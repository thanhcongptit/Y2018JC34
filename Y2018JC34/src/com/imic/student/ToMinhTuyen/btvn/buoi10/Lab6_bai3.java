package com.imic.student.ToMinhTuyen.btvn.buoi10;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab6_bai3 {

	public static void main(String[] args) {
		ArrayList<SinhVien10> sinhvienList = new ArrayList<SinhVien10>();
		Scanner scanner = new Scanner(System.in);
		SinhVien10 sinhvien = new SinhVien10();
		
		sinhvien.nhapSinhvien(scanner, sinhvienList);
		
		for(SinhVien10 sv : sinhvienList ) {
			System.out.println(sv);
		}
		
		

	}

}
