package com.landg.phoenix.diary.entities;

import lombok.Data;

@Data
public class DiaryEventRequestVO {
	
	
	public DiaryEventRequestVO(Long diaryUid, String diaryType, String diaryEventDate, String status, String policy,
			String diaryData, String diarySource) {
		super();
		this.diaryUid = diaryUid;
		this.diaryType = diaryType;
		this.diaryEventDate = diaryEventDate;
		this.status = status;
		this.policy = policy;
		this.diaryData = diaryData;
		this.diarySource = diarySource;
	}

	private Long diaryUid;
	
	private String diaryType;
	
	private String diaryEventDate;
	
	private String status;
	
	private String policy;
	
	private String diaryData;
	
	private String diarySource;
	
	
}
