package com.imic.students.Vietanh.Buoi13;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import com.imic.students.Vietanh.BaiTapBuoi9.SinhVien;

public class IOStream {
	public static void main(String[] args) {

		FileOutputStream fos = null;
		ObjectOutputStream oos = null;

		try {
			fos = new FileOutputStream("d:/mydata2.txt");
			oos = new ObjectOutputStream(fos);

			SinhVien sv[] = { new SinhVien("Viet anh", 100, 18, "Ha noi", 5.5),
					new SinhVien("Huy", 101, 18, "Ha noi", 7.7), new SinhVien("Loc", 102, 19, "Ha noi", 8.8) };

			oos.writeObject(sv);

		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		} finally {
			try {
				fos.close();
				oos.close();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}

	}
}