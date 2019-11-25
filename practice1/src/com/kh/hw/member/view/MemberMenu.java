package com.kh.hw.member.view;

import java.util.Scanner;

import com.kh.hw.member.controller.MemberController;

public class MemberMenu {
	
	private Scanner sc = new Scanner(System.in);
	private MemberController mc = new MemberController();
	
	public MemberMenu() {}
	
	public void mainMenu() {
		do {
			System.out.println();
			System.out.println("�ִ� ��� ������ ȸ�� ���� "+ mc.SIZE + "���Դϴ�.");
			System.out.println("���� ��ϵ� ȸ�� ����" + mc.existMemberNum() + "���Դϴ�.");
	
			if(mc.existMemberNum() != 10) {
				System.out.println("1. �� ȸ�� ���");
			} else if(mc.existMemberNum() == 10) {
				System.out.println("ȸ�� ���� ��� �� á�� ������ �Ϻ� �޴��� ���µ˴ϴ�.");
			}
			System.out.println("2. ȸ�� �˻�");
			System.out.println("3. ȸ�� ���� ����");
			System.out.println("4. ȸ�� ����");
			System.out.println("5. ��� ���");
			System.out.println("9. ������");
			System.out.print("�޴� ��ȣ : ");
			int menuNum = sc.nextInt();
			
			switch(menuNum) {
			case 1: insertMember(); break;
			case 2: searchMember(); break;
			case 3: updateMember(); break;
			case 4: deleteMember(); break;
			case 5: printAll(); break;
			case 9: System.out.println("���α׷��� �����մϴ�."); break;
			default : System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���."); break;
			}
			if(menuNum == 9) {
				break;
			}
		}while(true);
	}
	
	public void insertMember() {
		System.out.println("�� ȸ���� ����մϴ�.");
		
		String inputId = "";
		sc.nextLine();
		do {
			System.out.print("���̵� : ");
			inputId = sc.nextLine();
			if(mc.checkId(inputId)) {
				System.out.println("�ߺ��� ���̵��Դϴ�. �ٽ� �Է����ּ���.");
			}
			if(!mc.checkId(inputId)) {
				break;
			}
		}while(true);
		System.out.print("�̸� : ");
		String name = sc.nextLine();
		System.out.print("��й�ȣ : ");
		String password = sc.nextLine();
		System.out.print("�̸��� : ");
		String email = sc.nextLine();
		
		String gender = "";
		do{
			System.out.print("����(M/F) : ");
			gender = sc.nextLine();
			if(gender.toUpperCase().equals("M") || gender.toUpperCase().equals("F")) {
				break;
			} else {
				System.out.println("������ �ٽ� �Է��ϼ���.");
			}
		}while(true);
		System.out.print("���� : ");
		int age = sc.nextInt();
		
		mc.insertMember(inputId, name, password, email, gender, age);
		// mainMenu();
	}
	public void searchMember() {
		System.out.println("1. ���̵�� �˻��ϱ�");
		System.out.println("2. �̸����� �˻��ϱ�");
		System.out.println("3. �̸��Ϸ� �˻��ϱ�");
		System.out.println("9. �������� ���ư���");
		System.out.print("�޴� ��ȣ : ");
		int menuNum = sc.nextInt();
		
		switch(menuNum) {
		case 1: searchId(); break;
		case 2: searchName(); break;
		case 3: searchEmail(); break;
		case 9: System.out.println("�������� ���ư��ϴ�."); break;
		default: System.out.println("�߸� �Է��ϼ̽��ϴ�."); break;
		}
	}
	public void searchId() {
		sc.nextLine();
		System.out.print("�˻��� ���̵� : ");
		String inputId = sc.nextLine();
		if(mc.checkId(inputId)) {
			System.out.println("ã���� �˻� ��� �Դϴ�.");
			System.out.println(mc.searchId(inputId));
		} else {
			System.out.println(mc.searchId(inputId)); // mainMenu();
		}
	}
	public void searchName() {
		sc.nextLine();
		System.out.print("�˻��� �̸� : ");
		String inputName = sc.nextLine();
		if(mc.searchName(inputName) != null && mc.searchName(inputName).length != 0) {
			System.out.println("ã���� ȸ�� ��ȸ ��� �Դϴ�.");
			for(int i = 0; i < mc.searchName(inputName).length; i++) {
				System.out.println(mc.searchName(inputName)[i].inform());
			}
		} else {
			System.out.println("�˻� ����� �����ϴ�."); // mainMenu();
		}
	}
	public void searchEmail() {
		sc.nextLine();
		System.out.print("�˻��� �̸��� : ");
		String inputEmail = sc.nextLine();
		if(mc.searchEmail(inputEmail) != null && mc.searchName(inputEmail).length != 0) {
			System.out.println("ã���� ȸ�� ��ȸ ��� �Դϴ�.");
			for(int i = 0; i < mc.searchEmail(inputEmail).length; i++) {
				System.out.println(mc.searchEmail(inputEmail)[i].inform());
			}
		} else {
			System.out.println("�˻� ����� �����ϴ�."); // mainMenu();
		}
	}
	
