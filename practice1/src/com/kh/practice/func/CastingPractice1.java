package com.kh.practice.func;

import java.util.Scanner;

public class CastingPractice1 {

	public void practice1() {
		
		// 키보드로 문자 하나를 입력 받아 그 문자의 유니코드를 출력하세요.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자 : ");
		char text1 = sc.nextLine().charAt(0);
		int intText = text1;
		System.out.println( text1 + " unicode : " + intText );
	}
}
