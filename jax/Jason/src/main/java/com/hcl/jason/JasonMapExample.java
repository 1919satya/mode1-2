package com.hcl.jason;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JasonMapExample {
	public static void main(String args[]){ 
		JSONObject obj=new JSONObject();
		
		for(int i=0;i<5;i++){
			JSONArray arr=new  JSONArray();
			arr.add("EMP"+i);
			arr.add(1000*i);
			arr.add(25+i);
			obj.put(i, arr);
			
			System.out.println(obj);
		}
		  JSONArray arr = new JSONArray();  
		  arr.add("satya");
		  arr.add(new Integer(27));    
		  arr.add(new Double(600000));   
		  arr.add("satya@gmail.com");
		 // System.out.print(arr);  
		}
}
