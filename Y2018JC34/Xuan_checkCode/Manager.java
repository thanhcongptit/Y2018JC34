package xuanttph06854.lab.java.assignment;

import java.util.Scanner;

public class Manager extends Employee {
	private double responsibility;

	public double getResponsibility() {
		return responsibility;
	}

	public void setResponsibility(double responsibility) {
		this.responsibility = responsibility;
	}

	@Override
	public void init() {
		Scanner sc = new Scanner(System.in);
		super.init();
		System.out.print("Lương trách nhiệm: ");
		double resposibility = sc.nextDouble();
		this.setResponsibility(resposibility);
	}

	@Override
	public double getIncome() {
		return super.getIncome() + this.getResponsibility();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + " " + getResponsibility();
	}

}
