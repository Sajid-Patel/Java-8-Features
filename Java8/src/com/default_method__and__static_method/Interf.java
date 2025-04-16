package com.default_method__and__static_method;

@FunctionalInterface
public interface Interf {
	public void m1();

	default void m2() {

	}

	public static void m3() {

	}
}
