package com.hcl.ex;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataIn {
	public static void main(String[] args) {
		DataInputStream din;
		try {
			din = new DataInputStream(new FileInputStream("c:/files/data.text"));
			int x = din.read();
			x++;
			System.out.println("x value " + x);
			String name = din.readUTF();
			
			 System.out.println("name " +name);
			double bas;
			bas = din.readDouble();
			
			System.out.println("basic " +bas);
			boolean flag;
			
			System.out.println("flag " + true);
			din.close();		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}
		

}
