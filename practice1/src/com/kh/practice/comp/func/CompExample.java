package com.kh.practice.comp.func;

import java.util.Scanner;

public class CompExample {
	
	Scanner sc = new Scanner(System.in);
	public void practice1() {
		
//		������ �Է� �޾� ����� ���� 1���� �Է� ���� ������ Ȧ��/¦���� ������
//		Ȧ���� ���ڡ�, ¦���� �������� ����ϵ��� �ϼ���.
//		��, �Է� ���� ���� ����� �ƴϸ� ������� �ƴմϴ١��� ����ϼ���. 
		
		System.out.print("���� : ");
		int num = sc.nextInt();
		
		
		if( num < 1) {
			System.out.println("����� �ƴմϴ�.");
		} else {
			for(int bak = 1; bak <= num; bak++) {
				if( bak % 2 == 0) {
					System.out.print("��");
				} else {
					System.out.print("��");
				}
			}
		}
	}
	
	public void practice2() {
		
//		�� ������ ��� ���� �����ϳ�, 1 �̸��� ���ڰ� �Էµƴٸ�
//		������� �ƴմϴ�.���� ��µǸ鼭 �ٽ� ����ڰ� ���� �Է��ϵ��� �ϼ���.
		
		do {
			System.out.print("���� : ");
			int num = sc.nextInt();
			
			if(num < 1) {
				System.out.println("����� �ƴմϴ�.");
				continue;
			} else {
				for(int bak = 1; bak <= num; bak++) {
					if( bak % 2 == 0) {
						System.out.print("��");
					} else {
						System.out.print("��");
					}
				}
				break;
			}
		}while(true);
	}
	
	public void practice3() {
		
//		����ڷκ��� ���ڿ��� �Է� �ް� ���ڿ����� �˻��� ���ڸ� �Է� �޾� �ش� ���ڿ��� �� ���ڰ�
//		�� �� �ִ��� ������ ����ϼ���.

		System.out.print("���ڿ� : ");
		String string1 = sc.nextLine();
		System.out.print("���� : ");
		char text = sc.nextLine().charAt(0);
		
		int textOfString = 0;
		
		for(int i = 0; i < string1.length(); i++) {
			if(string1.charAt(i) == text) {
				textOfString += 1;
			}
		}
		System.out.println(string1 + " �ȿ� ���Ե� " + text + " ����  : " + textOfString);
	}
	
	public void practice4() {
		
//		�� ������ ��� ���� �����ϰ�, ���� �Ͻðڽ��ϱ�?����� �߰��� ������� �ϼ���.
//		�� ��, N�̳� n�� ������ ���α׷��� ������ Y�� y�� ��� �����ϵ��� �ϵ� Y, y, N, n�� �ƴ�
//		�ٸ� ���ڸ� �Է����� ��� ���߸��� ����Դϴ�. �ٽ� �Է����ּ���.���� ����ϰ�
//		�� �ϰڳĴ� ������ �ݺ��ϼ���.
		
		do {
			System.out.print("���ڿ� : ");
			String string1 = sc.nextLine();
			System.out.print("���� : ");
			char text = sc.nextLine().charAt(0);
			
			int textOfString = 0;
			
			for(int i = 0; i < string1.length(); i++) {
				if(string1.charAt(i) == text) {
					textOfString += 1;
				}
			}
			System.out.println(string1 + " �ȿ� ���Ե� " + text + " ����  : " + textOfString);
			
			String strGo = null;
			do{
				System.out.print("�� �Ͻðڽ��ϱ�? (y/n) : ");
				strGo = sc.nextLine();
				char go = strGo.charAt(0);
				if(go == 'y'|| go == 'Y') {
					break;
				} else if(go == 'n' || go == 'N') {
					break;
				} else {
					System.out.println("�߸��� ����Դϴ�. �ٽ� �Է����ּ���.");
					continue;
				}
			}while(true);
			
			if(strGo.charAt(0) == 'y' || strGo.charAt(0) == 'Y') {
				continue;
			} else {
				break;
			}
		}while(true);
	}
}
