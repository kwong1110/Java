package com.kh.practice.func;

import java.util.Scanner;

public class VariablePractice4 {
	
	public void practice4() {
		
		// ���� ���ڿ� ���� Ű����� �Է� �޾� ���ڿ��� �տ��� �� ���� ����ϼ���.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ڿ��� �Է��ϼ��� : ");
		String textLine = sc.nextLine();
		System.out.println("ù ��° ���� : " + textLine.charAt(0));
		System.out.println("�� ��° ���� : " + textLine.charAt(1));
		System.out.println("�� ��° ���� : " + textLine.charAt(2));
		
	}
}
