package com.evergent.corejava.divya.casestudy;

public class Employee {
	private int id;
	private String name;
	private String department;
	public Employee(int id, String name, String department) {
		this.id=id;
		this.name=name;
		this.department=department;	
	}
	public int getid() {
		return id;
	}
	public void setId(int id) {
		id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
public String toString() {
	return "Employee Id: "+id + ", Employee name: "+name + ", Employee department: "+department;
}
}
