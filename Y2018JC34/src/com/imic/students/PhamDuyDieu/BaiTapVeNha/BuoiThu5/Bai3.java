package com.imic.students.PhamDuyDieu.BaiTapVeNha.BuoiThu5;

import java.util.Arrays;
import java.util.Scanner;

public class Bai3 {
/*
 * Viết chương trình nhập mảng số nguyên từ bàn phím.
 * + Sắp xếp và xuất mảng vừa nhập ra màn hình.
 * + Xuất phần tử có giá trị nhỏ nhất ra màn hình.
 * + Tính và xuất ra màn hình trung bình cộng các phần tử chia hết cho 3.
 */
	public static void main(String[] args) {
		int a = 0;
		int tong = 0;
		int b = 0;
		boolean check = true;
		Scanner sc = new Scanner(System.in);

		while(check) {
			try {
				System.out.println("Mời bạn nhập số phần tử của mảng: ");
				a = new Scanner(System.in).nextInt();
				check = false;
			}catch (Exception e) {
				System.out.println("Bạn nhập sai kiểu dữ liệu. Vui lòng nhập lại..!");
			}
		}
		int arr[]=new int[a];
		System.out.println("Bạn vừa tạo mảng arr["+a+"]\nMời bạn nhập giá trị các phần tử:" );
		for(int i = 0; i<a; i++) {
			System.out.print("arr["+i+"] = ");
			arr[i]=sc.nextInt();
			if(arr[i]%3==0) {
				tong += arr[i];
				b++;
			}
			if(i==(a-1)) {
				System.out.println("Mảng arr["+a+"] có các phần tử: ");
				for(int i1 = 0;i1<a; i1++) {
					System.out.print(arr[i1]+ "  ");
				}
				System.out.println("\nSắp xếp:");
				Arrays.sort(arr);
				for(int i2 = 0;i2<a; i2++) {
					System.out.print(arr[i2]+ "  ");
			}
				System.out.println("\nPhần tử có giá trị nhỏ nhất: "+ arr[0]);
				System.out.println("Trung bình cộng các phần tử chia hết cho 3:\n"+tong+"/"+b+" = "+ (tong/b));
		}
	}}
}
