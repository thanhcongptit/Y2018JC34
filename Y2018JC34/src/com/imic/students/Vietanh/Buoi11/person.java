package com.imic.students.Vietanh.Buoi11;

import java.util.Scanner;

public class person implements personExample {
    protected String id;
    protected String name;
    protected int tuoi;
	
	public person() {};
	public person(String id, String name, int tuoi) {
		super();
		this.id = id;
		this.name = name;
		this.tuoi = tuoi;
	}

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

	public int getTuoi() {
		return tuoi;
	}

	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}

	
	Scanner sc = new Scanner(System.in);
	@Override
	public void input() {
		System.out.println("Xin moi nhap ho ten:");
		setName(sc.nextLine());
		System.out.println("Xin moi nhap tuoi");
		setTuoi(sc.nextInt());
		sc.nextLine();
		System.out.println("Xin moi nhap dia chi");
		setId(sc.nextLine());
		
	}

	@Override
	public void display() {
		System.out.println("Thong tin:");
		System.out.println("Name:"+getName());
		System.out.println("Age:"+getTuoi());
		System.out.println("Dia chi:"+getId());
		
	}

}
