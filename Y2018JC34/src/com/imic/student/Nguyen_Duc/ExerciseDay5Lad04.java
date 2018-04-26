package com.imic.student.Nguyen_Duc;
import java.util.Arrays;
import java.util.Scanner;
public class ExerciseDay5Lad04 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = 0;
		System.out.println("Nhap So Thanh Vien Trong Lop : ");
		n = input.nextInt();
		System.out.println("------------------");
		String[] name = new String[n];
		int[] score = new int[n];
		String[] hocluc = new String[n];
		
		for( int i = 0; i < n; i++) {
			System.out.println("Nhap Ho Va Ten : ");
			name[i] = input.next();
			
			System.out.println("Nhap Diem So Thang Diem 10 : ");
			
			score[i] = input.nextInt();
			if( score[i] < 5) {
				hocluc[i] = "Yeu";
			}
			else if( score[i] >= 5 && score[i] < 6.5 ) {
				hocluc[i] = "Trung Binh";
			}
			else if( score[i] >= 6.5 && score[i] < 7.5 ) {
				hocluc[i] = "Kha";
			}
			else if( score[i] >= 7.5 && score[i] < 9 ) {
				hocluc[i] = "Gioi";
			}
			else if( score[i] >= 9) {
				hocluc[i] = "Xuat Sac";
			}
		}
		System.out.println("Danh Sach Ten Diem Va Hoc Luc Theo Thu Tu : ");
		System.out.println("---------------");
		System.out.println(Arrays.toString(name) + "\n" + Arrays.toString(score) + "\n" + Arrays.toString(hocluc));
	}
}
