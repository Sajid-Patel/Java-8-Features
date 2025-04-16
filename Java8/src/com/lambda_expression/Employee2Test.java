package com.lambda_expression;

import java.util.ArrayList;
import java.util.Collections;

public class Employee2Test {

	public static void main(String[] args) {
		ArrayList<Employee2> l = new ArrayList<Employee2>();
		l.add(new Employee2("Sajid", 131));

		l.add(new Employee2("Akash", 135));

		l.add(new Employee2("Gaourav", 132));

		l.add(new Employee2("Sunny",139 ));

		l.add(new Employee2("Bunty", 134));
		System.out.println(l);

		// Sorting on bases of number
		System.out.println("\n Sorting on bases of number : ");
		Collections.sort(l, (e1, e2) -> (e1.eno < e2.eno) ? -1 : (e1.eno > e2.eno) ? 1 : 0);
		System.out.println(l);

		// Sorting on bases on name
		System.out.println("\n Sorting on bases on name : ");
		Collections.sort(l, (e1, e2) -> e1.name.compareTo(e2.name));
		System.out.println(l);

	}

}
