package com.imic.students.TruongQuangQuan.BaiTapBuoi11;

import java.util.Scanner;

public class Students extends Person {

	private int mark;
	private String grade;

	public Students(String id, String name, int age, int mark, String grade) {
		super(id, name, age);
		this.mark = mark;
		this.grade = grade;
	}

	public Students() {
	}

	public int getMark() {
		return mark;
	}

	public void setMark(int mark) {
		this.mark = mark;
	}

	public String getGrade() {
		return grade;
	}

	public void calGrade() {
		if (this.mark >= 8) {
			this.grade = "distinction";
		} else if (this.mark >= 7) {
			this.grade = "credit";
		} else if (this.mark >= 5) {
			this.grade = "pass";
		} else if (this.mark >= 0) {
			this.grade = "fail";
		}
	}

	@Override
	public void input() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập thông tin sinh viên : ");

		System.out.println("Tên sinh viên : ");
		this.name = scanner.nextLine();

		System.out.println("ID : ");
		this.id = scanner.nextLine();

		try {
			System.out.println("Tuổi : ");
			this.age = scanner.nextInt();
			scanner.nextLine();

			System.out.println("Điểm : ");
			this.mark = scanner.nextInt();
			scanner.nextLine();
		} catch (Exception e) {
			System.out.println("Bạn đã nhập sai kiểu dữ liệu, hãy nhập lại");
			input();
		}
	}

	@Override
	public void display() {
		System.out.println("Tên sinh viên \t: " + this.name);
		System.out.println("ID \t\t: " + this.id);
		System.out.println("Tuổi \t\t: " + this.age);
		System.out.println("Điểm \t\t: " + this.mark);
		this.calGrade();
		System.out.println("Grade \t\t: " + this.grade);
	}

	public static void main(String[] args) {
		Students st = new Students();
		st.input();
		st.display();
	}

}
