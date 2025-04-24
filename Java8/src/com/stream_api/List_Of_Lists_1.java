package com.stream_api;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class List_Of_Lists_1 {

	public static void main(String[] args) {
		// Given a list of lists of Strings, flatten them to a single list of Strings

		List<List<String>> listofLists = Arrays.asList(Arrays.asList("one", "two", "three"),
				Arrays.asList("four", "five", "six"));

		List<String> result = listofLists.stream().flatMap(Collection::stream).collect(Collectors.toList());

		System.out.println(result);

	}

}
