package com.hcl.lambda;

import java.util.ArrayList;
import java.util.List;

public class ForEach {
public static void main(String[] args) {
	List<String>list=new ArrayList<String>();
	list.add("Hi");
	list.add("My");
	list.add("Name");
	list.add("Is");
	list.add("Sai");
	list.forEach((a)->System.out.println(a) );
}
}
