package com.imic.students.TruongQuangQuan.BaiTapBuoi12;

import java.util.Scanner;

public class SinhVien {
	private int maSv;
	private String hoTen;
	private double diem;
	private String xepLoai;

	public int getMaSv() {
		return maSv;
	}

	public void setMaSv(int maSv) {
		this.maSv = maSv;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public double getDiem() {
		return diem;
	}

	public void setDiem(double diem) throws CheckDiemException {
		if (diem < 0 || diem > 10) {
			throw new CheckDiemException();
		}
		this.diem = diem;
	}

	public String getXepLoai() {
		if (diem >= 9) {
			this.xepLoai = "Xuất sắc";
		} else if (diem >= 8) {
			this.xepLoai = "Giỏi";
		} else if (diem >= 6.5) {
			this.xepLoai = "Khá";
		} else if (diem >= 5) {
			this.xepLoai = "TB";
		} else {
			this.xepLoai = "Yếu";
		}
		return xepLoai;
	}

	public SinhVien() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Họ tên : " + this.hoTen + "-----Mã sinh viên : " + this.maSv + "----Điểm : " + this.diem
				+ "----Xếp loại : " + this.getXepLoai();
	}

	public void input() {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Mời bạn nhập thông tinh sinh viên : ");

		System.out.println("Mã sv : ");
		this.maSv = scanner.nextInt();
		scanner.nextLine();

		System.out.println("Tên sv : ");
		this.hoTen = scanner.nextLine();

		boolean checkInput = true;
		do {
			try {
				System.out.println("Điểm : ");
				this.setDiem(scanner.nextDouble());
				checkInput = true;
			} catch (CheckDiemException e) {
				// e.printStackTrace();
				System.out.println(e.getMessage());
				scanner.nextLine();
				checkInput = false;
			}
		} while (!checkInput);

	}

}
