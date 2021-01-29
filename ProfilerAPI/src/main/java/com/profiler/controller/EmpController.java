package com.profiler.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.profiler.entity.Employee;
import com.profiler.entity.Result;
import com.profiler.entity.Result.ResStatus;
import com.profiler.service.EmpService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")
public class EmpController {

	private static final Logger LOG = LoggerFactory.getLogger("EmpController.class");
	
	@Autowired
	EmpService empService;


	@PostMapping("/authenticate")
	public Result authnticateUser(@RequestBody final Employee emp) {
		final Result result = new Result();
		final Employee resultEmp = empService.autheticateEmployee(emp.getUserName(), emp.getPassword());
		if (resultEmp != null) {
			result.setData(resultEmp);
		} else {
			result.setDescription("Some error while Autheticating. Please contact Administratator.");
			result.setStatus(ResStatus.FAILURE);
			LOG.error("Some error while Autheticating. Please contact Administratator with user {}", emp.getEmpId());
		}
		return result;
	}

	@PostMapping("/update")
	public Result updateDetails(@RequestBody final Employee user) {
		final Result result = new Result();
		return result;
	}

	@GetMapping("/user")
	public Result getAllUser() {
		final Result result = new Result();
		result.setData(null);
		result.setDescription("ok");
		result.setStatus(ResStatus.SUCCESS);
		return result;
	}
	

}
