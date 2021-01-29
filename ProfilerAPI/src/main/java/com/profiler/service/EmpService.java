package com.profiler.service;

import java.util.List;

import com.profiler.entity.Employee;
import com.profiler.entity.Result;

public interface EmpService {
	
	public Employee addEmployee(final Employee employee);
	public Employee updateEmployee(final Employee employee);
	public Employee autheticateEmployee(final String userName, final String password);
	public List<Employee> getAllEmployee();
	public Result deleteEmployee(final String empId);
	public Long empCount();
	
}
