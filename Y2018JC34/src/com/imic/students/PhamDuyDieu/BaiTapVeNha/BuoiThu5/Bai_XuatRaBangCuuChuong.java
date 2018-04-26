package com.imic.students.PhamDuyDieu.BaiTapVeNha.BuoiThu5;

public class Bai_XuatRaBangCuuChuong {

	public static void main(String[] args) {
		for(int i = 1; i<=10; i++) {
			for(int j = 2; j<10; j++) {
				System.out.print(j+" x "+i+" = "+ (j*i)+"     ");
				if(j==9) {
					System.out.println("\n");
				}
			}
		}

	}

}
