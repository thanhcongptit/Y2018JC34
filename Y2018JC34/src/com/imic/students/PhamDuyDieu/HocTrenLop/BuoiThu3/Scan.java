package com.imic.students.PhamDuyDieu.HocTrenLop.BuoiThu3;

import java.util.Scanner;

/*
 * Nhập Tên, Tuổi, Địa chỉ rồi hiển thị ra màn hình
 */
public class Scan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String Name;
		String Add;
		int Age;
		System.out.print("Mời thím nhập tên: ");
		Name = sc.nextLine();
		System.out.print("Mời thím nhập tuổi: ");
		Age = sc.nextInt();
		sc.nextLine();
		System.out.print("Mời thím nhập địa chỉ: ");
		Add = sc.nextLine();
		System.out.println("THÔNG TIN CÁ NHÂN: \n\tHọ và tên: "+Name+"\n\tTuổi: "+Age+"\n\tĐịa Chỉ: "+Add);
	}

}
