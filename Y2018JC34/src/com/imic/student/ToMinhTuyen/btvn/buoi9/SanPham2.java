package com.imic.student.ToMinhTuyen.btvn.buoi9;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

import com.imic.student.ToMinhTuyen.btvn.buoi7.Employee;

public class SanPham2 {

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


	Comparator<SanPham2> sp = new Comparator<SanPham2>() {

		@Override
		public int compare(SanPham2 o1, SanPham2 o2) {
			// TODO Auto-generated method stub
			return (int) o1.giasanpham - (int) o2.giasanpham;
		}
	};
	
}