package com.imic.students.Vietanh.Buoi14;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.ImageIcon;

public class DkiSinhVien {

	private JFrame frame;
	private JTextField tf_name;
	private JTextField tf_age;
	private JTextField tf_id;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DkiSinhVien window = new DkiSinhVien();
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
	public DkiSinhVien() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 558, 532);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel Jl_ = new JLabel("Register information");
		Jl_.setBounds(10, 11, 133, 14);
		frame.getContentPane().add(Jl_);

		JLabel Jl_Name = new JLabel("Name");
		Jl_Name.setBounds(10, 36, 46, 14);
		frame.getContentPane().add(Jl_Name);

		tf_name = new JTextField();
		tf_name.setBounds(110, 33, 213, 20);
		frame.getContentPane().add(tf_name);
		tf_name.setColumns(10);

		JLabel Jl_Age = new JLabel("Age");
		Jl_Age.setBounds(10, 67, 46, 14);
		frame.getContentPane().add(Jl_Age);

		tf_age = new JTextField();
		tf_age.setBounds(110, 64, 213, 20);
		frame.getContentPane().add(tf_age);
		tf_age.setColumns(10);

		JLabel Jl_id = new JLabel("ID");
		Jl_id.setBounds(10, 98, 46, 14);
		frame.getContentPane().add(Jl_id);

		tf_id = new JTextField();
		tf_id.setBounds(110, 95, 213, 20);
		frame.getContentPane().add(tf_id);
		tf_id.setColumns(10);

		JLabel JRB_Sex = new JLabel("Sex");
		JRB_Sex.setBounds(10, 129, 46, 14);
		frame.getContentPane().add(JRB_Sex);

		JRadioButton JRB_Nam = new JRadioButton("Nam");
		JRB_Nam.setBounds(109, 125, 109, 23);
		frame.getContentPane().add(JRB_Nam);

		JRadioButton JRB_Nu = new JRadioButton("Nu");
		JRB_Nu.setBounds(226, 125, 109, 23);
		frame.getContentPane().add(JRB_Nu);

		ButtonGroup btGr = new ButtonGroup();
		btGr.add(JRB_Nam);
		btGr.add(JRB_Nu);

		JLabel Jl_Ad = new JLabel("Adress");
		Jl_Ad.setForeground(Color.BLACK);
		Jl_Ad.setBounds(10, 165, 61, 14);
		frame.getContentPane().add(Jl_Ad);

		JComboBox combo_DiaChi = new JComboBox();
		combo_DiaChi.setModel(new DefaultComboBoxModel(new String[] { "Ha Noi\t", "Ho Chi Minh" }));
		combo_DiaChi.setBounds(236, 155, 87, 20);
		frame.getContentPane().add(combo_DiaChi);

		JLabel lblNewLabel = new JLabel("Oper actions");
		lblNewLabel.setBounds(10, 206, 87, 14);
		frame.getContentPane().add(lblNewLabel);

		JButton btnNewButton = new JButton("Register");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = tf_name.getText();
				String age = tf_age.getText();
				String id = tf_id.getText();
				String ad = combo_DiaChi.getToolTipText();
				String sex = JRB_Sex.getName();
				String mautuoi = "\\d+";

				SinhVien sv = new SinhVien(name, age, id, sex, ad);

				if (age.matches(mautuoi) && id.matches(mautuoi)) {
					JOptionPane.showMessageDialog(frame, sv.toString(), "Đăng kí thành công",
							JOptionPane.INFORMATION_MESSAGE);
				} else {
					JOptionPane.showMessageDialog(frame, "dang ki that bai", "ERROR", JOptionPane.ERROR_MESSAGE);
				}

			}
		});
		btnNewButton.setBounds(72, 247, 109, 23);
		frame.getContentPane().add(btnNewButton);

		JButton btnNewButton_1 = new JButton("Reset");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		btnNewButton_1.setBounds(178, 247, 97, 23);
		frame.getContentPane().add(btnNewButton_1);

		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon(DkiSinhVien.class.getResource("/imageVanh/Hacker-512.png")));
		lblNewLabel_1.setBounds(25, 275, 448, 207);
		frame.getContentPane().add(lblNewLabel_1);
	}
}
