package com.kh.practice.comp.func;

import java.util.Scanner;

public class RockPaperScissors {

	public void rps() {
		
//		������� �̸��� �Է��ϰ� ��ǻ�Ϳ� ������������ �ϼ���. ��ǻ�Ͱ� �������� ������ �ָ�������
//		������ ���� ���ؼ� �����ϵ��� �ϰ�, ����ڿ��Դ� ���� ������������ ��������.
//		����ڰ� ��exit���� �Է��ϱ� ������ ������������ ��� �����ϰ� ��exit���� ���� �ݺ��� ���߰�
//		�� ���� �ºο��� �� �� �̱�� �� �� ���� �� �� ������ ����ϼ���.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("����� �̸��� �Է����ּ��� : ");
		String name = sc.nextLine();
		
		int totalGame = 0;
		int win = 0;
		int draw = 0;
		int lose = 0;
		
		while(true) {
			System.out.print("���������� : ");
			String user = sc.nextLine();
			if(user.equals("exit")) {
				break;
			}
			if(!user.equals("����") && !user.equals("����") && !user.equals("��")) {
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
				continue;
			}
			int random = (int)(Math.random()*3) + 1;
			String computer = null;
			switch(random) {
			case 1: computer = "����"; break; 
			case 2: computer = "����"; break;
			case 3: computer = "��"; break;
			}
			System.out.println("��ǻ�� : " + computer);
			System.out.println(name + " : " + user);
			
			if(computer.equals(user)) {
				System.out.println("�����ϴ�.");
				draw += 1;
			} else if(computer.equals("����") && user.equals("����") ||
					computer.equals("����") && user.equals("��") ||
					computer.equals("��") && user.equals("����")) {
				System.out.println("�̰���ϴ� !");
				win += 1;
			} else {
				System.out.println("�����ϴ� �Ф�");
				lose += 1;
			}
			totalGame++;
		}
		System.out.printf("%d�� %d�� %d�� %d��", totalGame, win, draw, lose);
	}
	
	public void rpsKh() {
			Scanner sc = new Scanner(System.in);
			System.out.print("����� �̸��� �Է����ּ��� : ");
			String name = sc.nextLine();
			
			int count = 0; 	// n��
			int win = 0;	// n��
			int draw = 0;	// n��
			
			String winStr = "�̰���ϴ� !";
			String loseStr = "�����ϴ٤Ф�";
		
			while(true) {
			int comInt = (int)(Math.random() * 3);
			String comStr = null;
			switch(comInt) {
			case 0 : comStr = "����"; break;
			case 1 : comStr = "����"; break;
			case 2 : comStr = "��"; break;
			}
			System.out.print("���������� : ");
			String userStr = sc.nextLine();
			
			String result = null;
			
			if(userStr.equals("����") || userStr.equals("����") || userStr.equals("��")) {
				if(comStr.equals(userStr)) {
					result = "�����ϴ�.";
					draw++;
				} else {
					if(comStr.equals("����")) {
						switch(userStr) {
						case "����": result = winStr; win++; break;
						case "��" : result = loseStr; break;
						}
					} else if(comStr.equals("����")) {
						if(userStr.equals("��")) {
							result = winStr;
							win++;
						} else {
							result = loseStr;
						}
					} else {
						result = userStr.equals("����") ? winStr : loseStr;
						if(result.equals(winStr)) {
							win++;
						}
					}
				}
			} else if(!userStr.equals("exit")) {
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
				continue;
			} else {
				break;
			}
			count++;
			System.out.println("��ǻ�� : " + comStr);
			System.out.println(name + " : " + userStr);
			System.out.println(result);
		}
		System.out.printf("%d�� %d�� %d�� %d��", count, win, draw, (count-win-draw));
	}
	
	public void rpsPractice() {
		Scanner sc = new Scanner(System.in);
		System.out.print("����� �̸��� �Է����ּ��� : ");
		String name = sc.nextLine();
		// ������ ������ ������ ����
		int total = 0;
		int win = 0;
		int draw = 0;
		int lose = 0;
					
		do {
			System.out.print("���������� : ");
			String userRps = sc.nextLine();
			if(userRps.equals("exit")) { // equals ���� ������ �ֳ� Ȯ��.
				break;
			} else if(!userRps.equals("����") && !userRps.equals("����") && !userRps.equals("��")) {
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
				continue;
			}
			
			// ��ǻ���� ������������ �����ش�.
			int ranRps = (int)(Math.random() * 3);
			String comRps = "";
			switch(ranRps){
				case 0: comRps = "����"; break; 
				case 1: comRps = "����"; break; 
				case 2: comRps = "��"; break; 
			}
					
			System.out.println("��ǻ�� : " + comRps);
			System.out.println(name + " : " + userRps);
			
			if(userRps.equals(comRps)) {
				System.out.println("�����ϴ�.");
				draw++;
			} else if(userRps.equals("����") && comRps.equals("��") 
					|| userRps.equals("����") && comRps.equals("����")
					||userRps.equals("��") && comRps.equals("����")) {
				System.out.println("�̰���ϴ�!!");
				win++;
			} else {
				System.out.println("�����ϴ٤̤�");
				lose++;
			}
			total++;
		}while(true);
		System.out.printf("%d�� %d�� %d�� %d��", total, win, draw, lose);
	}
}
