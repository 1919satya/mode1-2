package com.hcl.inheritance;

class First {
	static {
		System.out.println("base class constructor....");
	}

	public First() {
		System.out.println("base class ");
	}
}

class second extends First {
	public second() {
		System.out.println("derived class static");
	}
}

public class Inhc {
	public static void main(String[] args) {
		new second();

	}
}
