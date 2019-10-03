package com.hcl.token;
	import java.util.StringTokenizer;
	public class Tokenizer
	{
	public static void main(String[] args)
	{
	String s ="My name is sai";
	StringTokenizer obj= new StringTokenizer(s);

	while(obj.hasMoreTokens()) 
	{
	String token= obj.nextToken();
	System.out.println("Token : "+token);
	}
	}
	} 

