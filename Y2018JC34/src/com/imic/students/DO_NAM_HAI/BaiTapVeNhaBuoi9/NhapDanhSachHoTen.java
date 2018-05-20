package com.imic.students.DO_NAM_HAI.BaiTapVeNhaBuoi9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class NhapDanhSachHoTen implements Comparable<NhapDanhSachHoTen> {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "NhapDanhSachHoTen [name=" + name + "]";
	}

	ArrayList<String> hoTen = new ArrayList<String>();
	Scanner nhap = new Scanner(System.in);
	

	public void nhap() {
		String chon;
		while (true) {

			System.out.print("Mời bạn nhập tên : ");
			name = nhap.nextLine();
			hoTen.add(name);
			System.out.print(" Bạn có muốn nhập thêm (Y/N)? :");
			chon = nhap.nextLine();
			if (chon.equalsIgnoreCase("N")) {
				break;
			}
		}
	}

	public void xuat() {
		System.out.print(" name : ");
		for (int i = 0; i < hoTen.size(); i++) {
			System.out.print(hoTen.get(i) + ",");

		}
		System.out.println("");

	}

	public void ngauNhien() {
		Collections.shuffle(hoTen);
		System.out.print(" name ngẫu nhiên : ");
		for (int i = 0; i < hoTen.size(); i++) {
			System.out.print(hoTen.get(i) + ",");
		}
		System.out.println("");

	}

	@Override
	public int compareTo(NhapDanhSachHoTen o) {
		for (int i = 0; i < hoTen.size(); i++)
			return this.hoTen.get(i).compareTo(o.hoTen.get(i));
		return 0;

	}

	public void sapXep() {

		Collections.sort(hoTen);
		Collections.reverse(hoTen);
		System.out.print(" Sắp xếp tên giảm dần : ");
		for (int i = 0; i < hoTen.size(); i++) {
			System.out.print(hoTen.get(i) + ",");
		}
		System.out.println("");
	}

	public void xoaHoTen() {
		System.out.print("Nhập tên bạn muốn xóa : ");
		String tenXoa = nhap.nextLine();
		int removeIndex = -1;
		for (int i = 0; i < hoTen.size(); i++) {
			if (hoTen.get(i).equalsIgnoreCase(tenXoa)) {
				removeIndex = i;

			}

		}
		if (removeIndex == -1) {
			System.out.println(" không tìm thấy tên");
		} else {
			hoTen.remove(removeIndex);
			System.out.println("Da xoa san pham");

		}
		System.out.println("");

	}

	public void menu() {
		System.out.println("      Chương trình         ");
		System.out.println(" 1. Nhập danh sách họ và tên");
		System.out.println(" 2. Xuất danh sách họ và tên");
		System.out.println(" 3. Xuất danh sách ngẫu nhiên ");
		System.out.println(" 4. Sắp xếp giảm dần và xuất danh sách");
		System.out.println(" 5. Tìm và xóa họ tên nhập từ bàn phím");
		System.out.println(" 6. Kết thúc");

	}
}