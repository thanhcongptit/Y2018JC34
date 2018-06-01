package com.imic.students.Dao_Thanh_Long;

public class _20180601_Exception extends Exception{

	private String message;
	public _20180601_Exception(String s) {
		message = s;
	}
	
	public String toString(){
		
		return message;
	}

}
