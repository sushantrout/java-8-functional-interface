package com.tech;

import java.util.function.Supplier;

public class SupplierTest {
	public static void main(String[] args) {
		Supplier<Double> randomValue = () -> Math.random();
		System.out.println(randomValue.get());
	}
}
