package com.j8;

import java.time.Clock;

public class App2 {
	public static void main(String[] args) {
		final Clock clock = Clock.systemUTC();
		System.out.println(clock.instant());
		System.out.println(clock.millis());
	}
}
