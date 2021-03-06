package com.hcl.department;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;
public class MainProg {
	public static void main(String[] args) {
		Configuration cfg=new AnnotationConfiguration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		Query q=s.createQuery("from Department");
		List list=q.list();
		
		for (Object ob : list) {
			Department e=(Department)ob;
			System.out.println("Deptno "+e.getDeptno());
			System.out.println("dName "+e.getDname());
			System.out.println("Loc "+e.getLoc());
			System.out.println("Head "+e.getHead());
			System.out.println("-------------------");
			
		}
	}

}

