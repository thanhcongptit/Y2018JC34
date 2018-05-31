package com.imic.students.Vietanh.Buoi11;

public class student extends person {
	private int mark;
	private String grade;

	public student(String id, String name, int tuoi, int mark) {
		super(id, name, tuoi);
		this.mark = mark;

	}
	
	public student() {};

	public student(String id, String name, int tuoi) {
		super(id, name, tuoi);
	}



	public int getMark() {
		return mark;
	}

	public void setMark(int mark) {
		this.mark = mark;
	}

	

	public String xetGrade() {
		String level = "";
		if (getMark() >= 8) {
			level = "distinction";
		} else if (getMark() >= 7) {
			level = "credit";
		} else if (getMark() >= 5) {
			level = "pass";
		} else {
			level = "failse";
		}
		return level;
	}
	
	public String getGrade() {
		return grade=xetGrade();
	}

	@Override
	public void input() {

		super.input();
		System.out.println("Xin moi nhap vao diem");
		setMark(sc.nextInt());
	}

	@Override
	public void display() {
		
		super.display();
		System.out.println("Mark:"+getMark());
		System.out.println("Grade:"+getGrade());
	}

}
