package com.spring.orm.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.spring.orm.entities.Employee;

public class EmployeeDao {

	private HibernateTemplate hibernateTemplate;

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	// Save/Insert Employee
	@Transactional
	public int insert(Employee employee) {
		Integer i = (Integer) this.hibernateTemplate.save(employee);
		return 1;

	}

	// get single data(object)
	public Employee getEmployee(int employeeId) {
		Employee emp = this.hibernateTemplate.get(Employee.class, employeeId);
		return emp;
	}

	// get all employees(all rowsF)
	public List<Employee> getAllEmpoyees() {
		List<Employee> emp1 = this.hibernateTemplate.loadAll(Employee.class);
		return emp1;
	}

	// deleting data
	@Transactional
	public void deleteEmployee(int employeeId) {
		Employee emp2 = this.hibernateTemplate.get(Employee.class, employeeId);
		this.hibernateTemplate.delete(emp2);

	}

	// Updating data
	@Transactional
	public void updateEmployee(Employee employee) {
		this.hibernateTemplate.update(employee);
	}

}
