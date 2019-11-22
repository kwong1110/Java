package com.kh.practice.snack.view;

import java.util.Scanner;

import com.kh.practice.snack.controller.SnackController;

public class SnackMenu {
	Scanner sc = new Scanner(System.in);
	SnackController scr = new SnackController();
	
	public void menu() {
		System.out.println("스낵류를 입력하세요.");
		System.out.print("종류 : ");
		String kind = sc.nextLine();
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("맛 : ");
		String flavor = sc.nextLine();
		System.out.print("개수 : ");
		int numOf = sc.nextInt();
		System.out.print("가격 : ");
		int price = sc.nextInt();
		
//		scr.saveData(kind, name, flavor, numOf, price);
		System.out.println(scr.saveData(kind, name, flavor, numOf, price));
		// ********* 이렇게 사용 할 수 있다!!!!!!!
		System.out.print("저장한 정보를 확인하시겠습니까?(y/n) : ");
		sc.nextLine();
		char confirm = sc.nextLine().charAt(0);
	
//		String confirm = sc.nextLine();
//		sc.nextLine();
//		confirm.equalsIgnoreCase("y")왜 안되지.....
		
		if(confirm == 'y' || confirm == 'Y') {
			System.out.println(scr.confirmDate());
		} else if(confirm == 'n' || confirm == 'N') {
			System.out.print("확인 안합니다.");
		}
	}
}
