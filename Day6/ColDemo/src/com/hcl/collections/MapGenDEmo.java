package com.hcl.collections;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class MapGenDEmo {

	public static void main(String[] args) {
		Map<Integer,String> m=new Hashtable<Integer,String>();
		m.put(1,"Darshini");
		m.put(2,"laksh");
		m.put(3,"hcl");
		m.put(4,"lakshmi");
		
		int Key;
		String result;
		System.out.println("enter key");
		Scanner sc=new Scanner(System.in);
		Key=sc.nextInt();
		result =m.getOrDefault(Key, "Not found");
		System.out.println(result);
		
	}
}
