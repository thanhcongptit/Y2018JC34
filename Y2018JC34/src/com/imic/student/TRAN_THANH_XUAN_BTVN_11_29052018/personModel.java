package com.imic.student.TRAN_THANH_XUAN_BTVN_11_29052018;

import java.util.ArrayList;
import java.util.Scanner;

public class personModel<T> {
	public ArrayList<T> li = new ArrayList<T>();

	public void addobject(T object) {
		li.add(object);
	}

	public void display() {
		for (T e : li)
			System.out.println(e);
	}

	public static void main(String args[]) {
		// personModel<Student_2> st = new personModel<Student_2>();
		// for (int i = 0; i < 2; i++) {
		// Student_2 student = new Student_2();
		// student.nhap();
		// st.addobject(student);
		//
		// }
		// System.out.println("-----------------------------");
		// st.display();

//		personModel<Employee> emp = new personModel<Employee>();
//
//		for (int i = 0; i < 3; i++) {
//			Employee e = new Employee();
//			e.nhap();
//			emp.addobject(e);
//		}
//
//		System.out.println("--------------------------");
//		emp.display();

		personModel<String> personString = new personModel<String>();
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 3; i++) {
			String name = "";
			name = sc.nextLine();
			personString.addobject(name);
		}

		personString.display();

	}
}
