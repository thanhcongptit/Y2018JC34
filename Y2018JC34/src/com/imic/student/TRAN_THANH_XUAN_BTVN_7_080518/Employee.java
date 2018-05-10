package com.imic.student.TRAN_THANH_XUAN_BTVN_7_080518;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Employee implements Comparable<Employee> {

	private String name;
	private int salary;

	public String getName() {
		return name;
	}

	public void setName(String name2) {
		this.name = name2;
	}

	public int getSaraly() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return o.name.compareTo(this.name);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name + "   " + salary;
	}

}
