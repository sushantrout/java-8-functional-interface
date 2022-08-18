package com.tech.test;

import com.tech.TechPredicate;

public class TechPredicateTest {
	public static void main(String[] args) {
		TechPredicate<String> p1 = (t) -> t.contains("su");
		TechPredicate<String> p2 = (t) -> t.contains("ro");
		
		TechPredicate<String> finalPredicate = p1.and(p2);
		
		System.out.println(finalPredicate.test("sushant rout"));
	}
}
