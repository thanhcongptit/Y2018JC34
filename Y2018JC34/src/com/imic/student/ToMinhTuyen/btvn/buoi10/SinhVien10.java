package com.imic.student.ToMinhTuyen.btvn.buoi10;

import java.util.ArrayList;
import java.util.Scanner;

public class SinhVien10 {
	private String hoten;
	private String email;
	private String sodt;
	private String socmnd;

	public String getHoten() {
		return hoten;
	}

	public void setHoten(String hoten) {
		this.hoten = hoten;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSodt() {
		return sodt;
	}

	public void setSodt(String sodt) {
		this.sodt = sodt;
	}

	public String getSocmnd() {
		return socmnd;
	}

	public void setSocmnd(String socmnd) {
		this.socmnd = socmnd;
	}

	@Override
	public String toString() {
		System.out.printf("\n Ho Ten: %-20s \t So DT: %-10s \t So CMND: %-10s \t Email: %-20s", getHoten(), getSodt(),
				getSocmnd(), getEmail());
		return " ";
	}

	public void nhapSinhvien(Scanner scanner, ArrayList<SinhVien10> sinhvienList) {
		while (true) {

			SinhVien10 sinhvien = new SinhVien10();
			String mobile = "0\\d{9,10}";
			String cmnd = "\\d{9,10}";
			// String mail = "\W+@\W+(\.\W){1,2}"

			System.out.println("Nhap ho ten sinh vien:");
			sinhvien.hoten = scanner.nextLine();

			System.out.println("Nhap so dien thoai");

			sinhvien.sodt = scanner.nextLine();
			if (!sodt.matches(mobile)) {
				System.out.println("So dien thoai khong dung");
			}
			System.out.println("Nhap so cmnd");

			sinhvien.socmnd = scanner.nextLine();
			if (!socmnd.matches(cmnd)) {
				System.out.println("So cmnd khong dung");
			}
			System.out.println("Nhap Email");
			sinhvien.email = scanner.nextLine();

			sinhvienList.add(sinhvien);

			System.out.println("Ban co muon nhap them sinh vien khong: Y/N");
			if (scanner.nextLine().equalsIgnoreCase("N")) {
				break;
			}

		}

	}

	public void xuatSinhvien() {
		System.out.printf("\n Ho Ten: %-20s \t So DT: %-10s \t So CMND: %-10s \t Email: %-20s", getHoten(), getSodt(),
				getSocmnd(), getEmail());
	}

}
