package com.kh.practice.func;

import java.util.Scanner;

public class VariablePractice3 {
	
	public void practice3() {
		
		// Ű����� ����, ���� ���� �Ǽ������� �Է� �޾� �簢���� ������ �ѷ��� ����Ͽ� ����ϼ���.
		// ��� ���� )  ���� : ���� * ����
		//			�ѷ� : (����  + ����) *2
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� ���� �Է�(�Ҽ���ù°�ڸ�����) : ");
		double width = sc.nextDouble();
		System.out.print("���� ���� �Է�(�Ҽ���ù°�ڸ�����) : ");
		double height = sc.nextDouble();
		System.out.println("���� : " + ( width * height ));
		System.out.println("�ѷ� : " + ( width + height ) * 2);
	}
}
