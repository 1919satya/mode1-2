package com.hcl.Boxing;

public class StudentTest {
	public void show(Object ob){
		Student s =(Student)ob;
		System.out.println(s);
	}
	public static void main(String[] args) {
		Student s1=new Student();
		s1.sno=1;
		s1.name="Satya";
		s1.cgp=8.5;
		
		Student s2=new Student();
		s2.sno=2;
		s2.name="Sai";
		s2.cgp=8.5;
		new StudentTest().show(s2);
		System.out.println(s1.equals(s2));
	}

}
