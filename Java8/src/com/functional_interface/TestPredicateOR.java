package com.functional_interface;

import java.util.function.Predicate;

public class TestPredicateOR {

	public static Predicate<String> hasLengthOf10 = new Predicate<String>() { 
        @Override
        public boolean test(String t) 
        { 
            return t.length() > 10; 
        } 
    }; 
  
    public static void predicate_or() 
    { 
  
        Predicate<String> containsLetterA = p -> p.contains("C"); 
        String containsA = "Bndornotppp"; 
        boolean outcome = hasLengthOf10.or(containsLetterA).test(containsA); 
        System.out.println(outcome); 
    } 
    public static void main(String[] args) 
    { 
        predicate_or(); 
    } 

}
