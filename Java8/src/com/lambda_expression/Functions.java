package com.lambda_expression;

import java.util.function.Function;
import java.util.function.Predicate;

public class Functions {

	public static void main(String[] args) {

		// To check num is even or odd
		Predicate<Integer> p = i -> i % 2 == 0;
		System.out.println(p.test(4));
		System.out.println(p.test(5));

		// To square a given number
		Function<Integer, Integer> f = i -> i * i;
		System.out.println("Square of 7 = " + f.apply(7));
		System.out.println("Square of 8 = " + f.apply(8));

		// ( a, b)-> System.out.println(a+b);

	}

}
