package com.kh.practice.generics.view;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

import com.kh.practice.generics.controller.FarmController;
import com.kh.practice.generics.model.vo.Farm;
import com.kh.practice.generics.model.vo.Fruit;
import com.kh.practice.generics.model.vo.Nut;
import com.kh.practice.generics.model.vo.Vegetable;

public class FarmMenu {

	private Scanner sc = new Scanner(System.in);
	private FarmController fc = new FarmController();
	
	public void mainMenu() {
		System.out.println("========== KH ��Ʈ ==========");
		
		do {
			System.out.println("===******* ���� �޴� *******===");
			System.out.println("1. ���� �޴�");
			System.out.println("2. �մ� �޴�");
			System.out.println("9. ����");
			System.out.print("�޴� ��ȣ : ");
			int menuNum = Integer.parseInt(sc.nextLine());
			
			switch(menuNum) {
			case 1: adminMenu(); break;
			case 2: customerMenu(); break;
			case 9: System.out.println("���α׷� ����.."); return;
			default : System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���."); break;
			}
		}while(true);
	}
	
	public void adminMenu() {
		do {
			System.out.println("===******* ���� �޴� *******===");
			System.out.println("1. �� ��깰 �߰�");
			System.out.println("2. ���� ����");
			System.out.println("3. ���� ����");
			System.out.println("4. ��깰 ���");
			System.out.println("9. �������� ���ư���");
			System.out.print("�޴� ��ȣ : ");
			int menuNum = Integer.parseInt(sc.nextLine());
			
			switch(menuNum) {
			case 1: addNewKind(); break;
			case 2: removeKind(); break;
			case 3: changeAmount(); break;
			case 4: printFarm(); break;
			case 9: return;
			default : System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���."); break;
			}
		}while(true);
	}
	
	public void customerMenu() {
		System.out.println("~~~~~ ���� KH��Ʈ ��깰 ���� ~~~~~");
		do {
			printFarm();
			System.out.println("===******* �� �޴� *******===");
			System.out.println("1. ��깰 ���");
			System.out.println("2. ��깰 ����");
			System.out.println("3. ������ ��깰 ����");
			System.out.println("9. �������� ���ư���");
			System.out.print("�޴� ��ȣ : ");
			int menuNum = Integer.parseInt(sc.nextLine());
			
			switch(menuNum) {
			case 1: buyFarm(); break;
			case 2: removeFarm(); break;
			case 3: printBuyFarm(); break;
			case 9: return;
			default : System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���."); break;
			}
		}while(true);
	}
	
	public void addNewKind() {
		System.out.println("1.���� / 2.ä�� / 3.�߰�");
		System.out.print("�߰��� ���� ��ȣ : ");
		int kind = Integer.parseInt(sc.nextLine());
		System.out.print("�̸� : ");
		String name = sc.nextLine();
		System.out.print("���� : ");
		int amount = Integer.parseInt(sc.nextLine());
		
		boolean check = false;
		
		switch(kind) {
		case 1:	check = fc.addNewKind(new Fruit("����", name), amount); break;
		case 2: check = fc.addNewKind(new Vegetable("ä��", name), amount); break;
		case 3: check = fc.addNewKind(new Nut("�߰�", name), amount); break;
		default : System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���."); break;
		}
		
		if(check) {
			System.out.println("�� ��깰�� �߰��Ǿ����ϴ�.");
		}else {
			System.out.println("�� ��깰 �߰��� �����Ͽ����ϴ�. �ٽ� �Է����ּ���.");
		};
	}
	
