package com.profiler.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="emp")
public class Employee {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int empId;
	private String userName;
	private String password;
	private String careerStart;
	private String careerStartBC;
	private String role;
	private String firstName;
	private String middleName;
	private String lastName;
	private String status;
	
	@OneToOne
	private Attachment profile;
	
	@OneToMany(mappedBy = "empId", cascade = CascadeType.ALL)
	@JsonIgnore
	private List<Project> projectList;
	
	@OneToMany(mappedBy = "empId", cascade = CascadeType.ALL)
	@JsonIgnore
	private List<Skill> skillList;
	
	@OneToMany(mappedBy = "requestBy", cascade = CascadeType.ALL)
	@JsonIgnore
	private List<Request> requestList;

	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCareerStart() {
		return careerStart;
	}
	public void setCareerStart(String careerStart) {
		this.careerStart = careerStart;
	}
	public String getCareerStartBC() {
		return careerStartBC;
	}
	public void setCareerStartBC(String careerStartBC) {
		this.careerStartBC = careerStartBC;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public List<Project> getProjectList() {
		return projectList;
	}
	public void setProjectList(List<Project> projectList) {
		this.projectList = projectList;
	}
	public Attachment getProfile() {
		return profile;
	}
	public void setProfile(Attachment profile) {
		this.profile = profile;
	}
	public List<Skill> getSkillList() {
		return skillList;
	}
	public void setSkillList(List<Skill> skillList) {
		this.skillList = skillList;
	}
	public List<Request> getRequestList() {
		return requestList;
	}
	public void setRequestList(List<Request> requestList) {
		this.requestList = requestList;
	}
	
}
