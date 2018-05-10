package com.imic.students.Vietanh.BaiTapVeNhaBuoi7;

public class Employee implements Comparable<Employee> {
	private String name;
	private int Salary;
	
	
	public String toString() {
		
		return "name: "+name+" , Salary: "+Salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return Salary;
	}
	public void setSalary(int salary) {
		Salary = salary;
	}
	@Override
	public int compareTo(Employee o) {
		return o.Salary-this.Salary;
	}
	
	

}
