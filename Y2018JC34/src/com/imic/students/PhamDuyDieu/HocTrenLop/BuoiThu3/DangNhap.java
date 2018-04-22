package com.imic.students.PhamDuyDieu.HocTrenLop.BuoiThu3;

import java.util.Scanner;
/*Học viên không cần thiết kế giao diện (Sử dụng phát biểu lệnh System.out.Println() để hiển thị thông báo & Scanner() để nhận giá trị người dùng nhập vào).
Công ty CP iMicroSoft – dành cho học viên tham khảo BM_[BM_TNOJ]_Training_On_Jobs_Of_JAVA – ver2.2.1
Trang 1 / 6
CÔNG TY CP PHẦN MỀM - ĐÀO TẠO VÀ PHÁT TRIỂN CÔNG NGHỆ
Trụ sở chính: Tầng 2B, tòa nhà T6-08 Tổng Cục V Bộ Công An Điện thoại: (043) 7557 666 – (043) 7557 333
Email: tuvan@imicrosoft.edu.vn - Website: www.imic.edu.vn
 Yêu cầu người dùng nhập vào thông tin UserName và PassWord.
 Kiểm tra thông tin đăng nhập. Trường hợp tên truy cập người dùng không
nhập thì đưa ra thông báo “Bạn chưa nhập tên truy cập!” và khi người dùng
không nhập mật khẩu thì thông báo “Bạn chưa nhập mật khẩu”.
 Kiểm tra nếu tên truy cập là : abc và mật khẩu là 123456 thì thông báo “Bạn
đã đăng nhập thành công!”. Ngược lại thì thông báo “Đăng nhập không thành công.Vui lòng kiểm tra thông tin đăng nhập”.*/

public class DangNhap {

	public static void main(String[] args) {
		while (true) {
			String tenDangNhap;
			String matKhau;
			String sosanh = "";
			Scanner sc = new Scanner(System.in);
			System.out.println("Ten Dang Nhap: ");
			tenDangNhap = sc.nextLine();
			if (tenDangNhap.equalsIgnoreCase(sosanh)) {
				System.out.println("Ban can nhap ten dang nhap.");
			} else {
				System.out.println("Mat Khau: ");
				matKhau = sc.nextLine();
				if (matKhau.equalsIgnoreCase(sosanh)) {
					System.out.println("Ban can nhap mat khau.");
				} else {
					if (tenDangNhap.equals("abc") && matKhau.equals("123456")) {
						System.out.println("Ban da dang nhap thanh cong");
					} else {
						System.out.println("Ban da nhap sai ten dang nhap hoac mat khau.");
					}

				}
			}

		}

	}
}