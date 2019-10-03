package com.hcl.function;

public class CalcularorMain {
	public static void main(String[] args) {
		Calculator calculator=new Calculator();
		Integer ans=calculator.calc((x, y)->x+y,10,5);
		System.out.println(ans);
	}

}
