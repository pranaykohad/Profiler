package com.profiler.service;

import java.util.List;

import com.profiler.entity.Project;

public interface ProjectService {
	
	public List<Project> findProjectByEmpId(int empId);

}
