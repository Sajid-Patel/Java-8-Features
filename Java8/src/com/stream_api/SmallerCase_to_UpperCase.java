package com.stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SmallerCase_to_UpperCase {
	public static void main(String[] args) {
		// Transform a list of Strings to the List of their Upper Case

		List<String> words = Arrays.asList("sajid", "creta", "iphone");

		List<String> result = words.stream().map(String::toUpperCase).collect(Collectors.toList());

		System.out.println(result);
	}
}
