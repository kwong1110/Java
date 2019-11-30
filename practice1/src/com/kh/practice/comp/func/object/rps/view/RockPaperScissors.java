package com.kh.practice.comp.func.object.rps.view;

import java.util.Scanner;

import com.kh.practice.comp.func.object.rps.controller.Fight;

public class RockPaperScissors {

	private Scanner sc = new Scanner(System.in);
	private Fight f = new Fight();
	
	public void rps() {
		
		System.out.print("당신의 이름을 입력해주세요 : ");
		String name = sc.nextLine();
		
		do {
			System.out.print("가위바위보 : ");
			String userRps = sc.nextLine();
			
//			int comRps = ;
//			int comRps = 0;
			f.createComRps();
			
			if(userRps.equals("exit")) {
				System.out.println(f.fightResult(userRps));
				break;
			}
			
			if(!userRps.equals("바위") && !userRps.equals("가위") && !userRps.equals("보")) {
				System.out.println("잘못 입력하셨습니다.");
				continue;
			}
			System.out.println("컴퓨터 : " + f.comRps());
			System.out.println(name + " : " + userRps);

			System.out.println(f.fightStart(userRps));
//			f.reComRps();
		}while(true);
	}
}
