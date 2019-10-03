package com.hcl.collections;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortEmp {
public static void main(String[] args) {
	SortedSet s=new TreeSet();
	s.add(new Emp(1,"hema",45362));
	s.add(new Emp(2,"Raghu",56789));
	s.add(new Emp(1,"raju",45362));
    s.add(new Emp(1,"raki",45362));
    s.add(new Emp(1,"ram",45362));
    System.out.println("sorted data");
    s.forEach(System.out::println);
}
}
