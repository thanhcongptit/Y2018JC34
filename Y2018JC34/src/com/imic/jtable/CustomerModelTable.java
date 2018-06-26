package com.imic.jtable;

import java.util.List;

import javax.swing.table.AbstractTableModel;

public class CustomerModelTable extends AbstractTableModel {
	private List<Customer> customers;

	String[] headerList = new String[] { "Id", "Firstname", "Lastname", "Phone", "Email", "Sex", "Update" };

	public CustomerModelTable(List<Customer> customers) {
		super();
		this.customers = customers;
	}

	@Override
	public int getRowCount() {
		return customers.size();
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
		Customer customer = customers.get(rowIndex);
		switch (columnIndex) {
		case 0:
			return customer.getId();
		case 1:
			return customer.getFirstname();
		case 2:
			return customer.getLastname();
		case 3:
			return customer.getPhoneNumber();
		case 4:
			return customer.getEmail();
		case 5:
			if(customer.getSex()) {
				return "Male";
			} else {
				return "Female";
			}
		case 6: 
			return customer.getUpdateDate().toString();

		}
		return "";
	}

}
