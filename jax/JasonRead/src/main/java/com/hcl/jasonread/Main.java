package com.hcl.jasonread;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Stream;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

import com.hcl.jason.model.Employee;

public class Main {

@SuppressWarnings("unchecked")
public static void main(String[] args) throws IOException {

StringBuilder contentBuilder = new StringBuilder();
List<Employee> obj1=new ArrayList<Employee>();

   try (Stream<String> stream= Files.lines( Paths.get("C:\\Users\\coalesce\\Downloads\\sai.json"), StandardCharsets.UTF_8))
   {
       stream.forEach(s -> contentBuilder.append(s));
   }
   catch (IOException e)
   {
       e.printStackTrace();
   }
   String s= contentBuilder.toString();
   Object obj=JSONValue.parse(s);
   
   JSONObject jsonObject = (JSONObject) obj;  
   JSONObject jsonobj=(JSONObject) jsonObject.get("employees");
   JSONArray array=(JSONArray) jsonobj.get("employee");
 
   for(int i=0;i<array.size();i++){
    JSONObject object=(JSONObject) array.get(i);
    long empno = (long) object.get("empno");  
    String name = (String) object.get("empName");  
   long salary = (long) object.get("salary");
   String band = (String) object.get("band");
   Date doj = (Date) object.get("dateOfJoin");  
   System.out.println(empno+" "+name+" "+salary+" "+band+" "+doj);  
   Employee em=new Employee();
   em.setEmpno(empno);
   em.setEmpName(name);
   em.setSalary(salary);
   em.setBand(band);
   em. setDateOfJoin(doj);
   obj1.add(em);
   System.out.println(obj1.size());
   
   
   
   }  
}  
}

