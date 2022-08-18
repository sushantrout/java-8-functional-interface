package com.tech;

import java.util.Objects;

@FunctionalInterface
public interface TechPredicate<T> {
	boolean test(T t);
	
	public default TechPredicate<T> and(TechPredicate<T> after) {
		Objects.requireNonNull(after);
		return t -> this.test(t) && after.test(t); 
	}
}
