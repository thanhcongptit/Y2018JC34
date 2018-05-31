package com.imic.students.DO_NAM_HAI.BaiTapVeNhaBuoi11;

import java.util.Scanner;

public class person implements personExample {
	protected String id;
	protected String name;
	protected int age;

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
		if (age>100 || age<0) {
			System.out.println(" moi ban nhap lai tuoi");
		}
	}

	public person() {

	}

	public person(String id, String name, int age) {

		this.id = id;
		this.name = name;
		this.age = age;
	}

	Scanner nhap = new Scanner(System.in);

	@Override
	public String toString() {
		return "person [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

	@Override
	public void input() {
		System.out.print(" moi ban nhap id : ");
		id = nhap.nextLine();
		System.out.print(" moi ban nhap ten : ");
		name = nhap.nextLine();
		System.out.print(" moi ban nhap tuoi : ");
		age = nhap.nextInt();

	}

	@Override
	public void display() {

		System.out.println(toString());
	}

}
