package com.stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Skip_elements {

	public static void main(String[] args) {

		// Skip first 4 elements and fetch the remaining elements from the list of
		// integers
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		List<Integer> result = numbers.stream().skip(4).collect(Collectors.toList());

		System.out.println(result);

	}

}
