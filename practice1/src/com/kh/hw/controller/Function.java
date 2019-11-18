package com.kh.hw.controller;

import java.util.Scanner;

public class Function {
	
	Scanner sc = new Scanner(System.in);
	public void calculator() {
		
//		정수 두 개와 연산자 하나를 키보드로 입력 받아 두 정수는 int변수에, 연산문자는 char에 저장
//		연산문자가 +이면 두 정수의 합 계산, -이면 두 정수의 차 계산, x 또는 X이면 두 정수의 곱,
//		/이면 두 정수의 나누기 몫이나 나누는 수(두 번째 수)가 0이면 “0으로 나눌 수 없습니다.” 출력하고
//		결과 값은 0으로 처리
		
		System.out.print("첫 번째 정수 : ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 정수 : ");
		int num2 = sc.nextInt();
		System.out.print("연산자(+, -, x, /) : ");
		sc.nextLine();
		char op = sc.nextLine().charAt(0);
		
		double result = 0;
		
		switch(op) {
		case '+': result = num1 + num2; break;
		case '-': result = num1 - num2; break;
		case '*': result = num1 * num2; break;
		case '/': if(num1 < num2 || num2 == 0) {
			System.out.println("0으로 나눌 수 없습니다.");
		}else{
			result = (double)num1 / num2;
		}; break;
		default : System.out.println("연사자는 (+, -, x, /) 중 입력해주세요.");
		}
		
		if(op == '/' && !(num1 < num2 || num2 == 0)) {
			System.out.printf("%d %c %d = %f", num1, op, num2, result);
			System.out.println();
		}else if(op == '+' || op == '-' || op == '*' || op == '%'||
				(op == '/' && num1 < num2 || num2 == 0)) {
			System.out.printf("%d %c %d = %d", num1, op, num2, (int)result);
			System.out.println();
		}
	}
	
	public void totalCalculator() {
		
//		키보드로 정수 두 개를 입력 받아 두 정수 중 작은 값을 시작 값으로 큰 값을 종료 값으로 사용
//		작은 값에서 큰 값까지 정수 합계를 구함
		
		System.out.print("첫 번째 정수 : ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 정수 : ");
		int num2 = sc.nextInt();
		
		int small = 0;
		int big = 0;
		int result = 0;
		
		if(num1 > num2) {
			small = num2;
			big = num1;
		} else {
			small = num1;
			big = num2;
		}
		for(int i = small; i <= big; i++) {
			result += i;
		}
		
		System.out.println("1부터 3까지 정수들의 합 : " + result);
	}
	
	public void printProfile() {
		
//		신상 정보들을 자료형에 맞춰 변수에 기록하고 변수에 기록된 값 출력
		
		System.out.print("이름 : ");
		String name = sc.nextLine();
//		sc.nextLine();
		System.out.print("나이 : ");
		int age = sc.nextInt();
		System.out.print("성별 : ");
		sc.nextLine();
		String gender = sc.nextLine();
		System.out.print("성격 : ");
		String character = sc.nextLine();
		
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("성별 : " + gender);
		System.out.println("성격 : " + character);
	}
	
	public void printScore() {
		
//		키보드로 입력 받은 값들을 변수에 기록하여 변수 값을 화면에 출력
//		점수가 90점 이상이면 A학점, 80이상 90미만이면 B, 70이상 80미만이면 C,
//		60이상 70미만 D, 60미만 F학점을 매김

		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("학년 : ");
		int grade = sc.nextInt();
		System.out.print("반 : ");
		int group = sc.nextInt();
		System.out.print("번 : ");
		int num = sc.nextInt();
		System.out.print("성별(M/F) : ");
		sc.nextLine();
		char charGender = sc.nextLine().charAt(0);
		System.out.print("성적 : ");
		double score = sc.nextDouble();
		
		String gender = null;
		if( charGender == 'M' || charGender == 'm') {
			gender = "남학생";
		} else if ( charGender == 'F' || charGender == 'f') {
			gender = "여학생";
		}
		
		char result = ' ';
		
		if(score >= 90) {
			result = 'A';
		} else if(score >= 80) {
			result = 'B';
		} else if(score >= 70) {
			result = 'C';
		} else if(score >= 60) {
			result = 'D';
		} else {
			result = 'F';
		}
		
		System.out.printf("%d학년 %d반 %d번 %s %s의 점수는 %g이고 %c학점입니다.", 
				grade, group, num, gender, name, score, result);
	}
	
