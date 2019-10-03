package com.hcl.Boxing;

public class Student {
	int sno;
	String name;
	double cgp;

	@Override
	public boolean equals(Object obj) {
		Student s=(Student)obj;
		if(s.cgp==cgp){
			return true;
		}else {
			return false;
		}
			
	
	}



	@Override
	public String toString() {
		return "Student [sno=" + sno + ", name=" + name + ", cgp=" + cgp + "]";
	}

}
