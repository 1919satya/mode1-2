package com.hcl.streams;

public class Employee {

	private int empno;
	private String empName;
	private float salary;
	private char band;
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public char getBand() {
		return band;
	}
	public void setBand(char band) {
		this.band = band;
	}
	public Employee() {
		super();
	}
	public Employee(int empno, String empName, float salary, char band) {
		super();
		this.empno = empno;
		this.empName = empName;
		this.salary = salary;
		this.band = band;
	}

}
