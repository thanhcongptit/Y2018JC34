package Lab2;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Lab_2_Exercise_5 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String name = "";
		String relationship = "";
		String sex = "";
		String age = "";
		boolean test = true;
		String check = "";
		do {
			try {
				System.out.println("Mời bạn nhập tên: ");
				name = sc.nextLine();
				System.out.println("Mối quan hệ: "); // ("\\d+"))
				relationship = sc.nextLine();
				System.out.println("Giới tính: ");
				sex = sc.nextLine();
				System.out.println("Tuổi: ");
				age = sc.nextLine();
				if (relationship.matches("\\d+") || sex.matches("\\d+")) {
					throw new FileNotFoundException();
				}

				if (name.equals("") || relationship.equals("") || sex.equals("") || age.equals("")) {
					System.out.println("Bạn chưa nhập đủ thông tin!");
				} else {
					if (Integer.parseInt(age) < 19) {
						System.out.println("Bạn chưa đủ tuổi tham gia!");
					} else {
						////////////////////////////////////////////////////////////
						if (sex.equalsIgnoreCase("nam") && Integer.parseInt(age) < 22
								&& (relationship.equalsIgnoreCase("chưa có gia đình")
										|| relationship.equalsIgnoreCase("ly hôn"))) {
							System.out.println("Bạn không đủ điều kiện tham gia!");
						} else {
							if ((sex.equalsIgnoreCase("nam") && Integer.parseInt(age) >= 22
									&& (relationship.equalsIgnoreCase("chưa có gia đình")
											|| relationship.equalsIgnoreCase("ly hôn")))) {
								System.out.println("Mời bạn tham gia!");
							}
						}
						/////////////////////////////////////////////////////////////////
						if ((sex.equalsIgnoreCase("nữ") || sex.equalsIgnoreCase("nu")) && Integer.parseInt(age) < 19
								&& !(relationship.equalsIgnoreCase("chưa có gia đình")
										|| relationship.equalsIgnoreCase("ly hôn"))) {
							System.out.println("Bạn không đủ điều kiện tham gia!");
						} else {
							if ((sex.equalsIgnoreCase("nữ") || sex.equalsIgnoreCase("nu"))
									&& Integer.parseInt(age) >= 19 && (relationship.equalsIgnoreCase("chưa có gia đình")
											|| relationship.equalsIgnoreCase("ly hôn"))) {
								System.out.println("Mời bạn tham gia!");
							}
						}
					}
				}
				System.out.println("Nhấn Enter để tiếp tục. Nhấn 0 để thoát!");
				check = sc.nextLine();
				if (check.equals("0")) {
					test = false;
					sc.close();
				} else {
					test = true;
				}

			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("Nhập sai định dạng (mối quan hệ/giới tính). Mời bạn nhập lại!");
			}

		} while (test);

	}
}
