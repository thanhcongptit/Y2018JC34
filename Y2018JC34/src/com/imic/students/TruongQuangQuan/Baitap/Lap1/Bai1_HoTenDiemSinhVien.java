package com.imic.students.TruongQuangQuan.Baitap.Lap1;

import java.util.Scanner;

public class Bai1_HoTenDiemSinhVien {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.print("Nhập Họ Tên : ");
	String name = scanner.nextLine();
	System.out.print("Nhập điểm : ");
	Double point = scanner.nextDouble();
	System.out.printf("Sinh viên %s : %.2f điểm", name, point);
}
}
