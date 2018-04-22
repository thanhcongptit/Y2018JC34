package com.imic.students.Vietanh.BaiTapVeNhaBuoi4;

import java.util.Scanner;

public class bai6 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Xin moi ban nhap 1 so bat ki");
	int so = sc.nextInt();
	System.out.println("So ban chon la: "+ so);
	
	int TongChan = 0;
	int TongLe = 0;
	for(int i=1; i<=so;i++) {
		if(i%2==0) {
			TongChan++;
		}else {
			TongLe++;
		}
		
	}
	System.out.println("Tong so chan la: "+ TongChan);
	System.out.println("Tong so le la:" +TongLe);
}

}
