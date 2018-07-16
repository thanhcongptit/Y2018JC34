package xuanttph06854.lab.java.assignment;

import java.util.Scanner;

public class Employee implements Comparable<Employee> {
	private int idEmployee;
	private String name;
	private double saraly;

	public int getIdEmployee() {
		return idEmployee;
	}

	public void setIdEmployee(int idEmployee) {
		this.idEmployee = idEmployee;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSaraly() {
		return saraly;
	}

	public void setSaraly(double saraly) {
		this.saraly = saraly;
	}

	public void init() {
		Scanner sc = new Scanner(System.in);
		System.out.println("--------------- Nhập thông tin nhân viên---------------");
		System.out.print("ID: ");
		int idEmp = sc.nextInt();
		sc.nextLine();
		this.setIdEmployee(idEmp);

		System.out.print("Tên nhân viên:");
		String nameEmp = sc.nextLine();
		this.setName(nameEmp);

		System.out.print("Mức lương: ");
		double saralyEmp = sc.nextDouble();
		this.setSaraly(saralyEmp);
	}

	public double getIncome() {
		double income = getSaraly();
		return income;

	}

	public double getTax() {
		double tax = 0;
		if (getIncome() < 9) {
			tax = 0;
		} else {
			if (9 <= getIncome() && getIncome() <= 15) {
				tax = getIncome() * 0.1;
			} else {
				if (getIncome() > 15)
					tax = getIncome() * 0.12;
			}
		}
		return tax;
	}

	@Override
	public String toString() {
		return idEmployee + " " + name + " " + getIncome() + " " + getTax();
	}

	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return (int) o.getIncome() - (int) this.getIncome();
	}

}
