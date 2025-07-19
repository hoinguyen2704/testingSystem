package com.vti.entity;

public class Department {

	private Integer departmaentId;
	private String departmentName;

	public Department(Integer departmaentId, String departmentName) {
		this.departmaentId = departmaentId;
		this.departmentName = departmentName;
	}

	public Department(String departmentName) {
		this.departmentName = departmentName;
	}

	public Department() {
	}

	public Integer getDepartmaentId() {
		return departmaentId;
	}

	public void setDepartmaentId(Integer departmaentId) {
		this.departmaentId = departmaentId;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
}
