package com.imic.student.TRAN_THANH_XUAN_BTVN_10_25052018;

import java.util.Scanner;

public class SinhVienIT extends SinhVienPoly implements Comparable<SinhVienIT> {

	private double javaMark;
	private double htmlMark;
	private double cssMark;

	public double getJavaMark() {
		return javaMark;
	}

	public void setJavaMark(double javaMark) {
		this.javaMark = javaMark;
	}

	public double getHtmlMark() {
		return htmlMark;
	}

	public void setHtmlMark(double htmlMark) {
		this.htmlMark = htmlMark;
	}

	public double getCssMark() {
		return cssMark;
	}

	public void setCssMark(double cssMark) {
		this.cssMark = cssMark;
	}

	@Override
	double getDiem() {
		double tb = (2 * javaMark + htmlMark + cssMark) / 4;
		return tb;
	}

	@Override
	public void NhapSV() {
		Scanner sc = new Scanner(System.in);
		super.NhapSV();
		System.out.print("Diem java: ");
		javaMark = sc.nextDouble();
		System.out.print("Diem html: ");
		htmlMark = sc.nextDouble();
		System.out.print("Diem css: ");
		cssMark = sc.nextDouble();

	}

	public void show() {
		SinhVienIT sIt = new SinhVienIT();
		sIt.toString();
	}

	@Override
	public int compareTo(SinhVienIT o) {
		// TODO Auto-generated method stub
		return (int) o.getDiem() - (int) this.getDiem();
	}

}
