package com.imic.students.PhamDuyDieu.BaiTapVeNha.BuoiThu7;

import java.util.Arrays;
import java.util.Scanner;

import com.imic.students.PhamDuyDieu.HocTrenLop.BuoiThu7.Student;

public class Run {

	public static void main(String[] args) {
		int n = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập số sinh viên cần thêm mới: ");
		n = sc.nextInt();
		SinhVien sinhvien[] = new SinhVien[n];
		System.out.println("Bạn vừa tạo mới "+ n+" sinh viên.");
		System.out.println("Nhập tên và điểm của từng sinh viên.");
		for(int i = 0; i<n; i++) {
			sinhvien[i]= new SinhVien();
			System.out.println("Sinh viên "+ (i+1));
			System.out.print("Tên sinh viên: ");
			String name = new Scanner(System.in).nextLine();
			sinhvien[i].setName(name);
			System.out.println("Điểm sinh viên: ");
			int diem = new Scanner(System.in).nextInt();
			sinhvien[i].setDiem(diem);
		}
		System.out.println("Trước khi sắp xếp: ");
		for (SinhVien SV: sinhvien) {
			System.out.println(SV.toString());
		}
/*	Sắp xếp cách 1:	
 * for(int i = 0; i<n-1; i++) {
*			for( int j = 1; j<n; j++) {
*				if(sinhvien[i].getDiem()<sinhvien[j].getDiem()) {
*					SinhVien temp = sinhvien[j];
					sinhvien[j]=sinhvien[i];
					sinhvien[i]=temp;
				}
			}
		}
		System.out.println("Sau khi sắp xếp: ");
		for (SinhVien SV: sinhvien) {
			System.out.println(SV.toString());
	}*/
		Arrays.sort(sinhvien);
		System.out.println("Sau khi sắp xếp: ");
		for (SinhVien SV: sinhvien) {
			System.out.println(SV.toString());
		
}}
}