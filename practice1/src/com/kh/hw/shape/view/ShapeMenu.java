package com.kh.hw.shape.view;

import java.util.Scanner;

import com.kh.hw.shape.controller.SquareController;
import com.kh.hw.shape.controller.TriangleController;

public class ShapeMenu {
	
	private Scanner sc = new Scanner(System.in);
	private SquareController scr = new SquareController();
	private TriangleController tc = new TriangleController();
	
	public void inputMenu() {
		System.out.println("==== ���� ���α׷� ====");
		System.out.println("3. �ﰢ��");
		System.out.println("4. �簢��");
		System.out.println("9. ���α׷� ����");
		System.out.print("�޴� ��ȣ : ");
		int type = sc.nextInt();
		
		switch(type) {
		case 3: triangleMenu(); break;
		case 4: squareMenu(); break;
		case 9: System.out.println("���α׷� ����"); break;
		default : System.out.println("�߸��� ��ȣ�Դϴ�. �ٽ� �Է����ּ���"); inputMenu(); break;
		}
	}
	
	public void triangleMenu() {
		do {
			System.out.println("===== �ﰢ�� =====");
			System.out.println("1. �ﰢ�� ����");
			System.out.println("2. �ﰢ�� ��ĥ");
			System.out.println("3. �ﰢ�� ����");
			System.out.println("9. ��������");
			System.out.print("�޴� ��ȣ : ");
			int menuNum = sc.nextInt();
			
			switch(menuNum) {
			case 1: inputSize(3, menuNum); break;
			case 2: inputSize(3, menuNum); break;
			case 3: printInformation(menuNum); break;
			case 9: System.out.println("�������� ���ư��ϴ�."); inputMenu(); break;
			default : System.out.println("�߸��� ��ȣ�Դϴ�. �ٽ� �Է����ּ���"); triangleMenu(); break;
			}
			if(menuNum == 9) {
				break;
			}
		}while(true);
	}
	
	public void squareMenu() {
		do {
			System.out.println("===== �簢�� =====");
			System.out.println("1. �簢�� �ѷ�");
			System.out.println("2. �簢�� ����");
			System.out.println("3. �簢�� ��ĥ");
			System.out.println("4. �簢�� ����");
			System.out.println("9. ��������");
			System.out.print("�޴� ��ȣ : ");
			int menuNum = sc.nextInt();
			
			switch(menuNum) {
			case 1: inputSize(4, menuNum); break;
			case 2: inputSize(4, menuNum); break;
			case 3: inputSize(4, menuNum); break;
			case 4: printInformation(menuNum); break;
			case 9: System.out.println("�������� ���ư��ϴ�."); inputMenu(); break;
			default : System.out.println("�߸��� ��ȣ�Դϴ�. �ٽ� �Է����ּ���"); squareMenu(); break; 
			}
			if(menuNum == 9) {
				break;
			}
		}while(true);
	}
	
	// �ʺ�� ����, ���� 
	public void inputSize(int type, int menuNum) {
		if(type == 3) {
			switch(menuNum) {
			case 1:
				System.out.print("���� : ");
				int height = sc.nextInt();
				System.out.print("�ʺ� : ");
				int width = sc.nextInt();
				System.out.println("�ﰢ�� ���� : " + tc.calcArea(height, width)); break;
			case 2:
				System.out.print("������ �Է��ϼ��� : ");
				sc.nextLine();
				String color = sc.nextLine();
				tc.paintColor(color);				
				System.out.println("���� �����Ǿ����ϴ�."); break;
			case 3: 
				printInformation(menuNum); break;
			case 9: 
				inputMenu(); break;
			}
		}
		if(type == 4) {
			switch(menuNum) {
			case 1 : case 2 : 
				System.out.print("���� : ");
				int height = sc.nextInt();
				System.out.print("�ʺ� : ");
				int width = sc.nextInt();
				if(menuNum == 1) {
					System.out.println("�簢�� �ѷ� : " + scr.calcPerimeter(height, width));
				} else if(menuNum == 2) {
					System.out.println("�簢�� ���� : " + scr.calcArea(height, width));
				}
				break;
			case 3:
				System.out.print("������ �Է��ϼ��� : ");
				sc.nextLine();
				String color = sc.nextLine();
				scr.paintColor(color);
				System.out.println("���� �����Ǿ����ϴ�."); break;
			case 4: 
				printInformation(menuNum); break;
			case 9: 
				inputMenu(); break;
			}
		}
	}
	
	// �ﰢ��, �簢���� ���� ���.
	public void printInformation(int type) {
		switch(type) {
		case 3: System.out.println(tc.print()); break;
		case 4: System.out.println(scr.print()); break;
		}
	}
}
