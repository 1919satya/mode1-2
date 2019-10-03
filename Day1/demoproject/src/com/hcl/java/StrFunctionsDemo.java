package com.hcl.java;

public class StrFunctionsDemo {
	public static void main(String[] args) {
		String str ="Welcome to java programming..";
		System.out.println("Length of string "+str.length());
		System.out.println("char at 5th position "+str.charAt(5));
		System.out.println("Index of 'a'is " +str.indexOf('a'));
		System.out.println("last occurrence of'a'"+str.lastIndexOf('a'));
		System.out.println("substring" +str.substring(3,9));
		String s1="Hello",s2="Hello";
		System.out.println(s1.equals(s2));
		String s3="java",s4="programming";
		System.out.println(s3.compareTo(s4));
		
		
	}

}
