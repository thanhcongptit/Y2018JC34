package com.imic.students.PhamDuyDieu.BaiTapVeNha.BuoiThu9;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		menu();
		Scanner sc = new Scanner(System.in);
		ArrayList<sinhVien> is = new ArrayList<sinhVien>();
		addSTD(is, sc);
		showSTD(is, sc);
		editSTD(is, sc);
		showSTD(is, sc);
		

	}
	public static void menu() {
		System.out.println("CHỌN CHỨC NĂNG");
		System.out.println("1. Add student");
		System.out.println("2. Edit student by id.");
		System.out.println("3. Delete student by id.");
		System.out.println("4. Sort student by gpa.");
		System.out.println("5. Sort student by name.");
		System.out.println("6. Show student.");
		System.out.println("0. Exit.");	
	}
	public static void add1STD(ArrayList<sinhVien> is, Scanner sc) {
		sinhVien sv = new sinhVien();
		
		System.out.println("ID: ");
		int id = sc.nextInt();
		sv.setId(id);
		
		System.out.println("Tên: ");
		String name = new Scanner(System.in).nextLine();
		sv.setName(name);
		
		System.out.println("Tuổi: ");
		int age = sc.nextInt();
		sv.setAge(age);
		
		System.out.println("Địa chỉ: ");
		String address = new Scanner(System.in).nextLine();
		sv.setAddress(address);
		
		System.out.println("GPA: ");
		int gpa = sc.nextInt();
		sv.setGpa(gpa);
		
		is.add(sv);
	}
	public static void addSTD(ArrayList<sinhVien> is, Scanner sc) {
		int soLuong=0;
		System.out.println("Nhập số lượng sinh viên muốn thêm: ");
		soLuong = sc.nextInt();
		for(int i=0; i<soLuong; i++) {
			add1STD(is, sc);
		}
	}
	public static void editSTD(ArrayList<sinhVien> is, Scanner sc) {
		System.out.println("Nhập ID sinh viên muốn sửa: ");
		int idEdit = sc.nextInt();
		for(int i=0; i<is.size();i++) {
			if(idEdit==is.get(i).getId()) {
				System.out.println("Nhập tên: ");
				is.get(i).setName(new Scanner(System.in).nextLine());
				System.out.println("Nhập tuổi: ");
				is.get(i).setAge(sc.nextInt());
				System.out.println("Nhập địa chỉ: ");
				is.get(i).setAddress(new Scanner(System.in).nextLine());
				System.out.println("Nhập GPA");
				is.get(i).setGpa(sc.nextInt());
			}
		}
	}
	public static void deleteSTD(ArrayList<sinhVien> is, Scanner sc) {
		System.out.println("Nhập ID sinh viên muốn sửa: ");
		int idEdit = sc.nextInt();
		for(int i=0; i<is.size();i++) {
			if(idEdit==is.get(i).getId()) {
				is.remove(i);
			}
		}
	}
	public static void showSTD(ArrayList<sinhVien> is, Scanner sc) {
		for(int i = 0; i<is.size(); i++) {
			System.out.println(is.get(i).toString());
		}
	}
}
