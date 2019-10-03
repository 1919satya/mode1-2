package com.hcl.Boxing;

public class StDemo {
	void show(){
	System.out.println("From show Method...");	
	}
static void display(){
	System.out.println("From display method..");
}
public static void main(String[] args) {
	display();
	StDemo.display();
}
}
