package com.lambda_expression;

public class Employee extends Person {

	private int empId;
	private String dept;

	public Employee(long adharNum, String name, int empId, String dept) {
		super(adharNum, name);
		this.empId = empId;
		this.dept = dept;
	}

}
