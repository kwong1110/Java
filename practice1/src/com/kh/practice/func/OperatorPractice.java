package com.kh.practice.func;

import java.util.Scanner;

public class OperatorPractice {
	
	Scanner sc = new Scanner(System.in);
	
	public void practice1() {
		
		// Ű����� �Է� ���� �ϳ��� ������ ����̸� "�����", ����� �ƴϸ� "����� �ƴϴ�"�� ����ϼ���.
		
		System.out.print("���� : ");
		int positive = sc.nextInt();
		System.out.print( positive > 0 ? "�����" : "����� �ƴϴ�" );
	}
	
	public void practice2() {
		
		// Ű����� �Է� ���� �ϳ��� ������ ����̸� "�����",
		// ����� �ƴ� ��� �߿��� 0�̸� "0�̴�", 0�� �ƴϸ� "������"�� ����ϼ���.
		
		System.out.print("���� : ");
		int num = sc.nextInt();
		System.out.print( num > 0 ? "�����" : ( num == 0 ? "0�̴�" : "������" ) );
	}
	
	public void practice3() {
		
		// Ű����� �Է� ���� �ϳ��� ������ ¦���̸� "¦����", ¦���� �ƴϸ� "Ȧ����"�� ����ϼ���.
		
		System.out.print("���� : ");
		int num = sc.nextInt();
		System.out.print( num % 2 == 0 ? "¦����" : "Ȧ����");
	}

	public void practice4() {
		
		// ��� ����� ������ ���� ������������ �Ѵ�. �ο� ���� ���� ������ Ű����� �Է� �ް�
		// 1�δ� �����ϰ� �������� ���� ������ �����ְ� ���� ������ ������ ����ϼ���.
		
		System.out.print("�ο� �� : ");
		int people = sc.nextInt();
		System.out.print("���� ���� : ");
		int totalCandy = sc.nextInt();
		System.out.println("1�δ� ���� ���� : " + ( totalCandy / people ));
		System.out.print("���� ���� ���� : " + ( totalCandy % people ));
	}
	
	public void practice5() {
		
		// Ű����� �Է� ���� ������ ������ ����ϰ� ����� ���� ���� ȭ�鿡 ����Ͽ� Ȯ���ϼ���.
		// �� �� ������ 'M'�̸� ���л�, 'M'�� �ƴϸ� ���л����� ��� ó�� �ϼ���.
		
		System.out.print("�̸� : ");
		String name = sc.nextLine();
		System.out.print("�г�(���ڸ�) : ");
		int grade = sc.nextInt();
		System.out.print("��(���ڸ�) : ");
		int gradeClass = sc.nextInt();
		System.out.print("��ȣ(���ڸ�) : ");
		int num = sc.nextInt();
		System.out.print("����(M/F) : ");
		char gender = sc.next().charAt(0);
		System.out.print("����(�Ҽ��� �Ʒ� ��°�ڸ�����) : ");
		double result = sc.nextDouble();
		System.out.println(" ");
		
		System.out.println(grade + "�г� " + gradeClass + "�� " + 
				num + "�� " + name + " " + ( gender=='M' ? "��" : "��") + "�л��� ������ " + result + "�̴�.");
	}
	
	public void practice6() {
		
		// ���̸� Ű����� �Է� �޾� ���(13�� ����)����, û�ҳ�(13�� �ʰ� ~ 19�� ����)����,
		// ����(19�� �ʰ�)���� ����ϼ���.
		
		System.out.print("���� : ");
		int age = sc.nextInt();
		System.out.print( age <= 13 ? "���" : ( age <= 19 ? "û�ҳ�" : "����" ));
	}
	
