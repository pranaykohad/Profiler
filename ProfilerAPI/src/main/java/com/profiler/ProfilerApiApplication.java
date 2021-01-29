package com.profiler;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.profiler.entity.Employee;
import com.profiler.service.EmpService;

@SpringBootApplication(scanBasePackages="com")
@EntityScan("com.profiler.entity")
@EnableJpaRepositories("com.profiler.repository")
public class ProfilerApiApplication {

	private static final Logger LOG = LoggerFactory.getLogger("ProfilerApiApplication.class");
	
	@Autowired 
	private EmpService empService;
	
	public static void main(String[] args) {
		SpringApplication.run(ProfilerApiApplication.class, args);
		LOG.debug("Profiler started..........");
		
	}

	@PostConstruct
    public void init(){
		LOG.debug("employee count: {}" ,empService.empCount());
		if(empService.empCount() == 0) {
			final Employee adminUser = new Employee(); 
			adminUser.setFirstName("Admin");
			adminUser.setMiddleName("Admin");
			adminUser.setLastName("Admin");
			adminUser.setUserName("admin");
			adminUser.setPassword("admin");
			adminUser.setRole("ADMIN");
			adminUser.setStatus("OCCUPIED");
			empService.addEmployee(adminUser);
		}
    }
}
