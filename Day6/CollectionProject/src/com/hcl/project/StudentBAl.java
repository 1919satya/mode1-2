package com.hcl.project;

import java.util.List;

public class StudentBAl {
 static StringBuilder sb=new StringBuilder();

public boolean addStudentBal(Student objStudent) throws StudentException{
	boolean isAdded = true;
	if(objStudent.getSno() <=0){
		sb.append("student num can not be zero or negative \r\n");
		isAdded= false;
	}
	if(objStudent.getName().length() <=3){
		sb.append("student name more than three chars \r\n");
		isAdded= false;
	}
	if(objStudent.getCgp() <=0){
		sb.append("student cgp non negative \r\n");
		isAdded= false;
	}
	if(isAdded==false){
		throw new StudentException(sb.toString());
		
	}else {
		new StudentDAO().addStudent(objStudent);
	}
	return isAdded;
}
public Student searchStudentBal(int sno) {
	return (Student) new StudentDAO().showStudentDao();
}
public List<Student> updateStudentBao(Student objStudent){
	return new StudentDAO().showStudentDao();
}
public String updateStudentBal(Student objStudent) {
	return new StudentDAO().updateStudentDao(objStudent);
}
public List<Student> showStudentBal() {
	return new StudentDAO().showStudentDao();
}
public String deleteStudentBal(int sno) {
	
	return new StudentDAO().deleteStudentDAO(sno);
}
}
