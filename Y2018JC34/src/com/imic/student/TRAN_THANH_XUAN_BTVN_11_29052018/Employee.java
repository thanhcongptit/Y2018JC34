package com.imic.student.TRAN_THANH_XUAN_BTVN_11_29052018;

import java.util.Scanner;

public class Employee {
	private String nameE;
	private int ageEmployee;

	public String getNameE() {
		return nameE;
	}

	public void setNameE(String nameE) {
		this.nameE = nameE;
	}

	public int getAgeEmployee() {
		return ageEmployee;
	}

	public void setAgeEmployee(int ageEmployee) {
		this.ageEmployee = ageEmployee;
	}

	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Name employee: ");
		nameE = sc.nextLine();
		System.out.println("Tuoi em: ");
		ageEmployee = sc.nextInt();
		sc.nextInt();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return nameE + " " + ageEmployee;
	}

}
