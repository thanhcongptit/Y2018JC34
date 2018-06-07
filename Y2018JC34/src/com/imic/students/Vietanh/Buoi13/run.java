package com.imic.students.Vietanh.Buoi13;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import com.imic.students.Vietanh.BaiTapBuoi9.SinhVien;

public class run {
	public static void main(String[] args) {
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		try {

			fis = new FileInputStream("d:/mydata2.txt");
			ois = new ObjectInputStream(fis);
			SinhVien[] sv1 = (SinhVien[]) ois.readObject();
			System.out.println("Doc tu file:");
			for (SinhVien x : sv1) {
				System.out.println(x.toString());
			}

		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		} finally {
			
			try {
				ois.close();
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}
}
