package com.stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Limit_elements {

	public static void main(String[] args) {
//Fetch the first 3 elements from list of integers
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		List<Integer> result = numbers.stream().limit(3).collect(Collectors.toList());
		System.out.println(result);

		// get first 5 elements -> sum of 5 numbers
		int sum = numbers.stream().limit(5).reduce((p, q) -> p + q).get();
		System.out.println(sum);
	}

}
