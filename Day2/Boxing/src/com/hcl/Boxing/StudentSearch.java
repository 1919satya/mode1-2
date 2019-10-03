package com.hcl.Boxing;

public class StudentSearch {
	public Student showStudent(int sno){
		Student student=null;
		if(sno==1){
			student =new Student();
			student.sno=100;
			student.name="satya";
			student.cgp=8.5;
		}
		if(sno==3){
			student =new Student();
			student.sno=200;
			student.name="pream";
			student.cgp=8.6;
			
		}
		return student;
	}
public static void main(String[] args) {
	StudentSearch obj=new StudentSearch();
	Student res=obj.showStudent(1);
	if(res!=null){
		System.out.println(res);
	}else{
		System.out.println("Student not Found...");
	}
	
}
}
