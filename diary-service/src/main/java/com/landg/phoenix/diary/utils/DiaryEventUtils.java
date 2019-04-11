package com.landg.phoenix.diary.utils;

public class DiaryEventUtils {
	
	public static String getUpperCaseEventTypeFromDiary(String diaryEventType) {
		
		if(diaryEventType!=null) {
			
			diaryEventType=diaryEventType.toUpperCase().trim();
		}
		return diaryEventType;
	}

}
