package com.kh.hw.employee.model.vo;

public class Employee {
	private int empNo;
	private String name;
	private char gender;
	private String phone;
	private String dept;
	private int salary;
	private double bonus;
	
	public Employee() {}
	
	public Employee(int empNo, String name, char gender, String phone) {
		this.empNo = empNo;
		this.name = name;
		this.gender = gender;
		this.phone = phone;
//		System.out.println("Employee가 전달받았습니다.");
	}
	
	public Employee(int empNo, String name, char gender, String phone,
					String dept, int salary, double bonus) {
		this(empNo, name, gender, phone);
		this.dept = dept;
		this.salary = salary;
		this.bonus = bonus;
	}
	
	// 번호
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	
	public int getEmpNo() {
		return empNo;
	}
	
	// 이름
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	// 성별
	public void setGender(char gender) {
		this.gender = gender;
	}
	public char getGender() {
		return gender;
	}
	
	// 폰번
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getPhone() {
		return phone;
	}
	
	// 부서
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getDept() {
		return dept;
	}
	
	// 연봉
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getSalary() {
		return salary;
	}
	
	// 보너스
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	public double getBonus() {
		return bonus;
	}
	
	public String printEmployee(){
		return empNo + " " + name + " " + gender + " " + phone + 
				" " + dept + " " + salary + " " + bonus;
	}
}