	public void printStarNumber() {
		
//		정수를 하나 입력 받아 그 수가 양수일 때만 입력된 수를 줄 수로 적용하여 아래와 같이 출력
//		정수 : 5
//		1 
//		*2
//		**3
//		***4
//		****5				// 정수가 아닐땐 "양수가 아닙니다." 출력.
		// 줄수와 별수가 일치하면 줄수 출력, 그렇지 않다면 별 출력
		// 
		
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		if(0 < num) {
			for(int row = 1; row <= num; row++) {
				for(int star = 1; star <= row; star++) {
					if(row == star) {
						System.out.println(row);
						break;
					}
					System.out.print("*");
				}			
			}
		} else {
			System.out.println("양수가 아닙니다.");
		}
	}
	
	public void sumRandom() {
		
		// 1부터 100 사이의 정수 중 임의의 정수를 하나 발생시켜 1부터 랜덤 수까지의 합계 출력
		
		int random = (int)(Math.random()*100) + 1;
		int sum = 0;
		
		for(int i = 1; i <= random; i++) {
			sum += i;
		}
		
		System.out.print("1부터 " + random + "까지의 합 : " + sum);
	}
	
	public void exceptGugu() {
		
		// 정수를 하나 입력 받아 그 수가 양수일 때만 그 수의 구구단 출력
		// 단 곱하기 수가 입력 받은 단의 배수일 경우 출력 제외
		
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		for(int dan = 1; dan <= 9; dan++) {
			if(dan == num) {
				for(int i = 1; i <= 9; i++) {
					if(i % num != 0) {
						System.out.println(dan + " * " + i + " = " + (dan * i));
					}
				}
			}
		}
	}
	
	public void diceGame() {
		
//		두 개의 주사위가 만들어낼 수 있는 모든 경우의 수를 랜덤으로 정하고
//		랜덤으로 정해진 두 주사위 눈의 합이 입력된 수와 같은 경우 “맞췄습니다“ 출력,
//		입력 값과 다르면 “틀렸습니다“ 출력하여 맞출 때까지 반복
//		값을 맞추면 “계속 하시겠습니까? (y/n) : “가 출력되고
//		‘y’ 또는 ‘Y’ 입력 시 새로운 랜덤 수가 정해지고 처음부터 다시 시작, ‘n’ 또는 ‘N’ 입력 시 종료
		
				
		do {
			int random = (int)(Math.random()*12) + 1;
			char go = ' ';
			
			System.out.print("주사위 두 개의 합을 맞춰보세요(1~12입력) : ");
			int sum = sc.nextInt();
			
			if(random != sum) {
				System.out.println("틀렸습니다.");
				continue;
			} else {
				System.out.println("정답입니다.");
				System.out.println("주사위의 합 : " + random);
				sc.nextLine();
					do {
						System.out.print("계속 하시 겠습니까?(y/n) : ");
						go = sc.nextLine().charAt(0);
						if( go == 'y' || go == 'Y') {
							break;
						} else if( go == 'n' || go == 'N') {
							System.out.println("종료합니다.");
							break;
						} else {
							System.out.println("y/n 중에 입력해 주세요.");
							continue;
						}
					} while(true);
				}
			if( go == 'y' || go == 'Y') {
				continue;
			} else {
				break;
			}
		}while(true);
	}
}
