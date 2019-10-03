package com.hcl.function;

public interface MethodRef {

	public String say(Integer str);
	public static String some(Integer num){return "Welcome Static:" +num;}
}
