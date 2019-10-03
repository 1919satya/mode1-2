package com.hcl.departmentshow;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hcl.departmentshow.DepartmentQueryDao;

public class MainProg {
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("jdbc.xml");
		DepartmentQueryDao d=(DepartmentQueryDao)ctx.getBean("myDao");
		d.showDepartment();
		System.out.println("Department Details are...");
	}


}
