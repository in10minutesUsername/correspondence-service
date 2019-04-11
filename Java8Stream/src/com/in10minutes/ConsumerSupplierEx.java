package com.in10minutes;

import java.util.function.Consumer;

/**
 * Give a Try with Functional Interface # 2 Tim has his own Sandwich corner
 * where he sells different types of sandwich which includes
 * 
 * Cheese Sandwich
 * 
 * Corn sandwich
 * 
 * Mix Veg sandwich
 * 
 * Write a program to add the above to a collection using Consumer interface and
 * print all using Supplier interface. Use only lambda functions.
 * 
 */

public class ConsumerSupplierEx {

	public static void main(String[] args) {

		System.out.println("E.g. #1 - Java8 Consumer Example\n");

		Consumer<String> consumer = ConsumerSupplierEx::printNames;

		consumer.accept("Cheese Sandwich");

		consumer.accept("Corn Sandwich");

		consumer.accept("Mix veg Sandwich");

	}

	private static void printNames(String name) {

		System.out.println(name);

	}

}

/*
 * import java.util.ArrayList;
 * 
 * import java.util.List;
 * 
 * import java.util.function.Supplier;
 * 
 * 
 * 
 * public class SupplierTest {
 * 
 * 
 * 
 * public static void main(String[] args) {
 * 
 * 
 * 
 * System.out.println("E.g. #2 - Java8 Supplier Example\n");
 * 
 * 
 * 
 * List<String> names = new ArrayList<String>();
 * 
 * names.add("Harry");
 * 
 * names.add("Daniel");
 * 
 * names.add("Lucifer");
 * 
 * names.add("April O' Neil");
 * 
 * 
 * names.stream().forEach((item)-> {
 * 
 * printNames(()-> item);
 * 
 * });
 * 
 * }
 * 
 * 
 * 
 * private static void printNames(Supplier<String> supplier) {
 * 
 * System.out.println(supplier.get());
 * 
 * }
 * 
 * }
 * 
 */