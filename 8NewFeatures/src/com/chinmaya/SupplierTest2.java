package com.chinmaya;

import java.util.function.Supplier;

/*interface Supplier<R> {

	public R get();
}*/

public class SupplierTest2 {

	public static void main(String[] args) {

		Supplier<String> s = () -> {

			String otp = "";

			for (int i = 0; i < 6; i++) {

				otp = otp + (int) (Math.random() * 10);
			}
			return otp;
		};

		System.out.println("OTP is " + s.get());
		System.out.println("OTP is " + s.get());
		System.out.println("OTP is " + s.get());
		System.out.println("OTP is " + s.get());

	}

}
