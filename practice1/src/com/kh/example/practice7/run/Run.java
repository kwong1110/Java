package com.kh.example.practice7.run;

import com.kh.example.practice7.model.vo.Employee;

public class Run {
	public static void main(String[] args) {
		Employee ep1 = new Employee();
		ep1.setter(100, "홍길동", "영업부", "과장", 25, '남', 2500000, 0.05, "010-1234-5678", "서울시 강남구");
		
		int empNo = ep1.getEmpNo();
		String empName = ep1.getEmpName();
		String dept = ep1.getDept();
		String job = ep1.getJob();
		int age = ep1.getAge();
		char gender = ep1.getGender();
		int salary = ep1.getSalary();
		double bonusPoint = ep1.getBonusPoint();
		String phone = ep1.getPhone();
		String address = ep1.getAddress();
		
		System.out.println("empNo : " + empNo);
		System.out.println("empName : " + empName);
		System.out.println("dept : " + dept);
		System.out.println("job : " + job);
		System.out.println("age : " + age);
		System.out.println("gender : " + gender);
		System.out.println("salary : " + salary);
		System.out.println("bonusPoint : " + bonusPoint);
		System.out.println("phone : " + phone);
		System.out.println("address : " + address);
	}
}
