package com.imic.students.Dao_Thanh_Long;

public class _20180504_btvn {

	public static void main(String[] args) {
//		long millis1 = System.currentTimeMillis();
//		System.out.println(millis1);
		soNT();
		soTN();
		chuSoNT();
		tongTN();
//		long millis2 = System.currentTimeMillis();
//		System.out.println(millis2);
//		System.out.println(millis2-millis1);
	}

	public static boolean soNT(int x){
		int dem = 0;
		if(x >= 2){
			for(int j=2;j<=(int)Math.sqrt(x);j++){
				if (x%j==0){
					dem++;
				}
				if (dem != 0){
					break;
				}
			}
			if(dem==0){
				return true;
			}else{
				return false;
			}
		}else{
			return false;
		}
		
	}
	
	public static void soNT(){
		System.out.println("So nguyen to co 7 chu so");
		for(int i = 1000000;i<=9999999;i++){	
			if(soNT(i)){
				System.out.println(i);
			}
		}
	}

	public static void soTN(){
		int i1,i2,i3,i4,i5,i6,i7;
		int temp;
		System.out.println("So thuan nghich co 7 chu so");
		for(int i=1000000;i<=9999999;i++){
			i1 = i/1000000;
			temp = i%1000000;
			
			i2 = temp/100000;
			temp = temp%100000;
			
			i3 = temp/10000;
			temp = temp%10000;
			
			i4 = temp/1000;
			temp = temp%1000;
			
			i5 = temp/100;
			temp = temp%100;
			
			i6 = temp/10;
			i7 = temp%10;
			
			if (i1 == i7 && i2 == i6 && i3 == i5){
				System.out.println(i);
			}
		}
	}

	public static void chuSoNT(){
		int i1,i2,i3,i4,i5,i6,i7;
		int temp;
		boolean result = false;
		System.out.println("So co 7 chu so va cac chu so la so nguyen to");
		for(int i=1000000;i<=9999999;i++){
			i1 = i/1000000;
			temp = i%1000000;
			
			i2 = temp/100000;
			temp = temp%100000;
			
			i3 = temp/10000;
			temp = temp%10000;
			
			i4 = temp/1000;
			temp = temp%1000;
			
			i5 = temp/100;
			temp = temp%100;
			
			i6 = temp/10;
			i7 = temp%10;
			
			result = soNT(i1) && soNT(i2) && soNT(i3) && soNT(i4) && soNT(i5) && soNT(i6) && soNT(i7);
			
			if(result){
				System.out.println(i);
			}
		}
	}

	public static void tongTN(){
		int i1,i2,i3,i4,i5,i6,i7;
		int temp;
		int sum;
		boolean result = false;
		System.out.println("So co 7 chu so va tong cac chu so la so TN");
		for(int i=1000000;i<=9999999;i++){
			i1 = i/1000000;
			temp = i%1000000;
			
			i2 = temp/100000;
			temp = temp%100000;
			
			i3 = temp/10000;
			temp = temp%10000;
			
			i4 = temp/1000;
			temp = temp%1000;
			
			i5 = temp/100;
			temp = temp%100;
			
			i6 = temp/10;
			i7 = temp%10;
			
			sum = i1+i2+i3+i4+i5+i6+i7;
			
			if((sum < 10) || (sum/10 == sum%10)){
				System.out.println(i);
			}
		}
	}

}






























