package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice2 {
	
	public void practice2() {
		
		// 키보드로 정수 두 개를 입력 받아 두 수의 합, 차, 곱, 나누기한 몫을 출력하세요.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 정수를 입력 : ");
		int firstInt = sc.nextInt();
		System.out.print("두 번째 정수를 입력 : ");
		int secondInt = sc.nextInt();
		
		System.out.println("더하기 결과 : " + (firstInt + secondInt));
		System.out.println("빼기 결과 : " + (firstInt - secondInt));
		System.out.println("곱하기 결과 : " + (firstInt * secondInt));
		System.out.println("나누기 몫 결과 : " + (firstInt / secondInt));
	}
}
