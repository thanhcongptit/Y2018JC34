package com.imic.students.Vietanh.Buoi14;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LogicTest {

	private JFrame frame;
	private JTextField JTF_User;
	private JPasswordField JPass_pass;
	private JLabel lblNewLabel_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LogicTest window = new LogicTest();
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
	public LogicTest() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel JLB_User = new JLabel("UserName");
		JLB_User.setIcon(new ImageIcon(LogicTest.class.getResource("/imageVanh/man-human-person-login-512.png")));
		JLB_User.setBounds(24, 108, 85, 14);
		frame.getContentPane().add(JLB_User);
		
		JLabel JLB_Pass = new JLabel("PassWord");
		JLB_Pass.setIcon(new ImageIcon(LogicTest.class.getResource("/imageVanh/basic1-106_lock_security-512.png")));
		JLB_Pass.setBounds(24, 133, 85, 14);
		frame.getContentPane().add(JLB_Pass);
		
		JTF_User = new JTextField();
		JTF_User.setBounds(137, 105, 243, 20);
		frame.getContentPane().add(JTF_User);
		JTF_User.setColumns(10);
		
		JPass_pass = new JPasswordField();
		JPass_pass.setBounds(137, 130, 243, 20);
		frame.getContentPane().add(JPass_pass);
		
		lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(LogicTest.class.getResource("/imageVanh/Hacker-512 (1).png")));
		lblNewLabel_2.setBounds(199, 11, 64, 64);
		frame.getContentPane().add(lblNewLabel_2);
		
		JButton JB_cancel = new JButton("Canel\r\n");
		JB_cancel.setBounds(260, 178, 89, 23);
		frame.getContentPane().add(JB_cancel);
		
		JButton JB_Login = new JButton("Login\r\n");
		JB_Login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = JTF_User.getText();
				String pass = JPass_pass.getText();
			if(name.equals("admin") && pass.equals("123")) {
				menu mn = new menu();
				JFrame jfrMenu = mn.getFrame();
				jfrMenu.setVisible(true);
				frame.dispose();
			}
			else {
				JOptionPane.showMessageDialog(frame, "Đăng nhập thất bại", "Error", JOptionPane.ERROR_MESSAGE);
			}
			}
		});
		JB_Login.setBounds(169, 178, 89, 23);
		frame.getContentPane().add(JB_Login);
	}
}
