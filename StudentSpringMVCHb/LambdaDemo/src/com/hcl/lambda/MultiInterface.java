package com.hcl.lambda;
@FunctionalInterface
public interface MultiInterface {
	public String SayHello(String name);
	public static int add(int a,int b){return a+b;}
	boolean equals(Object obj);
	default public int defaultMethod(int v){return v+100 ;}
	}
