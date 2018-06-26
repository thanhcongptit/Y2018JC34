package com.imic.jtable;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CustomerDao {

	public int create_data(Customer customer) {
		DB_Connection obj_DB_Connection = new DB_Connection();
		Connection connection = obj_DB_Connection.get_connection();
		PreparedStatement ps = null;
		try {
			String query = "insert into customer(firstname, lastname, phoneNumber, email, city, sex, updateDate, registerDate)"
					+ " values (?,?,?,?, ?, ?, now(), now())";
			ps = connection.prepareStatement(query);
			ps.setString(1, customer.getFirstname());
			ps.setString(2, customer.getLastname());
			ps.setString(3, customer.getPhoneNumber());
			ps.setString(4, customer.getEmail());
			ps.setString(5, customer.getCity());
			ps.setBoolean(6, customer.getSex());

			System.out.println(ps);
			return ps.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
			e.printStackTrace();
		}

		return -1;
	}

	public List<Customer> read_data(String name) {
		List<Customer> customers = new ArrayList<>();

		DB_Connection obj_DB_Connection = new DB_Connection();
		Connection connection = obj_DB_Connection.get_connection();
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			StringBuilder query = new StringBuilder("select * from customer ");
			
			if(!name.isEmpty()) {
				query.append(" Where firstname like '%?%' or lastname like '%?%'");
				
			}
			
			ps = connection.prepareStatement(query.toString());
			
			if(!name.isEmpty()) {
				ps.setString(1, name);
				ps.setString(2, name);
				
			}
			
			rs = ps.executeQuery();
			while (rs.next()) {
				Customer customer = new Customer();
				customer.setId(rs.getInt(1));
				customer.setFirstname(rs.getString(2));
				customer.setLastname(rs.getString(3));
				customer.setPhoneNumber(rs.getString(4));
				customer.setEmail(rs.getString(5));
				customer.setCity(rs.getString(6));
				customer.setSex(rs.getBoolean(7));
				customer.setUpdateDate(rs.getDate(8));
				customer.setRegisterDate(rs.getDate(9));
				customers.add(customer);
			}
			
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			close(connection, ps, rs);
		}

		return customers;
	}

	private void close(Connection connection, PreparedStatement ps, ResultSet rs) {
		if(rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		if(ps != null) {
			try {
				ps.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		if(connection != null) {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public int update_data(Customer customer) {
		DB_Connection obj_DB_Connection = new DB_Connection();
		Connection connection = obj_DB_Connection.get_connection();
		PreparedStatement ps = null;
		try {
			String query = "update customer set firstname =?, lastname =?, phoneNumber=?, email=?, city=?, sex=?, updateDate = now() where id=?";
			ps = connection.prepareStatement(query);
			ps.setString(1, customer.getFirstname());
			ps.setString(2, customer.getLastname());
			ps.setString(3, customer.getPhoneNumber());
			ps.setString(4, customer.getEmail());
			ps.setString(5, customer.getCity());
			ps.setBoolean(6, customer.getSex());
			ps.setInt(7, customer.getId());
			return ps.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
			e.printStackTrace();
		}
		return -1;
	}

	public int delete_data(int id) {
		DB_Connection obj_DB_Connection = new DB_Connection();
		Connection connection = obj_DB_Connection.get_connection();
		PreparedStatement ps = null;
		try {
			String query = "delete from customer where id=?";
			ps = connection.prepareStatement(query);
			ps.setInt(1, id);
			return ps.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
			e.printStackTrace();
		}
		
		return -1;
	}
}
