package com.imic.students.DO_NAM_HAI;

import java.util.Arrays;
import java.util.Scanner;

public class employee implements Comparable<employee> {
	Scanner nhap = new Scanner(System.in);
	private String name;
	private Double salary;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "employee [name : " + getName() + ", salary: " + getSalary() + "]";
	}

	employee[] employee = new employee[3];

	public void input() {

		for (int i = 0; i < 3; i++) {

			employee[i] = new employee();
			System.out.print(" Mời bạn nhập tên : ");
			this.name = nhap.nextLine();
			employee[i].setName(this.name);
			System.out.print("Mời bạn nhập lương : ");
			this.salary = nhap.nextDouble();
			employee[i].setSalary(this.salary);
			nhap.nextLine();
		}
	}

	public void sapXepLuong() {
		for (int i = 0; i < 3; i++) {
			for (int j = i + 1; j < 3; j++) {
				if (employee[i].getSalary() < employee[j].getSalary()) {
					employee temp = employee[i];
					employee[i] = employee[j];
					employee[j] = temp;
				}

			}
		}
	}

	public void sapXepTen() {
		for (int i = 0; i < 3; i++) {
		Arrays.sort(employee);
		
		}
	}

	public void output() {
		
		System.out.println(" Sắp xếp lương theo bậc từ trên xuống ta được :");
		sapXepLuong();
		for (int i = 0; i < 3; i++) {
			System.out.println(employee[i].toString());

		}
			System.out.println(" Sắp xếp tên theo ABC ta được");
			sapXepTen();
			for (int i = 0; i < 3; i++) {
			System.out.println(employee[i].toString());
			}
//		
	}

	@Override
	public int compareTo(employee o) {
		// TODO Auto-generated method stub
		return this.name.compareTo(o.name);
		
		
	}
	

	
}
