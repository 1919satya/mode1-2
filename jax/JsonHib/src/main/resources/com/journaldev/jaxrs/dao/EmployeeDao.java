package com.journaldev.jaxrs.dao;

import java.util.List;

import javax.ws.rs.core.Response;

import com.journaldev.jaxrs.model.Employee;

public interface EmployeeDao {
public List<Employee> getAllEmployees();

}
