package com.imic.students.PhamDuyDieu.BaiTapVeNha.BuoiThu11;

import java.util.Scanner;

public class Person implements personExample {
	protected String id;
	protected String name;
	protected int age;
	public static Scanner sc = new Scanner(System.in);

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
	public String toString() {
		// TODO Auto-generated method stub
		return "ID: " + id + "\nTên: " + name + "\nTuổi: " + age;
	}

	@Override
	public void input() {
		// TODO Auto-generated method stub
		System.out.println("Nhập ID: ");
		id = new Scanner(System.in).nextLine();
		System.out.println("Nhập tên: ");
		name = new Scanner(System.in).nextLine();
		System.out.println("Nhập tuổi: ");
		age = sc.nextInt();
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println(toString());
	}

}
