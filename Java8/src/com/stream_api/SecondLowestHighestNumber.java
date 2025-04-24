package com.stream_api;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SecondLowestHighestNumber {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(0, 3, 10, 20, 30, 15, 1, 13, 1, 2, 2, 10, 40, 19, 3, 40);
		// Second Highest
		int secH = list.stream().sorted(Collections.reverseOrder()).distinct().limit(2).skip(1).findFirst().get();
		System.out.println(secH);

		int secHh = list.stream().sorted(Collections.reverseOrder()).distinct().skip(1).findFirst().get();
		System.out.println(secHh);

		// Second Lowest

		int secL = list.stream().sorted().distinct().skip(1).findFirst().get();
		System.out.println(secL);
	}
}
