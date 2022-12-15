package com.spring.orm.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employee_details")
public class Employee {
	@Id
	@Column(name = "Id")
	private int employeeId;

	@Column(name = "FirstName")
	private String employeeFirstName;

	@Column(name = "LastName")
	private String empLastName;

	@Column(name = "Email")
	private String empEmail;

	@Column(name = "Age")
	private int empAge;

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeFirstName() {
		return employeeFirstName;
	}

	public void setEmployeeFirstName(String employeeFirstName) {
		this.employeeFirstName = employeeFirstName;
	}

	public String getEmpLastName() {
		return empLastName;
	}

	public void setEmpLastName(String empLastName) {
		this.empLastName = empLastName;
	}

	public String getEmpEmail() {
		return empEmail;
	}

	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}

	public int getEmpAge() {
		return empAge;
	}

	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}

	public Employee(int employeeId, String employeeFirstName, String empLastName, String empEmail, int empAge) {
		super();
		this.employeeId = employeeId;
		this.employeeFirstName = employeeFirstName;
		this.empLastName = empLastName;
		this.empEmail = empEmail;
		this.empAge = empAge;
	}

	public Employee() {

	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeFirstName=" + employeeFirstName + ", empLastName="
				+ empLastName + ", empEmail=" + empEmail + ", empAge=" + empAge + "]";
	}

}
