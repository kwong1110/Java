package com.kh.practice.chap02;

import java.util.Scanner;

public class LoopPractice {
	
	Scanner sc = new Scanner(System.in);
	
	public void practice1() {
		
//		����ڷκ��� �� ���� ���� �Է� �޾� 1���� �� ���ڱ����� ���ڵ��� ��� ����ϼ���.
//		��, �Է��� ���� 1���� ũ�ų� ���ƾ� �մϴ�.
//		���� 1 �̸��� ���ڰ� �Էµƴٸ� ��1 �̻��� ���ڸ� �Է����ּ��䡰�� ����ϼ���.
		
		System.out.print("1�̻��� ���ڸ� �Է��ϼ��� : ");
		int num = sc.nextInt();
						
		for(int i = 1; i <= num; i++) {
			System.out.print(i + " ");				
		}
	
		if(num < 1) {
		System.out.println("1 �̻��� ���ڸ� �Է����ּ���.");
		}
	}
	
	public void practice2() {
		
//		�� ������ ��� ���� �����ϳ�, 1 �̸��� ���ڰ� �Էµƴٸ�
//		��1 �̻��� ���ڸ� �Է����ּ��䡱�� ��µǸ鼭 �ٽ� ����ڰ� ���� �Է��ϵ��� �ϼ���.
		
//		��µǸ鼭 �ٽ� ����ڰ� ���� �Է��ϵ��� �ϼ���. = while ��� .
//		�Է��� ���� 1�̸��϶� �� �ݺ��ؾ���. = while 1�̸�.
		
		int num = 0;
		while(num < 1){
			System.out.print("1�̻��� ���ڸ� �Է��ϼ��� : ");
			num = sc.nextInt();	
			for(int i = 1; i <= num; i++) {
				System.out.print(i + " ");
			}
			if(num < 1) {
				System.out.println("1 �̻��� ���ڸ� �Է����ּ���.");
			}
		}
	}
	
	public void practice3() {
		
//		����ڷκ��� �� ���� ���� �Է� �޾� 1���� �� ���ڱ����� ��� ���ڸ� �Ųٷ� ����ϼ���.
//		��, �Է��� ���� 1���� ũ�ų� ���ƾ� �մϴ�.
		
		System.out.print("1�̻��� ���ڸ� �Է��ϼ��� : ");
		int num = sc.nextInt();
						
		for(int i = 0; i < num; i++) {
			System.out.print(num - i + " ");				
		}
	
		if(num < 1) {
		System.out.println("1 �̻��� ���ڸ� �Է����ּ���.");
		}
	}
	
	public void practice4() {
		
//		�� ������ ��� ���� �����ϳ�, 1 �̸��� ���ڰ� �Էµƴٸ�
//		��1 �̻��� ���ڸ� �Է����ּ��䡱�� ��µǸ鼭 �ٽ� ����ڰ� ���� �Է��ϵ��� �ϼ���.
		
		int num = 0;
		while(num < 1){
			System.out.print("1�̻��� ���ڸ� �Է��ϼ��� : ");
			num = sc.nextInt();	
			for(int i = 0; i < num; i++) {
				System.out.print(num - i + " ");
			}
			if(num < 1) {
				System.out.println("1 �̻��� ���ڸ� �Է����ּ���.");
			}
		}
	}
	
	public void practice5() {
		
//		1���� ����ڿ��� �Է� ���� �������� �������� ���� ����ϼ���
		
		System.out.print("������ �ϳ� �Է��ϼ��� : ");
		int num = sc.nextInt();
		int sum = 0;
		for(int i = 1; i <= num; i++) {
			sum += i;
			if(i==num) {
				break;
			}
			System.out.print(i + " + ");
		}
		System.out.println(num + " = " + sum);
	}
	
