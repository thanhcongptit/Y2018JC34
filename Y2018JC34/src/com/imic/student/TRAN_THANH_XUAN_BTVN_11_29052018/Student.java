package com.imic.student.TRAN_THANH_XUAN_BTVN_11_29052018;

import java.util.Scanner;

public class Student extends Person {
	private int mark;
	private String grade;

	public int getMark() {
		return mark;
	}

	public void setMark(int mark) {
		this.mark = mark;
	}

	public String getGrade() {
		return grade;
	}

	public String calGrade() {
		if (mark >= 8) {
			grade = "distiction";
		} else {
			if (mark >= 7) {
				grade = "credit";
			} else {

				if (mark >= 5) {
					grade = "pass";
				} else {
					if (mark >= 0) {
						grade = "fail";
					}
				}
			}
		}
		return grade;
	}

	public void input() {
		Scanner sc = new Scanner(System.in);

		super.input();
		System.out.println("Mark: ");
		mark = sc.nextInt();

	}

	public void display() {
		System.out.println(toString());
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + " " + mark + " " + calGrade();
	}

}
