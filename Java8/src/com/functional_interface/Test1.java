package com.functional_interface;

import java.util.ArrayList;

public class Test1 {

	public static void main(String[] args) {

		Itr1 checkNumber = (num) -> (num > 0) ? "Positive" : (num < 0) ? "Negative" : "Zero";

		System.out.println(checkNumber.m1(7));
		System.out.println(checkNumber.m1(-8));
		System.out.println(checkNumber.m1(0));

	}

}
