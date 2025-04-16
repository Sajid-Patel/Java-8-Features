package com.functional_interface;

import java.util.function.Predicate;

public class TestPredicateIsEqual {
	public static void main(String[] args) {
	    Predicate<String> i  = Predicate.isEqual("asdf");
	    
	    System.out.println(i.test("asdf"));
	  }
	
}
