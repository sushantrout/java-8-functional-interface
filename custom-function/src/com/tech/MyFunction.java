package com.tech;

import java.util.function.Function;

public interface MyFunction<T, R> {
	R apply(T t);

	default <V> Function<V, R> compose(Function<V, T> before) {
		return v -> apply(before.apply(v));
	}
}
