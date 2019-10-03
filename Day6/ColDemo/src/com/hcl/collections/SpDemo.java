package com.hcl.collections;

public class SpDemo {

	public static void main(String[] args) {
		String greet="Welcome to Java Programmig strings";
		String[] arr=greet.split(" ");
		for (String string : arr) {
			System.out.println(string);
		}
	}
}
