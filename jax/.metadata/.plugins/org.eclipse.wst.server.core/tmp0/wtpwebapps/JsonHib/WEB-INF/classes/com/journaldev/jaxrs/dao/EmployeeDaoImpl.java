 package com.journaldev.jaxrs.dao;

import java.util.List;

import javax.ws.rs.core.Response;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.journaldev.jaxrs.model.Employee;

public class EmployeeDaoImpl implements EmployeeDao {
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<Employee> getAllEmployees() {
		

			return sessionFactory.getCurrentSession().createQuery("from Employee").list();
		
		
		
	}

}