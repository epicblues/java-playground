package com.thisisjava.chap14.andthencompose;
import java.util.function.*;
public class PredicateIsEqualExample {

	public static void main(String[] args) {
		Predicate<String> predicate;
		
		
		predicate = Predicate.isEqual(null);
		System.out.println("null, null : " + predicate.test(null));

		
		predicate = Predicate.isEqual("java8");
		System.out.println("null, java8 : " + predicate.test("null"));
		

		predicate = Predicate.isEqual("null");
		System.out.println("java8, null : " + predicate.test("java8"));
		
		predicate = Predicate.isEqual("java8");
		System.out.println("java8, java8 : " + predicate.test("java8"));
		
	}

}
