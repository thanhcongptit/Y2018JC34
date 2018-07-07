package com.imic.student.ToMinhTuyen.BaiTapCuoiKhoa;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;

public class Quan_Ly_Ban_Hang extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Quan_Ly_Ban_Hang frame = new Quan_Ly_Ban_Hang();
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
	public Quan_Ly_Ban_Hang() {
		setTitle("QuanLyBanHang");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 466, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.CYAN);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btKhachHang = new JButton("Khach H\u00E0ng");
		btKhachHang.setForeground(Color.BLACK);
		btKhachHang.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btKhachHang.setBackground(Color.WHITE);
		btKhachHang.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			ThongTinKhachHang ttkh = new ThongTinKhachHang();
//			ttkh.setSize(720, 460); 
			ttkh.setVisible(true);
				
			}
			
			
		});
		btKhachHang.setIcon(null);
		btKhachHang.setBounds(33, 34, 113, 73);
		contentPane.add(btKhachHang);
		
		JButton btSanPham = new JButton("S\u1EA3n Ph\u1EA9m");
		btSanPham.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ThongTinSanPham ttsp = new ThongTinSanPham(); 
				ttsp.setVisible(true);
			
			}
		});
		btSanPham.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btSanPham.setBackground(Color.WHITE);
		btSanPham.setBounds(156, 34, 120, 73);
		contentPane.add(btSanPham);
		
		JButton btDonDatHang = new JButton("\u0110\u01A1n \u0110\u1EB7t H\u00E0ng");
		btDonDatHang.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ThongTinDonDatHang ttddh = new ThongTinDonDatHang(); 
				ttddh.setVisible(true);
				
			}
		});
		btDonDatHang.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btDonDatHang.setBackground(Color.WHITE);
		btDonDatHang.setBounds(286, 34, 120, 73);
		contentPane.add(btDonDatHang);
		
		JButton btExit = new JButton("Tho\u00E1t");
		btExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
//		JOptionPane.showConfirmDialog(btExit,"Ban co thuc su muon thoat");
				
				
			}
			
		});
		btExit.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btExit.setBackground(Color.WHITE);
		btExit.setBounds(233, 152, 120, 73);
		contentPane.add(btExit);
		
		JButton btnTiKhon = new JButton("T\u00E0i Kho\u1EA3n");
		btnTiKhon.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnTiKhon.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnTiKhon.setBackground(Color.WHITE);
		btnTiKhon.setBounds(83, 152, 120, 73);
		contentPane.add(btnTiKhon);
	}
}
