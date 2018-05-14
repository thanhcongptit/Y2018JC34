package com.imic.students.Dao_Thanh_Long;

public class studentCompareable implements Comparable<studentCompareable>{
	private String name;
	private int salary;
	private final static String str = "final";	
	
	public static String getStr() {
		return str;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public studentCompareable(){
		
	}
	
	public studentCompareable(String name, int salary){
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {	
		return "Ho ten : " + name + " ,Luong : " + salary;
	}
	
	@Override
	public int compareTo(studentCompareable o) {
		return this.getSalary() - o.getSalary();
	}


	
}
