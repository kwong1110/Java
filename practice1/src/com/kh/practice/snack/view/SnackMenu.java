package com.kh.practice.snack.view;

import java.util.Scanner;

import com.kh.practice.snack.controller.SnackController;

public class SnackMenu {
	private Scanner sc = new Scanner(System.in);
	private SnackController scr = new SnackController();
	
	public void menu() {
		System.out.println("�������� �Է��ϼ���.");
		System.out.print("���� : ");
		String kind = sc.nextLine();
		System.out.print("�̸� : ");
		String name = sc.nextLine();
		System.out.print("�� : ");
		String flavor = sc.nextLine();
		System.out.print("���� : ");
		int numOf = sc.nextInt();
//		int numOf = Integer.parseInt(sc.nextLine());
		System.out.print("���� : ");
		int price = sc.nextInt();
//		int price = Integer.parseInt(sc.nextLine());
		
//		String result = scr.saveData(kind, name, flavor, numOf, price);
		System.out.println(scr.saveData(kind, name, flavor, numOf, price));
		// ********* �̷��� ��� �� �� �ִ�!!!!!!!
		System.out.print("������ ������ Ȯ���Ͻðڽ��ϱ�?(y/n) : ");
		sc.nextLine();
		char confirm = sc.nextLine().charAt(0);
		// String answer = sc.nextLine();
	
//		String confirm = sc.nextLine();
//		sc.nextLine();
//		confirm.equalsIgnoreCase("y")�� �ȵ���.....
		
		if(confirm == 'y' || confirm == 'Y') {
			System.out.println(scr.confirmDate());
		} else if(confirm == 'n' || confirm == 'N') {
			System.out.print("Ȯ�� ���մϴ�.");
		}
		
		// toUpperCase **********
//		if(confirm.toUpperCase().equals("Y")) {
//			System.out.println(scr.confirmDate());
//		}
	}
}
