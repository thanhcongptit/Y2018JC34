package com.imic.student.TRAN_THANH_XUAN_BTVN_9_150518;



public class InfoStuden implements Comparable<InfoStuden> {
	private String idStudent;
	private String nameStudent;
	private int ageStudent;
	private String addStudent;
	private float gpaStudent;

	public String getIdStudent() {
		return idStudent;
	}

	public void setIdStudent(String idStudent) {
		this.idStudent = idStudent;
	}

	public String getNameStudent() {
		return nameStudent;
	}

	public void setNameStudent(String nameStudent) {
		this.nameStudent = nameStudent;
	}

	public int getAgeStudent() {
		return ageStudent;
	}

	public void setAgeStudent(int ageStudent) {
		this.ageStudent = ageStudent;
	}

	public String getAddStudent() {
		return addStudent;
	}

	public void setAddStudent(String addStudent) {
		this.addStudent = addStudent;
	}

	public float getGpaStudent() {
		return gpaStudent;
	}

	public void setGpaStudent(float gpaStudent) {
		this.gpaStudent = gpaStudent;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return idStudent + " " + nameStudent + " " + ageStudent + " " + addStudent + " " + gpaStudent;
	}

	@Override
	public int compareTo(InfoStuden o) {
		// TODO Auto-generated method stub
		return (int) o.gpaStudent - (int) this.gpaStudent;
	}

}
