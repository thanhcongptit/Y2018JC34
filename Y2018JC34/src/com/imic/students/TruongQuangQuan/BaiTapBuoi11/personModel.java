package com.imic.students.TruongQuangQuan.BaiTapBuoi11;

import java.util.ArrayList;

import com.imic.students.PhamDuyDieu.HocTrenLop.BuoiThu9.Array_List;

public class personModel<T> {

	public ArrayList<T> li = new ArrayList<T>();

	public void addObject(T object) {
		li.add(object);
	}

	public void display() {
		for (T e : li) {
			System.out.println(e);
		}
		System.out.println("--------------------------");
	}

	public static void main(String args[]) {

		personModel<Student> st = new personModel<Student>();

		st.addObject(new Student("1", "Perter", 30));
		st.addObject(new Student("2", "Tom", 29));
		st.display();

		personModel<Employee> emp = new personModel<Employee>();

		emp.addObject(new Employee("3", "John", 8000));
		emp.addObject(new Employee("4", "Maria", 9000));
		emp.display();

		personModel<String> s = new personModel<String>();
		s.addObject("Nguyễn Văn A");
		s.addObject("Nguyễn Văn B");
		s.display();
	}
}
