package com.imic.students.Vietanh.Buoi12;

public class testEnum {
	 enum Transport {
       CAR(65), TRUCK(110), TRAIN(70);
		 
		private int speed;
		 Transport(int s) {
			speed = s;
		}
		 
	int getSpeed() {
		return speed;
	}
	
	}
}
