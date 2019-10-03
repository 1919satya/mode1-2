package com.hcl.java;

public class Switch2 {
	public void check(String opt){
		switch(opt.toUpperCase()){
		case "INSERT":
			System.out.println("Insert Operation");
			break;
		case "UPDATE":
			System.out.println("update operation");
			break;
		case "DELETE":
			System.out.println("Delete operation");
			break;
		default:
			System.out.println("invalid operation..");
			break;
		}
	}
	public static void main(String[] args) {
		String op="INSERT";
		new Switch2().check(op);
	}

}
