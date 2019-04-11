package com.landg.phoenix.diary.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.landg.phoenix.diary.entities.DiaryEvent;
import com.landg.phoenix.diary.exception.DiaryServiceJsonParseException;

/**
 * 
 * @author Chinmaya
 *
 */

public class DiaryEventJsonMapping {

	private static final Logger LOGGER=LoggerFactory.getLogger(DiaryEventJsonMapping.class);

	public DiaryEventJsonMapping() {
		
	}
	
	
	/**
	 * Mapping JsonString to DiaryEvent
	 * 
	 * @param diaryEventJsonString
	 * @return diaryEvent
	 */
	public static DiaryEvent jsonStringToDiaryEvent(String diaryEventJsonString) {
		
		ObjectMapper mapper=new ObjectMapper();
		
		DiaryEvent diaryEvent=null;
		
		try {
			
			diaryEvent=mapper.readValue(diaryEventJsonString, DiaryEvent.class);
			
		}catch(Exception ex) {
			
			throw new DiaryServiceJsonParseException("Diary Service- DiaryEvent String to DiaryEvent entity json mapping error",ex);
		}
		
		return diaryEvent;
		
	}
	
	/*Common Jackson Mapper*/
	
	public static String objectToJsonString(Object obj) {
		
		ObjectMapper mapper=new ObjectMapper();
		
		String jsonString=null;
		
		try {
			jsonString=mapper.writeValueAsString(obj);
		}catch(JsonProcessingException ex) {
			throw new DiaryServiceJsonParseException("Diary Service-Json mapping error", ex);
		}
		return jsonString;
	}
}
