package com.hcl.ex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Custom {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter youe name ");
		try {
			String name= br.readLine();
			System.out.println("name " + name);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
