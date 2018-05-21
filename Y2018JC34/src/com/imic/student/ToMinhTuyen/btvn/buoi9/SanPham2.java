package com.imic.student.ToMinhTuyen.btvn.buoi9;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

import com.imic.student.ToMinhTuyen.btvn.buoi7.Employee;

public class SanPham2 implements Comparable<SanPham2> {

	private String tensanpham;
	private double giasanpham;

	public String getTensanpham() {
		return tensanpham;
	}

	public void setTensanpham(String tensanpham) {
		this.tensanpham = tensanpham;
	}

	public double getGiasanpham() {
		return giasanpham;
	}

	public void setGiasanpham(double giasanpham) {
		this.giasanpham = giasanpham;
	}
	
	public void Xuat() {
		System.out.println("SanPham: " + getTensanpham() + "-> Gia: "+ getGiasanpham());;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "SanPham: " + getTensanpham() + " Gia: "+ getGiasanpham();
	}

	public int compareTo(SanPham2 o) {
		return (int) (o.getGiasanpham()-this.giasanpham);
	}



}