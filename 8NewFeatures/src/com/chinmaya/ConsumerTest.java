package com.chinmaya;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class ConsumerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Function<Student, String> f = s -> {

			int marks = s.marks;
			String grade = "";
			if (marks >= 80)
				grade = "A[Distinction]";
			else if (marks >= 60)
				grade = "B[First Class]";
			else if (marks >= 50)
				grade = "C[Second Class]";
			else if (marks >= 35)
				grade = "D[Third Class]";
			else
				grade = "E[Failed]";

			return grade;

		};

		Predicate<Student> p = s -> s.marks >= 60;

		Consumer<Student> c = s -> {
			System.out.println("Student Name:" + s.name);
			System.out.println("Student Marks:" + s.marks);
			System.out.println("Student Grade:" + f.apply(s));
			System.out.println();
		};

		Student[] stu = { new Student("Chinmaya", 85), new Student("Chini", 65), new Student("Sunny", 50),
				new Student("Raj", 40), new Student("Adam", 35) };

		for (Student st : stu) {

			if (p.test(st))

				c.accept(st);
		}

	}

}
