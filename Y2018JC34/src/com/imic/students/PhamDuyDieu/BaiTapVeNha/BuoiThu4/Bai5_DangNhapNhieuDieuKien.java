package com.imic.students.PhamDuyDieu.BaiTapVeNha.BuoiThu4;

import java.util.Scanner;

public class Bai5_DangNhapNhieuDieuKien {
	/*
	 * Yêu cầu người dùng nhập vào các thông tin liên quan cho việc xử
	 * lý thông tin.  Phải kiểm tra tất cả những trường thông tin bắt
	 * buộc phải nhập như : Tên, Tuổi, Tình trạng hôn nhân, Giới tính.
	 * Nếu người dùng chưa nhập thì đưa ra thông báo.  Xử lý nghiệp
	 * vụ đăng ký tham gia kết bạn. Yêu cầu người dùng nhập các thông
	 * tin: Tên, Tuổi, Giới tính và Tình trạng hôn nhân. Các qui định
	 * bắt buộc khi tham gia : o Thành viên là Nam, độ tuổi >= 22 tuổi và
	 * chưa có gia đình hoặc ly hôn được phép tham gia. o Thành viên là
	 * Nữ, độ tuổi >= 19 tuổi và chưa có gia đình hoặc ly hôn được
	 * phép tham gia. o Tất cả các thành viên tuổi < 19không được tham
	 * gia.
	 */

	public static void main(String[] args) {
		int vonglap = 1;
		while(vonglap ==1) {
			String ten;
			String tuoi;
			String tinhTrangHonNhan;
			String gioiTinh;
			String sosanh = "";
			int x = 0;
			int tuoi1 = 0;
			boolean check = true;
			Scanner sc = new Scanner(System.in);
			System.out.print("Mời bạn nhập thông tin đăng ký:\n Họ và tên: ");
			ten = sc.nextLine();

			while (ten.equals(sosanh)) {
				System.out.print("Bạn chưa nhập họ và tên. Mời bạn nhập lại..!\n Họ và tên: ");
				ten = sc.nextLine();
			}
			System.out.print(" Tuổi: ");
			tuoi = sc.nextLine();
			while (true) {
				try {
					tuoi1 = Integer.parseInt(tuoi);
					break;
				} catch (Exception e) {
					System.out.print("Bạn chưa nhập tuổi hoặc sai kiểu dữ liệu.\nMời bạn nhập lại..!\n Tuổi: ");
					tuoi = sc.nextLine();
				}
			}

			System.out.print("Tình trạng hôn nhân: \n1: Độc thân\n2: Đã lập gia đình\n3: Đã ly hôn");
			tinhTrangHonNhan = sc.nextLine();
			while (true) {
				try {
					x = Integer.parseInt(tinhTrangHonNhan);
					break;
				} catch (Exception e) {
					System.out.print(
							"Bạn chưa nhập tình trạng hôn nhân hoặc sai kiểu dữ liệu.\n1: Độc thân\n2: Đã lập gia đình\n3: Đã ly hôn\nMời bạn nhập lại..!\n");
					tinhTrangHonNhan = sc.nextLine();
				}
			}
			System.out.print("Giới tính: \n1: Nam\n2: Nữ");
			gioiTinh = sc.nextLine();
			while (true) {
				try {
					x = Integer.parseInt(gioiTinh);
					break;
				} catch (Exception e) {
					System.out.print(
							"Bạn chưa nhập giới tính hoặc sai kiểu dữ liệu.\n1: Nam\n2: Nữ\nMời bạn nhập lại..!\n");
					gioiTinh = sc.nextLine();
				}
			}
			if (tuoi1 < 19 || Integer.parseInt(tinhTrangHonNhan)==2) {
				System.out.println("Bạn không đủ điều kiện tham gia! Mời bạn đọc lại nội quy nhóm..!");
			} else {
				if(Integer.parseInt(gioiTinh)==2) {
					System.out.println("Bạn đã đăng ký tham gia thành công..!");
					System.out.println("Thông tin đăng ký:\nHọ và tên: "+ ten+"\nTuổi: "+tuoi+"\nGiới tính: "+gioiTinh+"\nTình trạng hôn nhân: "+tinhTrangHonNhan+"\nXin Cảm Ơn..!"); 
				}else {
					if(tuoi1>=22) {
						System.out.println("Bạn đã đăng ký tham gia thành công..!");
						System.out.println("Thông tin đăng ký:\nHọ và tên: "+ ten+"\nTuổi: "+tuoi+"\nGiới tính: "+gioiTinh+"\nTình trạng hôn nhân: "+tinhTrangHonNhan+"\nXin Cảm Ơn..!"); 
					}else {
						System.out.println("Bạn không thuộc đối tượng tham gia..!");
					}
				}
		}
			System.out.println("Mời bạn nhập lựa chọn:\n1: Đăng kí lại\n2: Thoát.!");
			vonglap=sc.nextInt();
	}
		
		
}
}