	public void practice7() {
		
//		����, ����, ���п� ���� ������ Ű���带 �̿��� ������ �Է� �ް�,
//		�� ���� ���� �հ�(����+����+����)�� ���(�հ�/3.0)�� ���ϼ���.
//		�� ������ ������ ����� ������ �հ� ���θ� ó���ϴµ�
//		�� ���� ������ ���� 40�� �̻��̸鼭 ����� 60�� �̻��� �� �հ�, �ƴ϶�� ���հ��� ����ϼ���.
		
		System.out.print("���� : ");
		int korean = sc.nextInt();
		System.out.print("���� : ");
		int english = sc.nextInt();
		System.out.print("���� : ");
		int math = sc.nextInt();
		double average = (double)((korean + english + math) / 3.0);
		System.out.println(" ");
		
		System.out.println("�հ� : " + (korean + english + math));
		System.out.println("��� : " + average );
		System.out.println( korean >= 40 && math >= 40 && english >= 40 
				&& average >= 60 ? "�հ�" : "���հ�" );
	}
	
	public void practice8() {
		
		// �ֹι�ȣ�� �̿��Ͽ� �������� �������� �����Ͽ� ����ϼ���.
		
		System.out.print("�ֹι�ȣ�� �Է��ϼ���(- ����) : ");
		char idCardNumber = sc.nextLine().charAt(7);
		System.out.println(" ");
		
		System.out.println( idCardNumber % 2 == 0 ? "����" : "����" );
	}
	
	public void practice9() {
		
//		Ű����� ���� �� ���� �Է� �޾� ���� ����(num1, num2)�� �����ϼ���.
//		�׸��� �� �ٸ� ������ �Է� �޾� �� ���� num1 ���ϰų� num2 �ʰ��̸� true�� ����ϰ�
//		�ƴϸ� false�� ����ϼ���.
//		(��, num1�� num2���� �۾ƾ� ��)
		
		System.out.print("����1 : ");
		int num1 = sc.nextInt();
		System.out.print("����2(����1���� ū ��) : ");
		int num2 = sc.nextInt();
		System.out.print("�Է� : ");
		int inputNum = sc.nextInt();
		System.out.println(" ");
		
		System.out.print( inputNum <= num1 || inputNum > num2 );
	}
	
	public void practice10() {
		
		// 3���� ���� Ű����� �Է� �޾� �Է� ���� ���� ��� ������ true, �ƴϸ� false�� ����ϼ���.
		
		System.out.print("�Է�1 : ");
		int num1 = sc.nextInt();
		System.out.print("�Է�2 : ");
		int num2 = sc.nextInt();
		System.out.print("�Է�3 : ");
		int num3 = sc.nextInt();
		System.out.println(" ");
		
		System.out.print( num1 == num2 && num1 == num3 && num2 == num3 );
	}
	
	public void practice11() {
		
//		A, B, C ����� ������ �Է� �ް� �� ����� ������ �μ�Ƽ�긦 ������ ������ ����Ͽ� ����ϰ�
//		�μ�Ƽ�� ���� �޿��� 3000���� �̻��̸� ��3000 �̻�, �̸��̸� ��3000 �̸����� ����ϼ���.
//		(A ����� �μ�Ƽ��� 0.4, B ����� �μ�Ƽ��� ������, C ����� �μ�Ƽ��� 0.15)
		
		System.out.print("A����� ���� : ");
		int salaryA = sc.nextInt(); 
		System.out.print("B����� ���� : ");
		int salaryB = sc.nextInt();
		System.out.print("C����� ���� : ");
		int salaryC = sc.nextInt();
		
		double totalSalaryA = salaryA * 1.4;
		double totalSalaryB = salaryB * 1;
		double totalSalaryC = salaryC * 1.15;
		System.out.println(" ");
		
		System.out.println("A����� ����/����+a : " + salaryA + "/" + totalSalaryA);
		System.out.println(totalSalaryA >= 3000 ? "3000 �̻�" : "3000 �̸�");
		System.out.println("B����� ����/����+a : " + salaryB + "/" + totalSalaryB);
		System.out.println(totalSalaryB >= 3000 ? "3000 �̻�" : "3000 �̸�");
		System.out.println("C����� ����/����+a : " + salaryC + "/" + totalSalaryC);
		System.out.println(totalSalaryC >= 3000 ? "3000 �̻�" : "3000 �̸�");
	}
}
