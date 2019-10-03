package com.hcl.collections;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortEmploy {
	public static void main(String[] args) {
		Comparator c=new NameCompare();
		SortedSet s=new TreeSet(c);
		s.add(new Employ(1,"hema",45362));
		s.add(new Employ(2,"Raghu",56789));
		s.add(new Employ(1,"raju",45362));
	    s.add(new Employ(1,"raki",45362));
	    s.add(new Employ(1,"ram",45362));
	    System.out.println("sorted data");
	    s.forEach(System.out::println);
	}
}
