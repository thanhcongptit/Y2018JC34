package com.imic.students.PhamDuyDieu.BaiTapVeNha.BuoiThu9;

public class sinhVien {
	private int id;
	private String name;
	private int age;
	private String address;
	private int gpa;
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return " ID: "+id+"\n Họ và tên: "+ name+ "\n Tuổi: "+ age+ "\n Địa chỉ: "+address+ "\n Điểm trung bình: "+gpa;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getGpa() {
		return gpa;
	}
	public void setGpa(int gpa) {
		this.gpa = gpa;
	}
}
