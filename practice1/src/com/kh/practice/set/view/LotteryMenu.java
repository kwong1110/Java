package com.kh.practice.set.view;

import java.util.Iterator;
import java.util.Scanner;

import com.kh.practice.set.controller.LotteryController;
import com.kh.practice.set.model.vo.Lottery;

public class LotteryMenu {

	private Scanner sc = new Scanner(System.in);
	private LotteryController lc = new LotteryController();
	
	public void mainMenu() {
		System.out.println("========== KH ��÷ ���α׷� ==========");
		
		do {
			System.out.println("=====***** ���� �޴� *****=====");
			System.out.println("1. ��÷ ��� �߰�");
			System.out.println("2. ��÷ ��� ����");
			System.out.println("3. ��÷ ��� Ȯ��");
			System.out.println("4. ���ĵ� ��÷ ��� Ȯ��");
			System.out.println("5. ��÷ ��� �˻�");
			System.out.println("9. ����.");
			System.out.print("�޴� ��ȣ ���� : ");
			int menuNum = Integer.parseInt(sc.nextLine());
			
			switch(menuNum) {
			case 1: insertObject(); break;
			case 2: deleteObject(); break;
			case 3: winObject(); break;
			case 4: sortedWinObject(); break;
			case 5: searchWinner(); break;
			case 9: System.out.println("���α׷� ����."); return;
			default : System.out.println("�߸� �Է��Ͽ����ϴ�. �ٽ� �Է����ּ���"); break;
			}
		} while(true);
	}
	
	public void insertObject() {
		System.out.print("�߰��� ��÷ ��� �� : ");
		int person = Integer.parseInt(sc.nextLine());
		for(int i = 0; i < person; i++) {
			System.out.print("�̸� : ");
			String name = sc.nextLine();
			System.out.print("�ڵ��� ��ȣ('-'����) : ");
			String phone = sc.nextLine();
			Lottery l = new Lottery(name, phone);
			if(lc.insertObject(l)) {
				System.out.println("�ߺ��� ����Դϴ�. �ٽ� �Է��ϼ���.");
				i--;
				continue;
			}
		}
		System.out.println();
		System.out.println(person + "�� �߰� �Ϸ�Ǿ����ϴ�.");
	}
	
	public void deleteObject() {
		System.out.println("������ ����� �̸��� �ڵ��� ��ȣ�� �Է��ϼ���.");
		System.out.print("�̸� : ");
		String name = sc.nextLine();
		System.out.print("�ڵ��� ��ȣ('-'����) : ");
		String phone = sc.nextLine();
		Lottery l = new Lottery(name, phone);
		if(lc.deleteObject(l)) {
			System.out.println("���� �Ϸ� �Ǿ����ϴ�.");
		} else {
			System.out.println("�������� �ʴ� ����Դϴ�.");
		}
	}
	
	public void winObject() {
		if(lc.winObject() != null) {
			System.out.println(lc.winObject());
		} else {
			System.out.println("��÷�� ���� 4�� �̻��̾�� �մϴ�.");
		}
	}
	
	public void sortedWinObject() {
		Iterator<Lottery> it = lc.sortedWinObject().iterator();
		if(lc.sortedWinObject() != null)
			while(it.hasNext()) {
				System.out.println(it.next());
		} else {
			System.out.println("��÷�ڰ� �����ϴ�. ��÷�ڸ� Ȯ�� ���ּ���.");
		}
	}
	
	public void searchWinner() {
		System.out.println("�˻��� ����� �̸��� �ڵ��� ��ȣ�� �Է��ϼ���.");
		System.out.print("�̸� : ");
		String name = sc.nextLine();
		System.out.print("�ڵ��� ��ȣ('-'����) : ");
		String phone = sc.nextLine();
		Lottery searchL = new Lottery(name, phone);
		if(lc.searchWinner(searchL)) {
			System.out.println("�����մϴ�~~. ��÷ ��Ͽ� �����մϴ�!!");
		} else {
			System.out.println(";; ��Ÿ������... ��÷ ��Ͽ� �������� �ʽ��ϴ�...");
		}
	}
}
