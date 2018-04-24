package com.imic.students.Vietanh.BaiTapVeNhaBuoi4;

import java.util.Scanner;

public class BaiTapVeNhaThem_bai3 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Xin moi nhap vao so dien");
	int sodien = sc.nextInt();
	if(sodien<50) {
		System.out.println("Tien dien hang thang la: "+ (sodien*1000));
		
	}else {
		int tien =50*1000 + (sodien - 50)*1200;
		System.out.println("Tien dien hang thang la: "+tien);
	}
}
}
