package com.imic.students.Dao_Thanh_Long;

public class _20180515_Student implements Comparable<_20180515_Student> {
	private int id;
	private String name;
	private int age;
	private String addr;
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

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	public _20180515_Student() {

	}

	public _20180515_Student(int id, String name, int age, String addr,
			double gpa) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.addr = addr;
		this.gpa = gpa;
	}

	public void print_Out() {
		System.out.println("[ " + this.id + ", " + this.name + ", " + this.age
				+ ", " + this.addr + ", " + this.gpa + " ]");
	}

	@Override
	public int compareTo(_20180515_Student o) {

		return (int) (o.gpa - this.gpa);
	}
}
