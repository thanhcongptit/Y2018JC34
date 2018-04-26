package com.imic.student.TRAN_THANH_XUAN;

import java.util.Arrays;
import java.util.Scanner;

import com.sun.javafx.fxml.BeanAdapter;

public class BTVN_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoExercises();
	}

	public static void DoExercises() {
		Scanner sc = new Scanner(System.in);
		boolean check = true;
		String run = "";
		int exerciseNumber = 0;

		System.out.println("Nhập bài bạn muốn làm(1,2,3,4)!");
		try {
			exerciseNumber = sc.nextInt();
		} catch (Exception e) {
			System.out.println("Bạn phải nhập số!");
			exerciseNumber = 0;
		}

		while (check) {
			sc.nextLine(); // xóa phím enter
			switch (exerciseNumber) {
			case 1: {
				Bai_1();
				break;
			}
			case 2: {
				Bai_2();
				break;
			}
			case 3: {
				Bai_3();
				break;
			}
			case 4: {
				Bai_4();
				break;
			}
			default: {
				break;
			}
			}

			System.out.println("Nhấn 0 để thoát. Nhấn Enter để làm bài khác!");
			run = sc.nextLine();
			if (run.equals("0")) {
				check = false;
				break;
			} else {
				check = true;
			}

			System.out.println("Nhập bài bạn muốn làm(1,2,3,4)!");
			try {
				// sc.next();
				exerciseNumber = sc.nextInt();
			} catch (Exception e) {
				System.out.println("Bạn phải nhập số!");
				exerciseNumber = 0;
			}
		}
		System.out.println("Bạn đã thoát khỏi chương trình!");
		// sc.close();

	}

	// BAI 1: Nhap vao 1 mang so nguyen, in ra tat cac so chan cua mang do

	public static void Bai_1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Bài 1");
		System.out.println("Nhập số phần từ của mảng: ");
		int numberArrays = 0;
		boolean check = true;
		String run = "";
		boolean temp = true;
		boolean temp1 = true;
		try {
			numberArrays = sc.nextInt();
			check = false;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Bạn phải nhập số!");
			numberArrays = 0;
			// check = true;
		}

		// ----------------------------------------------------------//

		while (check) {
			sc.nextLine(); // xoa phim Enter
			System.out.println("Nhập số phần từ của mảng: ");
			try {
				numberArrays = sc.nextInt();
				check = false;
				break;
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("Bạn phải nhập số!");
				numberArrays = 0;
			}

			System.out.println("Nhấn 0 để kết thúc bài 1. Nhấn Enter để làm lại!");
			sc.nextLine();
			run = sc.nextLine();
			if (run.equals("0")) {
				check = false;
				temp = false;
				// break;
			} else {
				check = true;
				temp = true;
			}

		}
		if (temp == false) {
			System.out.println("Kết thúc bài 1!");
		} else {
			int intArrays[] = new int[numberArrays];
			int intArrays1[] = new int[numberArrays];

			System.out.println("Nhập mảng");
			try {
				for (int i = 0; i < numberArrays; i++) {
					intArrays[i] = sc.nextInt();
				}
			} catch (Exception e) {
				System.out.println("Bạn đã nhập sai định dạng!");
				temp1 = false;
			}

			if (temp1 == false) {
				System.out.println("Kết thúc bài 1!");
			} else {
				System.out.println("Các số chia hết cho 2:");
				for (int i = 0; i < numberArrays; i++) {
					if (intArrays[i] % 2 == 0) {
						intArrays1[i] = intArrays[i];
						System.out.print(intArrays1[i] + " ");
					}
				}
				System.out.println("");
			}

		}
		return;

	}

	// -----------------------------------------------//

	// BAI 2: BTVN: Nhap vao mang 10 phan tu, sap xep theo thu tu giam dan

	public static void Bai_2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Bài 2");
		System.out.println("Nhập số phần tử của mảng: ");
		int numberArrays = 0;
		String run = "";
		boolean check = true;
		boolean test = true;
		boolean test1 = true;
		try {
			numberArrays = sc.nextInt();
			check = false;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Bạn phải nhấp số!");
			numberArrays = 0;
		}

		while (check) {
			sc.nextLine(); // xoa phim Enter
			System.out.println("Nhập số phần tử của mảng: ");
			try {
				numberArrays = sc.nextInt();
				check = false;
				break;
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("Bạn phải nhập số!");
				numberArrays = 0;
			}

			System.out.println("Chọn 0 để kết thúc bài 2. Enter để làm lại!");
			sc.nextLine(); // xóa phím Enter
			run = sc.nextLine();
			if (run.equals("0")) {
				check = false;
				// break;
				test = false;
			} else {
				check = true;
				test = true;
			}
		}
		// ---------------------------------------------------//
		if (test == false) {
			System.out.println("Kết thúc bài 2!");
		} else {
			int intArray[] = new int[numberArrays];

			System.out.println("Nhập mảng: ");
			try {
				for (int i = 0; i < numberArrays; i++) {
					intArray[i] = sc.nextInt();
				}
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("Bạn nhập sai định dạng");
				test1 = false;
			}
			if (test1 == false) {
				System.out.println("Kết thúc bài 2!");
			} else {
				int temp = 0;
				for (int i = 0; i < numberArrays - 1; i++) {
					for (int j = i + 1; j < numberArrays; j++) {
						if (intArray[i] > intArray[j]) {

							temp = intArray[i];
							intArray[i] = intArray[j];
							intArray[j] = temp;
						}
					}
				}

				System.out.println("Dãy giảm");
				for (int i = numberArrays - 1; i >= 0; i--) {
					System.out.print(intArray[i] + " ");
				}
				System.out.println();
			}
		}
		return;
	}

	// BAI 3: Viết chương trình nhập mảng số nguyên từ bàn phím.
	// Sắp xếp và xuất mảng vừa nhập ra màn hình.
	// Xuất phần tử có giá trị nhỏ nhất ra màn hình
	// Tính và xuất ra màn hình trung bình cộng các phần tử chia hết cho 3

	public static void Bai_3() {
		Scanner sc = new Scanner(System.in);
		int numberArrays = 0;
		boolean check = true;
		boolean test = true;
		boolean test1 = true;
		String run = "";
		System.out.println("Bài 3");
		System.out.println("Nhập số phần tử của mảng: ");
		try {
			numberArrays = sc.nextInt();
			check = false;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Bạn phải nhập số!");
			numberArrays = 0;
		}
		// -----------------kiem tra dieu kien nhap so------------------//
		while (check) {
			sc.nextLine(); // xoa phim Enter
			System.out.println("Nhập số phần tử của mảng: ");
			try {
				numberArrays = sc.nextInt();
				check = false;
				break;
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("Bạn phải nhập số!");
				numberArrays = 0;
			}

			System.out.println("Chọn 0 để kết thúc bài 3. Enter để làm lại!");
			sc.nextLine(); // xoa phim Enter
			run = sc.nextLine();
			if (run.equals("0")) {
				check = false;
				test = false;
			} else {
				check = true;
				test = true;
			}
		}

		// -----------------------------thân hàm--------------------------------//
		if (test == false) {
			System.out.println("Kết thúc bài 1!");
		} else {
			int intArray[] = new int[numberArrays];

			System.out.println("Nhập mảng: ");
			try {
				for (int i = 0; i < numberArrays; i++) {
					intArray[i] = sc.nextInt();
				}
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("Bạn nhập sai định dạng!");
				test1 = false;
			}

			if (test1 == false) {
				System.out.println("Kết thúc bài 3!");
			} else {
				// Sắp xếp tăng và xuất mảng vừa nhập ra màn hình.
				Arrays.sort(intArray);
				for (int i = 0; i < numberArrays; i++) {
					System.out.print(intArray[i] + " ");
				}

				// Xuất phần tử có giá trị nhỏ nhất ra màn hình
				System.out.println();
				System.out.println("Phần tử nhỏ nhất: " + intArray[0]);

				// Tính và xuất ra màn hình trung bình cộng các phần tử chia hết cho 3
				double temp = 0;
				int count = 0;
				for (int i = 0; i < numberArrays; i++) {
					if (intArray[i] % 3 == 0) {
						temp = temp + intArray[i];
						count++;
					}
				}

				System.out.println("Trung bình cộng các số chia hết cho 3 = " + (temp / count));
			}
		}
		return;
	}

	// BAI 4:
	// Xuất 2 mảng đã nhập, mỗi sinh viên có thêm học lực
	// o Yếu: điểm < 5
	// o Trung bình: 5 <= điểm < 6.5
	// o Khá: 6.5 <= điểm < 7.5
	// o Giỏi: 7.5<= điểm < 9
	// o Xuất sắc: điểm >= 9
	// Sắp xếp danh sách sinh viên đã nhập tăng dần theo điểm

	public static void Bai_4() {
		Scanner sc = new Scanner(System.in);
		int numberStudent = 0;
		String run = "";
		boolean check = true;
		boolean test = true;
		boolean test1 = true;
		System.out.println("Bài 4");
		System.out.println("Nhập số sinh viên: ");
		try { // kiem tra dieu kien input
			numberStudent = sc.nextInt();
			check = false;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Bạn phải nhập số!");
			numberStudent = 0;
		}
		while (check) {
			sc.nextLine(); // xoa phim Enter
			System.out.println("Nhập số sinh viên: ");
			try {
				numberStudent = sc.nextInt();
				check = false;
				break;
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("Bạn phải nhập số!");
				numberStudent = 0;
			}

			System.out.println("Chọn 0 để kết thúc bài 4. Chọn Enter để làm lại");
			sc.nextLine(); // xóa phím Enter
			run = sc.nextLine();
			if (run.equals("0")) {
				check = false;
				test = false;
			} else {
				check = true;
				test = true;
			}
		}

		// --------------------------------------------------------//
		if (test == false) {
			System.out.println("Kết thúc bài 1!");
		} else {
			String studentArrays[] = new String[numberStudent];
			float studentMark[] = new float[numberStudent];
			String studentLevel[] = new String[numberStudent];

			try { // kiem tra dinh dang input
				for (int i = 0; i < numberStudent; i++) {
					System.out.print("Name student " + (i + 1) + ":");
					studentArrays[i] = sc.next();
					// sc.nextLine();
					System.out.print("Mark student " + (i + 1) + ":");
					studentMark[i] = sc.nextFloat();
					System.out.println();
				}
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("Bạn đã nhập sai định dạng!");
				test1 = false;
			}

			if (test1 == false) {
				System.out.println("Kết thúc bài 4!");
			} else {
				// ---------------------------Kiem tra hoc luc sinh
				// vien-----------------------------------//
				for (int i = 0; i < numberStudent; i++) {
					if (studentMark[i] < 5) {
						studentLevel[i] = "Yếu";
					} else {
						if (5 <= studentMark[i] && studentMark[i] < 6.5) {
							studentLevel[i] = "Trung bình";
						} else {
							if (6.5 <= studentMark[i] && studentMark[i] < 7) {
								studentLevel[i] = "Khá";
							} else {
								if (7.5 <= studentMark[i] && studentMark[i] < 9) {
									studentLevel[i] = "Giỏi";
								} else {
									studentLevel[i] = "Xuất sắc";
								}
							}
						}
					}
				}

				// ------------------------Sap xem sinh vien theo
				// diem--------------------------------//

				String tempArray = "";
				String tempLevel = "";
				float tempMark = 0;
				for (int i = 0; i < numberStudent - 1; i++) {
					for (int j = i + 1; j < numberStudent; j++) {
						if (studentMark[i] > studentMark[j]) {
							// --------------------------------------//
							tempArray = studentArrays[i];
							studentArrays[i] = studentArrays[j];
							studentArrays[j] = tempArray;

							// --------------------------------------//
							tempMark = studentMark[i];
							studentMark[i] = studentMark[j];
							studentMark[j] = tempMark;

							// --------------------------------------//
							tempLevel = studentLevel[i];
							studentLevel[i] = studentLevel[j];
							studentLevel[j] = tempLevel;
						}
					}
				}

				// ------------------------in ket qua--------------------------------------//
				System.out.println("Danh sách sinh viên");
				for (int i = 0; i < numberStudent; i++) {
					System.out.println("" + studentArrays[i] + "   " + studentMark[i] + "   " + studentLevel[i]);
				}
				System.out.println();
			}
		}
		return;
	}
}
