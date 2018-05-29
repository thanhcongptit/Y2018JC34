package com.imic.student.TRAN_THANH_XUAN_BTVN_10_25052018;

import java.util.Arrays;

public class XPoly {

	public static void main(String arg[]) {
		System.out.println(sum(2, 4, 6));
		System.out.println(Min(5, 4, 6, 2));
		System.out.println(Max(9, 3, 1, 5));
		ToUpperFirst("chau la xuan");
	}

	public static final double sum(double... x) {
		double tong = 0;
		for (double a : x) {
			tong = tong + a;
		}
		return tong;
	}

	public static double Min(double... x) {
		Arrays.sort(x);
		return x[0];
	}

	public static double Max(double... x) {
		Arrays.sort(x);
		return x[x.length - 1];
	}

	public static void ToUpperFirst(String x) {
		String[] stringArr = x.split(" ");
		String kq = "";
		for (int i = 0; i < stringArr.length; i++) {
			char firstChar = stringArr[i].charAt(0);
			char upperString = String.valueOf(firstChar).toUpperCase().charAt(0);
			stringArr[i] = upperString + stringArr[i].substring(1);
			kq = String.join(" ", stringArr);
		}
		System.out.println(kq);
	}
}
