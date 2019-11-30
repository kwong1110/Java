package com.kh.practice.comp.func;

import java.util.Scanner;

public class RockPaperScissors {

	public void rps() {
		
//		사용자의 이름을 입력하고 컴퓨터와 가위바위보를 하세요. 컴퓨터가 가위인지 보인지 주먹인지는
//		랜덤한 수를 통해서 결정하도록 하고, 사용자에게는 직접 가위바위보를 받으세요.
//		사용자가 “exit”를 입력하기 전까지 가위바위보를 계속 진행하고 “exit”가 들어가면 반복을 멈추고
//		몇 번의 승부에서 몇 번 이기고 몇 번 비기고 몇 번 졌는지 출력하세요.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("당신의 이름을 입력해주세요 : ");
		String name = sc.nextLine();
		
		int totalGame = 0;
		int win = 0;
		int draw = 0;
		int lose = 0;
		
		while(true) {
			System.out.print("가위바위보 : ");
			String user = sc.nextLine();
			if(user.equals("exit")) {
				break;
			}
			if(!user.equals("가위") && !user.equals("바위") && !user.equals("보")) {
				System.out.println("잘못 입력하셨습니다.");
				continue;
			}
			int random = (int)(Math.random()*3) + 1;
			String computer = null;
			switch(random) {
			case 1: computer = "가위"; break; 
			case 2: computer = "바위"; break;
			case 3: computer = "보"; break;
			}
			System.out.println("컴퓨터 : " + computer);
			System.out.println(name + " : " + user);
			
			if(computer.equals(user)) {
				System.out.println("비겼습니다.");
				draw += 1;
			} else if(computer.equals("가위") && user.equals("바위") ||
					computer.equals("바위") && user.equals("보") ||
					computer.equals("보") && user.equals("가위")) {
				System.out.println("이겼습니다 !");
				win += 1;
			} else {
				System.out.println("졌습니다 ㅠㅠ");
				lose += 1;
			}
			totalGame++;
		}
		System.out.printf("%d전 %d승 %d무 %d패", totalGame, win, draw, lose);
	}
	
	public void rpsKh() {
			Scanner sc = new Scanner(System.in);
			System.out.print("당신의 이름을 입력해주세요 : ");
			String name = sc.nextLine();
			
			int count = 0; 	// n전
			int win = 0;	// n승
			int draw = 0;	// n무
			
			String winStr = "이겼습니다 !";
			String loseStr = "졌습니다ㅠㅠ";
		
			while(true) {
			int comInt = (int)(Math.random() * 3);
			String comStr = null;
			switch(comInt) {
			case 0 : comStr = "가위"; break;
			case 1 : comStr = "바위"; break;
			case 2 : comStr = "보"; break;
			}
			System.out.print("가위바위보 : ");
			String userStr = sc.nextLine();
			
			String result = null;
			
			if(userStr.equals("가위") || userStr.equals("바위") || userStr.equals("보")) {
				if(comStr.equals(userStr)) {
					result = "비겼습니다.";
					draw++;
				} else {
					if(comStr.equals("가위")) {
						switch(userStr) {
						case "바위": result = winStr; win++; break;
						case "보" : result = loseStr; break;
						}
					} else if(comStr.equals("바위")) {
						if(userStr.equals("보")) {
							result = winStr;
							win++;
						} else {
							result = loseStr;
						}
					} else {
						result = userStr.equals("가위") ? winStr : loseStr;
						if(result.equals(winStr)) {
							win++;
						}
					}
				}
			} else if(!userStr.equals("exit")) {
				System.out.println("잘못 입력하셨습니다.");
				continue;
			} else {
				break;
			}
			count++;
			System.out.println("컴퓨터 : " + comStr);
			System.out.println(name + " : " + userStr);
			System.out.println(result);
		}
		System.out.printf("%d전 %d승 %d무 %d패", count, win, draw, (count-win-draw));
	}
	
	public void rpsPractice() {
		Scanner sc = new Scanner(System.in);
		System.out.print("당신의 이름을 입력해주세요 : ");
		String name = sc.nextLine();
		// 전적을 저장할 변수를 선언
		int total = 0;
		int win = 0;
		int draw = 0;
		int lose = 0;
					
		do {
			System.out.print("가위바위보 : ");
			String userRps = sc.nextLine();
			if(userRps.equals("exit")) { // equals 말고 따른거 있나 확인.
				break;
			} else if(!userRps.equals("가위") && !userRps.equals("바위") && !userRps.equals("보")) {
				System.out.println("잘못 입력하셨습니다.");
				continue;
			}
			
			// 컴퓨터의 가위바위보를 정해준다.
			int ranRps = (int)(Math.random() * 3);
			String comRps = "";
			switch(ranRps){
				case 0: comRps = "가위"; break; 
				case 1: comRps = "바위"; break; 
				case 2: comRps = "보"; break; 
			}
					
			System.out.println("컴퓨터 : " + comRps);
			System.out.println(name + " : " + userRps);
			
			if(userRps.equals(comRps)) {
				System.out.println("비겼습니다.");
				draw++;
			} else if(userRps.equals("가위") && comRps.equals("보") 
					|| userRps.equals("바위") && comRps.equals("가위")
					||userRps.equals("보") && comRps.equals("바위")) {
				System.out.println("이겼습니다!!");
				win++;
			} else {
				System.out.println("졌습니다ㅜㅜ");
				lose++;
			}
			total++;
		}while(true);
		System.out.printf("%d전 %d승 %d무 %d패", total, win, draw, lose);
	}
}
