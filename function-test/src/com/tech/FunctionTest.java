package com.tech;

import java.util.function.Function;

public class FunctionTest {
	public static void main(String[] args) {
		Function<Integer, Integer> multiply = e -> e * 2;
		Function<Integer, Integer> addition = e -> e + 2;
		
		Integer numberM = multiply.apply(3);
		System.out.println(numberM);
		
		Integer numberP = addition.apply(3);
		System.out.println(numberP);
		
		/**
		 * In compose first the parameter function run then the caller
		 */
		Function<Integer, Integer> compose = multiply.compose(addition);
		Integer composeV = compose.apply(3);
		System.out.println(composeV);
		
		Function<Integer, Integer> andThen = multiply.andThen(addition);
		Integer ansdThenV = andThen.apply(3);
		System.out.println(ansdThenV);
		
		Function<String,String> identity = Function.identity();
		String apply = identity.apply("Sushant");
		System.out.println(apply);
	}
}
