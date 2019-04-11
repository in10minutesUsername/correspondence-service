package com.landg.phoenix.diary.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.landg.phoenix.diary.entities.DiaryEventRequestVO;
import com.landg.phoenix.diary.repositories.DiaryEventRepository;

@Service
public class DefaultDiaryService {
	
	private DiaryEventRepository diaryEventRepository;

	public List<DiaryEventRequestVO> getDiaryEventList(List<String> eventTypes, String diaryEventLoadedStatus) {
		
		return diaryEventRepository.getDiaryEventList(eventTypes,diaryEventLoadedStatus);
	}

	
	
	
	
	@Autowired
	public void setDiaryEventRepository(DiaryEventRepository diaryEventRepository) {
		this.diaryEventRepository = diaryEventRepository;
	}

	
	
	

}
