package com.imic.students.Vietanh.Buoi11;

import java.util.Scanner;

public class Exercise_Hinhtron {
	public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Xin moi nhap Ban kinh hinh tron");
      double R = sc.nextDouble();
      
      double chuvi = 2*(Math.PI)*R;
      double dientich = (Math.PI)*R*R;
      
      System.out.println("Chu vi: "+chuvi);
      System.out.println("Dien tich:"+dientich);
      sc.close();
	}
}