	public void practice6() {
		
//		����ڷκ��� �� ���� ���� �Է� �޾� �� ������ ���ڸ� ��� ����ϼ���.
//		���� 1 �̸��� ���ڰ� �Էµƴٸ� ��1 �̻��� ���ڸ� �Է����ּ��䡰�� ����ϼ���.
		
		System.out.print("ù ��° ���� : ");
		int num1 = sc.nextInt();
		System.out.print("�� ��° ���� : ");
		int num2 = sc.nextInt();
		
		// ���� ����.
//		if(num1 > num2) {
//			int first = num1;
//			int second = num2;
//		} else if(num2 > num1) {
//			int first = num2;
//			int second = num1;
//		} else {
//			System.out.println("���� �ٸ� ���ڸ� �Է����ּ���.");
//		}
		
		if(num1 < 1 || num2 < 1) {
			System.out.println("1 �̻��� ���ڸ� �Է����ּ���.");
			} else {
			while(num1 < num2) {
				System.out.print(num1 + " ");
				num1++;
			}
			while(num1 >= num2) {
				System.out.print(num2 + " ");
				num2++;
			}
		}
	}
	
	public void practice7() {
		
//		�� ������ ��� ���� �����ϳ�, 1 �̸��� ���ڰ� �Էµƴٸ�
//		��1 �̻��� ���ڸ� �Է����ּ��䡱�� ��µǸ鼭 �ٽ� ����ڰ� ���� �Է��ϵ��� �ϼ���.
		
		int num1 = 0;
		int num2 = 0;
		while(num1 < 1 || num2 < 1){
			System.out.print("ù ��° ���� : ");
			num1 = sc.nextInt();
			System.out.print("�� ��° ���� : ");
			num2 = sc.nextInt();
			if(num1 < 1 || num2 < 1) {
				System.out.println("1 �̻��� ���ڸ� �Է����ּ���.");
				} else {
				while(num1 < num2) {
					System.out.print(num1 + " ");
					num1++;
				}
				while(num1 >= num2) {
					System.out.print(num2 + " ");
					num2++;
				}
			}
		}
	}
	
	public void practice8() {
		
//		����ڷκ��� �Է� ���� ������ ���� ����ϼ���
		// for1 : �� , for1-1 : *.
		
		System.out.print("���� : ");
		int num = sc.nextInt();
		
		for(int dan = 1; dan <= 9; dan++) {
			if(num == dan) {
				System.out.println("==== " + dan + "��" + " ====");
				for(int j = 1; j <= 9; j++) {
					System.out.println(dan + " * " + j + " = " + (dan*j));					
				}
			}
		}
		if(num < 1 || num > 9) {
			System.out.println("1~9������ ���ڸ� �Է����ּ���.");
		}
	}
	
	public void practice9() {
		
//		����ڷκ��� �Է� ���� ������ �ܺ��� 9�ܱ��� ����ϼ���.
//		��, 9�� �ʰ��ϴ� ���ڰ� ������ ��9 ������ ���ڸ� �Է����ּ��䡱�� ����ϼ���.
		
		System.out.print("���� : ");
		int num = sc.nextInt();
		
		for(int dan = 1; dan <= 9; dan++) {
			if(dan < num) {
				continue;
			}
				System.out.println("==== " + dan + "��" + " ====");
				for(int j = 1; j <= 9; j++) {
					System.out.println(dan + " * " + j + " = " + (dan*j));
			}
		}
		if(num > 9) {
			System.out.println("9 ������ ���ڸ� �Է����ּ���.");
		}
	}
	
	public void practice10() {
		
//		�� ������ ��� ���� �����ϳ�, 9�� �ʰ��ϴ� ���ڰ� �Էµƴٸ�
//		��9 ������ ���ڸ� �Է����ּ��䡱�� ��µǸ鼭 �ٽ� ����ڰ� ���� �Է��ϵ��� �ϼ���.

//		���� ���� ������شٸ�..for ���� if �߰��ؼ� �ǹ� if�� else�� �ٲ��ٰ�.

		int num = 0;
		while(num > 9 || num <= 0){
			System.out.print("���� : ");
			num = sc.nextInt();
			
			for(int dan = 1; dan <= 9; dan++) {
				if(dan < num) {
					continue;
				}
					System.out.println("==== " + dan + "��" + " ====");
					for(int j = 1; j <= 9; j++) {
						System.out.println(dan + " * " + j + " = " + (dan*j));
				}
			}
			if(num > 9) {
				System.out.println("9 ������ ���ڸ� �Է����ּ���.");
			}
		}
	}
	
