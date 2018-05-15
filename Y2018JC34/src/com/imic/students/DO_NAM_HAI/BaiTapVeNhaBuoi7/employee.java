package com.imic.students.DO_NAM_HAI.BaiTapVeNhaBuoi7;

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
			System.out.print(" Má»�i báº¡n nháº­p tÃªn : ");
			this.name = nhap.nextLine();
			employee[i].setName(this.name);
			System.out.print("Má»�i báº¡n nháº­p lÆ°Æ¡ng : ");
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
		
		System.out.println(" Sáº¯p xáº¿p lÆ°Æ¡ng theo báº­c tá»« trÃªn xuá»‘ng ta Ä‘Æ°á»£c :");
		sapXepLuong();
		for (int i = 0; i < 3; i++) {
			System.out.println(employee[i].toString());

		}
			System.out.println(" Sáº¯p xáº¿p tÃªn theo ABC ta Ä‘Æ°á»£c");
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
