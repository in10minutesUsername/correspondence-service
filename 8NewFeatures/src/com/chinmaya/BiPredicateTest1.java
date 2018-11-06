package com.chinmaya;

/*Normal predicate can take only one input argument and perform some conditional check*/

/*Sometimesourprogramming requirement is we have to take 2 inputarguments and perform someconditional check,forthis 
 * requirement, we should go for ByPredicate
*/

interface BiPredicate<T1, T2> {
	public boolean test(T1 t1, T2 t2);
}

// To Check sum of 2 given integers is even or not using ByPredicate

public class BiPredicateTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BiPredicate<Integer, Integer> p = (a, b) -> (a + b) % 2 == 0;

		System.out.println(p.test(10, 20));
		System.out.println(p.test(15, 20));

	}

}
