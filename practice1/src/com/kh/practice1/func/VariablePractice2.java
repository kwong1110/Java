package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice2 {
	
	public void practice2() {
		
		// Ű����� ���� �� ���� �Է� �޾� �� ���� ��, ��, ��, �������� ���� ����ϼ���.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ù ��° ������ �Է� : ");
		int firstInt = sc.nextInt();
		System.out.print("�� ��° ������ �Է� : ");
		int secondInt = sc.nextInt();
		
		System.out.println("���ϱ� ��� : " + (firstInt + secondInt));
		System.out.println("���� ��� : " + (firstInt - secondInt));
		System.out.println("���ϱ� ��� : " + (firstInt * secondInt));
		System.out.println("������ �� ��� : " + (firstInt / secondInt));
	}
}
