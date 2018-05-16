package com.imic.students.PhamDuyDieu.HocTrenLop.BuoiThu9;

import java.util.ArrayList;

public class Array_List {

	public static void main(String[] args) {
	ArrayList temp = new ArrayList();
	temp.add(1);
	temp.add(2);
	temp.add(3);
	temp.add("String");
	for(int i = 0; i<temp.size();i++) {
		int value = (int) temp.get(i);
		System.out.println("i "+ value);
	}
	}
}
