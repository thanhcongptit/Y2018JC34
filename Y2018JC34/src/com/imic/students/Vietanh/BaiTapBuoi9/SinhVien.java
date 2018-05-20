package com.imic.students.Vietanh.BaiTapBuoi9;

import java.util.Scanner;

public class SinhVien implements Comparable<SinhVien>{
	Scanner sc = new Scanner(System.in);
	private String name;
	private int id;
	private int age;
	private String ad;
	private double diemtrungbinh;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public double getDiemtrungbinh() {
		return diemtrungbinh;
	}

	public void setDiemtrungbinh(double diemtrungbinh) {
		this.diemtrungbinh = diemtrungbinh;
	}
	


	@Override
	public String toString() {
		return "Ten sinh vien: "+getName()+
				"-------ma sinh vien: "+getId()+
				"-------tuoi sinh vien: "+getAge()+
				"--------dia chi sinh vien: "+getAd()+
				"-------diem trung binh sinh vien"+getDiemtrungbinh();
	}

	@Override
	public int compareTo(SinhVien o) {
		return this.getName().compareTo(o.getName());
	}
	

}
