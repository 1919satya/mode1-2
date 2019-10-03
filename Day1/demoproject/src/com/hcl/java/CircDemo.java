package com.hcl.java;

public class CircDemo {
	
	public void calc(double radius){
		double area;
		double circ;
		area=Math.PI*Math.pow(radius, 2);
		circ=2*Math.PI*radius;
		System.out.println("Area of circle " +area);
		System.out.println();
	}
	public static void main(String[] args) {
		double radius=12.5;
	}

}
