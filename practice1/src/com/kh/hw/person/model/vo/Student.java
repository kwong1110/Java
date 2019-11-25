package com.kh.hw.person.model.vo;

public class Student extends Person{

	private int grade;
	private String major;
	
	public Student(){}
	
	public Student(String name, int age, double height, 
			double weight, int grade, String major) {
		super(name, age, height, weight);
		this.grade = grade;
		this.major = major;
	}
	
	// 학년
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public int getGrade() {
		return grade;
	}
	
	// 전공
	public void setMajor(String major) {
		this.major = major;
	}
	public String getMajor() {
		return major;
	}
	
	@Override
	public String toString() {
		return super.toString() + ", " + grade + ", " + major;
	}
}
