package com.imic.students.TruongQuangQuan.BaiTapBuoi11;

public class Employee {

	private String id;
	private String name;
	private double salary;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Employee(String id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Tên nhân viên : " + this.name + "-----ID: " + this.id + "-----Lương : " + this.salary;
	}
}
