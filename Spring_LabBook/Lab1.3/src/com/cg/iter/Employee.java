package com.cg.iter;

import java.util.List;

public class Employee {
	   private int employeeId;
	   private String employeeName ;
	   private double salary;
	   private SBU businessunit ;
	   private List<String> emplist;
	   
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int employeeId, String employeeName, double salary, SBU businessunit) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.salary = salary;
		this.businessunit = businessunit;
	}
	
	
	@Override
	public String toString() {
		return "Employee [[employeeId=" + employeeId + ", employeeName=" + employeeName + ", salary=" + salary +" Employee=" + emplist + " ,\nSBU Details\n--------\nSBU =" + businessunit + "]";
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	
	public List<String> getEmplist() {
		return emplist;
	}
	public void setEmplist(List<String> emplist) {
		this.emplist = emplist;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public SBU getbusinessunit() {
		return businessunit;
	}
	public void setbusinessunit(SBU businessunit) {
		this.businessunit = businessunit;
	}
	public String getSubDetails(String subCode, String subName, String subHead) {
		return "SBU [subCode=" + subCode + ", subName=" + subName + ", subHead=" + subHead + "]";
	}

}