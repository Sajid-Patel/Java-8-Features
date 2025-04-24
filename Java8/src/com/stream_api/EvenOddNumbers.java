package com.stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenOddNumbers {

	public static void main(String[] args) {
		List<Integer> nummbers = Arrays.asList(0,1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 14, 15, 17, 80, 99);
		List<Integer> evenList = nummbers.stream().filter(e -> e % 2 == 0).collect(Collectors.toList());
		List<Integer> oddList = nummbers.stream().filter(e -> e % 2 != 0).collect(Collectors.toList());

		System.out.println("Even numbers from list : " + evenList);

		System.out.println("Odd numbers from list : " + oddList);

	}

}
