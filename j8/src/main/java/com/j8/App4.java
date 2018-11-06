package com.j8;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class App4 {
	public static void main(String[] args) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE", Locale.US);
		System.out.println(formatter.format(LocalDateTime.now()));
	}
}