	public void practice11() {
		
//		����ڷκ��� ���� ���ڿ� ������ �Է� �޾�
//		������ ������ ���ڰ� Ŀ���ų� �۾����� ���α׷��� �����ϼ���.
//		��, ��µǴ� ���ڴ� �� 10���Դϴ�.
//		* ���������� ���ڵ� ���̿��� ������ ������ ���� �����ϴ� ���� ���Ѵ�.
//		ex) 2, 7, 12, 17, 22 ��
//			  5  5   5   5 => ���⼭ ������ 5
		
		// ���Ƚ�� = 10;  
		
		System.out.print("���� ���� : ");
		int fNum = sc.nextInt();
		System.out.print("���� : ");
		int operatorNum = sc.nextInt();
				
		int maxPrint = 10;
		int num = fNum;
		
		
		while(operatorNum > 0 && num < fNum + (operatorNum * maxPrint)) {
			System.out.print(num + " ");
			num += operatorNum;
		}
		while(operatorNum < 0 && num > fNum + (operatorNum * maxPrint)) {
			System.out.print(num + " ");
			num += operatorNum;
		}
		
//		if(operatorNum > 0) {
//			while(num < fNum + (operatorNum * maxPrint)) {
//				System.out.print(num + " ");
//				num += operatorNum;
//			}
//		} else if(operatorNum < 0) {
//			while(num > fNum + (operatorNum * maxPrint)) {
//				System.out.print(num + " ");
//				num += operatorNum;
//			}
//		} else {
//			System.out.println("������ 0�� �� �� �����ϴ�.");
//		}
	}
	
	public void practice12() {
		
//		���� �� ���� �����ڸ� �Է� �ް� �Էµ� �����ڿ� ���� �˸��� ����� ����ϼ���.
//		��, �ش� ���α׷��� ������ �Է¿� ��exit����� ���� ���� ������ ���� �ݺ��ϸ�
//		exit�� ������ �����α׷��� �����մϴ�.���� ����ϰ� �����մϴ�.
//		���� �����ڰ� �������̸鼭 �� ��° ������ 0���� ������
//		��0���� ���� �� �����ϴ�. �ٽ� �Է����ּ���.���� ����ϸ�,
//		���� �����ڰ� ���� �� ������ �������Դϴ�. �ٽ� �Է����ּ���.����� ����ϰ�
//		�� ��� ��� ó������ ���ư� ����ڰ� �ٽ� �����ں��� �Է��ϵ��� �ϼ���.
		
		//������ ���� �����غ���.
		String strOp = " ";
		do {
			System.out.print("������(+, -, *, /, %) : ");
			strOp = sc.nextLine();
			char op = strOp.charAt(0);
			if(strOp.equals("exit")) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}
			System.out.print("����1 : ");
			int num1 = sc.nextInt();
			System.out.print("����2 : ");
			int num2 = sc.nextInt();
			sc.nextLine();
			
			if( op == '/' && num2 == 0) {
				System.out.println("0���� ���� �� �����ϴ�. �ٽ� �Է����ּ���.");
				continue;
			}
			
			double result = 0;
			switch(op) {
			case '+': result = num1 + num2; break;
			case '-': result = num1 - num2; break;
			case '*': result = num1 * num2;	break;
			case '/': result = num1 / num2;	break;
			case '%': result = num1 % num2;	break;
			default : System.out.println("���� �������Դϴ�. �ٽ� �Է����ּ���.");
			}
			
			if(op == '+' || op == '-' || op == '*' || op == '/') {
				System.out.println(num1 + " " + op + " " + num2 + " = " + result);
			} 
		} while(!strOp.equals("exit"));
	}
	
	public void practice13() {
		
//		������ ���� ���� ������ �����ϼ���.
//		ex.
//		���� �Է� : 4
//		*
//		**
//		***
//		****
		
		// ���ٿ� *�� == �� �� ��
		
		System.out.print("���� �Է� : ");
		int num = sc.nextInt();
		
		for(int row = 1; row <= num; row++) {
			for(int star = 1; star <= row; star++) {
				System.out.print("*");
				}
			System.out.println();
			}
	}
	
	public void practice14() {
		
//		������ ���� ���� ������ �����ϼ���.
//		ex.
//		���� �Է� : 4
//		****
//		***
//		**
//		*
		
		System.out.print("���� �Է� : ");
		int num = sc.nextInt();
		
		for(int row = 1; row <= num; row++) {
			for(int star = num; star >= row; star--) {
				System.out.print("*");
				}
			System.out.println();
			}
	}
}
