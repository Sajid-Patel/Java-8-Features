package com.stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class GreaterThen5 {

	public static void main(String[] args) {
	
		//Fetch all numbers from list that are greater then 5
		
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		List<Integer> result = numbers.stream().filter(n -> n > 5).collect(Collectors.toList());

		System.out.println(result);
	}

}
