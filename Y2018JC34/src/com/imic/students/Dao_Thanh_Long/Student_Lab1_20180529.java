package com.imic.students.Dao_Thanh_Long;

public class Student_Lab1_20180529 extends Person{
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

	public Student_Lab1_20180529(){
		
	}
	
	public Student_Lab1_20180529(String id,String name, int age,int mark){
		super(id, name, age);
		this.mark = mark;
		calGrade();
	}
	
	public void input(String id,String name, int age,int mark){
		this.id = id;
		this.name = name;
		this.age = age;
		this.mark = mark;
		calGrade();
	}
	
	public void calGrade(){
		if(this.mark >= 8){
			this.grade = "distinction";
		}else if (this.mark >= 7){
			this.grade = "credit";
		}else if(this.mark >= 5){
			this.grade = "pass";
		}else{
			this.grade = "fail";
		}
		
	}
	
	public void display(){
		System.out.println(this.id +", "+ this.name + ", "+this.age +", "+ this.mark +", "+this.grade);
	}
	
	public static void main(String args[]){
		Student_Lab1_20180529 std = new Student_Lab1_20180529();
		std.input("1", "long", 26, 9);
		std.display();
	}
	
	
}
