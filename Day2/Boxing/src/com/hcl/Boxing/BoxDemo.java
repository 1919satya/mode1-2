package com.hcl.Boxing;

public class BoxDemo {

	public static void main(String[] args) {
		int a=12;
		double b=12.5;
		String name="Hcl";
		/* boxing Code*/
		Object ob1=a;
		Object ob2=b;
		Object ob3=name;
		/* Unboxing Code */
		int a1=(Integer)ob1;
		double b1=(Double)ob2;
		String n1=(String)ob3;
		
		a1++;
		System.out.println("Integer"+a1);
		System.out.println("double"+b1);
		System.out.println("Name"+name);
		
	}
}
