package com.kh.practice.student.view;

import com.kh.practice.student.controller.StudentController;

public class StudentMenu {

	private StudentController ssm = new StudentController();
	public StudentMenu() {
		System.out.println("========== �л� ���� ��� ==========");
		for(int i = 0; i < ssm.printStudent().length; i++) {
			System.out.println(ssm.printStudent()[i].inform());
		}
		System.out.println("========== �л� ���� ��� ==========");
		System.out.println("�л� ���� �հ� : " + ssm.sumScore());
		System.out.println("�л� ���� ��� : " + ssm.avgScore()[1]);
		System.out.println("========== ���� ��� ��� ==========");
		for(int i = 0; i < ssm.printStudent().length; i++){
			if(ssm.printStudent()[i].getScore() < ssm.CUT_LINE) {
				System.out.println(ssm.printStudent()[i].getName() + "�л��� " + "����� ����Դϴ�.");
			} else {
				System.out.println(ssm.printStudent()[i].getName() + "�л��� " + "����Դϴ�.");
			}
		}
//		System.out.println(ssm.CUT_LINE);
	}
	
}
