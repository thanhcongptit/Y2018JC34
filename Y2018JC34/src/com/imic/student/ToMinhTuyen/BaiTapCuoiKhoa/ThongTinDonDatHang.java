package com.imic.student.ToMinhTuyen.BaiTapCuoiKhoa;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ThongTinDonDatHang extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ThongTinDonDatHang frame = new ThongTinDonDatHang();
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
	public ThongTinDonDatHang() {
		setTitle("Th\u00F4ng Tin \u0110\u01A1n \u0110\u1EB7t H\u00E0ng");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 617, 412);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		table = new JTable();
		table.setBorder(new LineBorder(new Color(0, 0, 0)));
		table.setBounds(10, 56, 332, 237);
		panel.add(table);
		
		JLabel lblntHng = new JLabel("\u0110\u01A1n \u0110\u1EB7t H\u00E0ng");
		lblntHng.setHorizontalAlignment(SwingConstants.CENTER);
		lblntHng.setBounds(10, 11, 229, 34);
		panel.add(lblntHng);
		
		textField = new JTextField();
		textField.setBounds(10, 306, 236, 28);
		panel.add(textField);
		textField.setColumns(10);
		
		JButton btnTmKim = new JButton("T\u00ECm Ki\u1EBFm");
		btnTmKim.setBounds(256, 309, 89, 23);
		panel.add(btnTmKim);
		
		JButton btnNewButton = new JButton("X\u00F3a \u0110\u01A1n");
		btnNewButton.setBounds(352, 270, 89, 23);
		panel.add(btnNewButton);
		
		JButton btnTrangCh = new JButton("Trang ch\u1EE7");
		btnTrangCh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Quan_Ly_Ban_Hang qlbh = new Quan_Ly_Ban_Hang();

				qlbh.setVisible(true);
				setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			}
		});
		btnTrangCh.setBounds(492, 270, 89, 23);
		panel.add(btnTrangCh);
		
		JButton btnThmn = new JButton("Th\u00EAm \u0110\u01A1n");
		btnThmn.setBounds(352, 236, 89, 23);
		panel.add(btnThmn);
		
		JButton btnSan = new JButton("S\u1EEFa \u0110\u01A1n");
		btnSan.setBounds(492, 236, 89, 23);
		panel.add(btnSan);
	}
}
