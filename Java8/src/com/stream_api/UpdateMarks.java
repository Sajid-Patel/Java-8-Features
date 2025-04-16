package com.stream_api;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UpdateMarks {

	public static void main(String[] args) {
		ArrayList<Integer> marks = new ArrayList<Integer>();
		marks.add(5);
		marks.add(0);
		marks.add(15);
		marks.add(10);
		marks.add(25);
		marks.add(20);

		System.out.println("Previous Marks = " + marks);
		System.out.println("--------------------------------------------------------------------------");

		List<Integer> updatedMarks = marks.stream().map(i -> i + 5).collect(Collectors.toList());

		System.out.println("Updated MArks = " + updatedMarks);

		System.out.println("--------------------------------------------------------------------------");

		ArrayList<Integer> marks2 = new ArrayList<Integer>();
		marks2.add(75);
		marks2.add(30);
		marks2.add(44);
		marks2.add(34);
		marks2.add(82);
		marks2.add(97);

		long noOfFailStudents = marks2.stream().filter(m -> m < 35).count();
		System.out.println("Number Of Fail Students = " + noOfFailStudents);

		System.out.println("--------------------------------------------------------------------------");

		List<Integer> sortedList = marks2.stream().sorted().collect(Collectors.toList());
		System.out.println("Default natural sorting order = " + sortedList);

		System.out.println("--------------------------------------------------------------------------");

		List<Integer> sortedList2 = marks2.stream().sorted((i1, i2) -> ((i1 < i2) ? 1 : (i1 > i2) ? -1 : 0))
				.collect(Collectors.toList());
		System.out.println("Decending Sorting Order 1 = " + sortedList2);

		System.out.println("--------------------------------------------------------------------------");

		List<Integer> sortedList3 = marks2.stream().sorted((i1, i2) -> -i1.compareTo(i2)).collect(Collectors.toList());
		System.out.println("Decending Sorting Order 2 = " + sortedList3);

	}

}
