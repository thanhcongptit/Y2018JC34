package com.imic.student.ToMinhTuyen.BaiTapCuoiKhoa;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Frame;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTable;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ThongTinKhachHang extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ThongTinKhachHang frame = new ThongTinKhachHang();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ThongTinKhachHang() {
		setTitle("Th\u00F4ng Tin Kh\u00E1ch H\u00E0ng");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 728, 471);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Th\u00F4ng Tin Kh\u00E1ch H\u00E0ng");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(67, 11, 224, 14);
		contentPane.add(lblNewLabel);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
			},
			new String[] {
				"ID", "name", "Phone", "Address"
			}
		));
		table.setBorder(new LineBorder(new Color(0, 0, 0)));
		table.setBounds(10, 36, 369, 331);
		contentPane.add(table);
		
		JButton btnNewButton = new JButton("Trang Ch\u1EE7");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Quan_Ly_Ban_Hang qlbh = new Quan_Ly_Ban_Hang();
				qlbh.setVisible(true);
//				this.dispose;
			
				
			}

			private void ThongTinKhachHang(int exitOnClose) {
				// TODO Auto-generated method stub
				
				
			}
		});
		btnNewButton.setBounds(540, 344, 138, 23);
		contentPane.add(btnNewButton);
		
		JButton btnSaKhchHng = new JButton("S\u1EEFa Kh\u00E1ch H\u00E0ng");
		btnSaKhchHng.setBounds(540, 310, 138, 23);
		contentPane.add(btnSaKhchHng);
		
		JButton btnThmKhchHng = new JButton("Th\u00EAm Kh\u00E1ch H\u00E0ng");
		btnThmKhchHng.setBounds(389, 310, 141, 23);
		contentPane.add(btnThmKhchHng);
		
		JButton btnXaKhchHng = new JButton("X\u00F3a Kh\u00E1ch H\u00E0ng");
		btnXaKhchHng.setBounds(389, 344, 141, 23);
		contentPane.add(btnXaKhchHng);
		
		textField = new JTextField();
		textField.setBounds(10, 378, 265, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnTmKim = new JButton("T\u00ECm Ki\u1EBFm");
		btnTmKim.setBounds(290, 375, 89, 23);
		contentPane.add(btnTmKim);
		
		JLabel lblNewLabel_1 = new JLabel("ID");
		lblNewLabel_1.setBounds(409, 48, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(409, 87, 46, 14);
		contentPane.add(lblName);
		
		JLabel lblPhone = new JLabel("Phone");
		lblPhone.setBounds(409, 124, 46, 14);
		contentPane.add(lblPhone);
		
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setBounds(409, 159, 46, 14);
		contentPane.add(lblAddress);
		
		JLabel label_3 = new JLabel("New label");
		label_3.setBounds(409, 204, 46, 14);
		contentPane.add(label_3);
		
		textField_1 = new JTextField();
		textField_1.setBounds(497, 45, 181, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(497, 84, 181, 20);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(497, 121, 181, 20);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(497, 156, 181, 20);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(497, 201, 181, 20);
		contentPane.add(textField_5);
	}
}
