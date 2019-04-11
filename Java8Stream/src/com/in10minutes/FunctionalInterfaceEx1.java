package com.in10minutes;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class FunctionalInterfaceEx1 {
	/**
	 * Give a Try with Functional Interface # 1 Write a program to print odd, even
	 * and numbers greater than 5 using Consumer functional Interface in addition to
	 * Predicate interface.
	 * 
	 * Hint: Method accept(T t) to be used to print the number
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

		System.out.println("Print even numbers:");

		// pass n as parameter
		eval(list1, n -> n % 2 == 0);

		System.out.println("Print the numbers greater than 5");
		eval(list1, n -> n > 5);

	}

	private static void eval(List<Integer> list1, Predicate<Integer> predicate) {
		// TODO Auto-generated method stub
		for (Integer n : list1) {
			if (predicate.test(n)) {
				System.out.println(n + "");
			}
		}

	}

}
