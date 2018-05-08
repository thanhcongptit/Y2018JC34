package com.imic.students.PhamDuyDieu.BaiTapVeNha.BuoiThu6;

public class sdgcvb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("A. SNT có 7 chữ số");
		for (int i = 1000000; i <= 9999999; i++) {
			if (Prime(i)) {
				System.out.println(i);
			}
		}
	}
	public static boolean Prime(int n) {
		if (n < 2) {
			return false;
		}
		// if (n == 2 || n == 3) {
		// return true;
		// }
		for (int i = 2; i <= Math.sqrt(n); i++)
			if (n % i == 0)
				return false;
		return true;
	}
	public static boolean SeparatorNumber(int n) {

		int separatorNumber = 0;
		while (n > 0) {
			separatorNumber = n % 10;
			n = n / 10;
			if (Prime(separatorNumber) == false)
				return false;
		}
		return true;
	}
}
