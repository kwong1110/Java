package com.kh.practice.func;

import java.util.Scanner;

public class CastingPractice1 {

	public void practice1() {
		
		// Ű����� ���� �ϳ��� �Է� �޾� �� ������ �����ڵ带 ����ϼ���.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� : ");
		char text1 = sc.nextLine().charAt(0);
		int intText = text1;
		System.out.println( text1 + " unicode : " + intText );
	}
}
