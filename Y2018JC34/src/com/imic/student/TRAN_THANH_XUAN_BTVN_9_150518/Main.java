package com.imic.student.TRAN_THANH_XUAN_BTVN_9_150518;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Run();
	}

	public static void Run() {
		Scanner sc = new Scanner(System.in);
		int numberStudent = 0;
		System.out.println("Nhap so sinh vien: ");
		ArrayList<InfoStuden> infoStArr = new ArrayList<InfoStuden>();
		try {
			numberStudent = sc.nextInt();
			sc.nextLine();
			if (numberStudent < 0) {
				System.out.println("So sinh vien la so nguyen duong!");
				return;
			}
			for (int i = 0; i < numberStudent; i++) {
				init(sc, infoStArr);
			}
			if (infoStArr.size() == 0) {
				System.out.println("Danh sach sinh vien trong!");
				return;
			} else {
				System.out.println("-------------Danh sach sinh vien sau khi nhap-------------");
				showStudent(infoStArr);

				System.out.println("---------------LUA CHON CHUC NANG-----------------");
				System.out.println("1. Add Student");
				System.out.println("2. Edit student by id.");
				System.out.println("3. Delete student by id.");
				System.out.println("4. Sort student by gpa.");
				System.out.println("5. Sort student by name.");
				System.out.println("6. Show student.");
				System.out.println("0. Exit");
				System.out.println("Your chosse: ");
				try {
					int numberChosse = sc.nextInt();
					sc.nextLine();
					boolean run = true;
					while (run) {
						switch (numberChosse) {
						case 1:
							Main ma = new Main();
							AddStudent(infoStArr, sc);
							break;
						case 2:
							EditStudent(infoStArr, sc);
							break;
						case 3:
							DeleteStudent(infoStArr, sc);
							break;
						case 4:
							SortGpa(infoStArr);
							break;
						case 5:
							SortGpa(infoStArr);
							break;
						case 6:
							SortName(infoStArr);
							break;
						case 0:
							System.out.println("Ban da thoat khoi chuong trinh!");
							return;
						default:
							System.out.println("So ban chon khong ton tai! Moi chon lai");
							numberChosse = sc.nextInt();
							sc.nextLine();
							break;
						}

						System.out.println("---------------LUA CHON CHUC NANG-----------------");
						System.out.println("1. Add Student");
						System.out.println("2. Edit student by id.");
						System.out.println("3. Delete student by id.");
						System.out.println("4. Sort student by gpa.");
						System.out.println("5. Sort student by name.");
						System.out.println("6. Show student.");
						System.out.println("0. Exit");
						System.out.println("Your chosse: ");
						numberChosse = sc.nextInt();
						sc.nextLine();

					}
				} catch (Exception e) {
					System.out.println("Ban phai lua chon cac so 1/2/3/4/5/6/0");
				}
			}

		} catch (Exception e) {
			System.out.println("So sinh vien la so nguyen duong!");
			return;
		}
	}

	// ---------------------------------------------------------------------------//
	public static void showStudent(ArrayList<InfoStuden> is) {
		for (int i = 0; i < is.size(); i++) {
			System.out.println(is.get(i).toString());
		}
	}

	// ---------------------------------------------------------------------------//
	public static void AddStudent(ArrayList<InfoStuden> infoStArr, Scanner sc) {
		System.out.println("Nhap so sinh vien ban muon them");
		try {
			int moreStudent = sc.nextInt();
			sc.nextLine();
			for (int i = 0; i < moreStudent; i++) {
				init(sc, infoStArr);

			}
			System.out.println("-------------Danh sach sinh vien sau khi them-------------");
			showStudent(infoStArr);
		} catch (Exception e) {
			System.out.println("So SV phai la so nguyen duong!");
			return;
		}

	}

	// ---------------------------------------------------------------------------//
	public static void EditStudent(ArrayList<InfoStuden> infoStArr, Scanner sc) {
		System.out.println("Nhap id sinh vien ban muon sua thong tin:");
		String idEdit = sc.nextLine();
		for (int i = 0; i < infoStArr.size(); i++) {
			if (idEdit.equals(infoStArr.get(i).getIdStudent())) {
				infoStArr.remove(i);
				System.out.println("Sua thong tin sin vien co ma so " + idEdit);
				init(sc, infoStArr);
			}
		}
		System.out.println("-------------Danh sach sinh vien sau khi sua-------------");
		showStudent(infoStArr);
	}

	// ---------------------------------------------------------------------------//
	public static void DeleteStudent(ArrayList<InfoStuden> infoStArr, Scanner sc) {
		System.out.println("Nhap id sinh vien ban muon xoa");
		String idRemove = sc.nextLine();
		for (int i = 0; i < infoStArr.size(); i++) {
			if (idRemove.equals(infoStArr.get(i).getIdStudent())) {
				infoStArr.remove(i);
			}
		}
		System.out.println("-------------Danh sach sinh vien sau khi xoa-------------");
		showStudent(infoStArr);
	}

	// ---------------------------------------------------------------------------//
	public static void SortGpa(ArrayList<InfoStuden> is) {

		for (int i = 0; i < is.size(); i++) {
			for (int j = i + 1; j < is.size(); j++) {
				if (is.get(i).getGpaStudent() < is.get(j).getGpaStudent()) {
					InfoStuden temp = is.get(j);
					is.set(j, is.get(i));
					is.set(i, temp);
				}

			}
		}
		System.out.println("-------------DS sinh vien sau khi sort GPA giam dan-------------");
		showStudent(is);
	}

	// ---------------------------------------------------------------------------//
	public static void SortName(ArrayList<InfoStuden> is) {
		Collections.sort(is);
		System.out.println("-------------DS sinh vien sau khi sap xep theo ten-------------");
		showStudent(is);
	}

	// ---------------------------------------------------------------------------//
	public static void init(Scanner sc, ArrayList<InfoStuden> is) {
		InfoStuden info = new InfoStuden();
		try {
			System.out.print("ID: ");
			String id = sc.nextLine();
			info.setIdStudent(id);

			System.out.print("Name: ");
			String name = sc.nextLine();
			info.setNameStudent(name);

			System.out.print("Age: ");
			int age = sc.nextInt();
			if (age < 0) {
				System.out.println("Age la so nguyen duong!");
				return;
			}
			info.setAgeStudent(age);
			sc.nextLine();

			System.out.print("Add: ");
			String add = sc.nextLine();
			info.setAddStudent(add);

			try {
				System.out.print("GPA: ");
				float gpa = sc.nextFloat();
				if (gpa < 0) {
					System.out.println("Diem gpa phai > 0");
					return;
				}
				info.setGpaStudent(gpa);
			} catch (Exception e) {
				return;
			}

			sc.nextLine();
			is.add(info);

		} catch (Exception e) {
			System.out.println("Ban nhap sai dinh dang! Moi kiem tra lai.");
			sc.nextLine();
			return;
		}

	}

}
