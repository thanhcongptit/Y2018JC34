package com.imic.student.ToMinhTuyen.btvn.buoi9;

import java.util.Comparator;

public class Student9 implements Comparable <Student9> {
	private String id;
	private String name;
	private int age;
	private String address;
	private double gpa;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public double getGpa() {
		return gpa;
	}
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "ID: "+getId()+"		Name: "+getName()+"		Age: "+ getAge()+"		address: "+ getAddress()+"		gpa: "+getGpa();
	}
	public int compareTo(Student9 o) {
		return o.getName().compareTo(this.name);
	}
	
	
	
	
	
}