	public void removeKind() {
		System.out.println("1.���� / 2.ä�� / 3.�߰�");
		System.out.print("������ ���� ��ȣ : ");
		int kind = Integer.parseInt(sc.nextLine());
		System.out.print("�̸� : ");
		String name = sc.nextLine();
		
		boolean check = false;
		
		switch(kind) {
		case 1:	check = fc.removeKind(new Fruit("����", name)); break;
		case 2: check = fc.removeKind(new Vegetable("ä��", name)); break;
		case 3: check = fc.removeKind(new Nut("�߰�", name)); break;
		default : System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���."); break;
		}
		
		if(check) {
			System.out.println("��깰 ������ �����Ͽ����ϴ�!!");
		}else {
			System.out.println("��깰 ������ �����Ͽ����ϴ�. �ٽ� �Է����ּ���.");
		};
	}
	
	public void changeAmount() {
		System.out.println("1.���� / 2.ä�� / 3.�߰�");
		System.out.print("������ ���� ��ȣ : ");
		int kind = Integer.parseInt(sc.nextLine());
		System.out.print("�̸� : ");
		String name = sc.nextLine();
		System.out.print("������ ���� : ");
		int amount = Integer.parseInt(sc.nextLine());
		
		boolean check = false;
		
		switch(kind) {
		case 1:	check = fc.changeAmount(new Fruit("����", name), amount); break;
		case 2: check = fc.changeAmount(new Vegetable("ä��", name), amount); break;
		case 3: check = fc.changeAmount(new Nut("�߰�", name), amount); break;
		default : System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���."); break;
		}
		
		if(check) {
			System.out.println("��깰 ������ �����Ǿ����ϴ�.");
		}else {
			System.out.println("��깰 ���� ������ �����Ͽ����ϴ�. �ٽ� �Է����ּ���.");
		};
	}
	
	public void printFarm() {
		// "���� : �̸�(n��)" �������� �������� Ȯ��.
		Set<Farm> set = new HashSet<>(fc.printFarm().keySet());
		Iterator<Farm> it = set.iterator();
		while(it.hasNext()) {
			Farm next = it.next(); // �ܹ��� �̹Ƿ� ������ ��� ���.
			System.out.println(next + "(" +fc.printFarm().get(next) +"��)");
		}
	}
	
	public void buyFarm() {
		System.out.println("1.���� / 2.ä�� / 3.�߰�");
		System.out.print("���� ���� ��ȣ : ");
		int kind = Integer.parseInt(sc.nextLine());
		System.out.print("������ �� : ");
		String name = sc.nextLine();
		
		boolean check = false;
		
		switch(kind) {
		case 1:	check = fc.buyFarm(new Fruit("����", name)); break;
		case 2: check = fc.buyFarm(new Vegetable("ä��", name)); break;
		case 3: check = fc.buyFarm(new Nut("�߰�", name)); break;
		default : System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���."); break;
		}
		
		if(check) {
			System.out.println("���ſ� �����Ͽ����ϴ�!!");
		}else {
			System.out.println("��Ʈ�� ���� �����̰ų� ������ �����ϴ�. �ٽ� �Է����ּ���.");
		};
	}
	
	public void removeFarm() {
		System.out.println("1.���� / 2.ä�� / 3.�߰�");
		System.out.print("��� ���� ��ȣ : ");
		int kind = Integer.parseInt(sc.nextLine());
		System.out.print("���� ����� �� : ");
		String name = sc.nextLine();
		
		boolean check = false;
		
		switch(kind) {
		case 1:	check = fc.removeFarm(new Fruit("����", name)); break;
		case 2: check = fc.removeFarm(new Vegetable("ä��", name)); break;
		case 3: check = fc.removeFarm(new Nut("�߰�", name)); break;
		default : System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���."); break;
		}
		
		if(check) {
			System.out.println("���� ��ҿ� �����Ͽ����ϴ�.");
		}else {
			System.out.println("���� ��Ͽ� �������� �ʽ��ϴ�. �ٽ� �Է����ּ���.");
		};
	}
	
	public void printBuyFarm() {
		Iterator<Farm> it = fc.printBuyFarm().iterator();
		while(it.hasNext()) {
			Farm next = it.next();
			System.out.println(next);
		}
	}
}
