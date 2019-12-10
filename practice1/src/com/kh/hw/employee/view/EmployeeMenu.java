package com.kh.hw.employee.view;

import java.util.Scanner;

import com.kh.hw.employee.controller.EmployeeController;

public class EmployeeMenu {

	Scanner sc = new Scanner(System.in);
	EmployeeController ec = new EmployeeController();
	
	public EmployeeMenu() {
		do {
			System.out.println("1. ��� �߰�");
			System.out.println("2. ��� ����");
			System.out.println("3. ��� ����");
			System.out.println("4. ��� ���");
			System.out.println("9. ���α׷� ����.");
			System.out.print("�޴� ��ȣ�� �������� : ");
			int menuNum = sc.nextInt();
			
			switch(menuNum) {
				case 1: insertEmp(); break;
				case 2: updateEmp(); break;
				case 3: deleteEmp(); break;
				case 4: printEmp(); break;
				case 9: System.out.println("���α׷��� �����մϴ�."); break;
				default : System.out.println("��ȣ�� �߸� �Է��߽��ϴ�."); break;
			}
			if(menuNum == 9) {
				break;
			}
		}while(true);
	}
	
	public void insertEmp() {
		System.out.print("��� ��ȣ : ");
		int empNo = sc.nextInt();
		sc.nextLine();
		System.out.print("��� �̸� : ");
		String name = sc.nextLine();
		System.out.print("��� ���� : ");
		char gender = sc.nextLine().charAt(0);
		System.out.print("��ȭ ��ȣ : ");
		String phone = sc.nextLine();
		System.out.print("�߰� ������ �� �Է��Ͻðڽ��ϱ�?(y/n) : ");
		String add = sc.nextLine();
		
		if(add.toUpperCase().equals("Y")) {
			System.out.print("��� �μ� : ");
			String dept = sc.nextLine();
			System.out.print("��� ���� : ");
			int salary = sc.nextInt();
			System.out.print("���ʽ� �� : ");
			double bonus = sc.nextDouble();
			ec.add(empNo, name, gender, phone, dept, salary, bonus);
		} else if (add.toUpperCase().equals("N")) {
//			System.out.println("add�� �����մϴ�.");
			ec.add(empNo, name, gender, phone);
		}
	}
	
	public void updateEmp() {
		System.out.println("���� �ֽ��� ��� ������ �����ϰ� �˴ϴ�");
		System.out.println("����� � ������ �����Ͻðڽ��ϱ�?");
		System.out.println("1. ��ȭ��ȣ");
		System.out.println("2. ��� ����");
		System.out.println("3. ���ʽ� ��");
		System.out.println("9. ���ư���");
		System.out.print("�޴� ��ȣ�� �������� : ");
		int menuNum = sc.nextInt();
		
		switch (menuNum) {
		case 1:
			System.out.print("������ ��ȭ��ȣ : ");
			String phone = sc.nextLine();
			ec.modify(phone);
			break;
		case 2:
			System.out.print("������ ��� ���� : ");
			int salary = sc.nextInt();
			ec.modify(salary);
			break;
		case 3:
			System.out.print("������ ���ʽ� �� : ");
			double bonus = sc.nextDouble();
			ec.modify(bonus);
			break;
		case 9:
			System.out.println("���θ޴��� ���ư��ϴ�.");
			break;
		default:
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			break;
		}
	}
	
	public void deleteEmp() {
		sc.nextLine();
		System.out.print("���� �����Ͻðڽ��ϱ�? (y/n) : ");
		String delete = sc.nextLine();
		if(delete.toUpperCase().equals("Y")) {
			ec.remove();
		}
		if(ec.remove() == null) {
			System.out.println("������ ������ �����Ͽ����ϴ�!!");
		} else {
			System.out.println("������ ������ �����Ͽ����ϴ٤�");
		}
	}
	
	public void printEmp() {
		if(ec.infrom() != null) {
			System.out.println(ec.infrom());
		} else {
			System.out.println("��� �����Ͱ� �����ϴ�.");
		}
	}
}
