package com.kh.hw.controller;

import java.util.Scanner;

public class Function {
	
	Scanner sc = new Scanner(System.in);
	public void calculator() {
		
//		���� �� ���� ������ �ϳ��� Ű����� �Է� �޾� �� ������ int������, ���깮�ڴ� char�� ����
//		���깮�ڰ� +�̸� �� ������ �� ���, -�̸� �� ������ �� ���, x �Ǵ� X�̸� �� ������ ��,
//		/�̸� �� ������ ������ ���̳� ������ ��(�� ��° ��)�� 0�̸� ��0���� ���� �� �����ϴ�.�� ����ϰ�
//		��� ���� 0���� ó��
		
		System.out.print("ù ��° ���� : ");
		int num1 = sc.nextInt();
		System.out.print("�� ��° ���� : ");
		int num2 = sc.nextInt();
		System.out.print("������(+, -, x, /) : ");
		sc.nextLine();
		char op = sc.nextLine().charAt(0);
		
		double result = 0;
		
		switch(op) {
		case '+': result = num1 + num2; break;
		case '-': result = num1 - num2; break;
		case '*': result = num1 * num2; break;
		case '/': if(num1 < num2 || num2 == 0) {
			System.out.println("0���� ���� �� �����ϴ�.");
		}else{
			result = (double)num1 / num2;
		}; break;
		default : System.out.println("�����ڴ� (+, -, x, /) �� �Է����ּ���.");
		}
		
		if(op == '/' && !(num1 < num2 || num2 == 0)) {
			System.out.printf("%d %c %d = %f", num1, op, num2, result);
			System.out.println();
		}else if(op == '+' || op == '-' || op == '*' || op == '%'||
				(op == '/' && num1 < num2 || num2 == 0)) {
			System.out.printf("%d %c %d = %d", num1, op, num2, (int)result);
			System.out.println();
		}
	}
	
	public void totalCalculator() {
		
//		Ű����� ���� �� ���� �Է� �޾� �� ���� �� ���� ���� ���� ������ ū ���� ���� ������ ���
//		���� ������ ū ������ ���� �հ踦 ����
		
		System.out.print("ù ��° ���� : ");
		int num1 = sc.nextInt();
		System.out.print("�� ��° ���� : ");
		int num2 = sc.nextInt();
		
		int small = 0;
		int big = 0;
		int result = 0;
		
		if(num1 > num2) {
			small = num2;
			big = num1;
		} else {
			small = num1;
			big = num2;
		}
		for(int i = small; i <= big; i++) {
			result += i;
		}
		
		System.out.println("1���� 3���� �������� �� : " + result);
	}
	
