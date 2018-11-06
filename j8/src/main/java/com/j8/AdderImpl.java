package com.j8;

import java.util.function.Consumer;
import java.util.function.Function;

interface Adder {
	String add(Function<String, String> f);

	void add(Consumer<Integer> f);
}

class AdderImpl1 implements Adder {

	public String add(Function<String, String> f) {
		// TODO Auto-generated method stub
		return f.apply("Welcome ");
	}

	public void add(Consumer<Integer> f) {
		// TODO Auto-generated method stub

	}

}

public class AdderImpl {

	public static void main(String[] args) {
		AdderImpl1 adderImpl = new AdderImpl1();
		String r = adderImpl.add(a -> a + " lambda");
		System.out.println(r);
	}

}