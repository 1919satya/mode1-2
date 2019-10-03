package com.hcl.lambda;

public interface Default {
	default void printHello() {
		System.out.println("Hello Default");
	}
	static void printHello1() {
		System.out.println("Hello refault");
	}
}