	public void updateMember() {
		System.out.println("1. ��й�ȣ �����ϱ�");
		System.out.println("2. �̸� �����ϱ�");
		System.out.println("3. �̸��� �����ϱ�");
		System.out.println("9. �������� ���ư���");
		System.out.print("�޴� ��ȣ : ");
		int menuNum = sc.nextInt();
		
		switch(menuNum) {
		case 1: updatePassword(); break;
		case 2: updateName(); break;
		case 3: updateEmail(); break;
		case 9: System.out.println("�������� ���ư��ϴ�."); break;
		default: System.out.println("�߸� �Է��ϼ̽��ϴ�."); break; 
		}
	}
	public void updatePassword() {
		sc.nextLine();
		System.out.print("������ ȸ���� ���̵� : ");
		String inputId = sc.nextLine();
		System.out.print("������ ��й�ȣ : ");
		String inputPassword = sc.nextLine();
		if(mc.updatePassword(inputId, inputPassword)) {
			System.out.println("������ ���������� �Ǿ����ϴ�.");
			// mainMenu();
		} else {
			System.out.println("�������� �ʴ� ���̵��Դϴ�.");
			// mainMenu();
		}
	}
	public void updateName() {
		sc.nextLine();
		System.out.print("������ ȸ���� ���̵� : ");
		String inputId = sc.nextLine();
		System.out.print("������ �̸� : ");
		String inputName = sc.nextLine();
		if(mc.updateName(inputId, inputName)) {
			System.out.println("������ ���������� �Ǿ����ϴ�.");
			// mainMenu();
		} else {
			System.out.println("�������� �ʴ� ���̵��Դϴ�.");
			// mainMenu();
		}
	}
	public void updateEmail() {
		sc.nextLine();
		System.out.print("������ ȸ���� ���̵� : ");
		String inputId = sc.nextLine();
		System.out.print("������ �̸��� : ");
		String inputEmail = sc.nextLine();
		if(mc.updateEmail(inputId, inputEmail)) {
			System.out.println("������ ���������� �Ǿ����ϴ�.");
			// mainMenu();
		} else {
			System.out.println("�������� �ʴ� ���̵��Դϴ�.");
			// mainMenu();
		}
	}
	
	public void deleteMember() {
		System.out.println("1. Ư�� ȸ�� �����ϱ�");
		System.out.println("2. ��� ȸ�� �����ϱ�");
		System.out.println("9. �������� ���ư���");
		System.out.print("�޴� ��ȣ : ");
		int menuNum = sc.nextInt();
		
		switch(menuNum) {
		case 1: deleteOne(); break;
		case 2: deleteAll(); break;
		case 9: System.out.println("�������� ���ư��ϴ�."); break;
		default: System.out.println("�߸� �Է��ϼ̽��ϴ�."); break; 
		}
	}
	public void deleteOne() {
		sc.nextLine();
		System.out.print("������ ȸ���� ���̵� : ");
		String inputId = sc.nextLine();
		System.out.print("���� �����Ͻðڽ��ϱ�?(y/n) : ");
		String deleteCheck = sc.nextLine();
		if(deleteCheck.equalsIgnoreCase("Y")) {
			if(mc.delete(inputId)) {
				System.out.println("���������� �����Ͽ����ϴ�.");
				// mainMenu();
			} else if(!mc.delete(inputId)) {
				System.out.println("�������� �ʴ� ���̵��Դϴ�.");
				// mainMenu();
			}
		} else if (deleteCheck.equalsIgnoreCase("N")) {
			System.out.println("�������� �ʽ��ϴ�.");
			// mainMenu();
		}
	}
	public void deleteAll() {
		sc.nextLine();
		System.out.print("���� �����Ͻðڽ��ϱ�?(y/n) : ");
		String deleteCheck = sc.nextLine();
		if(deleteCheck.equalsIgnoreCase("Y")) {
			mc.delete();
			System.out.println("���������� �����Ͽ����ϴ�.");
			// mainMenu();
		} else if (deleteCheck.equalsIgnoreCase("N")) {
			System.out.println("�������� �ʽ��ϴ�.");
			// mainMenu();
		}
	}
	
	public void printAll() {
		if(mc.printAll() == null) {
			System.out.println("����� ȸ���� �����ϴ�.");
		} else {
			for(int i = 0; i < mc.printAll().length; i++) {
				System.out.println(mc.printAll()[i].inform());
			}
		}
	}
}
