package com.imic.student.ToMinhTuyen.btvn.buoi10;

import java.util.ArrayList;
import java.util.Scanner;

import com.imic.student.ToMinhTuyen.btvn.buoi9.Student9;

public class QuanLySinhVien {

	public static void main(String[] args) {
		SinhVienPoLy sv1 = new SinhVienIT("A", "IT", 7.5, 6, 8);
		SinhVienPoLy sv2 = new SinhVienBiz("B", "Biz", 8, 5.5);
		sv1.Xuat();
		sv2.Xuat();

	}

}
