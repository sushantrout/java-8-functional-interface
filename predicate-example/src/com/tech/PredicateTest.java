package com.tech;

import java.util.function.Predicate;

public class PredicateTest {
	public static void main(String[] args) {
		Predicate<String> p = (t) -> t.contains("sh");
		
		//test(T t)
		boolean test = p.test("Sushant");
		System.out.println(test);
		
		//negate()
		Predicate<String> pNegate = (t) -> t.contains("sh");
		Predicate<String> negate = pNegate.negate();
		boolean negateStatus = negate.test("Sushant");
		System.out.println(negateStatus);
		
		
		Predicate<String> fName = fn -> fn.contains("sush");
		Predicate<String> lName = ln -> ln.contains("rout");

		//and(Predicate<? super String> other)
		Predicate<String> fullName = fName.and(lName);
		boolean andTest = fullName.test("sushant rout");
		
		System.out.println(andTest);
		
		//or(Predicate<? super String> other)
		Predicate<String> orPredicate = fName.or(lName);
		boolean orStatus = orPredicate.test("Sushant rout");
		System.out.println(orStatus);
		
	}
}