	public void printProfile() {
		
//		�Ż� �������� �ڷ����� ���� ������ ����ϰ� ������ ��ϵ� �� ���
		
		System.out.print("�̸� : ");
		String name = sc.nextLine();
//		sc.nextLine();
		System.out.print("���� : ");
		int age = sc.nextInt();
		System.out.print("���� : ");
		sc.nextLine();
		String gender = sc.nextLine();
		System.out.print("���� : ");
		String character = sc.nextLine();
		
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + age);
		System.out.println("���� : " + gender);
		System.out.println("���� : " + character);
	}
	
	public void printScore() {
		
//		Ű����� �Է� ���� ������ ������ ����Ͽ� ���� ���� ȭ�鿡 ���
//		������ 90�� �̻��̸� A����, 80�̻� 90�̸��̸� B, 70�̻� 80�̸��̸� C,
//		60�̻� 70�̸� D, 60�̸� F������ �ű�

		System.out.print("�̸� : ");
		String name = sc.nextLine();
		System.out.print("�г� : ");
		int grade = sc.nextInt();
		System.out.print("�� : ");
		int group = sc.nextInt();
		System.out.print("�� : ");
		int num = sc.nextInt();
		System.out.print("����(M/F) : ");
		sc.nextLine();
		char charGender = sc.nextLine().charAt(0);
		System.out.print("���� : ");
		double score = sc.nextDouble();
		
		String gender = null;
		if( charGender == 'M' || charGender == 'm') {
			gender = "���л�";
		} else if ( charGender == 'F' || charGender == 'f') {
			gender = "���л�";
		}
		
		char result = ' ';
		
		if(score >= 90) {
			result = 'A';
		} else if(score >= 80) {
			result = 'B';
		} else if(score >= 70) {
			result = 'C';
		} else if(score >= 60) {
			result = 'D';
		} else {
			result = 'F';
		}
		
		System.out.printf("%d�г� %d�� %d�� %s %s�� ������ %g�̰� %c�����Դϴ�.", 
				grade, group, num, gender, name, score, result);
	}
	
	public void printStarNumber() {
		
//		������ �ϳ� �Է� �޾� �� ���� ����� ���� �Էµ� ���� �� ���� �����Ͽ� �Ʒ��� ���� ���
//		���� : 5
//		1 
//		*2
//		**3
//		***4
//		****5				// ������ �ƴҶ� "����� �ƴմϴ�." ���.
		// �ټ��� ������ ��ġ�ϸ� �ټ� ���, �׷��� �ʴٸ� �� ���
		// 
		
		System.out.print("���� : ");
		int num = sc.nextInt();
		
		if(0 < num) {
			for(int row = 1; row <= num; row++) {
				for(int star = 1; star <= row; star++) {
					if(row == star) {
						System.out.println(row);
						break;
					}
					System.out.print("*");
				}			
			}
		} else {
			System.out.println("����� �ƴմϴ�.");
		}
	}
	
	public void sumRandom() {
		
		// 1���� 100 ������ ���� �� ������ ������ �ϳ� �߻����� 1���� ���� �������� �հ� ���
		
		int random = (int)(Math.random()*100) + 1;
		int sum = 0;
		
		for(int i = 1; i <= random; i++) {
			sum += i;
		}
		
		System.out.print("1���� " + random + "������ �� : " + sum);
	}
	
	public void exceptGugu() {
		
		// ������ �ϳ� �Է� �޾� �� ���� ����� ���� �� ���� ������ ���
		// �� ���ϱ� ���� �Է� ���� ���� ����� ��� ��� ����
		
		System.out.print("���� : ");
		int num = sc.nextInt();
		
		for(int dan = 1; dan <= 9; dan++) {
			if(dan == num) {
				for(int i = 1; i <= 9; i++) {
					if(i % num != 0) {
						System.out.println(dan + " * " + i + " = " + (dan * i));
					}
				}
			}
		}
	}
	
	public void diceGame() {
		
//		�� ���� �ֻ����� ���� �� �ִ� ��� ����� ���� �������� ���ϰ�
//		�������� ������ �� �ֻ��� ���� ���� �Էµ� ���� ���� ��� ��������ϴ١� ���,
//		�Է� ���� �ٸ��� ��Ʋ�Ƚ��ϴ١� ����Ͽ� ���� ������ �ݺ�
//		���� ���߸� ����� �Ͻðڽ��ϱ�? (y/n) : ���� ��µǰ�
//		��y�� �Ǵ� ��Y�� �Է� �� ���ο� ���� ���� �������� ó������ �ٽ� ����, ��n�� �Ǵ� ��N�� �Է� �� ����
		
				
		do {
			int random = (int)(Math.random()*12) + 1;
			char go = ' ';
			
			System.out.print("�ֻ��� �� ���� ���� ���纸����(1~12�Է�) : ");
			int sum = sc.nextInt();
			
			if(random != sum) {
				System.out.println("Ʋ�Ƚ��ϴ�.");
				continue;
			} else {
				System.out.println("�����Դϴ�.");
				System.out.println("�ֻ����� �� : " + random);
				sc.nextLine();
					do {
						System.out.print("��� �Ͻ� �ڽ��ϱ�?(y/n) : ");
						go = sc.nextLine().charAt(0);
						if( go == 'y' || go == 'Y') {
							break;
						} else if( go == 'n' || go == 'N') {
							System.out.println("�����մϴ�.");
							break;
						} else {
							System.out.println("y/n �߿� �Է��� �ּ���.");
							continue;
						}
					} while(true);
				}
			if( go == 'y' || go == 'Y') {
				continue;
			} else {
				break;
			}
		}while(true);
	}
}
