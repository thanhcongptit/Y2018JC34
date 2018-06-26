package com.imic.jtable;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class UI_Add {

	private JFrame frame;
	private JTextField tfFirstname;
	private JTextField tfLastname;
	private JTextField tfPhone;
	private JTextField tfEmail;
	private final ButtonGroup buttonGroup = new ButtonGroup();


	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}

	/**
	 * Create the application.
	 */
	public UI_Add() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 531, 393);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblFirstname = new JLabel("Firstname: ");
		lblFirstname.setBounds(81, 42, 106, 16);
		frame.getContentPane().add(lblFirstname);
		
		tfFirstname = new JTextField();
		tfFirstname.setBounds(202, 37, 232, 26);
		frame.getContentPane().add(tfFirstname);
		tfFirstname.setColumns(10);
		
		JLabel lblLastname = new JLabel("Lastname: ");
		lblLastname.setBounds(81, 80, 83, 16);
		frame.getContentPane().add(lblLastname);
		
		tfLastname = new JTextField();
		tfLastname.setBounds(202, 75, 232, 26);
		frame.getContentPane().add(tfLastname);
		tfLastname.setColumns(10);
		
		tfPhone = new JTextField();
		tfPhone.setBounds(202, 113, 232, 26);
		frame.getContentPane().add(tfPhone);
		tfPhone.setColumns(10);
		
		JLabel lblPhone = new JLabel("Phone:");
		lblPhone.setBounds(81, 118, 61, 16);
		frame.getContentPane().add(lblPhone);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setBounds(81, 156, 61, 16);
		frame.getContentPane().add(lblEmail);
		
		tfEmail = new JTextField();
		tfEmail.setBounds(202, 151, 232, 26);
		frame.getContentPane().add(tfEmail);
		tfEmail.setColumns(10);
		
		JLabel lblCity = new JLabel("City:");
		lblCity.setBounds(81, 194, 61, 16);
		frame.getContentPane().add(lblCity);
		
		JComboBox cbCity = new JComboBox();
		cbCity.setModel(new DefaultComboBoxModel(new String[] {"Ha Noi", "Ho Chi Minh", "Can Tho", "Hai Phong", "Hue", "Da Nang"}));
		cbCity.setSelectedIndex(0);
		cbCity.setBounds(202, 189, 232, 27);
		frame.getContentPane().add(cbCity);
		
		JLabel lblNewLabel = new JLabel("Sex: ");
		lblNewLabel.setBounds(81, 233, 61, 16);
		frame.getContentPane().add(lblNewLabel);
		
		JRadioButton rdbtnMale = new JRadioButton("Male");
		rdbtnMale.setSelected(true);
		buttonGroup.add(rdbtnMale);
		rdbtnMale.setBounds(202, 228, 92, 23);
		frame.getContentPane().add(rdbtnMale);
		
		JRadioButton rdbtnFemale = new JRadioButton("Female");
		buttonGroup.add(rdbtnFemale);
		rdbtnFemale.setBounds(293, 228, 141, 23);
		frame.getContentPane().add(rdbtnFemale);
		
		JButton btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Customer customer = new Customer();
				customer.setFirstname(tfFirstname.getText());
				customer.setLastname(tfLastname.getText());
				customer.setEmail(tfEmail.getText());
				customer.setPhoneNumber(tfPhone.getText());
				customer.setSex(rdbtnMale.isSelected());
				customer.setCity(cbCity.getSelectedItem().toString());
				
				int rs = new CustomerDao().create_data(customer);
				if(rs > -1) {
					JOptionPane.showMessageDialog(frame, "Successfully!");
					UI ui = new UI();
					ui.getFrame().setVisible(true);
					frame.dispose();
				} else {
					JOptionPane.showMessageDialog(frame, "Failed!", "Error",  JOptionPane.ERROR_MESSAGE);
				}
				
			}
		});
		btnSave.setBounds(202, 297, 117, 29);
		frame.getContentPane().add(btnSave);
		
		JButton btnCancel = new JButton("Back");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UI ui = new UI();
				ui.getFrame().setVisible(true);
				frame.dispose();
			}
		});
		btnCancel.setBounds(317, 297, 117, 29);
		frame.getContentPane().add(btnCancel);
	}
}
