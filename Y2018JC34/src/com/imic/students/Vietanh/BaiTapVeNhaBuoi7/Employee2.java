package com.imic.students.Vietanh.BaiTapVeNhaBuoi7;

public class Employee2 implements Comparable<Employee2> {
	private String NAME;
	private int SALARY;

	public String getNAME() {
		return NAME;
	}

	public void setNAME(String nAME) {
		NAME = nAME;
	}

	@Override
	public String toString() {
		return "Name "+NAME+"------Salary:"+SALARY;
	}

	public int getSALARY() {
		return SALARY;
	}

	public void setSALARY(int sALARY) {
		SALARY = sALARY;
	}

	@Override
	public int compareTo(Employee2 o) {
		return this.NAME.compareTo(o.NAME);
	}

}
