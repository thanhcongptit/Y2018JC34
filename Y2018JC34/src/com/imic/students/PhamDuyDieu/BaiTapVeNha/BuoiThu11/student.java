package com.imic.students.PhamDuyDieu.BaiTapVeNha.BuoiThu11;

import com.imic.students.PhamDuyDieu.HocTrenLop.BuoiThu7.Student;

public class student extends Person {
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
		if(mark>=8 && mark<=10) {
			grade = "distinction";
		}
		else {
			if(mark>=7&& mark <8) {
				grade = "credit";
			}
			else {
				if(mark >=5&&mark<7) {
					grade ="pass";
				}
				else {
					if(mark >=0) {
						grade = "fail";
					}
				}
			}
		}
		return grade;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + "\nĐiểm: " + mark + "\nLoại: " + calGrade();
	}

	@Override
	public void input() {
		// TODO Auto-generated method stub
		super.input();
		System.out.println("Nhập điểm: ");
		mark = sc.nextInt();
	}

	@Override
	public void display() {
		System.out.println(toString());
	}

	public student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public static void main(String args[]) {
		student st = new student();
		st.input();
		System.out.println("Hiển thị kết quả");
		st.display();
	}
}
