package com.kh.hw.person.controller;

import com.kh.hw.person.model.vo.Employee;
import com.kh.hw.person.model.vo.Student;

public class PersonController {

	private Student[] s = new Student[3];
	private Employee[] e = new Employee[10];
	
	public int[] personCount() {
		int[] pc = new int[2];
		pc[0] = 0;	// 저장된 학생 수
		pc[1] = 0;	// 저장된 사원 수
		for(int i = 0; i < s.length; i++) {
			if(s[i] != null) {
				pc[0]++;
			}
		}
		for(int i = 0; i < e.length; i++) {
			if(e[i] != null) {
				pc[1]++;
			}
		}
		return pc;
	}
	public void insertStudent(String name, int age, double height, 
							double weight, int grade, String major) {
		s[personCount()[0]] = new Student(name, age, height, weight, grade, major);
	}
	public Student[] printStudent() {
		return s;
	}
	public void insertEmployee(String name, int age, double height, 
							double weight, int salary, String dept) {
		e[personCount()[1]] = new Employee(name, age, height, weight, salary, dept);
	}
	
	public Employee[] printEmployee() {
		return e;
	}
}
