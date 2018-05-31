package com.imic.student.TRAN_THANH_XUAN_BTVN_11_29052018;

import java.util.Scanner;


public class Person implements personExample {

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
	}

	@Override
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("ID: ");
		id = sc.nextLine();
		System.out.println("Name: ");
		name = sc.nextLine();
		System.out.println("Age: ");
		age = sc.nextInt();
		sc.nextLine();

	}

	@Override
	public void display() {
		System.out.println(toString());

	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return id + " " + name + " " + age;
	}

}
