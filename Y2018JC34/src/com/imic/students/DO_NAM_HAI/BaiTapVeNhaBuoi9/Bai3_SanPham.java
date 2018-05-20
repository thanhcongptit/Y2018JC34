package com.imic.students.DO_NAM_HAI.BaiTapVeNhaBuoi9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Bai3_SanPham {
	private String tenSP;
	private Double giaSP;

	public String getTenSP() {
		return tenSP;
	}

	public void setTenSP(String tenSP) {
		this.tenSP = tenSP;
	}

	public Double getGiaSP() {
		return giaSP;
	}

	public void setGiaSP(Double giaSP) {
		this.giaSP = giaSP;
	}

	@Override
	public String toString() {
		return "Bai3_SanPham [tenSP=" + tenSP + ", giaSP=" + giaSP + "]";
	}

	ArrayList<Bai3_SanPham> sanPham = new ArrayList<Bai3_SanPham>();
	Scanner nhap = new Scanner(System.in);

	public void nhap() {
		String chon;
		while (true) {
			Bai3_SanPham sp = new Bai3_SanPham();
			System.out.print("Mời bạn nhập tên của sản phẩm : ");
			sp.tenSP = nhap.nextLine();
			System.out.print("Mời bạn nhập giá của sản phẩm : ");
			sp.giaSP = nhap.nextDouble();
			nhap.nextLine();
			sanPham.add(sp);
			System.out.print(" Bạn có muốn nhập thêm (Y/N)? :");
			chon = nhap.nextLine();
			if (chon.equalsIgnoreCase("N")) {
				break;
			}
		}
	}

	public void sapXep() {
		Comparator<Bai3_SanPham> comp = new Comparator<Bai3_SanPham>() {
			@Override
			public int compare(Bai3_SanPham o1, Bai3_SanPham o2) {
				return o1.getGiaSP().compareTo(o2.getGiaSP());
			}
		};
		Collections.sort(sanPham, comp);
		Collections.reverse(sanPham);

		System.out.println("Sắp xếp sản phẩm theo giá giảm dần : ");
		for (int i = 0; i < sanPham.size(); i++) {
			System.out.println(sanPham.get(i).toString());
		}

	}

	public void xoaSanPham() {
		System.out.print("Nhập sản phẩm bạn muốn xóa : ");
		String sanPhamXoa = nhap.nextLine();
		int removeIndex = -1;
		for (int i = 0; i < sanPham.size(); i++) {
			if (sanPham.get(i).getTenSP().equalsIgnoreCase(sanPhamXoa)) {
				removeIndex = i;

			}

		}
		if (removeIndex == -1) {
			System.out.println(" không tìm thấy sản phẩm");
		} else {
			sanPham.remove(removeIndex);
			System.out.println("Da xoa san pham");

		}
		System.out.println("");

	}

	public void giaTrungBinh() {

		double tong = 0;
		for (int i = 0; i < sanPham.size(); i++) {
			tong += sanPham.get(i).getGiaSP();

		}
		System.out.println(" Giá trung bình của các sản phẩm : " + (tong / sanPham.size()));
	}
	
	public void menu() {
		System.out.println("      Chương trình         ");
		System.out.println(" 1. Nhập danh sách sản phẩm");
		System.out.println(" 2. Sắp xếp giảm dần theo giá và xuất danh sách");
		System.out.println(" 3. Tìm và xóa sản phẩm nhập từ bàn phím ");
		System.out.println(" 4. Xuất giá trị trung bình của các sản phẩm");
		System.out.println(" 5. Kết thúc");

	}
}
