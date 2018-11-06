package com.j8;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		ZoneId zoneId = ZoneId.of("Asia/Singapore");
		ZonedDateTime.of(LocalDateTime.now(), zoneId);
		System.out.println(ZonedDateTime.of(LocalDateTime.now(), zoneId).getOffset());
	}
}
