package com.hcl.lambda;

public class Add {
	public static void main(String[] args) {
		AddInterface a1=(a,b)->(a+b);
		System.out.println(a1.add(3, 4));
	}

}
