package com.profiler.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.profiler.entity.Employee;

@Repository
public interface EmpRepository extends JpaRepository<Employee, Integer>{
	
	@Query(value="SELECT count(*) FROM emp", nativeQuery = true)
	public Long getCount();
	
	public Employee getEmployeeByUserNameAndPassword(String userName, String password);
	
}
