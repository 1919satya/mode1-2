package com.hcl.java;

public class SbExample {
	public void show(int age,String name,String course,String city){
		StringBuilder sbError=new StringBuilder();
		boolean isValid=true;
		/* validation for age */
		if(age <= 20){
			sbError.append("age must be greater than 20"+"\r\n");
			isValid=false;
		}
		if(name.indexOf(' ')==-1){
			sbError.append("Name Contains both Firstname amd Last Name"+"\r\n");
			isValid=false;
		}
		if(!course.equalsIgnoreCase("JAVA")){
			sbError.append("only java course allowed"+"\r\n");
		}
		if(isValid==true){
		System.out.println("Age is "+age);
		System.out.println("Name is "+name);
		System.out.println("course " +course);
		System.out.println("City "+city);
	}else{
		System.out.println(sbError);
	}
	}
	public static void main(String[] args) {
		int age;
		String name;
		String course;
		String city;
		age=30;
		name="Ram raju";
		course="Java";
		city="Delhi";
		new SbExample().show(age, name, course, city);
				
		
	}

}
