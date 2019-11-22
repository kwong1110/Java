package com.kh.hw.employee.controller;

import com.kh.hw.employee.model.vo.Employee;

public class EmployeeController {
	
	private Employee e = new Employee();
	
	public void add(int empNo, String name, char gender, String phone) {
//		System.out.println("add가 전달받았습니다.");
//		System.out.println("Employee에 전달합니다.");
//		Employee e2 = new Employee(empNo, name, gender, phone);
		e.setEmpNo(empNo);
		e.setName(name);
		e.setGender(gender);
		e.setPhone(phone);
	}
	
	public void add(int empNo, String name, char gender, String phone,
					String dept, int salary, double bonus) {
//		Employee e3 = new Employee(empNo, name, gender, phone, dept, salary, bonus);
		e.setEmpNo(empNo);
		e.setName(name);
		e.setGender(gender);
		e.setPhone(phone);
		e.setDept(dept);
		e.setSalary(salary);
		e.setBonus(bonus);
		
	}
	
	public void modify(String phone) {
		e.setPhone(phone);
	}
	
	public void modify(int salary) {
		e.setSalary(salary);
	}
	
	public void modify(double bonus) {
		e.setBonus(bonus);
	}
	
	public Employee remove() {
		e = null;
		return null;
	}
	
	public String infrom() {
		if(e == null) {
			return null;
		} else {
			return e.printEmployee();
		}
	}
}
