package com.hcl.jason;

import org.json.simple.JSONObject;

public class JasonExample {
	public static void main(String args[]){    
		JSONObject obj=new JSONObject();    
		  obj.put("name","satya");    
		  obj.put("age",new Integer(22));    
		  obj.put("salary",new Double(40000));    
		   System.out.print(obj);    
		}

}
