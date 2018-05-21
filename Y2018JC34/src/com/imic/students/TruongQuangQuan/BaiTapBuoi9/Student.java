package com.imic.students.TruongQuangQuan.BaiTapBuoi9;

public class Student implements Comparable<Student> {

	private int id;
	private String name;
	private int age;
	private String address;
	private double gpa;

	public int getId() {
		return id;
	}

	public void setId(int id) {
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
		return "name:" + this.name + "-----Id: " + this.id + "-----Tuổi:" + this.age + "----Địa chỉ: " + this.address
				+ "-----Điểm TB:" + this.gpa;
	}

	@Override
	public int compareTo(Student o) {
		if (o.getGpa() > this.gpa) {
			return 1;
		} else if (o.getGpa() < this.gpa) {
			return -1;
		} else
			return 0;
	}
}
