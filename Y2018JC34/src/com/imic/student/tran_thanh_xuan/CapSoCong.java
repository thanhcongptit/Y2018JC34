package com.imic.student.tran_thanh_xuan;

import java.util.Scanner;

public class CapSoCong {
	public static void main(String arg[]){
        int[] A;
        int count=0;
        A = new int[20];
        @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            A[i] = sc.nextInt();
        }
        int temp = A[1]-A[0];
        for(int i = 0; i < n; i++){
            if(A[i+1]-A[i]==temp) count++;
        }
        if(count==n-1){
            System.out.println("Yes");
        }else System.out.println("No");
    }

}
