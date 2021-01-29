package com.profiler.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.profiler.entity.Employee;
import com.profiler.entity.Project;
import com.profiler.entity.Result;
import com.profiler.entity.Result.ResStatus;
import com.profiler.service.EmpService;
import com.profiler.service.ProjectService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")
public class ProjectController {

	private static final Logger LOG = LoggerFactory.getLogger("ProjectController.class");
	
	@Autowired
	ProjectService projService;


	@GetMapping("/project/{empId}")
	public Result getAllUser(@PathVariable int empId) {
		final Result result = new Result();
		final List<Project> projects = projService.findProjectByEmpId(empId);
		if(projects.isEmpty()) {
			result.setStatus(ResStatus.FAILURE);
		} else {
			result.setData(projService.findProjectByEmpId(empId));
			result.setDescription("ok");
			result.setStatus(ResStatus.SUCCESS);
		}
		return result;
	}
	

}
