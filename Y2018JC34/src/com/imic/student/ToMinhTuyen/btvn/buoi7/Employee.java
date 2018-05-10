package com.imic.student.ToMinhTuyen.btvn.buoi7;

public class Employee {
	private String name;
	private double salary;
	
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
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "employee: "+ this.name+ " >>>>>> Salary: "+this.salary;
	}
	public int compareTo(Employee o) {
		return this.name.compareTo(o.name);
	}
	
	
	

}
