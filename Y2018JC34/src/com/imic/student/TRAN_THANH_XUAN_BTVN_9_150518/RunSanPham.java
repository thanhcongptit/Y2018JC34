package com.imic.student.TRAN_THANH_XUAN_BTVN_9_150518;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class RunSanPham {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<SanPham> sanphamArr = new ArrayList<SanPham>();
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap so san pham: ");
		int numSp = sc.nextInt();
		for (int i = 0; i < numSp; i++) {
			init(sc, sanphamArr);
		}

		System.out.println("-----------Danh muc san pham------------");
		for (int i = 0; i < sanphamArr.size(); i++) {
			getSP(sanphamArr);
		}

		System.out.println("-----------Sort giam dan theo gia-----------");
		Collections.sort(sanphamArr);
		for (int i = 0; i < sanphamArr.size(); i++) {
			getSP(sanphamArr);
		}

		System.out.println("-----------Tim va xoa ten san pham------------");
		RemoveName(sc, sanphamArr);
		System.out.println();
		System.out.println("Sau khi xoa");
		for (int i = 0; i < sanphamArr.size(); i++) {
			getSP(sanphamArr);
		}

		System.out.println("------------Gia trung binh cua sp----------------");
		System.out.println("Gia TB = " + GiaTrungBinh(sanphamArr));

	}

	public static void init(Scanner sc, ArrayList<SanPham> arr) {
		SanPham sp = new SanPham();
		String nameSp = sc.nextLine();
		sp.setName(nameSp);
		double giaSp = sc.nextDouble();
		sp.setGiaSp(giaSp);
		arr.add(sp);
		sc.nextLine();

	}

	public static void getSP(ArrayList<SanPham> arr) {
		for (int i = 0; i < arr.size(); i++) {
			SanPham sp = arr.get(i);
			System.out.println(sp.toString());
		}
	}

	public static double GiaTrungBinh(ArrayList<SanPham> arr) {
		double sum = 0;
		for (int i = 0; i < arr.size(); i++) {
			sum = sum + arr.get(i).getGiaSp();
		}
		return sum / arr.size();

	}

	public static void RemoveName(Scanner sc, ArrayList<SanPham> arr) {
		System.out.println("Nhap ten sp muon xoa");
		String nameRemove = sc.nextLine();
		for (int i = 0; i < arr.size(); i++) {
			if (nameRemove.equals(arr.get(i).getName())) {
				arr.remove(i);
			}
		}
	}

}
