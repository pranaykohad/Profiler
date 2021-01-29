package com.profiler.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.profiler.entity.Project;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Integer>{
	
	@Query(value = "SELECT p.* FROM project p where p.emp_id_emp_id=?1 order by p.state_date",  nativeQuery = true)
	public List<Project> findProjectByEmpId(int empId);
	
}
