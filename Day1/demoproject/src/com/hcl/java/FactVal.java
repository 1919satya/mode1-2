package com.hcl.java;

public class FactVal {
	public void calc(int n){
		int f=1,i=1;
		while(i<=n){
		f=f*i;
		i++;
	}
	System.out.println("Fact value is" +f);
	}
	public static void main(String[] args) {
	int n=6;
	FactVal obj=new FactVal();
	obj.calc(n);
	}

}
