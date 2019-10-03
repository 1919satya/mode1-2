package com.hcl.obj;

	public class SbExample {
		public StringBuilder show(int age,String name,String course,String city){
			StringBuilder sbError=new StringBuilder();
			boolean isValid=true;
			/* validation for age */
			if(age <= 20){
				sbError.append("age must be greater than 20"+"\r\n");
				isValid=false;
			}
			/* validation for Name */
			if(name.indexOf(' ')==-1){
				sbError.append("Name Contains both Firstname amd Last Name"+"\r\n");
				isValid=false;
			}
			/* validation for course */
			if(!course.equalsIgnoreCase("JAVA")){
				sbError.append("only java course allowed"+"\r\n");
			}
			if(isValid==true){
			sbError.append("Age is "+age+"\r\n");
			sbError.append("Name is "+name+"\r\n");
			sbError.append("course " +course+"\r\n");
			sbError.append("City "+city+"\r\n");
		}
			return sbError;
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
			StringBuilder sbRes= new SbExample().show(age,name,course,city);
			System.out.println(sbRes);
		}

	}

