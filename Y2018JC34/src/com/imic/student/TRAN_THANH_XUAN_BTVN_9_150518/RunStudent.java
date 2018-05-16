package com.imic.student.TRAN_THANH_XUAN_BTVN_9_150518;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class RunStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> studentList = new ArrayList<Student>();
		Scanner sc = new Scanner(System.in);
		int numberStudent = 0;

		System.out.println("nhap so hoc sinh");
		numberStudent = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < numberStudent; i++) {
			init(sc, studentList);
		}

		System.out.println("---------------Danh sach hoc sinh-----------------");
		for (int i = 0; i < studentList.size(); i++) {
			Student student = studentList.get(i);
			System.out.println(student.toString());

		}

		System.out.println("-------------------hoan vi--------------------");
		Collections.shuffle(studentList);
		for (int i = 0; i < studentList.size(); i++) {
			Student student = studentList.get(i);
			System.out.println(student.toString());
		}

		System.out.println("-------------------sap xep theo diem giam dan--------------------");
		Collections.sort(studentList);
		for (int i = 0; i < studentList.size(); i++) {
			Student student = studentList.get(i);
			System.out.println(student.toString());
		}

		System.out.println("-------Tim va xoa name nhap tu ban phim------");
		System.out.println("Nhap ten ban muon xoa");

		String nameFind = sc.nextLine();
		for (int i = 0; i < studentList.size(); i++) {
			if (nameFind.equals(studentList.get(i).getName())) {
				studentList.remove(i);
			}
		}
		for (int i = 0; i < studentList.size(); i++) {
			Student student = studentList.get(i);
			System.out.println(student.toString());
		}

	}

	public static void init(Scanner sc, ArrayList<Student> studentList) {
		Student student = new Student();
		System.out.println("Name:");
		String name = sc.nextLine();
		student.setName(name);
		System.out.println("Age:");
		int age = sc.nextInt();
		student.setAge(age);
		System.out.println("Mark:");
		int mark = sc.nextInt();
		student.setMark(mark);
		sc.nextLine();
		studentList.add(student);
	}

}
