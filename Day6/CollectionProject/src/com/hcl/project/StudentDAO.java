package com.hcl.project;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class StudentDAO {
	static List<Student> lstStudent = null;
	static {
		lstStudent = new ArrayList<Student>();
	}

	public String addStudent(Student student) {
		lstStudent.add(student);
		return "student created succusfully";
	}

	public Student searchStudentDao(int sno) {
		Student objStudent = null;
		for (Student student : lstStudent) {
			if (student.getSno() == sno) {
				objStudent = student;
			}
		}
		return objStudent;
	}

	public List<Student> showStudentDao() {
		return lstStudent;
	}

	public String updateStudentDao(Student objStudent) {
		Student student = searchStudentDao(objStudent.getSno());
		if (student != null) {
			for (Student s : lstStudent) {
				if (s.getSno() == objStudent.getSno()) {
					s.setName(objStudent.getName());
					s.setCity(objStudent.getCity());
					s.setCgp(objStudent.getCgp());
				}

			}
			return "record updated..";

		} else {
			return "student not found";
		}
	}

	public String deleteStudentDAO(int sno) {
		Student student = searchStudentDao(sno);
		if (student != null) {
			lstStudent.remove(student);
			return "student Removed";
		} else {
			return "student no not found";
		}
	}
		public void writeStudentFileDAo() {
			try {
				FileOutputStream fout=new FileOutputStream("c:/files/student.txt");
				ObjectOutputStream objout=new ObjectOutputStream(fout);
				objout.writeObject(lstStudent);
				objout.close();
				fout.close();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		public void readStudentFileDAO() {
			try {
				FileInputStream fin=new FileInputStream("c:/files/student.txt");
				ObjectInputStream objin=new ObjectInputStream(fin);
				lstStudent =(List<Student>)objin.readObject();
				objin.close();
				fin.close();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
}
