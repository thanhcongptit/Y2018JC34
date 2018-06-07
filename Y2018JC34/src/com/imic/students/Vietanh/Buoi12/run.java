package com.imic.students.Vietanh.Buoi12;

import java.util.InputMismatchException;
import java.util.Scanner;

public class run {
	public static void tinhtoan(int diem) throws myEx {
		if (diem > 10) {
			throw new myEx(diem);
		}
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		try {
			System.out.println("Xin moi ban nhap diem");
            int diem = sc.nextInt();
            sc.nextLine();
            System.out.println("Diem cua ban:"+diem);
			tinhtoan(diem);
			
		}catch(InputMismatchException ex) {
			System.out.println("Diem phai la so");
			System.out.println("------------");
		}
		
		catch (myEx e) {
			
			e.printStackTrace();
//			return;
		}
		
		finally {
			System.out.println("The end");
		}

		
	}
}
