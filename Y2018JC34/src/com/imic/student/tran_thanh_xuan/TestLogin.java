package com.imic.student.tran_thanh_xuan;

import java.util.Scanner;

public class TestLogin {

	public static void main(String[] args) {
		/*
		 * Yêu cầu người dùng nhập vào thông tin UserName và PassWord.  Kiểm
		 * tra thông tin đăng nhập. Trường hợp tên truy cập người dùng không
		 * nhập thì đưa ra thông báo “Bạn chưa nhập tên truy cập!” và khi
		 * người dùng không nhập mật khẩu thì thông báo “Bạn chưa nhập mật
		 * khẩu”.  Kiểm tra nếu tên truy cập là : abc và mật khẩu là 123456
		 * thì thông báo “Bạn đã đăng nhập thành công!”. Ngược lại thì
		 * thông báo “Đăng nhập không thành công.Vui lòng kiểm tra thông tin
		 * đăng nhập”.
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("User name: ");
		String userName = sc.nextLine();
		//sc.nextLine();
		System.out.println("Password: ");
		String passWord = sc.nextLine();
		if (userName.equals("") || passWord.equals("")) {
			System.out.println("Ban chua nhap User name hoac Pass word!");
		} else {
			if (userName.equals("abc") && passWord.equals("123456")) {
				System.out.println("Ban da dang nhap thanh cong!");
			} else {
				System.out.println("Dang nhap khong thanh cong!");
			}
		}
	}

}
