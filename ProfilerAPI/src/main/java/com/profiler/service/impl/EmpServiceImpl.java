package com.profiler.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.profiler.entity.Employee;
import com.profiler.entity.Result;
import com.profiler.repository.EmpRepository;
import com.profiler.service.EmpService;

@Service
public class EmpServiceImpl implements EmpService {
	
	private static final Logger LOG = LoggerFactory.getLogger("EmpServiceImpl.class");
	
	@Autowired
	private EmpRepository empRepository;

	@Override
	public Employee addEmployee(Employee employee) {
		return empRepository.save(employee);
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee autheticateEmployee(String userName, String password) {
		return empRepository.getEmployeeByUserNameAndPassword(userName, password);
	}

	@Override
	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result deleteEmployee(String empId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Long empCount() {
		return empRepository.getCount();
	}

}
