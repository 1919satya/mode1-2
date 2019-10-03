package com.hcl.Boxing;

public class BoxStudent {
	public void show(Object ob){
		//int x=(Integer)ob;
		Student s=(Student)ob;
		System.out.println(s);
	}
	
	public static void main(String[] args) {
	Student objStudent=new Student();
	objStudent.sno=1;
	objStudent.name="Nagendra";
	objStudent.cgp=85234;
	new BoxStudent().show(objStudent);
	}

}
