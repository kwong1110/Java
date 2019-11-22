package com.kh.example.practice7.model.vo;

public class Employee {
	private int empNo;
	private String empName;
	private String dept;
	private String job;
	private int age;
	private char gender;
	private int salary;
	private double bonusPoint;
	private String phone;
	private String address;
	
	public Employee() {}
	
	public Employee(int empNo, String empName) {
		this.empNo = empNo;
		this.empName = empName;
	}
	
	public Employee(int empNo, String empName, String dept,
			 String job, int age, char gender, int salary,
			 double bonusPoint, String phone, String address) {
		this(empNo, empName); // 오버로딩이 되는걸 적어주어야함!
		this.dept = dept;
		this.job = job;
		this.age = age;
		this.gender = gender;
		this.salary = salary;
		this.bonusPoint = bonusPoint;
		this.phone = phone;
		this.address = address;
	}
	
	public void setter(int empNo, String empName, String dept,
			 String job, int age, char gender, int salary,
			 double bonusPoint, String phone, String address) {
		this.empNo = empNo;
		this.empName = empName;
		this.dept = dept;
		this.job = job;
		this.age = age;
		this.gender = gender;
		this.salary = salary;
		this.bonusPoint = bonusPoint;
		this.phone = phone;
		this.address = address;
	}
	
	public int getEmpNo() {
		return empNo;
	}
	
	public String getEmpName() {
		return empName;
	}
	
	public String getDept() {
		return dept;
	}
	
	public String getJob() {
		return job;
	}
	
	public int getAge() {
		return age;
	}
	
	public char getGender() {
		return gender;
	}
	
	public int getSalary() {
		return salary;
	}
	
	public double getBonusPoint() {
		return bonusPoint;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public String getAddress() {
		return address;
	}
}
