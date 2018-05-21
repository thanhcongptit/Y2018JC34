package com.imic.students.Dao_Thanh_Long;
public class SVPoly implements Comparable<SVPoly>{
	private String name;
	private double mark;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getMark() {
		return mark;
	}
	public void setMark(double mark) {
		this.mark = mark;
	}
	
	public SVPoly() {
	}
	
	public SVPoly(String name,double mark) {
		this.name = name;
		this.mark = mark;
	}
	
	public void printOut(){
		System.out.println(this.name + " - " +this.mark);
	}
	
	@Override
	public int compareTo(SVPoly o) {
			return (int)(o.mark - this.mark);
	}
}

