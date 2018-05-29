package com.imic.students.DO_NAM_HAI.BaiTapVeNhaBuoi10;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab6_Bai3_SinhVien {
	private String hoTen;
	private String email;
	private String soDienThoai;
	private String cmt;

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSoDienThoai() {
		return soDienThoai;
	}

	public void setSoDienThoai(String soDienThoai) {
		this.soDienThoai = soDienThoai;
	}

	public String getCmt() {
		return cmt;
	}

	public void setCmt(String cmt) {
		this.cmt = cmt;
	}

	@Override
	public String toString() {
		return "Lab6_Bai3_SinhVien [hoTen=" + hoTen + ", email=" + email + ", soDienThoai=" + soDienThoai + ", cmt="
				+ cmt + "]";
	}

	Scanner nhap = new Scanner(System.in);
	ArrayList<Lab6_Bai3_SinhVien> sinhVien = new ArrayList<Lab6_Bai3_SinhVien>();

	public void input() {
		for (int i = 0; i < 4; i++) {
			Lab6_Bai3_SinhVien sv = new Lab6_Bai3_SinhVien();
			
				System.out.print("ho ten : ");
				sv.hoTen = nhap.nextLine();
				
			while (true) {
				System.out.print("email : ");
				sv.email = nhap.nextLine();
				String checkEmail = "\\w+@\\w+\\.\\w+";
				if (sv.email.matches(checkEmail)) {
					break;
				} else {
					System.out.println("Moi ban nhap lai email");
				}
			}
			while (true) {
				System.out.print("so dien thoai :");
				sv.soDienThoai = nhap.nextLine();
				String checkSoDienThoai = "0\\d{9,10}";
				if (sv.soDienThoai.matches(checkSoDienThoai)) {
					break;
				} else {
					System.out.println("Moi ban nhap lai so dien thoai");
				}
			}
			while (true) {
				System.out.print("CMT : ");
				sv.cmt = nhap.nextLine();
				String checkCMT = "\\d{9}";
				if (sv.cmt.matches(checkCMT)) {
					break;
				} else {
					System.out.println("Moi ban nhap lai CMT");
				}
			}

			sinhVien.add(sv);

		}
	}

	public void output() {
		for (int i = 0; i < 4; i++) {
			System.out.println(sinhVien.get(i).toString());
		}
	}

}
