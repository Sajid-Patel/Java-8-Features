package com.stream_api;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortNamesInReverse {

	public static void main(String[] args) {
		// Sort a list of names on reverse alphabetical order
		List<String> names = Arrays.asList("Sajid", "Akash", "Zaid");

		List<String> result = names.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());

		System.out.println(result);

	}

}
