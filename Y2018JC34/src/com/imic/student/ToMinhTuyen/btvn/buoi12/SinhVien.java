package com.imic.student.ToMinhTuyen.btvn.buoi12;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SinhVien {
	private int masv;
	private String hoten;
	private int diem;
	private String xeploai;

	private static final int DIEM = 0;
	private static final String XEPLOAI = "CHUA_XEP_LOAI";
	private static final int MASV = 0;
	private static final String HOTEN = "CHUA_CO_TEN";

	public SinhVien(int masv, String hoten, int diem, String xeploai) {
		this.masv = masv;
		this.hoten = hoten;
		this.diem = diem;
		this.xeploai = xeploai;

	}

	public SinhVien() {
		this(MASV, HOTEN, DIEM, XEPLOAI);

	}

	public int getMasv() {
		return masv;
	}

	public void setMasv(int masv) {
		this.masv = masv;
	}

	public String getHoten() {
		return hoten;
	}

	public void setHoten(String hoten) {
		this.hoten = hoten;
	}

	public int getDiem() {
		return diem;
	}

	public void setDiem(int diem) {
		this.diem = diem;
	}

	public String getXeploai() {
		return xeploai;
	}

	public void setXeploai(String xeploai) {
		this.xeploai = xeploai;
	}

	public void setXeploai() {
		if (diem >= 8) {
			xeploai = "Gioi";

		} else if (diem >= 7) {
			xeploai = "Kha";

		} else if (diem >= 5) {
			xeploai = "Trung binh";

		} else {
			xeploai = "kem";
		}
	}

	@Override
	public String toString() {

		return "MSV: " + masv + "\t Ho ten: " + hoten + "\t Diem: " + diem + "\t Xep loai: " + xeploai + "\n";
	}

	public void nhap() {
		Scanner input = new Scanner(System.in);
		boolean check = true;
		while (check) {
			try {
				System.out.println("Nhap ma sinh vien");
				masv = input.nextInt();
				input.nextLine();
				check = false;
			} catch (InputMismatchException e) {
				System.out.println("Ban nhap sai kieu du lieu !");
				input.nextLine();
			}
		}
		check = true;
		while (check) {
			try {
				System.out.println("Nhap ho ten");
				hoten = input.nextLine();
				check = false;
			} catch (Exception e) {
				System.out.println("Ban nhap sai kieu du lieu !");
			}
		}
		check = true;
		while (check) {
			try {
				System.out.println("Nhap diem");
				diem = input.nextInt();
				if (diem > 10 || diem < 0) {
					throw new Diemexception(diem);
				}
				check = false;
			} catch (Diemexception e) {
				System.out.println("Diem phai >=0 va <= 10");
			} catch (InputMismatchException e) {
				System.out.println("Ban nhap sai kieu du lieu (int)");
				input.nextLine();
			}

		}
	}

	public static void main(String[] args) {
		SinhVien s = new SinhVien();
		System.out.println("Sinh vien: " + s);
		s.nhap();
		s.setXeploai();
		System.out.println("Sau khi nhap");
		System.out.println(s);
	}
}
