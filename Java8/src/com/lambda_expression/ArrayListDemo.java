package com.lambda_expression;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		System.out.println("ArrayList using Lambda Expression");
		numbers.add(1);
		numbers.add(0);
		numbers.add(7);
		numbers.add(33);
		numbers.forEach((n) -> {
			System.out.print(+n + " ");

		});
	}

}
