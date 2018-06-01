package com.imic.students.Dao_Thanh_Long;

import java.util.ArrayList;

public class personModel<T> {

	public ArrayList<T> li = new ArrayList<T>();
	public void addObject(T object){
		li.add(object);
	}
	public void display(){
		for(T e:li){
			System.out.println(e.toString());
		}
	}
	public static void main(String[] args) {
		personModel<Student> std = new personModel<Student>();
		Student st1 = new Student("a",100);
		std.addObject(st1);
		Student st2 = new Student("b",200);
		std.addObject(st2);	
		std.display();
		
		personModel<Student> emp = new personModel<Student>();
		Student emp1 = new Student("c",100);
		std.addObject(emp1);
		Student emp2 = new Student("d",200);
		emp.addObject(emp2);	
		emp.display();
		
		personModel<String> str = new personModel<String>();
		String str1 = "e";
		str.addObject(str1);
		String str2 = "f";
		str.addObject(str2);
		str.display();
		
	}

}
