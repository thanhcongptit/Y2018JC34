package com.imic.student.TRAN_THANH_XUAN_BTVN_10_25052018;

import java.util.Scanner;


public class SinhVienBz extends SinhVienPoly implements Comparable<SinhVienBz> {

	private double marketingMark;
	private double saleMark;

	@Override
	double getDiem() {
		double tb = (2 * marketingMark + saleMark) / 3;
		return tb;
	}

	@Override
	public void NhapSV() {
		Scanner sc = new Scanner(System.in);
		super.NhapSV();
		System.out.print("Diem Marketing: ");
		marketingMark = sc.nextDouble();
		System.out.print("Diem sale: ");
		saleMark = sc.nextDouble();
	}

	@Override
	public int compareTo(SinhVienBz o) {
		// TODO Auto-generated method stub
		return (int) o.getDiem() - (int) this.getDiem();
	}

}
