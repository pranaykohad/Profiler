package com.profiler.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.profiler.entity.Project;
import com.profiler.repository.EmpRepository;
import com.profiler.repository.ProjectRepository;
import com.profiler.service.ProjectService;

@Service
public class ProjectServiceImpl implements ProjectService {

private static final Logger LOG = LoggerFactory.getLogger("ProjectServiceImpl.class");
	
	@Autowired
	private ProjectRepository projRepository;

	@Override
	public List<Project> findProjectByEmpId(int empId) {
		return projRepository.findProjectByEmpId(empId);
	}

}
