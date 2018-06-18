package com.imic.students.Vietanh.Buoi14;

import java.awt.EventQueue;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.imic.students.Vietanh.BaiTapBuoi9.SinhVien;

import javafx.scene.shape.SVGPath;

import javax.swing.JScrollPane;

public class menu {

	private JFrame frame;
	private JTextField textField;
	private JTable table;

	ArrayList<SinhVien> sv = new ArrayList<SinhVien>();
	/**
	 * Launch the application.
	 */
	// public static void main(String[] args) {
	// EventQueue.invokeLater(new Runnable() {
	// public void run() {
	// try {
	// menu window = new menu();
	// window.frame.setVisible(true);
	// } catch (Exception e) {
	// e.printStackTrace();
	// }
	// }
	// });
	// }

	/**
	 * Create the application.
	 */
	public menu() {

//		sv.add(new SinhVien("Viet anh", 01, 18, "Ha Noi", 10.0));
//		sv.add(new SinhVien("huy", 05, 18, "Sai gon", 2.3));
//		sv.add(new SinhVien("Loc", 8, 20, "hn", 2.3));
		FileInputStream fis = null;
		ObjectInputStream oos = null;

		try {
			fis = new FileInputStream("d:/mydata2.txt");
			oos = new ObjectInputStream(fis);
			SinhVien[] svbuoi9 = (SinhVien[]) oos.readObject();
			for(SinhVien x:svbuoi9) {
				sv.add(x);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException ex) {
			ex.printStackTrace();
		}catch(ClassNotFoundException ex1) {
			ex1.printStackTrace();
		}
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 557, 533);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		textField = new JTextField();
		textField.setBounds(70, 24, 329, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		JButton btnNewButton = new JButton("Th\u00EAm sinh vi\u00EAn");
		btnNewButton.setBounds(69, 83, 130, 23);
		frame.getContentPane().add(btnNewButton);

		JButton btnNewButton_1 = new JButton("Danh s\u00E1ch sinh vi\u00EAn");
		btnNewButton_1.setBounds(261, 83, 138, 23);
		frame.getContentPane().add(btnNewButton_1);

		JButton btnNewButton_2 = new JButton("Search");
		btnNewButton_2.setBounds(409, 23, 89, 23);
		frame.getContentPane().add(btnNewButton_2);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(70, 185, 487, 134);
		frame.getContentPane().add(scrollPane);

		SinhVienModelTable mode = new SinhVienModelTable(sv);
		table = new JTable();
		table.setModel(mode);
		scrollPane.setViewportView(table);
	}

	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}
}
