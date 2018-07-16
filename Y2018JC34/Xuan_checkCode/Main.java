package xuanttph06854.lab.java.assignment;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	static ArrayList empArr = new ArrayList<>();
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Run();
	}

	public static void Run() {
		boolean test = true;
		while (test) {
			System.out.println("------------------------------------ MENU ------------------------------------");
			System.out.printf(" 1. Nhập danh sách nhân viên \n " + "2. Xuất danh sách nhân viên \n "
					+ "3. Tìm nhân viên theo mã số \n " + "4. Xóa nhân viên theo mã \n "
					+ "5. Cập nhật thông tin nhân viên theo mã \n " + "6. Tìm các nhân viên theo khoảng lương \n "
					+ "7. Sắp xếp nhân viên theo họ tên \n " + "8. Sắp xếp nhân viên theo thu nhập \n "
					+ "9. Xuất 5 nhân viên có thu nhập cao nhất \n " + "0. Thoát \n");
			System.out.print(">> Lựa chọn: ");
			int choice = sc.nextInt();
			sc.nextLine();

			switch (choice) {
			case 1:
				option_1();
				break;
			case 2:
				option_2();
				break;
			case 3:
				option_3();
				break;
			case 4:
				option_4();
				break;
			case 5:
				option_5();
				break;
			case 6:
				option_6();
				break;
			case 7:
				option_7();
				break;
			case 8:
				option_8();
				break;
			case 9:
				option_9();
				break;
			case 0:
				System.out.println("Bạn đã thoát khỏi chương trình!");
				test = false;
			}

		}

	}

	public static void option_1() {

		System.out.println("----------------- Loại nhân viên -----------------");
		System.out.println(" 1. Nhân viên hành chính \n 2. Trưởng phòng \n 3. Nhân viên tiếp thị");
		System.out.println(">> Lựa chọn: ");
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			System.out.println("---------------- Nhập thông tin nhân viên hành chính ----------------");
			Employee emp = new Employee();
			emp.init();
			empArr.add(emp);
			break;
		case 2:
			System.out.println("---------------- Nhập thông tin trưởng phòng ----------------");
			Manager manager = new Manager();
			manager.init();
			empArr.add(manager);
			break;
		case 3:
			System.out.println("---------------- Nhập thông tin nhân viên tiếp thị ----------------");
			sale_Employee sale = new sale_Employee();
			sale.init();
			empArr.add(sale);
			break;
		}

	}

	public static void option_2() {
		System.out.println("--------------------------- Danh sách nhân viên --------------------------");
		for (int i = 0; i < empArr.size(); i++) {
			System.out.println(empArr.get(i).toString());
		}
	}

	public static void option_3() {

		System.out.println("Nhập mã nhân viên cần tìm kiếm: ");
		int idEmp = sc.nextInt();
		System.out.println("******* KẾT QUẢ ******");
		for (int i = 0; i < empArr.size(); i++) {
			if (idEmp == ((Employee) empArr.get(i)).getIdEmployee()) {
				System.out.println(((Employee) empArr.get(i)).toString());
			} else {
				if (idEmp == ((Manager) empArr.get(i)).getIdEmployee()) {
					System.out.println(((Manager) empArr.get(i)).toString());
				} else {
					if (idEmp == ((sale_Employee) empArr.get(i)).getIdEmployee()) {
						System.out.println(((sale_Employee) empArr.get(i)).toString());
					} else {
						System.out.println("không tìm thấy nhân viên có ID: " + idEmp);
					}
				}
			}
		}

	}

	public static void option_4() {
		System.out.println("Nhập mã nhân viên cần xóa: ");
		int idEmp = sc.nextInt();
		System.out.println("******* KẾT QUẢ ******");
		for (int i = 0; i < empArr.size(); i++) {
			if (idEmp == ((Employee) empArr.get(i)).getIdEmployee()) {
				empArr.remove(i);
				option_2();
			} else {
				System.out.println("không tìm thấy nhân viên có ID: " + idEmp);
				break;
			}
		}
	}

	public static void option_5() {
		System.out.println("Nhập mã nhân viên: ");
		int idEmp = sc.nextInt();

	}

	public static void option_6() {
		System.out.print("Khoảng lương MAX:");
		double max = sc.nextDouble();
		System.out.print("Khoảng lương MIN:");
		double min = sc.nextDouble();
		for (int i = 0; i < empArr.size(); i++) {
//			if (empArr.get(i).getSaraly() <= max && empArr.get(i).getSaraly() >= min) {
//				System.out.println(empArr.get(i).toString());
//			} else {
//				System.out.println("Không có nhân viên nào thảo mãn!");
//			}
		}
	}

	public static void option_7() {

	}

	public static void option_8() {
		System.out.println("------------------ Sắp xếp nhân viên theo thu nhập tăng dần");
		Collections.sort(empArr);
		option_2();
	}

	public static void option_9() {
		System.out.println("---------------- 5 nhân viên có thu nhập cao nhất -------------------");
		Collections.sort(empArr);
		for (int i = 0; i < 4; i++) {
			System.out.println(empArr.get(i).toString());
		}
	}

}
