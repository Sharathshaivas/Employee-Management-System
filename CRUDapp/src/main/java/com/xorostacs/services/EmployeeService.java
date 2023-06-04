package com.xorostacs.services;

import java.util.List;

import com.xorostacs.entity.Employee;

public interface EmployeeService {

	List<Employee> getAllEmployees();
	void saveEmployee(Employee employee);
	
	Employee getEmployeeById(int id);
	
	void deleteEmployeeById(int id);
}
