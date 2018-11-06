package com.j8;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class App5 {
	public static void main(String[] args) {
		LocalDate date1 = LocalDate.now();
		LocalDate date2 = date1.plus(1, ChronoUnit.MONTHS);
		Period period = Period.between(date2, date1);
		System.out.println("Period: " + period);

	}
}
