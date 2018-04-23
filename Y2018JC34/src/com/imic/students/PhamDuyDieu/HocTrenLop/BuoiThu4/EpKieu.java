package com.imic.students.PhamDuyDieu.HocTrenLop.BuoiThu4;

public class EpKieu {

	public static void main(String[] args) {

		String temp = "10";
		int number = 0;
		try {
			number = Integer.parseInt(temp);
			
		} catch(Exception e) {
			System.out.println("Day khong phai la so");
		}
		System.out.println("Number = "+ number);
	}

}