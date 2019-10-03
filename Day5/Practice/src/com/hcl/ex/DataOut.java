package com.hcl.ex;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOut {
	public static void main(String[] args) {
		try {
			DataOutputStream dOut=
					new DataOutputStream(new FileOutputStream("c:/files/data.text"));
			dOut.writeInt(12);
			dOut.writeUTF("HCL");
			dOut.writeDouble(58664.6);
			dOut.writeBoolean(true);
			dOut.close();
			System.out.println("*** file created***");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
