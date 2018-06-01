package com.imic.students.PhamDuyDieu.BaiTapVeNha.BuoiThu11;

// * Tạo interface có tên personExample có 2 phương thức
// * a/ public void input();
// * b/ public void display();
// * 2===
// * Tạo class person thực thi interface trên và có thêm các thuộc tính và phương thức sau:
// * a. protected String id.
// * b. protected String name..
// * c. protected int age.
// * 3===
// * Tạo class student kế thừa từ class person và có thêm các thuộc tính và phương thức sau:
// * a. private int mark.
// * b. private String grade.
// * Viết các getter cho mark và grade.
// * Viết setter cho mark.
// * Viết phương thức tính grade như sau
// * Nếu mark >=8 thì grade = distinction
// * Nếu mark >=7 thì grade = credit
// * Nếu mark >=5 thì grade = pass
// * Nếu mark >=0 thì grade = fail.
// * Viết lại các phương thức input() và display() và 2 constructor.
// * 4===
// * Viết phương thức main trong class student và thực hiện các công việc.
// * a. Nhập và 1 student từ bàn phím.
// * b. In dữ liệu đã nhập ra màn hình.

public interface personExample {
	public void input();

	public void display();
}
