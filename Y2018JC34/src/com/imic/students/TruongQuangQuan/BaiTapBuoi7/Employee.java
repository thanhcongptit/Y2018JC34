package com.imic.students.TruongQuangQuan.BaiTapBuoi7;

public class Employee implements Comparable<Employee> {

	private String name;
	private Double salary;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public void print() {
		System.out.print(name+" : "+salary);
		System.out.println();
	}

	@Override
	public int compareTo(Employee o) {
		return this.name.compareTo(o.getName());
	}

	@Override
	public String toString() {
		return 	"Tên\t: "+this.name + "\t------" + "\tLương: "+this.salary;
	}

	
	
}