package com.hcl.java;

public class Switch {
	public void calc(int d){
		switch(d){
		case 1:
			System.out.println("Sunday..");
			break;
		case 2:
			System.out.println("Monday..");
			break;
		case 3:
			System.out.println("Tuesday..");
			break;
		case 4:
			System.out.println("Wednesday");
			break;
		case 5:
			System.out.println("Thursday");
			break;
		case 6:
			System.out.println("Friday");
			break;
		case 7:
			System.out.println("Saturday..");
		}
	}

	public static void main(String[] args) {
		int d=2;
		new Switch().calc(d);
	}
}
