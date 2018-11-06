package com.chinmaya;

import java.util.ArrayList;
import java.util.function.BiFunction;

class Employee {
	int eno;
	String name;

	public Employee(int eno, String name) {
		super();
		this.eno = eno;
		this.name = name;
	}

}

public class BiFunctionTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Employee> l = new ArrayList<Employee>();

		BiFunction<Integer, String, Employee> f = (eno, name) -> new Employee(eno, name);

		l.add(f.apply(100, "Adam"));
		l.add(f.apply(101, "Ben"));
		l.add(f.apply(102, "Carrel"));

		for (Employee e : l) {
			System.out.println();
		}
	}

}
