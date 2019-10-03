package com.journaldev.jaxrs.service;

import javax.ws.rs.core.Response;

import com.journaldev.jaxrs.model.Employee;

public interface EmployeeService {

	public Employee[] getAllEmployees();

}
