package com.lambda_expression;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetUsingJava8 {

	public static void main(String[] args) {
		// Set<Person> ts = new TreeSet<>(new PersonComparator());
		Set<Person> ts = new TreeSet<>(
				(a, b) -> a.getAdharNum() == b.getAdharNum() ? 0 : (a.getAdharNum() < b.getAdharNum()) ? -1 : 1);

//		Set<Person> ts = new TreeSet<>(new Comparator<Person>() {
//
//			@Override
//			public int compare(Person o1, Person o2) {
//
//				if (o1.getAdharNum() == o2.getAdharNum())
//					return 0;
//				else if (o1.getAdharNum() < o2.getAdharNum())
//					return -1;
//				else
//					return 1;
//			}
//		});

		ts.add(new Student(1, "Java"));
		ts.add(new Employee(436835954531l, "Sajid", 123, "Dev"));
		System.out.println(ts);

	}

}
