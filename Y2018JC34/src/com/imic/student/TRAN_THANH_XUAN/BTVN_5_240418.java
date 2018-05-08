package com.imic.student.TRAN_THANH_XUAN;

import java.util.Arrays;
import java.util.Scanner;

import com.sun.javafx.fxml.BeanAdapter;

public class BTVN_5_240418 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoExercises();
	}

	public static void DoExercises() {
		Scanner sc = new Scanner(System.in);
		boolean check = true;
		String run = "";
		int exerciseNumber = 0;

		System.out.println("Nhập bài bạn muốn làm(1,2,3,4,5,6)!");
		try {
			exerciseNumber = sc.nextInt();
			if (exerciseNumber < 0) {
				System.out.println("Bạn phải nhập số nguyên dương!");
			}
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
			case 5: {
				Bai_5();
				break;
			}
			case 6: {
				Bai_6();
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

			System.out.println("Nhập bài bạn muốn làm(1,2,3,4,5,6)!");
			try {
				// sc.next();
				exerciseNumber = sc.nextInt();
				if (exerciseNumber < 0) {
					System.out.println("Bạn phải nhập số nguyên dương!");
				}
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
			if (numberArrays <= 0) {
				System.out.println("Bạn phải nhập số nguyên dương!");
				// check = true;
			} else
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
				if (numberArrays <= 0) {
					System.out.println("Bạn phải nhập số nguyên dương!");
					// check = true;
				} else {
					check = false;
					break;
				}
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
			if (numberArrays <= 0) {
				System.out.println("Bạn phải nhập số nguyên dương!");
				// check = true;
			} else
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
				if (numberArrays <= 0) {
					System.out.println("Bạn phải nhập số nguyên dương!");
					// check = true;
				} else {
					check = false;
					break;
				}

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
			if (numberArrays <= 0) {
				System.out.println("Bạn phải nhập số nguyên dương!");
			} else
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
				if (numberArrays <= 0) {
					System.out.println("Bạn phải nhập số nguyên dương!");
				} else {
					check = false;
					break;
				}
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
			if (numberStudent <= 0) {
				System.out.println("Số sinh viên là số nguyên dương!");
			} else
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
				if (numberStudent <= 0) {
					System.out.println("Số sinh viên là số nguyên dương!");
				} else {
					check = false;
					break;
				}
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
			System.out.println("Kết thúc bài 4!");
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

	/*
	 * Bai 5: Viết chương trình nhập số nguyên dương n và thực hiện các chức năng
	 * sau: a) Tính tổng các chữ số của n. b) Liệt kê các ước số của n. c) Liệt kê
	 * các ước số là nguyên tố của n.
	 */
	public static void Bai_5() {
		Scanner sc = new Scanner(System.in);
		int number = 0;
		String run = "";
		boolean test = true;
		boolean check = true;
		int[] Arr;
		int sumOfNum = 0;

		System.out.println("Nhập số nguyên dương n: ");
		try {
			number = sc.nextInt();
			if (number <= 0) {
				System.out.println("Bạn phải nhập số nguyên dương!");
				// check = true;
			} else {
				check = false;
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Bạn phải nhập số nguyên dương!");
			number = 0;
		}
		while (check) {
			sc.nextLine();
			System.out.println("Nhập số nguyên dương n: ");
			try {
				number = sc.nextInt();
				if (number <= 0) {
					System.out.println("Bạn phải nhập số nguyên dương!");
					// check = true;
				} else {
					check = false;
					break;
				}
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("Bạn phải nhập số nguyên dương!");
				number = 0;
			}

			System.out.println("Chọn 0 để thoát bài 5. Enter để làm lại!");
			sc.nextLine();
			run = sc.nextLine();
			if (run.equals("0")) {
				check = false;
				test = false;
			} else {
				check = true;
				test = true;
			}

		}

		if (test == false) {
			System.out.println("Kết thúc bài 5!");
		} else {
			// tổng các chữ số của n
			System.out.println("------------------------------------------");
			System.out.println("A. Giá trị các phần tử của mảng");
			sumOfNum = SumOfNumber(number);
			System.out.println("Tổng các chữ số của n = " + sumOfNum);

			// Các ước số của n
			System.out.println("------------------------------------------");
			System.out.println("A. Giá trị các phần tử của mảng");
			System.out.println("Các ước số của n : ");
			DivisionalOfNumber(number);

			// Các ước nguyên tố
			System.out.println("------------------------------------------");
			System.out.println("A. Giá trị các phần tử của mảng");
			System.out.println("Các ước nguyên tố của n: ");
			DivisionalOfPrime(number);

		}
		return;
	}

	// a) Tính tổng các chữ số của n
	public static int SumOfNumber(int n) {
		int sumOfNum = 0;
		while (n > 0) {
			sumOfNum = sumOfNum + n % 10;
			n = n / 10;
		}
		return sumOfNum;
	}

	// b) Liệt kê các ước số của n
	public static void DivisionalOfNumber(int n) { // hàm ước số nguyên
		int DivisionalNumber[] = new int[n];
		int j = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				DivisionalNumber[j] = i;
				j++;
			}
		}
		for (int k = 0; k < j; k++) {
			System.out.print(DivisionalNumber[k] + " ");
		}
		System.out.println();
	}

	// c) Liệt kê các ước số là nguyên tố của n.
	public static void DivisionalOfPrime(int n) {
		int DivisionalNumber[] = new int[n];
		int j = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0 && Prime(i) == true) {
				DivisionalNumber[j] = i;
				j++;
			}
		}
		for (int k = 0; k < j; k++) {
			System.out.print(DivisionalNumber[k] + " ");
		}
		System.out.println();

	}

	// ham kiem tra so nguyen to
	public static boolean Prime(int n) {
		int count = 0;
		// boolean test = true;
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				count++;
			}
		}
		if (count != 0) {
			return false;
		} else
			return true;
	}

	// ------------------------------------------------------------------//
	/*
	 * Bài 6. Viết chương trình nhập vào một mảng số nguyên có n phần tử
	 * 
	 * a) Xuất giá trị các phần tử của mảng. b) Tìm phần tử có giá trị lớn nhất,
	 * nhỏ nhất. c) Đếm số phần tử là số chẵn d) Tìm các phần tử là số
	 * nguyên tố. e) Sắp xếp mảng tăng dần f) Tìm phần tử có giá trị x
	 */
	public static void Bai_6() {
		Scanner sc = new Scanner(System.in);
		int numOfArr = 0;
		int Arr[];
		String run = "";
		boolean test = true;
		boolean check = true;

		System.out.println("Nhập số phần tử của mảng: ");
		try {
			numOfArr = sc.nextInt();
			if (numOfArr <= 0) {
				System.out.println("Bạn phải nhập số nguyên dương!");
				// check = true;
			} else {
				check = false;
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Bạn phải nhập số nguyên dương!");
			numOfArr = 0;
		}
		while (check) {
			sc.nextLine();
			System.out.println("Nhập số phần tử của mảng: ");
			try {
				numOfArr = sc.nextInt();
				if (numOfArr <= 0) {
					System.out.println("Bạn phải nhập số nguyên dương!");
					// check = true;
				} else {
					check = false;
					break;
				}
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("Bạn phải nhập số nguyên dương!");
				numOfArr = 0;
			}

			System.out.println("Chọn 0 để thoát bài 6. Enter để làm lại!");
			sc.nextLine();
			run = sc.nextLine();
			if (run.equals("0")) {
				check = false;
				test = false;
			} else {
				check = true;
				test = true;
			}
		}
		if (test == false) {
			System.out.println("Kết thúc bài 6!");
		} else {
			try {
				Arr = new int[numOfArr];
				System.out.println("Nhập mảng:");
				for (int i = 0; i < numOfArr; i++) {
					Arr[i] = sc.nextInt();
				}

				// xuất giá trị các phần tử mảng
				System.out.println("------------------------------------------");
				System.out.println("A. Giá trị các phần tử của mảng");
				System.out.print(Arrays.toString(Arr));
				System.out.println();

				// phần tử lớn nhất
				System.out.println("------------------------------------------");
				Arrays.sort(Arr);
				System.out.println("B. Phần tử lớn nhất: " + Arr[numOfArr - 1]);

				// đếm số phần tử chẵn
				int count = 0;
				int ArrEven[] = new int[numOfArr];
				for (int i = 0; i < numOfArr; i++) {
					if (Arr[i] % 2 == 0) {
						ArrEven[count] = Arr[i];
						count++;
					}
				}
				System.out.println("------------------------------------------");
				System.out.println("C. Có " + count + " phần tử chẵn trong mảng!");
				System.out.print("Các phần tử đó là: ");
				for (int i = 0; i < count; i++) {
					System.out.print(ArrEven[i] + " ");
				}
				System.out.println();

				// các phần tử là số nguyên tố
				int ArrPrime[] = new int[numOfArr];
				int countPrime = 0;
				System.out.println("------------------------------------------");
				for (int i = 0; i < numOfArr; i++) {
					if (Prime(Arr[i])) {
						ArrPrime[countPrime] = Arr[i];
						countPrime++;
					}
				}
				if (countPrime == 0) {
					System.out.println("D. Không có phần tử nào trong mảng là số nguyên tố!");
				} else {
					System.out.print("D. Các phần tử là số nguyên tố trong mảng gồm: ");
					for (int i = 0; i < countPrime; i++) {
						System.out.print(ArrPrime[i] + " ");
					}
				}
				System.out.println();

				// sắp xếp mảng tăng dần
				System.out.println("------------------------------------------");
				System.out.println("E. Sắp xếp mảng tăng dần");
				System.out.print(Arrays.toString(Arr));
				System.out.println();

				// tìm phần tử có giá trị x
				System.out.println("------------------------------------------");
				System.out.println("Tìm phần tử có giá trị x");
				System.out.println("Nhập x: ");
				try {
					int x = sc.nextInt();
					int ArrLocation[] = new int[numOfArr];
					int countOfLocation = 0;
					for (int i = 0; i < numOfArr; i++) {
						if (Arr[i] == x) {
							ArrLocation[countOfLocation] = i;
							countOfLocation++;
						}
					}
					if (countOfLocation == 0) {
						System.out.println(x + " không xuất hiện trong mảng!");
					} else {
						System.out.print(x + " xuất hiện trong mảng tại " + (countOfLocation) + " tại vị trí: ");
						for (int i = 0; i < countOfLocation; i++) {
							System.out.print(ArrLocation[i] + " ");
						}
						System.out.println();
					}
				} catch (Exception e) {
					// TODO: handle exception
					System.out.println("x phải là một số nguyên!");
					return;
				}
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("Bạn nhập sai định dạng!");
			}
		}
		return;
	}
}
