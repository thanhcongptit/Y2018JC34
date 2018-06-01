package com.imic.students.Dao_Thanh_Long;

public class Student {

	private String name;
	private int salary;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public Student(){
		
	}
	
	public Student(String name,int salary){
		this.name = name;
		this.salary = salary;
	}
	
	public String toString(){
		return "Ho ten :"+this.name+", luong : "+this.salary;
	}
}
