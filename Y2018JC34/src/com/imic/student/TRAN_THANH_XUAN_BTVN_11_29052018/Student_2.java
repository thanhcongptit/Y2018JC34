package com.imic.student.TRAN_THANH_XUAN_BTVN_11_29052018;

import java.util.Scanner;

public class Student_2 {
	private String name;
	private String id;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Name: ");
		name = sc.nextLine();
		System.out.println("ID:");
		id = sc.nextLine();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name + " " + id;
	}

}
