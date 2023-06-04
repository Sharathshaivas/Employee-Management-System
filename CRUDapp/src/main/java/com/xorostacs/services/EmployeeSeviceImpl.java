package com.xorostacs.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xorostacs.entity.Employee;
import com.xorostacs.repo.EmployeeRepo;
@Service
public class EmployeeSeviceImpl implements EmployeeService  {
	@Autowired
	private EmployeeRepo employeeRepo; 
	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-genera'ted method stub
		return employeeRepo.findAll();
	}
	@Override
	public void saveEmployee(Employee employee) {

		this.employeeRepo.save(employee);
	}
	@Override
	public Employee getEmployeeById(int id) {
		Optional<Employee> optional=employeeRepo.findById(id);
		Employee employee=null;
		if(optional.isPresent()) {
			employee=optional.get();
		}else {
			throw new RuntimeException("Employee not fount::"+id);
		}
		return employee;
	}
	@Override
	public void deleteEmployeeById(int id) {
		// TODO Auto-generated method stub
		this.employeeRepo.deleteById(id);
	}
	
	
}
