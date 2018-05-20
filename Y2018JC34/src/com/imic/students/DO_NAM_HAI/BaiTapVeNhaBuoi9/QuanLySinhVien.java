package com.imic.students.DO_NAM_HAI.BaiTapVeNhaBuoi9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class QuanLySinhVien implements Comparator<QuanLySinhVien>{
	private int id;
	private String name;
	private byte age;
	private String address;
	private Float gpa;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public byte getAge() {
		return age;
	}

	public void setAge(byte age) {
		this.age = age;
		if (age < 0 && age > 100) {
            throw new NumberFormatException();
        }

	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Float getGpa() {
		return gpa;
	}

	public void setGpa(Float gpa) {
		this.gpa = gpa;
		if (gpa < 0.0 && gpa > 10.0) {
            throw new NumberFormatException();
        }

	}

	public QuanLySinhVien(int id, String name, byte age, String address, float gpa) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.address = address;
		this.gpa = gpa;
	}

	public QuanLySinhVien() {

	}

	@Override
	public String toString() {
		return "QuanLySinhVien [id=" + id + ", name=" + name + ", age=" + age + ", address=" + address + ", gpa=" + gpa
				+ "]";
	}

	ArrayList<QuanLySinhVien> sinhVien = new ArrayList<QuanLySinhVien>();
	Scanner nhap = new Scanner(System.in);

	public void nhap() {
		String chon;
		while (true) {
			QuanLySinhVien sv = new QuanLySinhVien();
			System.out.print("Mời bạn nhập tên của sinh viên : ");
			sv.name = nhap.nextLine();
			System.out.print("Mời bạn nhập ID của sinh viên : ");
			sv.id = nhap.nextInt();
			nhap.nextLine();
			System.out.print("Mời bạn nhập tuổi của sinh viên : ");
			sv.age = nhap.nextByte();
			nhap.nextLine();
			System.out.print("Mời bạn nhập địa chỉ của sinh viên : ");
			sv.address = nhap.nextLine();
			System.out.print("Mời bạn nhập điểm trung bình của sinh viên :");
			sv.gpa = nhap.nextFloat();
			nhap.nextLine();
			sinhVien.add(sv);
			System.out.print(" Bạn có muốn nhập thêm (Y/N)? :");
			chon = nhap.nextLine();
			if (chon.equalsIgnoreCase("N")) {
				break;
			}
		}
	}

	public void xoaID() {
		System.out.print("Nhập ID bạn muốn xóa sinh viên : ");
		int idXoa = nhap.nextInt();
		int removeIndex = -1;
		for (int i = 0; i < sinhVien.size(); i++) {
			if (sinhVien.get(i).getId() == idXoa) {
				removeIndex = i;

			}

		}
		if (removeIndex == -1) {
			System.out.println(" không tìm thấy sản phẩm");
		} else {
			sinhVien.remove(removeIndex);
			System.out.println("Da xoa san pham");

		}
		System.out.println("");

	}
	
	public void sapXepTheoDiemTrungBinh() {
		Comparator<QuanLySinhVien> comp = new Comparator<QuanLySinhVien>() {
			@Override
			public int compare(QuanLySinhVien o1, QuanLySinhVien o2) {
				return o1.getGpa().compareTo(o2.getGpa());
			}
		};
		Collections.sort(sinhVien, comp);
		
	}

	@Override
	public int compare(QuanLySinhVien o1, QuanLySinhVien o2) {     
        return o1.getName().compareTo(o2.getName());

    }
	public void sapXepTheoTen() {
		Collections.sort(sinhVien,new QuanLySinhVien());
	}
	

		
	public void suaSinhVien() {
		boolean tonTai = false;
        int size = sinhVien.size();
        System.out.println(" Mời bạn nhập id sinh viên muốn sửa : ");
        int idSua = nhap.nextInt();
        for (int i = 0; i < size; i++) {
            if (sinhVien.get(i).getId() == idSua) {
            	tonTai = true;
            	sinhVien.get(i).nhap();
                break;
            }
        }
        if (!tonTai) {
            System.out.printf("id = %d không tồn tại.\n", id);
        } else {
            System.out.println(" Đã sửa ");
        }

	}
	
	public void xuat() {
		for(int i=0;i<sinhVien.size();i++) {
			System.out.println(sinhVien.get(i).toString());
		}
	}
	
	public void menu() {
		System.out.println("          Chương trình         ");
		System.out.println(" 1. Add student.");
		System.out.println(" 2. Edit student by id.");
		System.out.println(" 3. Delete student by id. ");
		System.out.println(" 4. Sort student by gpa.");
		System.out.println(" 5. Sort student by name.");
		System.out.println(" 6. Show student.");
		System.out.println(" 7. Exit");

	}
}

