package com.lambda_expression;

import java.util.Comparator;

public class PersonComparator implements Comparator<Person> {

	@Override
	public int compare(Person o1, Person o2) {
		if (o1.getAdharNum() == o2.getAdharNum())
			return 0;
		else if (o1.getAdharNum() < o2.getAdharNum())
			return -1;
		else
			return 1;

	}

}
