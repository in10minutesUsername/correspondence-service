package com.landg.phoenix.diary.entities;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import com.landg.phoenix.diary.constants.DiaryServiceConstants;
/*
 * Entity to hold Diary event
 * 
 * @author Chinmaya
 * 
 * @Created on 2019-03-03
 */

import lombok.Data;

@Data
@Entity
@Table(name=DiaryServiceConstants.TABLE_DIARY_EVENT,schema=DiaryServiceConstants.SCHEMA_PHOENIX_DIARY)
public class DiaryEvent implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="DIARY_UID")
	private Long diaryUid;
	
	@Column(name="POLICY")
	private String policy;
	
	@Column(name="DIARY_TYPE")
	private String diaryType;
	
	@Column(name="DIARY_TIMESTAMP")
	private Timestamp diaryTimestamp;
	
	
	@Column(name="CREATED_TIMESTAMP")
	private Timestamp createdTimestamp;
	
	@Column(name="DIARY_SOURCE")
	private String diarySource;
	
	
	@Column(name="DIARY_DATA")
	private String diaryData;
	
	
	
	
	
	

}
