package com.stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class SumOfAllNumbers {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2, 3, 4, 5, 6, 7, 8, 9, 10, 14, 15, 17, 80, 99);

		Optional<Integer> sum = list.stream().reduce((a, b) -> a + b);

		System.out.println("Sum of all numbers : " + sum.get());
	}

}
