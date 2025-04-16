package com.lambda_expression;

public class Itr1Test {
	public static void main(String[] args) {
		Itr1 i = n -> n * n;
		System.out.println(i.squareIt(5));

	}

}
