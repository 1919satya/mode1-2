package com.hcl.collections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SortEmploy {
public static void main(String[] args) {
	Comparator<Employ>c =new NameCoparator();
	Set<Employ>SetEmploy=new TreeSet<Employ>(c);
	SetEmploy.add(new Employ(1,"divya",54367));
	SetEmploy.add(new Employ(2,"ram",65473));
	SetEmploy.add(new Employ(3,"ravi",65748));
	SetEmploy.add(new Employ(4,"Raghu",56438));
	SetEmploy.add(new Employ(5,"akash",87694));
	System.out.println("employ list");
	SetEmploy.forEach(System.out::println);
}
}
