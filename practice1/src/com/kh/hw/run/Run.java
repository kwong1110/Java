package com.kh.hw.run;

import com.kh.hw.view.Menu;

//Run에서 Menu 사용, Menu에서 Function 사용
//Run클래스에 main()를 구현하여
//main()메소드에는 Menu클래스의 displayMenu()메소드 실행

public class Run {
	public static void main(String[] args) {
		
		Menu mu = new Menu();
		mu.displayMenu();
		
		// Function 기능구
//		Function ft = new Function();
//		ft.calculator();
//		ft.totalCalculator();
//		ft.printProfile();
//		ft.printScore();
//		ft.printStarNumber();
//		ft.sumRandom();
//		ft.exceptGugu();
//		ft.diceGame();
	}

}
