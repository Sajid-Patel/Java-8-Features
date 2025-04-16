package com.lambda_expression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ArrayListDemo2 {
	public static void main(String[] args) {
		ArrayList<Integer> l = new ArrayList<Integer>();
		l.add(5);
		l.add(0);
		l.add(15);
		l.add(10);
		l.add(25);
		l.add(20);

		System.out.println(l);

		Comparator<Integer> c = (I1, I2) -> (I1 < I1) ? -1 : (I1 > I1) ? 1 : 0;
		Collections.sort(l, c);
		System.out.println(l);
	}
}
