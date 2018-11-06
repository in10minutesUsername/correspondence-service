package com.j8;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class App7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DateTimeFormatter dateFormat = DateTimeFormatter.ISO_DATE;
		LocalDate dateOfBirth = LocalDate.of(2015, Month.FEBRUARY, 31);
		System.out.println(dateFormat.format(dateOfBirth));
	}

}
