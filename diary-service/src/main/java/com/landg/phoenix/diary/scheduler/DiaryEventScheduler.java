package com.landg.phoenix.diary.scheduler;

import static com.landg.phoenix.diary.constants.DiaryServiceConstants.ARREARCHASER_TRIGGER_QUEUE;
import static com.landg.phoenix.diary.constants.DiaryServiceConstants.DIARY_EVENT_IN_PROGRESS;
import static com.landg.phoenix.diary.constants.DiaryServiceConstants.DIARY_EVENT_LOADED_STATUS;
import static com.landg.phoenix.diary.constants.DiaryServiceConstants.DIARY_EVENT_TYPE_ARRCHSR;
import static com.landg.phoenix.diary.constants.DiaryServiceConstants.DIARY_EVENT_TYPE_LOADVALTNS;
import static com.landg.phoenix.diary.constants.DiaryServiceConstants.DIARY_EVENT_TYPE_REFUND_PREM;
import static com.landg.phoenix.diary.constants.DiaryServiceConstants.VALUATION_TRIGGER_QUEUE;
import static com.landg.phoenix.diary.utils.DiaryEventJsonMapping.objectToJsonString;
import static com.landg.phoenix.diary.utils.DiaryEventUtils.getUpperCaseEventTypeFromDiary;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.landg.phoenix.diary.entities.DiaryEventRequestVO;
import com.landg.phoenix.diary.sender.Sender;
import com.landg.phoenix.diary.service.DefaultDiaryService;


@Component
public class DiaryEventScheduler {

	private Sender sender;
	
	private DefaultDiaryService defaultDiaryService;
	
	/**
	 * Fixed Rate vs Fixed Delay
	 * 
	 * fixedRate---->The fixedRate property runs the scheduled task at every n millisecond. It doesn’t check for any previous executions of the task.
	 * 
	 * fixedDelay--->The fixedDelay property makes sure that there is a delay of n millisecond between the finish time of an execution of a task and the start time of the next execution of the task.
	 */
	
	
	//@Scheduled(fixedRateString="${phoeni.landg.scheduleDelay}")
	@Scheduled(fixedRate = 1000)
	public void diaryEventScheduler() {
		
		final List<String> eventTypes=new ArrayList<>(Arrays.asList(DIARY_EVENT_TYPE_REFUND_PREM,DIARY_EVENT_TYPE_ARRCHSR,DIARY_EVENT_TYPE_LOADVALTNS));
		
		sendDiaryDataToMQ(defaultDiaryService.getDiaryEventList(eventTypes,DIARY_EVENT_LOADED_STATUS));
	}
	
	
	public void sendDiaryDataToMQ(List<DiaryEventRequestVO> diaryEventList) {
		
		//Log.debug("Diary data event list: {}", diaryEventList);
		
		System.out.println("Diary data event list: {}"+diaryEventList);
		
		diaryEventList.forEach(diaryEvent ->{
			
			final String diaryEventType=getUpperCaseEventTypeFromDiary(diaryEvent.getDiaryType());
			
			String status=DIARY_EVENT_IN_PROGRESS;
			
			if(diaryEventType!=null) {
				
				String sendQueueName=null;
				
				switch(diaryEventType) {
				
				case DIARY_EVENT_TYPE_ARRCHSR:
					status=DIARY_EVENT_IN_PROGRESS;
					sendQueueName=ARREARCHASER_TRIGGER_QUEUE;
					sender.sendToActiveMq(sendQueueName,objectToJsonString(diaryEvent));
					break;
					
				case DIARY_EVENT_TYPE_LOADVALTNS:
					 status=DIARY_EVENT_IN_PROGRESS;
					 sendQueueName=VALUATION_TRIGGER_QUEUE;
					 sender.sendToActiveMq(sendQueueName,objectToJsonString(diaryEvent));
					 break;
					 
				default:
					break;
				}
				//Log.debug("Sending diary data to the {} queue:",sendQueueName);
				
				System.out.println("Sending diary data to the {} queue:"+sendQueueName);
			}
			
			//Log.debug("Updating the diary event status to Inprogress ({}):{}",status,diaryEvent);
			System.out.println("Updating the diary event status to Inprogress ({}):{}"+status+"and"+diaryEvent);
			
			//defaultDiaryService.updateDiaryEventStatus(status,diaryEvent.getDiaryUid());
		});
		
	}

	


	@Autowired
	public void setSender(Sender sender) {
		this.sender = sender;
	}

	@Autowired
	public void setDefaultDiaryService(DefaultDiaryService defaultDiaryService) {
		this.defaultDiaryService = defaultDiaryService;
	}
	
	
	
}
