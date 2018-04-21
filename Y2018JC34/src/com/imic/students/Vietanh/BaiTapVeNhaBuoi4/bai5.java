package com.imic.students.Vietanh.BaiTapVeNhaBuoi4;

import java.util.Scanner;

public class bai5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Xin moi ban nhap ten");
		String ten = sc.nextLine();
		if(ten.equals("")) {
			System.out.println("Ban chua nhap, vui long nhap lai");
			
		}else {
			System.out.println("Ten cua ban la:" +ten);
		}
		
		
		System.out.println("Xin moi ban nhap tuoi");
		int tuoi = sc.nextInt();
		System.out.println("Tuoi cua ban: "+ tuoi);
		sc.nextLine();
		
		System.out.println("Xin moi ban nhap gioi tinh");
		String gioitinh = sc.nextLine();
		if(gioitinh.equals("")) {
			System.out.println("Ban chua nhap, vui long nhap lai");
		}else {
			System.out.println("Gioi tinh: "+gioitinh);
		}
		
		
		System.out.println("Ban chua co gia dinh");
		System.out.println("Hay li hon");
		System.out.println("Xin moi ban nhap tinh trang hon nhan");
		String tthn = sc.nextLine();
		if(tthn.equals("")) {
			System.out.println("Ban chua nhap, vui long nhap lai");
		}else {
			System.out.println("Tinh trang hon nhan cua ban:"+tthn);
		}
		
		
	if(gioitinh.equals("Nam") && tuoi>=22 || tthn.equals("chua co gia dinh") || tthn.equals("li hon")){
		System.out.println("Duoc phep tham gia");
		
	}else if(gioitinh.equals("Nu") && tuoi>=19 || tthn.equals("chua co gia dinh") || tthn.equals("li hon")) {
		System.out.println("Duoc phep tham gia");
		
	}else {
		System.out.println("K du dieu kien tham gia");
	}
		
		

}
}
