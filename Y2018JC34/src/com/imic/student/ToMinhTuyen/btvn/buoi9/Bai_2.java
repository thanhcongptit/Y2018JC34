package com.imic.student.ToMinhTuyen.btvn.buoi9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Bai_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		ArrayList<String> hoten = new ArrayList<String>();
		boolean check = true;
		while (check) {
			System.out.println("Nhap ho ten");
			String name = scanner.nextLine();
			hoten.add(name);
			System.out.println("Nhap them ho ten Y/N");
			if (scanner.nextLine().equalsIgnoreCase("N")) {
				break;
			}
		}
		System.out.println("Mang Nhap vao: " + hoten.toString());

		Collections.shuffle(hoten);

		System.out.println("Mang ngau nhien: " + hoten.toString());

		Collections.sort(hoten, new Comparator<String>() {

			@Override
			public int compare(String hoten1, String hoten2) {
				// TODO Auto-generated method stub
				return hoten2.compareTo(hoten1);
			}

		});

		System.out.println("Mang Sap xep giam dan: " + hoten.toString());

		System.out.println("Nhap Ho ten can xoa");
		while (true) {
			String namex = scanner.nextLine();
			for (int i = 0; i < hoten.size(); i++) {
				if (hoten.get(i).equalsIgnoreCase(namex)) {
					hoten.remove(i);
				}
			}
			System.out.println("Ban co muon Nhap them ho ten de xoa tiep: Y/N");
			if (scanner.nextLine().equalsIgnoreCase("N")) {
				break;
			}
		}
		System.out.println("Mang Da xoa ho ten" + hoten.toString());

	}
}
