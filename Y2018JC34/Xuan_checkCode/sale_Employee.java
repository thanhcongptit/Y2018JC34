package xuanttph06854.lab.java.assignment;

import java.util.Scanner;

public class sale_Employee extends Employee {
	private int commission;
	private double kpi;

	public int getCommission() {
		return commission;
	}

	public void setCommission(int commission) {
		this.commission = commission;
	}

	public double getKpi() {
		return kpi;
	}

	public void setKpi(double kpi) {
		this.kpi = kpi;
	}

	@Override
	public void init() {
		Scanner sc = new Scanner(System.in);
		super.init();
		System.out.print("Doanh số: ");
		double kpi = sc.nextDouble();
		this.setKpi(kpi);
		System.out.print("Hoa hồng: ");
		int commission = sc.nextInt();
		this.setCommission(commission);
	}

	// hàm tính thu nhập
	@Override
	public double getIncome() {
		return super.getIncome() + getCommission() * getKpi() / 100;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + " " + getKpi() + " " + getCommission();
	}

}
