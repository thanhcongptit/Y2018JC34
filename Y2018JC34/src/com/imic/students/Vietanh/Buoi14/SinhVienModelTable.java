package com.imic.students.Vietanh.Buoi14;

import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;

import com.imic.students.Vietanh.BaiTapBuoi9.SinhVien;

public class SinhVienModelTable extends AbstractTableModel {
	private ArrayList<SinhVien> sv;

	String[] headerList = new String[] { "Name", "Age", "ID", "Adress", "Diem trung binh" };

	public SinhVienModelTable(ArrayList<SinhVien> sv) {
		super();
		this.sv = sv;
	}

	@Override
	public int getRowCount() {
		return sv.size();
	}

	@Override
	public String getColumnName(int column) {
		return headerList[column];
	}

	@Override
	public int getColumnCount() {
		return headerList.length;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		SinhVien SV = sv.get(rowIndex);
		switch (columnIndex) {
		case 0:
			return SV.getName();
		case 1:
			return SV.getAge();
		case 2:
			return SV.getId();
		case 3:
			return SV.getAd();
		case 4:
			return SV.getDiemtrungbinh();

		}
		return "";
	}

}
