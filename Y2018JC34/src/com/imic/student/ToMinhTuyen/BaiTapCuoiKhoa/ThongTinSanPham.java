package com.imic.student.ToMinhTuyen.BaiTapCuoiKhoa;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTable;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.table.DefaultTableModel;

public class ThongTinSanPham extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ThongTinSanPham frame = new ThongTinSanPham();
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
	public ThongTinSanPham() {
		setTitle("Th\u00F4ng Tin S\u1EA3n Ph\u1EA9m");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 772, 485);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Th\u00F4ng Tin S\u1EA3n Ph\u1EA9m");
		lblNewLabel.setBounds(5, 5, 424, 14);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
			},
			new String[] {
				"M\u00E3 S\u1EA3n Ph\u1EA9m", "T\u00EAn S\u1EA3n Ph\u1EA9m", "Gi\u00E1 S\u1EA3n Ph\u1EA9m"
			}
		));
		table.setBorder(new LineBorder(new Color(0, 0, 0)));
		table.setBounds(5, 50, 404, 331);
		contentPane.add(table);
		
		textField = new JTextField();
		textField.setBounds(5, 392, 305, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Th\u00EAm S\u1EA3n Ph\u1EA9m");
		btnNewButton.setBounds(435, 358, 131, 23);
		contentPane.add(btnNewButton);
		
		JButton btnSaSnPhm = new JButton("S\u1EEDa S\u1EA3n Ph\u1EA9m");
		btnSaSnPhm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnSaSnPhm.setBounds(576, 358, 135, 23);
		contentPane.add(btnSaSnPhm);
		
		JButton btnXaSnPhm = new JButton("X\u00F3a S\u1EA3n Ph\u1EA9m");
		btnXaSnPhm.setBounds(435, 391, 131, 23);
		contentPane.add(btnXaSnPhm);
		
		JButton btnTmKim = new JButton("T\u00ECm Ki\u1EBFm");
		btnTmKim.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnTmKim.setBounds(320, 392, 89, 23);
		contentPane.add(btnTmKim);
		
		JButton btnTrangCh = new JButton("Trang ch\u1EE7");
		btnTrangCh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Quan_Ly_Ban_Hang qlbh = new Quan_Ly_Ban_Hang();

				qlbh.setVisible(true);
				setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
			}
		});
		btnTrangCh.setBounds(576, 391, 135, 23);
		contentPane.add(btnTrangCh);
		
		JLabel lblId = new JLabel("M\u00E3 S\u1EA3n Ph\u1EA9m");
		lblId.setHorizontalAlignment(SwingConstants.CENTER);
		lblId.setBounds(412, 50, 73, 14);
		contentPane.add(lblId);
		
		textField_1 = new JTextField();
		textField_1.setBounds(495, 50, 203, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblTnSnPhm = new JLabel("T\u00EAn S\u1EA3n Ph\u1EA9m");
		lblTnSnPhm.setHorizontalAlignment(SwingConstants.CENTER);
		lblTnSnPhm.setBounds(407, 106, 78, 14);
		contentPane.add(lblTnSnPhm);
		
		JLabel lblGiSnPhm = new JLabel("Gi\u00E1 S\u1EA3n Ph\u1EA3m");
		lblGiSnPhm.setHorizontalAlignment(SwingConstants.CENTER);
		lblGiSnPhm.setBounds(412, 152, 73, 14);
		contentPane.add(lblGiSnPhm);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(495, 103, 203, 20);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(495, 149, 203, 20);
		contentPane.add(textField_3);
	}

}
