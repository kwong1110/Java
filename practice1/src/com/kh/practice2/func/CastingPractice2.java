package com.kh.practice2.func;

import java.util.Scanner;

public class CastingPractice2 {
	
	public void practice2() {
		
		// �Ǽ������� ����, ����, ���� �� ������ ������ �Է� �޾� ������ ����� ����ϼ���.
		// �� �� ������ ����� ���������� ó���ϼ���.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�� ������ ������ �Է��ϼ���.(�Ҽ��� ù°�ڸ�����)" + "\n" );
		System.out.print("���� : ");
		double korean = sc.nextDouble();
		System.out.print("���� : ");
		double english = sc.nextDouble();
		System.out.print("���� : ");
		double math = sc.nextDouble();
		int totalScore = (int)(korean + english + math);
		System.out.println("���� : " + ( totalScore ) );
		System.out.println("��� : " + ( totalScore ) / 3 );
	}
}
