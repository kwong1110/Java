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
			
			if(computer == user) {
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
}
