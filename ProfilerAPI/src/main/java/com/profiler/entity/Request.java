package com.profiler.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="request")
public class Request {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int requestId;
	@OneToOne
	private Employee requestFor;
	private String requestDate;
	private String status;
	
	@ManyToOne
	private Employee requestBy;

	public int getRequestId() {
		return requestId;
	}
	public void setRequestId(int requestId) {
		this.requestId = requestId;
	}
	public Employee getRequestFor() {
		return requestFor;
	}
	public void setRequestFor(Employee requestFor) {
		this.requestFor = requestFor;
	}
	public String getRequestDate() {
		return requestDate;
	}
	public void setRequestDate(String requestDate) {
		this.requestDate = requestDate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Employee getRequestBy() {
		return requestBy;
	}
	public void setRequestBy(Employee requestBy) {
		this.requestBy = requestBy;
	}
	
}
