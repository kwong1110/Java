package com.kh.hw.view;

import java.util.Scanner;

import com.kh.hw.controller.Function;

public class Menu {

	public void displayMenu() {
		
//		1. displayMenu() 메소드에 메뉴 화면이 반복 출력되게 함
//		2. 메뉴 번호를 입력 받아 해당 번호의 기능이 실행되게 함
//		3. 메뉴 1~8번까지의 실행용 메소드는 Function클래스의 메소드 호출
//		4. 9번 입력 시 “종료합니다.” 출력 후 종료
//		5. 잘 못 입력 했을 시 “잘못 입력하셨습니다. 다시 입력해주세요.” 출력
		Function ft = new Function();
		
		do {
			Scanner sc = new Scanner(System.in);
			System.out.println("1. 간단 계산기");
			System.out.println("2. 작은 수에서 큰 수까지 합계");
			System.out.println("3. 신상 정보 확인");
			System.out.println("4. 학생 정보 확인");
			System.out.println("5. 별과 숫자 출력");
			System.out.println("6. 난수까지의 합계");
			System.out.println("7. 구구단");
			System.out.println("8. 주사위 숫자 알아맞추기 게임");
			System.out.println("9. 프로그램 종료");
			System.out.print("메뉴 번호 : ");
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
			case 9: System.out.println("종료합니다."); break;
			default: System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
			if(menu == 9) {
				break;
			}
		}while(true);
	}
}
