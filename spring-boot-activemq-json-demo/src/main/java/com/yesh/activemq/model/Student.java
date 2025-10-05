package com.yesh.activemq.model;

import java.io.Serializable;

public class Student implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private int stuId;
	private String name;
	private String email;
	
	public int getStuId() {
		return stuId;
	}
	public void setStuId(int stuId) {
		this.stuId = stuId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "Student [stuId=" + stuId + ", name=" + name + ", email=" + email + "]";
	}
	
	

}
