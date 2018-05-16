package com.imic.student.TRAN_THANH_XUAN_BTVN_9_150518;


public class Student implements Comparable<Student> {
	private String name;
	private int age;
	private int mark;

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

	public int getMark() {
		return mark;
	}

	public void setMark(int mark) {
		this.mark = mark;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name + "   " + age + "   " + mark;
	}

	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return o.mark - this.mark;
	}

}
