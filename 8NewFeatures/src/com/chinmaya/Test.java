package com.chinmaya;

import java.util.function.Consumer;
import java.util.function.Function;

class AdderImpl implements Adder {

	@Override
	public String add(Function<String, String> f) {
		return f.apply("Welcome ");
	}

	@Override
	public void add(Consumer<Integer> f) {

	}

}

public class Test {

	public static void main(String[] args) {
		AdderImpl adderImpl = new AdderImpl();
		String r = adderImpl.add(a -> a + " lambda");
		System.out.println(r);
	}
}