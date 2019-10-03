package com.hcl.java;

public class EveOdd {
	public void check(int n){
		if(n%2==0){
			System.out.println("Even no..");
		}else{
			System.out.println("Odd no..");
		}
	}
	
	public static void main(String[] args) {
	int n=12;
	new EveOdd().check(n);

		
	}

}
