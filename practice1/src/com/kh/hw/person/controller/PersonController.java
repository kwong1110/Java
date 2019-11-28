package com.kh.hw.person.controller;

import com.kh.hw.person.model.vo.Employee;
import com.kh.hw.person.model.vo.Student;

public class PersonController {

	private Student[] s = new Student[3];
	private Employee[] e = new Employee[10];
	
	public int[] personCount() {
//		int[] pc = new int[2];
//		pc[0] = 0;	// ����� �л� ��
//		pc[1] = 0;	// ����� ��� ��
		int[] pc = {0, 0};
		
		// ����� �ִٴ°� �ּҰ��� �ִٴ� ���̹Ƿ� null�� �־� �ش�.
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
		// for������ ����ִ� �迭�� ã�ư��� ���� �־��ش�.
		// �����Ѱ��� ä���־�� �ϱ� ������.
		for(int i = 0; i < s.length; i++) {
			if(s[i] == null) {
				s[i] = new Student(name, age, height, weight, grade, major);
				break;
			}
		}
	}
	public Student[] printStudent() {
		return s;
	}
	public void insertEmployee(String name, int age, double height, 
							double weight, int salary, String dept) {
		for(int i = 0; i < e.length; i++) {
			if(e[i] == null) {
				e[personCount()[1]] = new Employee(name, age, height, weight, salary, dept);
			}
		}
	}
	
	public Employee[] printEmployee() {
		return e;
	}
}
