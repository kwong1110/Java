package com.kh.hw.shape.view;

import java.util.Scanner;

import com.kh.hw.shape.controller.SquareController;
import com.kh.hw.shape.controller.TriangleController;

public class ShapeMenu {
	
	private Scanner sc = new Scanner(System.in);
	private SquareController scr = new SquareController();
	private TriangleController tc = new TriangleController();
	
	public void inputMenu() {
		System.out.println("==== 도형 프로그램 ====");
		System.out.println("3. 삼각형");
		System.out.println("4. 사각형");
		System.out.println("9. 프로그램 종료");
		System.out.print("메뉴 번호 : ");
		int type = sc.nextInt();
		
		switch(type) {
		case 3: triangleMenu(); break;
		case 4: squareMenu(); break;
		case 9: System.out.println("프로그램 종료"); break;
		default : System.out.println("잘못된 번호입니다. 다시 입력해주세요"); inputMenu(); break;
		}
	}
	
	public void triangleMenu() {
		do {
			System.out.println("===== 삼각형 =====");
			System.out.println("1. 삼각형 면적");
			System.out.println("2. 삼각형 색칠");
			System.out.println("3. 삼각형 정보");
			System.out.println("9. 메인으로");
			System.out.print("메뉴 번호 : ");
			int menuNum = sc.nextInt();
			
			switch(menuNum) {
			case 1: inputSize(3, menuNum); break;
			case 2: inputSize(3, menuNum); break;
			case 3: printInformation(menuNum); break;
			case 9: System.out.println("메인으로 돌아갑니다."); inputMenu(); break;
			default : System.out.println("잘못된 번호입니다. 다시 입력해주세요"); triangleMenu(); break;
			}
			if(menuNum == 9) {
				break;
			}
		}while(true);
	}
	
	public void squareMenu() {
		do {
			System.out.println("===== 사각형 =====");
			System.out.println("1. 사각형 둘레");
			System.out.println("2. 사각형 면적");
			System.out.println("3. 사각형 색칠");
			System.out.println("4. 사각형 정보");
			System.out.println("9. 메인으로");
			System.out.print("메뉴 번호 : ");
			int menuNum = sc.nextInt();
			
			switch(menuNum) {
			case 1: inputSize(4, menuNum); break;
			case 2: inputSize(4, menuNum); break;
			case 3: inputSize(4, menuNum); break;
			case 4: printInformation(menuNum); break;
			case 9: System.out.println("메인으로 돌아갑니다."); inputMenu(); break;
			default : System.out.println("잘못된 번호입니다. 다시 입력해주세요"); squareMenu(); break; 
			}
			if(menuNum == 9) {
				break;
			}
		}while(true);
	}
	
	// 너비와 높이, 색깔 
	public void inputSize(int type, int menuNum) {
		if(type == 3) {
			switch(menuNum) {
			case 1:
				System.out.print("높이 : ");
				int height = sc.nextInt();
				System.out.print("너비 : ");
				int width = sc.nextInt();
				System.out.println("삼각형 면적 : " + tc.calcArea(height, width)); break;
			case 2:
				System.out.print("색깔을 입력하세요 : ");
				sc.nextLine();
				String color = sc.nextLine();
				tc.paintColor(color);				
				System.out.println("색이 수정되었습니다."); break;
			case 3: 
				printInformation(menuNum); break;
			case 9: 
				inputMenu(); break;
			}
		}
		if(type == 4) {
			switch(menuNum) {
			case 1 : case 2 : 
				System.out.print("높이 : ");
				int height = sc.nextInt();
				System.out.print("너비 : ");
				int width = sc.nextInt();
				if(menuNum == 1) {
					System.out.println("사각형 둘레 : " + scr.calcPerimeter(height, width));
				} else if(menuNum == 2) {
					System.out.println("사각형 면적 : " + scr.calcArea(height, width));
				}
				break;
			case 3:
				System.out.print("색깔을 입력하세요 : ");
				sc.nextLine();
				String color = sc.nextLine();
				scr.paintColor(color);
				System.out.println("색이 수정되었습니다."); break;
			case 4: 
				printInformation(menuNum); break;
			case 9: 
				inputMenu(); break;
			}
		}
	}
	
	// 삼각형, 사각형의 정보 출력.
	public void printInformation(int type) {
		switch(type) {
		case 3: System.out.println(tc.print()); break;
		case 4: System.out.println(scr.print()); break;
		}
	}
}
