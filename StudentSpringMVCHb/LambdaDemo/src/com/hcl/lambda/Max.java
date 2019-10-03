package com.hcl.lambda;

public class Max {
public static void main(String[] args) {
	MaxInterface m=(a,b,c)->(c>a?c>b?c:a : b);
	System.out.println(m.max(15, 17,8));
}
}
