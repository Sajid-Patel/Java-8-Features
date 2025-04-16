package com.lambda_expression;

public class InterfTest implements Interf {

	public static void main(String[] args) {

		// with lambfa expression
		Interf i = (a, b) -> System.out.println("The sum is " + (a + b));
		i.add(10, 20);
		i.add(50, 50);
		i.add(11, 22);
	}

	@Override
	// without Lambda Expression
	public void add(int a, int b) {
		System.out.println("The sum is " + (a + b));

	}

}
