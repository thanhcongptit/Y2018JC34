package com.imic.students.PhamDuyDieu.BaiTapVeNha.BuoiThu5;

import java.util.Scanner;

public class Bai4 {
	/*
	 * Viết chương trình nhập 2 mảng họ tên và điểm của sinh viên. + Xuất 2 mảng đã
	 * nhập, mỗi sinh viên có thêm học lực. Yếu: < 5 điểm Trung bình: 5<= điểm <6.5
	 * Khá: 6.5<=điểm<7.5 Giỏi: 7.5<=điểm<9 Xuất sắc: điểm>=9. + Sắp xếp danh sách
	 * sinh viên đã nhập tăng dần theo điểm.
	 */
	public static void main(String[] args) {
		int a = 0;
		boolean check = true;
		boolean check1 = true;
		double temp = 0;
		String temp1;
		while (check) {
			try {
				System.out.print("Nhập tổng số sinh viên: ");
				a = new Scanner(System.in).nextInt();
				check = false;
			} catch (Exception e) {
				System.out.println("Bạn đã nhập sai dữ liệu. Mời bạn nhập lại..!");
			}
			String name[] = new String[a];
			double diem[] = new double[a];
			System.out.println("Mời bạn nhập họ tên & điểm số từng sinh viên.");
// KHAI BÁO TÊN & ĐIỂM CỦA SINH VIÊN
			for (int i = 0; i < a; i++) {
				do {
					try {
						System.out.printf("SINH VIÊN %d ", i + 1);
						System.out.print("\nHọ và tên: ");
						name[i] = new Scanner(System.in).nextLine();
						System.out.print("Điểm: ");
						diem[i] = new Scanner(System.in).nextDouble();
						System.out.println("----------------------");
						check1 = false;
						if(diem[i]>10) {
							System.out.println("Điểm không được quá 10. Nhập lại.");
							check1 = true;
						}
					} catch (Exception e) {
						System.out.println("Bạn đã nhập sai dữ liệu. Vui lòng nhập lại..!");
						check1 = true;
					}
				} while (check1);
			}
// XẾP LOẠI HỌC LỰC CỦA SINH VIÊN.
			String hocLuc[]= new String[a];
			for(int i1=0; i1<a; i1++) {
				if(diem[i1]<5) {
					hocLuc[i1] = "Yếu";
				}else if(5<=diem[i1]&&diem[i1]<6.5) {
					hocLuc[i1] = "Trung bình";
					
				}else if(6.5<= diem[i1]&&diem[i1]<7.5) {
					hocLuc[i1]="Khá";
				}else if(7.5<=diem[i1] && diem[i1]<9) {
					hocLuc[i1]="Giỏi";
				}else {
					hocLuc[i1]="Xuất sắc";
				}
			}
// HIỂN THỊ RA MÀN HÌNH
			for(int i2 = 0; i2<a; i2++) {
		//		System.out.println("SINH VIÊN "+ (i2+1));
				System.out.println(name[i2]+"   -  "+ diem[i2]+"   -   "+hocLuc[i2]);
			}
// SẮP XẾP SINH VIÊN TĂNG DẦN THEO ĐIỂM.
			for(int j = 0; j<a-1; j++) {
				for(int j1 = j+1;j1<a; j1++) {
					if(diem[j]>diem[j1]) {
						temp = diem[j1];
						diem[j1]=diem[j];
						diem[j]=temp;
						temp1 = name[j1];
						name[j1]=name[j];
						name[j]=temp1;
						temp1=hocLuc[j1];
						hocLuc[j1]=hocLuc[j];
						hocLuc[j]=temp1;
					}
				}
			}
			System.out.println("Sắp xếp theo thứ tự tăng theo điểm:");
			for(int j2 = 0; j2<a; j2++) {
				System.out.println( name[j2]+"    "+diem[j2]+"    "+hocLuc[j2]);
			}
		}
	}
}
