package com.lambda_expression;

public class Person implements Comparable<Person> {
	private long adharNo;
	private String name;

	public Person() {
		super();

	}

	public Person(long adharNo, String name) {
		super();
		this.adharNo = adharNo;
		this.name = name;
	}

	public long getAdharNum() {
		return adharNo;
	}

	public void setAdharNum(long adharNo) {
		this.adharNo = adharNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [adharNo=" + adharNo + ", name=" + name + "]";
	}

	@Override
	public int compareTo(Person o) {
		if (this.adharNo == o.adharNo)

			return 0;

		else if (this.adharNo < o.adharNo)
			return -1;

		else
			return 1;
	}

}
