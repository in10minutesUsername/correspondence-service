package com.landg.phoenix.diary.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class DiaryServiceJsonParseException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	public DiaryServiceJsonParseException(String message,Exception ex) {
		
		super(message,ex);
	}
	
}
