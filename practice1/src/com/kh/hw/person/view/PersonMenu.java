package com.kh.hw.person.view;

import java.util.Scanner;

import com.kh.hw.person.controller.PersonController;

public class PersonMenu {
	
	private Scanner sc = new Scanner(System.in);
	private PersonController pc = new PersonController();
	
	public void mainMenu() {
		do {
			System.out.println("�л��� �ִ� 3����� ������ �� �ֽ��ϴ�.");
			System.out.println("���� ����� �л��� " + pc.personCount()[0] + "���Դϴ�.");
			System.out.println("����� �ִ� 10����� ������ �� �ֽ��ϴ�.");
			System.out.println("���� ����� ����� " + pc.personCount()[1] + "���Դϴ�.");
			System.out.println();
			
			System.out.println("1. �л� �޴�");
			System.out.println("2. ��� �޴�");
			System.out.println("9. ������");
			System.out.print("�޴� ��ȣ : ");
			int menuNum = sc.nextInt();
			
			switch(menuNum) {
			case 1: studentMenu(); break;
			case 2: employeeMenu(); break;
			case 9: System.out.println("�����մϴ�."); break;
			default: System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���."); break;
			}
			if(menuNum == 9) {
				break;
			}
		}while(true);
	}
	public void studentMenu() {
		System.out.println();
		System.out.println("1. �л� �߰�");
		System.out.println("2. �л� ����");
		System.out.println("9. ��������");
		if(pc.personCount()[0] == 3) {
			System.out.println("�л��� ���� �� �ִ� ������ �� á�� ������ �л� �߰� �޴��� ���̻� Ȱ��ȭ ���� �ʽ��ϴ�.");
		}
		System.out.print("�޴� ��ȣ : ");
		int menuNum = sc.nextInt();
		
		if(pc.personCount()[0] == 3 && menuNum == 1) {
			System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���."); studentMenu();
		}
		
		switch(menuNum) {
		case 1: insertStudent(); break;
		case 2: printStudent(); break;
		case 9: System.out.println("�������� ���ư��ϴ�."); mainMenu(); break;
		default: System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���."); studentMenu(); break;
		}
	}
	public void employeeMenu() {
		System.out.println();
		System.out.println("1. ��� �߰�");
		System.out.println("2. ��� ����");
		System.out.println("9. ��������");
		if(pc.personCount()[1] == 10) {
			System.out.println("����� ���� �� �ִ� ������ �� á�� ������ ��� �߰� �޴��� ���̻� Ȱ��ȭ ���� �ʽ��ϴ�.");
		}
		System.out.print("�޴� ��ȣ : ");
		int menuNum = sc.nextInt();
		
		if(pc.personCount()[1] == 10 && menuNum == 1) {
			System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���."); employeeMenu();
		}
		
		switch(menuNum) {
		case 1: insertEmployee(); break;
		case 2: printEmployee(); break;
		case 9: System.out.println("�������� ���ư��ϴ�."); mainMenu(); break;
		default: System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���."); employeeMenu(); break;
		}
	}
	public void insertStudent() {
		sc.nextLine();
		do {
			System.out.print("�л� �̸� : ");
			String name = sc.nextLine();
			System.out.print("�л� ���� : ");
			int age = sc.nextInt();
			System.out.print("�л� Ű : ");
			double height = sc.nextDouble();
			System.out.print("�л� ������ : ");
			double weight = sc.nextDouble();
			System.out.print("�л� �г� : ");
			int grade = sc.nextInt();
			sc.nextLine();
			System.out.print("�л� ���� : ");
			String major = sc.nextLine();
			
			pc.insertStudent(name, age, height, weight, grade, major);
			
			if(pc.personCount()[0] != 3) {
				System.out.print("�׸��Ͻ÷��� N(�Ǵ� n), �̾��Ͻ÷��� �ƹ� Ű�� �������� : ");
				String go = sc.nextLine();
				if(go.equalsIgnoreCase("N")) {
					break;
				}
			} else {
				System.out.println("�л��� ���� �� �ִ� ������ �� á�� ������ �л� �߰��� �����ϰ� �л� �޴��� ���ư��ϴ�");
				break;
			}
		}while(true);
		studentMenu();
	}
	public void printStudent() {
//		pc.printStudent()
		for(int i = 0; i < pc.personCount()[0]; i++ ) {
		System.out.println(pc.printStudent()[i].toString());
		}
		studentMenu();
	}
	public void insertEmployee() {
		sc.nextLine();
		do {
			System.out.print("��� �̸� : ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("��� ���� : ");
			int age = sc.nextInt();
			System.out.print("��� Ű : ");
			double height = sc.nextDouble();
			System.out.print("��� ������ : ");
			double weight = sc.nextDouble();
			System.out.print("��� �޿� : ");
			int salary = sc.nextInt();
			sc.nextLine();
			System.out.print("��� �μ� : ");
			String dept = sc.nextLine();
			
			pc.insertEmployee(name, age, height, weight, salary, dept);
			
			if(pc.personCount()[1] != 10) {
				System.out.print("�׸��Ͻ÷��� N(�Ǵ� n), �̾��Ͻ÷��� �ƹ� Ű�� �������� : ");
				String go = sc.nextLine();
				if(go.equalsIgnoreCase("N")) {
					break;
				}
			} else {
				System.out.println("����� ���� �� �ִ� ������ �� á�� ������ ��� �߰��� �����ϰ� ��� �޴��� ���ư��ϴ�");
				break;
			}
		}while(true);
		employeeMenu();
	}
	public void printEmployee() {
		for(int i = 0; i < pc.personCount()[1]; i++ ) {
			System.out.println(pc.printEmployee()[i].toString());
			}
		employeeMenu();
	}
}
