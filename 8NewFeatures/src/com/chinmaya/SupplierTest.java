package com.chinmaya;

import java.util.Date;
import java.util.function.Supplier;

/*interface Supplier<R> {

	public R get();
}*/

public class SupplierTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Supplier<Date> s = () -> new Date();
		System.out.println(s.get());
	}

}
