package com.hcl.collections;

import java.util.ArrayList;
import java.util.List;

public class GenEmploy {
public static void main(String[] args) {
	List<Employ>lstEmploy=new ArrayList<Employ>();
	lstEmploy.add(new Employ(1,"divya",54367));
	lstEmploy.add(new Employ(2,"ram",65473));
	lstEmploy.add(new Employ(3,"ravi",65748));
	lstEmploy.add(new Employ(4,"Raghu",56438));
	lstEmploy.add(new Employ(5,"akash",87694));
	System.out.println("employ list");
	lstEmploy.forEach(System.out::println);
}
}
