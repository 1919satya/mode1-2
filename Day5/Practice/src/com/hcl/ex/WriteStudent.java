package com.hcl.ex;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteStudent {
	public static void main(String[] args) {
		try {
			FileOutputStream fo=new FileOutputStream("c:/files/Student.txt");
			ObjectOutputStream ob=new ObjectOutputStream(fo);
			Student s=new Student(3, "Ram","Banglore",8.5);
			ob.writeObject(s);
			ob.close();
			fo.close();
			System.out.println("student stored");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
