package com.imic.students.Vietanh.Buoi14;

public class SinhVien {
	private String name;
	private String age;
	private String Id;
	private String Sex;
	private String Add;

	public SinhVien(String name, String age, String id, String Sex, String Add) {
		super();
		this.name = name;
		this.age = age;
		this.Sex = Sex;
		this.Add = Add;
		Id = id;
	}

	@Override
	public String toString() {
		return "Name:"+name+"-----Age:"+age+"-----Id:"+Id+"------Sex:"+Sex+"------Add:"+Add;
	}
}
