package com.j8;


//To call the Lamda Expression, we need the Functionl interface

interface Interf {

	public int square(int n);
}

public class LamdaSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Interf i = n -> n * n;

		System.out.println(i.square(10));
		System.out.println(i.square(5));

	}

}
