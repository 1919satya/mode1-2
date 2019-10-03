package com.hcl.collections;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class SortStudent {
	public static void main(String[] args) {
		Comparator<Student>c =new cgpComparator();
		Set<Student>setStudent=new TreeSet<Student>(c);
		setStudent.add(new Student("sai","divya","chennai",8.5));
		setStudent.add(new Student("Raju","ram","chili",6.8));
		setStudent.add(new Student("rakesh","ravi","banglore",7.8));
		setStudent.add(new Student("sai","Raghu","chennai",8.8));
		setStudent.add(new Student("rahul","akash","pune",8.7));
		System.out.println("student list");
		setStudent.forEach(System.out::println);
	}

}
