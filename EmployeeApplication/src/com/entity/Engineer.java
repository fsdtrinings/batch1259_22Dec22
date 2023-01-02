package com.entity;

public class Engineer extends Employee{
	
	
	private String projectName;
	private String clientCallDetails;
	public Engineer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public String getClientCallDetails() {
		return clientCallDetails;
	}
	public void setClientCallDetails(String clientCallDetails) {
		this.clientCallDetails = clientCallDetails;
	}
	
	
	
	

}
