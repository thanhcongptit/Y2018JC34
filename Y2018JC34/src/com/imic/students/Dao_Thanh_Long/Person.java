package com.imic.students.Dao_Thanh_Long;

public class Person implements PersonExample{
	
	protected String id;
	protected String name;
	protected int age;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	public Person(String id,String name,int age){
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	public Person(){
		
	}
	@Override
	public void input() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void display() {
		System.out.println("Person class display");
		
	}
}
