package com.hcl.function;

public class MethodMain {
public static void main(String[] args) {
	MethodRef s1=(a)->{return "welcome " +a;};
	System.out.println(s1.say(22));
	
	MethodRef s2=MethodRef::some;
	System.out.println(s2.say(44));
	
}
}
