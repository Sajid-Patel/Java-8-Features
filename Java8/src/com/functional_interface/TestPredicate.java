package com.functional_interface;

import java.util.function.Predicate;

public class TestPredicate {

	public static void main(String[] args) {
System.out.println("inbult test method");

		// Creating predicate
		Predicate<Integer> lesserthan = i -> (i < 18);

		// Calling Predicate method
		System.out.println(lesserthan.test(10));
		
		
		System.out.println("inbult and,negate,test method :");
		
		
		 Predicate<Integer> greaterThanTen = (i) -> i > 10; 
		  
	        // Creating predicate 
	        Predicate<Integer> lowerThanTwenty = (i) -> i < 20;  
	        boolean result = greaterThanTen.and(lowerThanTwenty).test(15); 
	        System.out.println(result); 
	  
	        // Calling Predicate method 
	        boolean result2 = greaterThanTen.and(lowerThanTwenty).negate().test(15); 
	        System.out.println(result2); 

	}
	
	


}
