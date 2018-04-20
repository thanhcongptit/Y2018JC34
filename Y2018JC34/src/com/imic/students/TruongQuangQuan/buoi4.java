package com.imic.students.TruongQuangQuan;
import java.util.Scanner;

public class buoi4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("UserName: ");
		String userName = scanner.nextLine();

		System.out.println("PassWord");
		String passWord = scanner.nextLine();

		String a = "";
		if (userName.equalsIgnoreCase(a)) {
			System.out.println("Bạn chưa nhập tên truy cập!");
		}
		if (passWord.equalsIgnoreCase(a)) {
			System.out.println("Bạn chưa nhập mật khẩu!");
		}

		String userNamedung = "abc";
		String passWorddung = "123456";

		if (userName.equalsIgnoreCase(userNamedung) && passWord.equalsIgnoreCase(passWorddung)) {
			System.out.println("đã đăng nhập thành công!");
		} else
			System.out.println("Đăng nhập không thành công.Vui lòng kiểm tra thông tin đăng nhập");

	}
}