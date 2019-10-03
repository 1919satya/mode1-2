package com.hcl.demo;

public class Demo {
public static void main(String[] args) {
	
	Long x=123699L;
	double y=(double)x;
	System.out.println(y);
	int a=5;
	
	System.out.println(a);
	 int b=--a;
	System.out.println(b);
	String name="Rama Raju";
	
//	System.out.println(name.substring(0,5));
	//System.out.println(name.charAt(5));
	//System.out.println(name.length());
	StringBuilder sb=new StringBuilder();
	sb.append(name);
	System.out.println(sb);
}
}
