package com.imic.students.Dao_Thanh_Long;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

import com.sun.corba.se.spi.orb.ParserImplBase;

public class _20180515_btvn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner objSc = new Scanner(System.in);
		String strInput = "";
		int intInput;
		boolean loop=true;
		
		System.out.println("*============MENU=============*");
		System.out.println("* 1.Add student...............*");
		System.out.println("* 2.Edit student by id........*");
		System.out.println("* 3.Delete student by id......*");
		System.out.println("* 4.Sort student by gpa.......*");
		System.out.println("* 5.Sort student by name......*");
		System.out.println("* 6.Show student..............*");
		System.out.println("* 0.Exit......................*");
		System.out.println("*=============================*");

		ArrayList<_20180515_Student> studentList = new ArrayList<_20180515_Student>();
		
		while(loop){
			
			System.out.println("Select function in MENU");
			strInput = objSc.nextLine();
			
			switch (strInput) {
			case "0":{
				System.out.println("Game over");
				loop = false;
				break;
			}
			case "1": {
				System.out.println("Add student");
				add_Student(objSc, studentList);
				objSc.nextLine();
				break;
			}
			case "2": {
				System.out.printf("Enter Id of student need to edit : ");
				intInput = objSc.nextInt();
				System.out.println();
				
				edit_By_Id(objSc, studentList, intInput);
				break;
			}
			case "3": {
				System.out.printf("Enter Id of student need to delete : ");
				intInput = objSc.nextInt();
				System.out.println();
				
				delete_By_Id(objSc, studentList, intInput);
				objSc.nextLine();
				break;
			}
			case "4": {
				sort_By_Gpa(objSc, studentList);
				break;
			}
			case "5": {
				sort_By_Name(objSc, studentList);
				break;
			}
			case "6": {
				show_Student(objSc,studentList);
				break;
			}
			default:
				break;
			}
			
		}
		objSc.close();
	}
	
	private static void add_Student(Scanner objSc,ArrayList<_20180515_Student> studentList){
		_20180515_Student studentTemp = new _20180515_Student();
		String name,addr;
		double gpa;
		int age,id;
		
		System.out.printf("ID : ");
		id = objSc.nextInt();
		objSc.nextLine();
		
		System.out.printf("Name : ");
		name = objSc.nextLine();
		
		System.out.printf("Age : ");
		age = objSc.nextInt();
		objSc.nextLine();

		System.out.printf("Address : ");
		addr = objSc.nextLine();
		
		System.out.printf("GPA : ");
		gpa = objSc.nextDouble();
		System.out.println();
		
		studentTemp.setId(id);
		studentTemp.setName(name);
		studentTemp.setAge(age);
		studentTemp.setAddr(addr);
		studentTemp.setGpa(gpa);
		
		studentList.add(studentTemp);
	}
	
	private static void edit_By_Id(Scanner objSc,ArrayList<_20180515_Student> studentList,int id){
		_20180515_Student studentTemp = new _20180515_Student();
		int position=0;
		int count=0;
		
		if(studentList.isEmpty()){
			System.out.println("Students list is empty ");
			objSc.nextLine();
			return;
		}
		
		for(_20180515_Student st:studentList){
			if(st.getId() == id){
				position = studentList.indexOf(st);
				count=1;
				break;
			}
		}
		
		if(count == 0){
			System.out.println("ID  didn't exist!");
			return;
		}
		studentTemp = studentList.get(position);
		
		String temp;
		String name,addr;
		double gpa;
		objSc.nextLine();
		System.out.printf("Name : ");
		name = objSc.nextLine();
		if(!name.equalsIgnoreCase("")){
			studentTemp.setName(name);
		}else{
			System.out.printf("Skip");
		}
		
		System.out.printf("Age : ");
		temp = objSc.nextLine();
		if(!temp.equalsIgnoreCase("")){
			studentTemp.setAge(Integer.parseInt(temp));
		}else{
			System.out.printf("Skip");
		}
		
		System.out.printf("Address : ");
		addr = objSc.nextLine();
		if(!addr.equalsIgnoreCase("")){
			studentTemp.setAddr(addr);
		}else{
			System.out.printf("Skip");
		}

		System.out.printf("GPA : ");
		temp = objSc.nextLine();
		if(!temp.equalsIgnoreCase("")){
			studentTemp.setGpa(Double.parseDouble(temp));
		}else{
			System.out.printf("Skip");
		}
		
		studentList.set(position, studentTemp);
		
		System.out.println();
		
	}
	
	private static void delete_By_Id(Scanner objSc,ArrayList<_20180515_Student> studentList,int id){
		int position=0;
		int count=0;
		
		if(studentList.isEmpty()){
			System.out.println("Students list is empty ");
			return;
		}
		
		for(_20180515_Student st:studentList){
			if(st.getId() == id){
				position = studentList.indexOf(st);
				count=1;
				break;
			}
		}
		if(count == 0){
			System.out.println("ID  didn't exist!");
			return;
		}
		studentList.remove(position);
	}
	
	private static void sort_By_Gpa(Scanner objSc,ArrayList<_20180515_Student> studentList){	
		if(studentList.isEmpty()){
			System.out.println("Students list is empty ");
			return;
		}
		
		Collections.sort(studentList);
		for(_20180515_Student student:studentList){
			student.print_Out();
		}
	}
	
	private static void sort_By_Name(Scanner objSc,ArrayList<_20180515_Student> studentList){		
		if(studentList.isEmpty()){
			System.out.println("Students list is empty ");
			return;
		}
		
		Collections.sort(studentList, new Comparator<_20180515_Student>() {
			public int compare(_20180515_Student st1,_20180515_Student st2){
				return st1.getName().compareToIgnoreCase(st2.getName());
			}
		});
		
		for(_20180515_Student student:studentList){
			student.print_Out();
		}
	}
	
	private static void show_Student(Scanner objSc,ArrayList<_20180515_Student> studentList){
		if(studentList.isEmpty()){
			System.out.println("Students list is empty ");
			return;
		}
		for(_20180515_Student student:studentList){
			student.print_Out();
		}
	}
	
}


