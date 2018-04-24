package com.imic.students.Dao_Thanh_Long;

import java.util.Scanner;

public class _20180420_btvn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner objSc = new Scanner(System.in);
//		 bai4(objSc);
//		 bai5(objSc);
//		 demSoChan(objSc);
//		 giaiPTBac2(objSc);
		menu(objSc);
		objSc.close();
	}

	/*
	 * BAI TAP 4
	 */
	public static void bai4(Scanner objSc) {
		String thang, nam;
		System.out.println("Nhap vao thang can xem");
		thang = objSc.nextLine();

		System.out.println("Nhap vao nam can xem");
		nam = objSc.nextLine();
		int intNam = Integer.parseInt(nam);

		int nhom = 0;
		if (0 < Integer.parseInt(thang) && Integer.parseInt(thang) <= 12) {
			if (thang.equals("4") || thang.equals("6") || thang.equals("9")
					|| thang.equals("11")) {
				nhom = 1;
			} else if (thang.equals("2")) {
				nhom = 2;
			} else {
				nhom = 3;
			}
		}
		switch (nhom) {
		case 1:
			System.out.printf("Thang %s nam %s co 30 ngay", thang, nam);
			break;
		case 2:
			if ((intNam % 400 == 0)
					|| ((intNam % 4 == 0) && (intNam % 100 != 0))) {
				System.out.printf("Thang %s nam %s co 29 ngay", thang, nam);
			} else {
				System.out.printf("Thang %s nam %s co 28 ngay", thang, nam);
			}
			break;
		case 3:
			System.out.printf("Thang %s nam %s co 31 ngay", thang, nam);
			break;
		default:
			System.out.println("Thang ban can xem khong co trong thuc te");
			break;
		}
		System.out.println();
	}

	/*
	 * BAI TAP 5
	 */
	public static void bai5(Scanner objSc) {
		String hoTen = "", tuoi = "", gioiTinh = "", tinhTrangHonNhan = "";
		hoTen = getValue(objSc, "Nhap ho va ten");
		if (hoTen.equals("") == false) {
			tuoi = getValue(objSc, "Nhap tuoi cua ban");
			if ((tuoi.equals("") == false) && (0 < Integer.parseInt(tuoi))
					&& (Integer.parseInt(tuoi) < 150)) {
				gioiTinh = getValue(objSc, "Gioi tinh (Nam/Nu)");
				if ((gioiTinh.equals("") == false)
						&& (gioiTinh.equals("Nam") || gioiTinh.equals("Nu"))) {
					tinhTrangHonNhan = getValue(objSc,
							"Tinh trang hon nhan (DT/GD/LH)");
					if ((tinhTrangHonNhan.equals("") == false)
							&& (tinhTrangHonNhan.equals("DT")
									|| tinhTrangHonNhan.equals("GD") || tinhTrangHonNhan
										.equals("LH"))) {
						xuLyYeuCau(tuoi, gioiTinh, tinhTrangHonNhan);
					} else {
						System.out
								.println("Thong tin ban nhap khong dung yeu cau.");
					}
				} else {
					System.out
							.println("Thong tin ban nhap khong dung yeu cau.");
				}
			} else {
				System.out
						.println("Thong tin ban nhap khong dung yeu cau.");
			}
		} else {
			System.out
					.println("Thong tin ban nhap khong dung yeu cau.");
		}

	}

	public static String getValue(Scanner objSc, String inputString) {
		int soLanNhapLai = 3;
		int bienDem = 0;
		String outputString = "";
		do {
			System.out.println(inputString);
			outputString = objSc.nextLine();
			if (outputString.equals("")) {
				System.out.println("Thong tin khong duoc bo trong");
				bienDem++;
			} else {
				bienDem = soLanNhapLai + 1;
			}
		} while (bienDem < soLanNhapLai);
		return outputString;
	}

	public static void xuLyYeuCau(String tuoi, String gioiTinh, String ttHonNhan) {
		int intTuoi = Integer.parseInt(tuoi);
		if (intTuoi < 19) {
			System.out.println("Ban khong duoc phep tham gia");
		} else {
			if (ttHonNhan.equals("DT") || ttHonNhan.equals("LH")) {
				if (gioiTinh.equals("Nam") && (intTuoi >= 22)) {
					System.out.println("Duoc phep tham gia ket ban"); // Nam
																		// >=22
				} else if (gioiTinh.equals("Nu")) {
					System.out.println("Duoc phep tham gia ket ban"); // Nu >=
																		// 19
				} else {
					System.out.println("Ban khong duoc phep tham gia"); // Nam <
																		// 22
																		// tuoi
				}
			} else {
				System.out.println("Ban khong duoc phep tham gia");
			}

		}
	}

	/*
	 * BAI TAP 6
	 */
	public static void demSoChan(Scanner objSc) {
		double soDem = 0;
		double giaTri = 0;
		double gioiHan = 0;
		double doubleGioiHan = 0;
		System.out.println("Nhap gia tri chon lam gioi han dem");
		try {
			gioiHan = objSc.nextDouble();
		} catch (Exception e) {
			System.out.println("Gia tri ban nhap khong phai la so ");
			return;
		}

		doubleGioiHan = Math.floor(gioiHan);
		while (giaTri <= doubleGioiHan) {
			if (giaTri % 2 == 0) {
				soDem++;
			}
			giaTri++;
		}
		System.out.printf("So luong so chan tu 0 den " + doubleGioiHan + " la "
				+ soDem);
		objSc.nextLine();
	}

	/*
	 * BAI 2 _ CHO THEM
	 */
	public static void giaiPTBac2(Scanner objSc) {
		float a, b, c;
		double delta, sqrtDelta;

		try {
			System.out.println("Nhap gia tri tham so a");
			System.out.print("a = ");
			a = objSc.nextFloat();

			System.out.println("Nhap gia tri tham so b");
			System.out.print("b = ");
			b = objSc.nextFloat();

			System.out.println("Nhap gia tri tham so c");
			System.out.print("c = ");
			c = objSc.nextFloat();

		} catch (Exception e) {
			System.out.println("Gia tri ban nhap khong phai la so ");
			return;
		}

		if (a == 0f) {
			if (b == 0f) {
				System.out.println("Phuong trinh vo nghiem");
			} else {
				System.out.println("x = " + (-c / b));
			}
		} else {
			delta = Math.pow(b, 2) - 4 * a * c;
			if (delta < 0) {
				System.out.println("Phuong trinh vo nghiem");
			} else if (delta == 0) {
				System.out.println("Phuong trinh co nghiem kep x = "
						+ (-b / (2 * a)));
			} else {
				sqrtDelta = Math.sqrt(delta);
				System.out.println("Phuong trinh co 2 nghiem phan biet");
				System.out.printf("x1 = " + ((-b + sqrtDelta) / (2 * a)));
				System.out.println();
				System.out.printf("x2 = " + ((-b - sqrtDelta) / (2 * a)));
			}
		}
		objSc.nextLine();
	}

	/*
	 * BAI 3 _ CHO THEM
	 */
	public static void tinhTienDien(Scanner objSc) {
		int soDienSuDung = 0;
		int tienDien = 0;
		System.out.println("Nhap so dien su dung trong thang");
		try {
			soDienSuDung = objSc.nextInt();
			if (soDienSuDung < 0) {
				System.out.println("Gia tri ban nhap khong phai la so ");
				return;
			}
		} catch (Exception e) {
			System.out.println("Gia tri ban nhap khong phai la so ");
			return;
		}

		if (soDienSuDung <= 50) {
			tienDien = soDienSuDung * 1000;
		} else {
			tienDien = 50 * 1000 + (soDienSuDung - 50) * 1200;
		}
		System.out.println("So tien dien phai tra : " + tienDien);

		objSc.nextLine();
	}

	/*
	 * BAI 4 _ CHO THEM
	 */
	public static void menu(Scanner objSc) {
		System.out.println("+-------------------------------------------+");
		System.out.println("1.Tinh so ngay trong thang");
		System.out.println("2.Dang ki ket ban");
		System.out.println("3.Tim so luong so chan");
		System.out.println("4.Giai phuong trinh bac 2");
		System.out.println("5.Tinh tien dien");
		System.out.println("6.Ket thuc");
		System.out.println("+-------------------------------------------+");

		boolean tiepTucChon=true;
		String temp = "";
		
		while(tiepTucChon){
			System.out.print("Chon chuc nang : ");
			int maChucNang = 0;
			try {
				maChucNang = objSc.nextInt();
				objSc.nextLine();
			} catch (Exception e) {
				System.out.println("Ma chuc nang ban nhap khong dung");
				return;
			}
			switch (maChucNang) {
			case 1:
				bai4(objSc);
				break;
			case 2:
				bai5(objSc);
				break;
			case 3:
				demSoChan(objSc);
				break;
			case 4:
				giaiPTBac2(objSc);
				break;
			case 5:
				tinhTienDien(objSc);
				break;
			case 6:
				System.out.println("Ket thuc chuong trinh");
				tiepTucChon = false;
				break;
			default:
				System.out.println("Ma chuc nang ban nhap khong dung");
				break;
			}
			
//			System.out.println();
//			
//			if (tiepTucChon == false){
//				return;
//			}else{
//				System.out.println("Ban co muon lam tiep khong (Y/N)");
//				temp = objSc.nextLine();
//				while(temp.equals("")){
//					System.out.println("Hay nhap Y(Yes) hoac N(No))");
//					temp = objSc.nextLine();
//				}
				
//				if(temp.equals("Y")){
//					tiepTucChon = true;
//				}else{
//					tiepTucChon = false;
//					System.out.println("Ket thuc chuong trinh");
//				}
//			}
		}
	}
}
