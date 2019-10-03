package com.hcl.function;

import java.util.function.Consumer;

public class MyInterfaceMain {

	public static void main(String[] args) {
		MyInterface m=(a)->{System.out.println(a);};
		m.some("HCL");
		MyInterface m1=System.out::println;
		m1.some("java Core");
		Consumer<String> consumer =System.out::println;
		consumer.accept("Bye");
	}
}
