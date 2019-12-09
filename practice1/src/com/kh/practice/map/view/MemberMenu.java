package com.kh.practice.map.view;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

import com.kh.practice.map.controller.MemberController;
import com.kh.practice.map.model.vo.Member;

public class MemberMenu {

	private Scanner sc = new Scanner(System.in);
	private MemberController mc = new MemberController();
	
	public void mainMenu() {
		System.out.println("========== KH ����Ʈ ==========");
		
		System.out.println("===*******  ���� �޴�  *******===");
		
		do {
			System.out.println("1. ȸ������");
			System.out.println("2. �α���");
			System.out.println("3. ���� �̸� ȸ�� ã��");
			System.out.println("9. ����");
			System.out.print("�޴� ��ȣ  : ");
//			String menuNumS = sc.nextLine();
			int menuNum = Integer.parseInt(sc.nextLine());
			
			switch(menuNum) {
			case 1: joinMembership(); break;
			case 2: login(); memberMenu(); break;
			case 3: sameName(); break;
			case 9: System.out.println("���α׷� ����"); return;
			default : System.out.println("�߸� �Է��Ͽ����ϴ�. �ٽ� �Է����ּ���."); break;
			}
		} while(true);
	}
	
	public void memberMenu() {
		System.out.println("=====***** ȸ�� �޴� *****=====");
		do {
			System.out.println("1. ��й�ȣ �ٲٱ�");
			System.out.println("2. �̸� �ٲٱ�");
			System.out.println("3. �α׾ƿ�");
			System.out.print("�޴� ��ȣ  : ");
			int menuNum = Integer.parseInt(sc.nextLine());
			
			switch(menuNum) {
			case 1: changePassword(); break;
			case 2: changeName(); break;
			case 3: System.out.println("�α׾ƿ� �Ǿ����ϴ�."); return;
			default : System.out.println("�߸� �Է��Ͽ����ϴ�. �ٽ� �Է����ּ���."); break;
			}
		} while(true);
	}
	
	public void joinMembership() {
		System.out.print("���̵� : ");
		String id = sc.nextLine();
		System.out.print("��й�ȣ : ");
		String password = sc.nextLine();
		System.out.print("�̸� : ");
		String name = sc.nextLine();
		
		Member m = new Member(password, name);
		if(mc.joinMembership(id, m)) {
			System.out.println("���������� ȸ������ �Ϸ��Ͽ����ϴ�.");
		} else {
			System.out.println("�ߺ��� ���̵��Դϴ�. �ٽ� �Է����ּ���.");
		}
	}
	
	public void login() {
		do {
			System.out.print("���̵� : ");
			String id = sc.nextLine();
			System.out.print("��й�ȣ : ");
			String password = sc.nextLine();
			
			if(mc.login(id, password) != null) {
				System.out.println(mc.login(id, password) + "��, ȯ���մϴ�!");
				break;
			} else {
				System.out.println("Ʋ�� ���̵� �Ǵ� ��й�ȣ�Դϴ�. �ٽ� �Է����ּ���.");
			}
		} while(true);
	}
	
	public void changePassword() {
		do {
			System.out.print("���̵� : ");
			String id = sc.nextLine();
			System.out.print("���� ��й�ȣ : ");
			String oldPw = sc.nextLine();
			System.out.print("���ο� ��й�ȣ : ");
			String newPw = sc.nextLine();
	
			if(mc.changePassword(id, oldPw, newPw)) {
				System.out.println("��й�ȣ ���濡 �����߽��ϴ�!!");
				break;
			} else {
				System.out.println("��й�ȣ ���濡 �����߽��ϴ�. �ٽ� �Է����ּ���...");
			}
		} while(true);
	}
	
	public void changeName() {
		do {
			System.out.print("���̵� : ");
			String id = sc.nextLine();
			System.out.print("��й�ȣ : ");
			String password = sc.nextLine();
			
			System.out.println("���� ������ �̸� : " + mc.login(id, password));
			System.out.print("������ �̸� : ");
			String newName = sc.nextLine();
			
			if(mc.login(id, password) != null) {
				mc.changeName(id, newName);
				System.out.println("�̸� ���濡 �����Ͽ����ϴ�!!!");
				break;
			} else {
				System.out.println("�̸� ���濡 �����߽��ϴ�;;");
				System.out.println("���̵�� ��й�ȣ�� Ȯ�� �� �ٽ� �Է����ּ���...");
			}
		}while(true);
	}
	
	public void sameName() {
		System.out.print("�˻��� �̸� : ");
		String name = sc.nextLine();
		
		TreeMap<String, String> tMap = mc.sameName(name);
		
		if(tMap.size() != 0) {
			Set<Entry<String, String>> set = tMap.entrySet();
			Iterator<Entry<String, String>> it = set.iterator();
			
			while(it.hasNext()) {
				Entry<String, String> e = it.next();
				System.out.println(e.getValue() + " - " + e.getKey());
			}
			
//			for(Entry<String, String> e : set) {
//				System.out.println(e.getKey() + " - " + e.getValue());
//			}
		} else {
			System.out.println("�˻��Ͻ� �̸��� �����ϴ�.");
		}
	}
}
