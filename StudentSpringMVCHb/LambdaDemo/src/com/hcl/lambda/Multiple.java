package com.hcl.lambda;

public class Multiple {
	public static void main(String[] args) {
		
		MultiInterface m=(name)->{return "Hello "+ name;};
		System.out.println("Hello" +" "+ "Sai");
		System.out.println("add:"+MultiInterface.add(6, 8));
		System.out.println(m.equals(m));
		System.out.println("Default:"+m.defaultMethod(44));
			
	}

}
