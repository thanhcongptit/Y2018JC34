package com.imic.students.DO_NAM_HAI.BaiTapVeNhaBuoi11;

import java.util.Scanner;

public class student extends person {
	private int mark;
	private String grade;

	public int getMark() {
		return mark;
	}

	public void setMark(int mark) {
		this.mark = mark;
		if(mark <0 || mark >10) {
			System.out.println(" moi ban nhap lai diem");
		}
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	Scanner nhap = new Scanner(System.in);

	public void Mark() {
		System.out.print("moi ban nhap diem ");
		mark = nhap.nextInt();
	}

	public void calGrade() {
		if (mark >= 8) {
			System.out.println("distinction");
		} else if (mark < 8 && mark >= 7) {
			System.out.println("credit");
		} else if (mark < 7 && mark >= 5) {
			System.out.println("pass");
		} else if (mark < 5 && mark >= 0) {
			System.out.println("  fail");
		}
	}

	@Override
	public void input() {
		super.input();
	}

	@Override
	public void display() {
		super.display();
	}
	
	public static void main(String[] args) {
		student st = new student();
		st.input();
		st.Mark();
		st.display();
		st.calGrade();
		
	}

}
