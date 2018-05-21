package com.imic.students.TruongQuangQuan.BaiTapBuoi9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class BaiTapBoSung {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		ArrayList<Student> a = new ArrayList<Student>();
		int menu = 0;
		while (true) {
			System.out.println("Chọn 1 trong các chức năng");
			System.out.println("1. Add student.\r\n" + "2. Edit student by id.\r\n" + "3. Delete student by id.\r\n"
					+ "4. Sort student by gpa.\r\n" + "5. Sort student by name.\r\n" + "6. Show student.\r\n"
					+ "0. Exit.");
			menu = scanner.nextInt();

			switch (menu) {
			case 1:
				addStudent(scanner, a);
				break;
			case 2:
				editStudent(scanner, a);
				break;
			case 3:
				deleteStudent(scanner, a);
				break;
			case 4:
				Collections.sort(a);
				break;
			case 5:
				Collections.sort(a, new Comparator<Student>() {

					@Override
					public int compare(Student o1, Student o2) {
						// TODO Auto-generated method stub
						return o1.getName().compareTo(o2.getName());
					}
				});
				break;
			case 6:

				for (int i = 0; i < a.size(); i++) {
					System.out.println(a.get(i));
				}
				break;

			default:
				break;
			}
			if (menu == 0) {
				break;
			}
		}
	}

	public static void addStudent(Scanner scanner, ArrayList<Student> a) {
		while (true) {
			Student student = new Student();
			boolean check = true;
			do {
				System.out.print("ID:");
				student.setId(scanner.nextInt());
				scanner.nextLine();
				check = true;
				if (!a.isEmpty()) {
					for (int i = 0; i < a.size(); i++) {
						Student checkID = a.get(i);
						if (student.getId() == checkID.getId()) {
							System.out.printf("ID %d đã tồn tại mời bạn nhập lại \n", student.getId());
							check = false;
						}
					}
				}
			} while (!check);

			System.out.print("Name:");
			student.setName(scanner.nextLine());
			System.out.print("Age:");
			student.setAge(scanner.nextInt());
			scanner.nextLine();
			System.out.println("Address");
			student.setAddress(scanner.nextLine());
			System.out.print("Gpa:");
			student.setGpa(scanner.nextDouble());
			scanner.nextLine();
			a.add(student);

			System.out.println("Bạn có muốn nhập tiếp  \n" + "Y or N");
			String nhapTiep = scanner.nextLine();
			if (nhapTiep.equalsIgnoreCase("N")) {
				break;
			}
		}
	}

	public static void editStudent(Scanner scanner, ArrayList<Student> a) {

		Student student = new Student();
		int i = 0;
		int n = 0;
		int check = 0;
		
		if (a.isEmpty()) {
			System.out.println("Chưa có sinh viên nào được nhập");
		} else {
			while (check == 0) {
				System.out.println("Nhập ID sinh viên muốn sửa");
				int checkID = scanner.nextInt();
				scanner.nextLine();

				for (i = 0; i < a.size(); i++) {
					Student svTemp = a.get(i);
					if (checkID == svTemp.getId()) {
						student = a.get(i);
						check++;
					}
				}
				if (check == 0) {
					System.out.printf("Không có sinh viên có mã ID %d %n", checkID);
					System.out.println("Hãy nhập lại");
				}
			}

			System.out.println("Mời bạn nhập thông tin muốn sửa : ");
			System.out.print("1 : ID\r\n" + "2 : Tên\r\n" + "3 : Tuổi\r\n" + "4 : Địa chỉ\r\n" + "5 : Điểm TB");
			int infoEdit = scanner.nextInt();
			scanner.nextLine();
			switch (infoEdit) {
			case 1:
				boolean chek = true;
				do {
					System.out.print("Mời bạn nhập ID mới:");
					int newID = scanner.nextInt();
					scanner.nextLine();
					chek = true;
					System.out.println(student.getId());
					for (i = 0; i < a.size(); i++) {
						Student checkID = a.get(i);
						System.out.println(checkID.getId());
						n = i;
						if (newID == checkID.getId()) {
							System.out.printf("ID %d đã tồn tại mời bạn nhập lại \n", student.getId());
							chek = false;
						}
					}
					student.setId(newID);
				} while (!chek);
				a.set(n, student);
				break;
			case 2:
				System.out.print("Mời bạn nhập tên mới: ");
				student.setName(scanner.nextLine());
				a.set(n, student);
				break;
			case 3:
				System.out.print("Mời bạn nhập tuổi mới: ");
				student.setAge(scanner.nextInt());
				scanner.nextLine();
				a.set(n, student);
				break;
			case 4:
				System.out.print("Mời bạn nhập địa chỉ mới: ");
				student.setAddress(scanner.nextLine());
				a.set(n, student);
				break;
			default:
				System.out.print("Mời bạn nhập điểm TB mới: ");
				student.setGpa(scanner.nextDouble());
				scanner.nextLine();
				a.set(n, student);
				break;
			}
		}
	}

	public static void deleteStudent(Scanner scanner, ArrayList<Student> a) {
		int check = 0;
		int n = 0;

		if (a.isEmpty()) {
			System.out.println("Chưa có sinh viên nào được nhập");
		} else {
			while (check == 0) {
				System.out.println("Nhập ID sinh viên muốn xóa");
				int checkID = scanner.nextInt();
				scanner.nextLine();

				for (int i = 0; i < a.size(); i++) {
					Student svTemp = a.get(i);
					if (checkID == svTemp.getId()) {
						n = i;
						check++;
					}
				}
				if (check == 0) {
					System.out.printf("Không có sinh viên có mã ID %d %n", checkID);
					System.out.println("Hãy nhập lại");
				}
			}
			a.remove(n);
		}
	}
}
