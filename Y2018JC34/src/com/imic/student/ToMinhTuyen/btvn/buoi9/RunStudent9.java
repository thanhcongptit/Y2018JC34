package com.imic.student.ToMinhTuyen.btvn.buoi9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class RunStudent9 {

	public static void main(String[] args) {
		ArrayList<Student9> studentList = new ArrayList<Student9>();
		Scanner scanner = new Scanner(System.in);
		chonchucnang( scanner,studentList);

	}

	public static void addStudent(Scanner scanner, ArrayList<Student9> studentList) {
		while (true) {
			Student9 student = new Student9();

			System.out.println("Nhap ID ");
			String id = scanner.nextLine();
			student.setId(id);

			System.out.println("Nhap Ho Ten");
			String hoten = scanner.nextLine();
			student.setName(hoten);

			System.out.println("Nhap Tuoi ");
			int tuoi = scanner.nextInt();
			scanner.nextLine();
			student.setAge(tuoi);

			System.out.println("Nhap Dia Chi ");
			String diachi = scanner.nextLine();
			student.setAddress(diachi);

			System.out.println("Nhap GPA ");
			double diem = scanner.nextDouble();
			student.setGpa(diem);
			scanner.nextLine();

			studentList.add(student);

			System.out.println("Ban co muon nhap them Sinh vien khong: Y/N");
			if (scanner.nextLine().equalsIgnoreCase("N")) {
				break;
			}
		}
		System.out.println("	Danh Sach Sinh Vien:");
		showStudent(studentList);
	}

	public static void editStudent(Scanner scanner, ArrayList<Student9> studentList) {
		System.out.println("Nhap ID cua sinh vien can Edit:");
		while (true) {
			String id = scanner.nextLine();
			for (int i = 0; i < studentList.size(); i++) {
				Student9 s = studentList.get(i);
				if (s.getId().equalsIgnoreCase(id)) {
					// studentList.add (i, addStudent(scanner, studentList));
					System.out.println("Nhap thong tin moi cua sinh vien");
					Student9 student = new Student9();
					System.out.println("Nhap ID moi ");
					id = scanner.nextLine();
					student.setId(id);

					System.out.println("Nhap Ho Ten");
					String hoten = scanner.nextLine();
					student.setName(hoten);

					System.out.println("Nhap Tuoi ");
					int tuoi = scanner.nextInt();
					scanner.nextLine();
					student.setAge(tuoi);

					System.out.println("Nhap Dia Chi ");
					String diachi = scanner.nextLine();
					student.setAddress(diachi);

					System.out.println("Nhap GPA ");
					double diem = scanner.nextDouble();
					student.setGpa(diem);
					scanner.nextLine();

					studentList.add(i, student);
					studentList.remove(i + 1);

				}

			}
			System.out.println("Ban co muon nhap tiep ID khac: Y/N");
			if (scanner.nextLine().equalsIgnoreCase("N")) {
				break;
			}
		}
		System.out.println("	Danh Sach Sinh VIen sau khi Edit:");
		showStudent(studentList);

	}

	public static void DeleteStudent(Scanner scanner, ArrayList<Student9> studentList) {

		while (true) {
			System.out.println("Nhap ID cua sinh vien can Delete:");
			String id = scanner.nextLine();
			for (int i = 0; i < studentList.size(); i++) {
				Student9 s = studentList.get(i);
				if (s.getId().equalsIgnoreCase(id)) {
					studentList.remove(i);

				}
			}
			System.out.println("Ban co muon nhap tiep ID: Y/N");
			if (scanner.nextLine().equalsIgnoreCase("N")) {
				break;
			}
		}
		System.out.println("	Danh sach sinh vien sau khi Xoa: ");
		showStudent(studentList);
	}

	public static void sortname(ArrayList<Student9> studentList) {
		Collections.sort(studentList);
		System.out.println("Danh sach sinh vien sau khi Sap Xep theo HoTen: ");
		for (Student9 temp : studentList) {
			System.out.println(temp);
		}
		System.out.println("--------------------");

	}

	public static void sortgpa(ArrayList<Student9> studentList) {
		Collections.sort(studentList, new Comparator<Student9>() {

			@Override
			public int compare(Student9 gpa1, Student9 gpa2) {
				// TODO Auto-generated method stub
				return (int) (gpa2.getGpa() - gpa1.getGpa());
			}

		});

		System.out.println("Danh sach sinh vien sau khi Sap Xep theo Diem: ");
		showStudent(studentList);
	}

	public static void showStudent(ArrayList<Student9> studentList) {
		for (Student9 temp : studentList) {
			System.out.println(temp);
		}
		System.out.println("--------------------");
	}

	public static void chonchucnang(Scanner scanner, ArrayList<Student9> studentList) {
		while(true) {
		System.out.println("Moi Ban Chon chuc nang");
		System.out.println("1. Nhap Sinh Vien");
		System.out.println("2. Sua sinh vien theo ID");
		System.out.println("3. Xoa Sinh Vien theo ID");
		System.out.println("4. Sap xep sinh vien theo ten");
		System.out.println("5. Sap xep sinh vien theo diem");
		System.out.println("6. Show sinh vien");
		System.out.println("0. Exit");
		System.out.println("Chuc nang so:");
		
		int chucnang = scanner.nextInt();
		scanner.nextLine();

		switch (chucnang) {
		case 0:

			break;
		case 1:
			addStudent(scanner, studentList);
			break;
		case 2:
			editStudent(scanner, studentList);
			break;
		case 3:
			DeleteStudent(scanner, studentList);
			break;
		case 4:
			sortname(studentList);
			break;
		case 5:
			sortgpa(studentList);
			break;
		case 6:
			showStudent(studentList);
			break;

		default:
			break;
		}
		System.out.println("Ban co muon tiep tuc chon chuc nang khac khong: Y/N");
		if(scanner.nextLine().equalsIgnoreCase("N")) {
			break;
		}
	}
		
	}
}
