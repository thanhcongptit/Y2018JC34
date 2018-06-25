package com.imic.jtable;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class UI {

	private JFrame frame;
	private JTextField tfSearch;
	private JTable table;

	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UI window = new UI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public UI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 810, 545);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		tfSearch = new JTextField();
		tfSearch.setBounds(147, 54, 365, 26);
		frame.getContentPane().add(tfSearch);
		tfSearch.setColumns(10);
		
		JButton btnSearch = new JButton("Search");
		btnSearch.setBounds(524, 54, 117, 29);
		frame.getContentPane().add(btnSearch);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UI_Add ui_Add = new UI_Add();
				ui_Add.getFrame().setVisible(true);
				frame.dispose();
			}
		});
		btnAdd.setBounds(637, 54, 117, 29);
		frame.getContentPane().add(btnAdd);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(51, 127, 722, 354);
		frame.getContentPane().add(scrollPane);
		
		
		CustomerDao customerDao = new CustomerDao();
		List<Customer> customers = customerDao.read_data("");
		CustomerModelTable customerModelTable = new CustomerModelTable(customers);
		
		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent evt) {
				int row = table.rowAtPoint(evt.getPoint());
	            Customer customer = customers.get(row);
	            UI_Update ui_Update = new UI_Update(customer);
	            ui_Update.getFrame().setVisible(true);
	            frame.dispose();
	            
			}
		});
		table.setModel(customerModelTable);
		scrollPane.setViewportView(table);
	}
}
