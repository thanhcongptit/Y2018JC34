package com.imic.students.Dao_Thanh_Long;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ExampleArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner objSc = new Scanner(System.in);
		ArrayList<SVPoly> svList = new ArrayList<SVPoly>();
		SVPoly svpoly = new SVPoly();
		boolean loop=true;
		String strResponse;
		int intResponse;
		int count = 0;
		
		// 1. Nhap danh sach sinh vien
		while(true){
			if(svList.isEmpty()){
				System.out.println("Nhap ten va diem cua SV");
			}else{
				objSc.nextLine();
				System.out.println("Ban co muon nhap tiep khong (Y/N)");
				strResponse = objSc.nextLine();
				if(strResponse.equalsIgnoreCase("N")){
					break;
				}
			}
			
			System.out.printf("Ho ten SV %d : ",count+1);
			strResponse = objSc.nextLine();

			System.out.printf("Diem TB SV %d : ",count+1);
			intResponse = objSc.nextInt();
			
//			svpoly.setName(strResponse);
//			svpoly.setMark(intResponse);
			svpoly = new SVPoly(strResponse,intResponse);
			svList.add(svpoly);	
			count++;
			
		}
		
		// 2. Xuat danh sach sinh vien da nhap
		System.out.println("Danh sach Sinh vien vua nhap");
		for(SVPoly obj:svList){
			obj.printOut();
		}
		
		
		Collections.shuffle(svList);
		System.out.println("Danh sach Sinh vien ngau nhien");
		for(SVPoly obj:svList){
			obj.printOut();
		}
		
		// 3. Xuat danh sach sinh vien theo khoang diem
		Collections.sort(svList);
		System.out.println("Danh sach Sinh vien sap xep giam dan theo diem");
		for(SVPoly obj:svList){
			obj.printOut();
		}

		// 4. Tim sinh vien theo ho ten
		System.out.println("Nhap ho ten SV ma ban muon tim");
		strResponse = objSc.nextLine();
		for(SVPoly sv:svList){
			if(sv.getName().equalsIgnoreCase(strResponse)){
				sv.printOut();
			}
		}
		
		// 5. Tim va sua sinh vien theo ho ten
		System.out.println("Nhap ho ten SV ma ban muon tim va sua");
		String strName = objSc.nextLine();
		count=0;
		for(SVPoly sv:svList){
			if(sv.getName().equalsIgnoreCase(strName)){
				sv.printOut();
				System.out.println("Ban co muon sua ten SV nay(Y/N)?");
				strResponse = objSc.nextLine();
				if(strResponse.equalsIgnoreCase("Y")){
					System.out.printf("Nhap ho ten thay the");
					strResponse = objSc.nextLine();
					sv.setName(strResponse);
				}
				System.out.println("Ban co muon sua diem SV nay(Y/N)?");
				strResponse = objSc.nextLine();
//				objSc.nextLine();
				if(strResponse.equalsIgnoreCase("Y")){
					System.out.printf("Nhap diem thay the");
					intResponse = objSc.nextInt();
					sv.setMark(intResponse);
				}
			}
		}
		System.out.println("Danh sach Sinh vien sau khi sua");
		for(SVPoly obj:svList){
			obj.printOut();
		}
		
		objSc.nextLine();
		// Tim va xoa sinh vien theo ho ten
		System.out.println("Nhap ho ten SV ma ban muon xoa");
		strResponse = objSc.nextLine();
		loop = true;
		count=0;
		while(loop){
			for(SVPoly sv:svList){
				if(sv.getName().equalsIgnoreCase(strResponse)){
					svList.remove(sv);
					count++;
					break;
				}
				if(svList.indexOf(sv) == (svList.size()-1)){
					loop = false;
				}
			}
		}
		if(count > 0){
			if(svList.isEmpty()){
				System.out.println("Khong con SV nao trong danh sach");
			}else{
				System.out.println("Danh sach SV sau khi xoa");
				for(SVPoly obj:svList){
					obj.printOut();
				}
			}
			
		}else{
			System.out.println("Khong co SV nao ten la " + strResponse);
		}
		
		objSc.close();
	}
	
}


















