package com.example.demo.services;
@FunctionalInterface
public interface Compute<T,R> {
	public R compute(T value);
	default double offer() {
		return 4.0;
	}

}
