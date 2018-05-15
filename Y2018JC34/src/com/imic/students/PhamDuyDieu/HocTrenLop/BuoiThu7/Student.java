package com.imic.students.PhamDuyDieu.HocTrenLop.BuoiThu7;

import java.util.Scanner;

public class Student {
	private String ten;
	private int tuoi;
	private int diem;
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public int getTuoi() {
		return tuoi;
	}
	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}
	public int getDiem() {
		return diem;
	}
	public void setDiem(int diem) {
		this.diem = diem;
	}
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập tên: ");
		this.ten = new Scanner(System.in).nextLine();
		System.out.println("Nhập tuổi: ");
		this.tuoi = sc.nextInt();
		System.out.println("Nhập điểm: ");
		this.diem = sc.nextInt();
	}
	public void output() {
		System.out.println("Tên sinh viên: "+ this.ten);
		System.out.println("Tuổi sinh viên: "+ this.tuoi);
		System.out.println("Điểm sinh viên: "+ this.diem);
	}
}
