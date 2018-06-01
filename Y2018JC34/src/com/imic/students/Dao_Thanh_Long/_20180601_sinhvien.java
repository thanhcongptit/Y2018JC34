package com.imic.students.Dao_Thanh_Long;

import java.util.Scanner;

public class _20180601_sinhvien {
	private int masv;
	private String hoten;
	private int diem;
	private String xeploai;
	private static final int DIEM=0;
	private static final String XEPLOAI = "CHUA_XEP_LOAI";
	private static final int MASV=0;
	private static final String HOTEN = "CHUA_CO_TEN";
	
	public _20180601_sinhvien(int masv,String hoten,int diem,String xeploai){
		this.masv = masv;
		this.hoten = hoten;
		this.diem = diem;
		this.xeploai = xeploai;
	}
	
	public _20180601_sinhvien(){
		this(MASV, HOTEN, DIEM, XEPLOAI);
	}

	public int getMasv() {
		return masv;
	}

	public void setMasv(int masv) {
		this.masv = masv;
	}

	public String getHoten() {
		return hoten;
	}

	public void setHoten(String hoten) {
		this.hoten = hoten;
	}

	public int getDiem() {
		return diem;
	}

	public void setDiem(int diem) {
		this.diem = diem;
	}

	public String getXeploai() {
		return xeploai;
	}

	public void setXeploai(String xeploai) {
		this.xeploai = xeploai;
	}
	
	public void setXeploai(){
		if(diem >= 8){
			xeploai = "Gioi";
		}else if(diem >= 7){
			xeploai = "Kha";
		}else if(diem >= 5){
			xeploai = "Trung binh";
		}else{
			xeploai = "Kem";
		}
	}
	
	public String toString(){
		return masv + "\t" + hoten+"\t"+diem+"\t"+xeploai+"\n";
	}
	
	public void nhapdl() throws _20180601_Exception{
		boolean loop=true;
		Scanner input = new Scanner(System.in);
		while(loop){
			try {
				System.out.print("Nhap ma sinh vien:");
				masv = input.nextInt();
				loop = false;
			} catch (Exception e) {
				System.out.println("Kieu du lieu khong phu hop");
				input.nextLine();
			}
		}
		
		loop = true;
		while(loop){
			try {
				System.out.print("Nhap hoten:");
				hoten = input.next();
				if(!hoten.matches("[a-zA-Z]{1,30}")){
					throw new _20180601_Exception("Kieu du lieu khong phu hop");
				}
				loop = false;
				
			} catch (Exception e) {
				System.out.println("Kieu du lieu khong phu hop");
			}
		}
		
		loop = true;
		while(loop){
			try {
				System.out.print("Nhap diem:");
				diem = input.nextInt();
				if(!String.valueOf(diem).matches("\\d{1,2}")){
					throw new _20180601_Exception("Kieu du lieu khong phu hop");
				}
				loop = false;
			} catch (Exception e) {
				System.out.println("Kieu du lieu khong phu hop");
			}
		}
		this.setDiem(diem);
		input.close();
	}
	
	public static void main(String[] args) throws _20180601_Exception{
		_20180601_sinhvien sv = new _20180601_sinhvien();
		System.out.println("Sinh vien:"+sv);
		sv.nhapdl();
		sv.setXeploai();
		System.out.println("Sau khi nhap:");
		System.out.println(sv);
	}
	
	
}
