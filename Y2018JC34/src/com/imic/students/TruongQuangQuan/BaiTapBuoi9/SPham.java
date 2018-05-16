package com.imic.students.TruongQuangQuan.BaiTapBuoi9;

import java.util.ArrayList;

public class SPham {

	private String name;
	private double Price;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return Price;
	}

	public void setPrice(double price) {
		Price = price;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Tên sản phẩm: " + getName() + "---------Giá sản phẩm:" + getPrice();
	}

}
