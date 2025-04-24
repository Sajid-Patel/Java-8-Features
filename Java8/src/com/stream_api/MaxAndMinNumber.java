package com.stream_api;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MaxAndMinNumber {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(0, -1, 3, 10, 20, 30, 15, 1, 13, 1, 2, 2, 10, 40, 19, 3);

		// for max number
		int max = list.stream().max(Comparator.comparing(Integer::valueOf)).get();
		System.out.println("Maximum number from List : " + max);

		// for min number
		int min = list.stream().min(Comparator.comparing(Integer::valueOf)).get();

		System.out.println("Minimum number from List : " + min);

	}

}
