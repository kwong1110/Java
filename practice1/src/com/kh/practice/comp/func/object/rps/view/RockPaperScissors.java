package com.kh.practice.comp.func.object.rps.view;

import java.util.Scanner;

import com.kh.practice.comp.func.object.rps.controller.Fight;

public class RockPaperScissors {

	private Scanner sc = new Scanner(System.in);
	private Fight f = new Fight();
	
	public void rps() {
		
		System.out.print("����� �̸��� �Է����ּ��� : ");
		String name = sc.nextLine();
		
		do {
			System.out.print("���������� : ");
			String userRps = sc.nextLine();
			
//			int comRps = ;
//			int comRps = 0;
			f.createComRps();
			
			if(userRps.equals("exit")) {
				System.out.println(f.fightResult(userRps));
				break;
			}
			
			if(!userRps.equals("����") && !userRps.equals("����") && !userRps.equals("��")) {
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
				continue;
			}
			System.out.println("��ǻ�� : " + f.comRps());
			System.out.println(name + " : " + userRps);

			System.out.println(f.fightStart(userRps));
//			f.reComRps();
		}while(true);
	}
}
