package com.kh.hw.view;

import java.util.Scanner;

import com.kh.hw.controller.Function;

public class Menu {

	public void displayMenu() {
		
//		1. displayMenu() �޼ҵ忡 �޴� ȭ���� �ݺ� ��µǰ� ��
//		2. �޴� ��ȣ�� �Է� �޾� �ش� ��ȣ�� ����� ����ǰ� ��
//		3. �޴� 1~8�������� ����� �޼ҵ�� FunctionŬ������ �޼ҵ� ȣ��
//		4. 9�� �Է� �� �������մϴ�.�� ��� �� ����
//		5. �� �� �Է� ���� �� ���߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.�� ���
		Function ft = new Function();
		
		do {
			Scanner sc = new Scanner(System.in);
			System.out.println("1. ���� ����");
			System.out.println("2. ���� ������ ū ������ �հ�");
			System.out.println("3. �Ż� ���� Ȯ��");
			System.out.println("4. �л� ���� Ȯ��");
			System.out.println("5. ���� ���� ���");
			System.out.println("6. ���������� �հ�");
			System.out.println("7. ������");
			System.out.println("8. �ֻ��� ���� �˾Ƹ��߱� ����");
			System.out.println("9. ���α׷� ����");
			System.out.print("�޴� ��ȣ : ");
			int menu = sc.nextInt();
			
			switch(menu) {
			case 1: ft.calculator(); break;
			case 2: ft.totalCalculator(); break;
			case 3: ft.printProfile(); break;
			case 4: ft.printScore(); break;
			case 5: ft.printStarNumber(); break;
			case 6: ft.sumRandom(); break;
			case 7: ft.exceptGugu(); break;
			case 8: ft.diceGame(); break;
			case 9: System.out.println("�����մϴ�."); break;
			default: System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
			}
			if(menu == 9) {
				break;
			}
		}while(true);
	}
}
