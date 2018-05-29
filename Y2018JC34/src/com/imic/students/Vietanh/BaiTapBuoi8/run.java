package com.imic.students.Vietanh.BaiTapBuoi8;

import java.util.Scanner;

public class run {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HocSinh[] hs = new HocSinh[2];
        
        for(int i=0;i<2;i++) {
//        	hs[i] = new HocSinh();
        	System.out.println("Xin moi nhap name");
        	String name = sc.nextLine();
        	hs[i].setTenHS(name);
        	System.out.println("Xin moi nhap tuoi");
        	int tuoi = sc.nextInt();
        	hs[i].setTuoiHS(tuoi);
        	sc.nextLine();
        	
        }
        
        for(HocSinh hocsinh:hs) {
        	System.out.println(hocsinh.toString());
        }
        
        hs[0] = new HocSinh("Hoa", 20);
        hs[1] = new HocSinh("loc", 2);
        
}
	
}