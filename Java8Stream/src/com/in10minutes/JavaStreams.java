package com.in10minutes;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class JavaStreams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Integer Stream
		IntStream

				.range(1, 10).forEach(System.out::println);

		// System.out.println();

		System.out.println("-----------------Integer Stream with skip-----------------");
		// 2. Integer Stream with skip
		IntStream.range(1, 10).skip(5).forEach(x -> System.out.println(x));

		System.out.println();

		// 3. Integer Stream with sum
		System.out.println("-----------------Integer Stream with sum-----------------");

		System.out.println(

				IntStream

						.range(1, 10).sum());

		// 4. Stream.of, sorted and findFirst
		System.out.println("-----------------Stream.of, sorted and findFirst-----------------");

		Stream.of("Ava", "Aneri", "Alberto").sorted().findFirst().ifPresent(System.out::println);

		// 5. Stream from Array, sort, filter and print
		System.out.println("-----------------Stream from Array, sort, filter and print-----------------");

		String[] names = { "Al", "Ankit", "Kushal", "Brent", "Sarika", "amanda", "Hans", "Shivika", "Sarah" };

		Arrays.stream(names) // Same as Stream.of()

				.filter(x -> x.startsWith("S")).sorted().forEach(System.out::print);

		// 6. average of squares of an int array
		System.out.println("-----------------average of squares of an int array-----------------");

		Arrays.stream(new int[] { 2, 4, 6, 8, 10 })

				.map(x -> x * x).average().ifPresent(System.out::print);

		// 7. Stream from List, filter and print
		System.out.println("-----------------Stream from List, filter and print-----------------");

		List<String> people = Arrays.asList("Al", "Ankit", "Brent", "Sarika", "amanda", "Hans", "Shivika", "Sarah");

		people.stream().map(String::toLowerCase).filter(x -> x.startsWith("a")).sorted().forEach(System.out::println);
		System.out.println("-----------------Stream from List, filter and print-----------------");
		people.parallelStream().map(String::toLowerCase).filter(x -> x.startsWith("a")).sorted()
				.forEach(System.out::println);

	}

}
