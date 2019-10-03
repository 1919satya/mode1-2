package com.hcl.jasonread;



import java.io.BufferedReader;


import java.io.FileReader;
import java.io.IOException;
import java.sql.Date;

import org.json.simple.JSONObject;
import org.json.simple.JSONValue;


public class JasonReador {
	public static void main(String[] args) {
		BufferedReader objReader=null;
		try {
			String str;
			objReader=new BufferedReader(new FileReader("C:\\Users\\coalesce\\Downloads\\sai.json"));
			
			
			while ((str=objReader.readLine()) != null ){
				 JSONObject jsonObject = (JSONObject) JSONValue.parse(objReader);  
				  
				    int empno = (Integer) jsonObject.get("empno"); 
				    String empName = (String) jsonObject.get("empName");
				    double salary = (Double) jsonObject.get("salary");
				    String band = (String) jsonObject.get("band");
				    Date dateOfJoin=(Date) jsonObject.get("dateOfJoin");
				    System.out.println(empno+" "+empName+" "+salary+" "+band+" "+dateOfJoin);  
			   
				System.out.println(str);
				   
			   }
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try{
				if(objReader != null)
					objReader.close();
			}
			
		
			
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

} 
}
