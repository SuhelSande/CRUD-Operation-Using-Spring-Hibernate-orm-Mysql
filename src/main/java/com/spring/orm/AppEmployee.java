package com.spring.orm;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.orm.dao.EmployeeDao;
import com.spring.orm.entities.Employee;

/**
 * Hello world!
 *
 */
public class AppEmployee {
	public static void main(String[] args) {

		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

		EmployeeDao employeeDao = context.getBean("employeeDao", EmployeeDao.class);

		// Executing one by one but at a time execute only one and other commenting

		// Employee employee = new Employee(1, "Raj", "Verma", "raj.verma@imagine.com",
		// 35);

		// Employee employee = new Employee(2, "Vaibhav", "Telang",
		// "v.telang@futureready.com", 29);
		// Employee employee = new Employee(3, "Ketan", "Bahadur",
		// "k.bahadur@infonext.com", 32);
		Employee employee = new Employee(4, "Abhishek", "Raj", "abhi.raj@softsol.com", 30);

		// insert data

		int r = employeeDao.insert(employee);
		System.out.println(" done " + r);

		// read single employee via employeeId
		Employee e1 = employeeDao.getEmployee(1);
		System.out.println("single student info " + e1.getEmployeeFirstName());

		// read multiple employee data
		List<Employee> e = employeeDao.getAllEmpoyees();

		for (Employee e11 : e) {
			System.out.println(e11);
		}

		// update data
		// employeeDao.updateEmployee(employee);

		// delete data
		// employeeDao.deleteEmployee(4);

	}
}
