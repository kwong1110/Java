package com.kh.practice.comp.func;

import java.util.Scanner;

public class CompExample {
	
	Scanner sc = new Scanner(System.in);
	public void practice1() {
		
//		정수를 입력 받아 양수일 때만 1부터 입력 받은 수까지 홀수/짝수를 나눠서
//		홀수면 ‘박’, 짝수면 ‘수’를 출력하도록 하세요.
//		단, 입력 받은 수가 양수가 아니면 “양수가 아닙니다”를 출력하세요. 
		
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		
		if( num < 1) {
			System.out.println("양수가 아닙니다.");
		} else {
			for(int bak = 1; bak <= num; bak++) {
				if( bak % 2 == 0) {
					System.out.print("수");
				} else {
					System.out.print("박");
				}
			}
		}
	}
	
	public void practice2() {
		
//		위 문제와 모든 것이 동일하나, 1 미만의 숫자가 입력됐다면
//		“양수가 아닙니다.”가 출력되면서 다시 사용자가 값을 입력하도록 하세요.
		
		do {
			System.out.print("정수 : ");
			int num = sc.nextInt();
			
			if(num < 1) {
				System.out.println("양수가 아닙니다.");
				continue;
			} else {
				for(int bak = 1; bak <= num; bak++) {
					if( bak % 2 == 0) {
						System.out.print("수");
					} else {
						System.out.print("박");
					}
				}
				break;
			}
		}while(true);
	}
	
	public void practice3() {
		
//		사용자로부터 문자열을 입력 받고 문자열에서 검색될 문자를 입력 받아 해당 문자열에 그 문자가
//		몇 개 있는지 개수를 출력하세요.

		System.out.print("문자열 : ");
		String string1 = sc.nextLine();
		System.out.print("문자 : ");
		char text = sc.nextLine().charAt(0);
		
		int textOfString = 0;
		
		for(int i = 0; i < string1.length(); i++) {
			if(string1.charAt(i) == text) {
				textOfString += 1;
			}
		}
		System.out.println(string1 + " 안에 포함된 " + text + " 개수  : " + textOfString);
	}
	
	public void practice4() {
		
//		위 문제와 모든 것이 동일하고, “더 하시겠습니까?”라고 추가로 물어보도록 하세요.
//		이 때, N이나 n이 나오면 프로그램을 끝내고 Y나 y면 계속 진행하도록 하되 Y, y, N, n이 아닌
//		다른 문자를 입력했을 경우 “잘못된 대답입니다. 다시 입력해주세요.”를 출력하고
//		더 하겠냐는 물음을 반복하세요.
		
		do {
			System.out.print("문자열 : ");
			String string1 = sc.nextLine();
			System.out.print("문자 : ");
			char text = sc.nextLine().charAt(0);
			
			int textOfString = 0;
			
			for(int i = 0; i < string1.length(); i++) {
				if(string1.charAt(i) == text) {
					textOfString += 1;
				}
			}
			System.out.println(string1 + " 안에 포함된 " + text + " 개수  : " + textOfString);
			
			String strGo = null;
			do{
				System.out.print("더 하시겠습니까? (y/n) : ");
				strGo = sc.nextLine();
				char go = strGo.charAt(0);
				if(go == 'y'|| go == 'Y') {
					break;
				} else if(go == 'n' || go == 'N') {
					break;
				} else {
					System.out.println("잘못된 대답입니다. 다시 입력해주세요.");
					continue;
				}
			}while(true);
			
			if(strGo.charAt(0) == 'y' || strGo.charAt(0) == 'Y') {
				continue;
			} else {
				break;
			}
		}while(true);
	}
}
