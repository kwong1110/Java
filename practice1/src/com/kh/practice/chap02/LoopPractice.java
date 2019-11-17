package com.kh.practice.chap02;

import java.util.Scanner;

public class LoopPractice {
	
	Scanner sc = new Scanner(System.in);
	
	public void practice1() {
		
//		사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 숫자들을 모두 출력하세요.
//		단, 입력한 수는 1보다 크거나 같아야 합니다.
//		만일 1 미만의 숫자가 입력됐다면 “1 이상의 숫자를 입력해주세요“를 출력하세요.
		
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
						
		for(int i = 1; i <= num; i++) {
			System.out.print(i + " ");				
		}
	
		if(num < 1) {
		System.out.println("1 이상의 숫자를 입력해주세요.");
		}
	}
	
	public void practice2() {
		
//		위 문제와 모든 것이 동일하나, 1 미만의 숫자가 입력됐다면
//		“1 이상의 숫자를 입력해주세요”가 출력되면서 다시 사용자가 값을 입력하도록 하세요.
		
//		출력되면서 다시 사용자가 값을 입력하도록 하세요. = while 사용 .
//		입력한 값이 1미만일때 만 반복해야함. = while 1미만.
		
		int num = 0;
		while(num < 1){
			System.out.print("1이상의 숫자를 입력하세요 : ");
			num = sc.nextInt();	
			for(int i = 1; i <= num; i++) {
				System.out.print(i + " ");
			}
			if(num < 1) {
				System.out.println("1 이상의 숫자를 입력해주세요.");
			}
		}
	}
	
	public void practice3() {
		
//		사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 모든 숫자를 거꾸로 출력하세요.
//		단, 입력한 수는 1보다 크거나 같아야 합니다.
		
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
						
		for(int i = 0; i < num; i++) {
			System.out.print(num - i + " ");				
		}
	
		if(num < 1) {
		System.out.println("1 이상의 숫자를 입력해주세요.");
		}
	}
	
	public void practice4() {
		
//		위 문제와 모든 것이 동일하나, 1 미만의 숫자가 입력됐다면
//		“1 이상의 숫자를 입력해주세요”가 출력되면서 다시 사용자가 값을 입력하도록 하세요.
		
		int num = 0;
		while(num < 1){
			System.out.print("1이상의 숫자를 입력하세요 : ");
			num = sc.nextInt();	
			for(int i = 0; i < num; i++) {
				System.out.print(num - i + " ");
			}
			if(num < 1) {
				System.out.println("1 이상의 숫자를 입력해주세요.");
			}
		}
	}
	
	public void practice5() {
		
//		1부터 사용자에게 입력 받은 수까지의 정수들의 합을 출력하세요
		
		System.out.print("정수를 하나 입력하세요 : ");
		int num = sc.nextInt();
		int sum = 0;
		for(int i = 1; i <= num; i++) {
			sum += i;
			if(i==num) {
				break;
			}
			System.out.print(i + " + ");
		}
		System.out.println(num + " = " + sum);
	}
	
	public void practice6() {
		
//		사용자로부터 두 개의 값을 입력 받아 그 사이의 숫자를 모두 출력하세요.
//		만일 1 미만의 숫자가 입력됐다면 “1 이상의 숫자를 입력해주세요“를 출력하세요.
		
		System.out.print("첫 번째 숫자 : ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 숫자 : ");
		int num2 = sc.nextInt();
		
		// 실패 생각.
//		if(num1 > num2) {
//			int first = num1;
//			int second = num2;
//		} else if(num2 > num1) {
//			int first = num2;
//			int second = num1;
//		} else {
//			System.out.println("서로 다른 숫자를 입력해주세요.");
//		}
		
		if(num1 < 1 || num2 < 1) {
			System.out.println("1 이상의 숫자를 입력해주세요.");
			} else {
			while(num1 < num2) {
				System.out.print(num1 + " ");
				num1++;
			}
			while(num1 >= num2) {
				System.out.print(num2 + " ");
				num2++;
			}
		}
	}
	
	public void practice7() {
		
//		위 문제와 모든 것이 동일하나, 1 미만의 숫자가 입력됐다면
//		“1 이상의 숫자를 입력해주세요”가 출력되면서 다시 사용자가 값을 입력하도록 하세요.
		
		int num1 = 0;
		int num2 = 0;
		while(num1 < 1 || num2 < 1){
			System.out.print("첫 번째 숫자 : ");
			num1 = sc.nextInt();
			System.out.print("두 번째 숫자 : ");
			num2 = sc.nextInt();
			if(num1 < 1 || num2 < 1) {
				System.out.println("1 이상의 숫자를 입력해주세요.");
				} else {
				while(num1 < num2) {
					System.out.print(num1 + " ");
					num1++;
				}
				while(num1 >= num2) {
					System.out.print(num2 + " ");
					num2++;
				}
			}
		}
	}
	
	public void practice8() {
		
//		사용자로부터 입력 받은 숫자의 단을 출력하세요
		// for1 : 단 , for1-1 : *.
		
		System.out.print("숫자 : ");
		int num = sc.nextInt();
		
		for(int dan = 1; dan <= 9; dan++) {
			if(num == dan) {
				System.out.println("==== " + dan + "단" + " ====");
				for(int j = 1; j <= 9; j++) {
					System.out.println(dan + " * " + j + " = " + (dan*j));					
				}
			}
		}
		if(num < 1 || num > 9) {
			System.out.println("1~9까지의 숫자를 입력해주세요.");
		}
	}
	
	public void practice9() {
		
//		사용자로부터 입력 받은 숫자의 단부터 9단까지 출력하세요.
//		단, 9를 초과하는 숫자가 들어오면 “9 이하의 숫자만 입력해주세요”를 출력하세요.
		
		System.out.print("숫자 : ");
		int num = sc.nextInt();
		
		for(int dan = 1; dan <= 9; dan++) {
			if(dan < num) {
				continue;
			}
				System.out.println("==== " + dan + "단" + " ====");
				for(int j = 1; j <= 9; j++) {
					System.out.println(dan + " * " + j + " = " + (dan*j));
			}
		}
		if(num > 9) {
			System.out.println("9 이하의 숫자만 입력해주세요.");
		}
	}
	
	public void practice10() {
		
//		위 문제와 모든 것이 동일하나, 9를 초과하는 숫자가 입력됐다면
//		“9 이하의 숫자를 입력해주세요”가 출력되면서 다시 사용자가 값을 입력하도록 하세요.

//		음수 까지 고려해준다면..for 위에 if 추가해서 맨밑 if를 else로 바꿔줄것.

		int num = 0;
		while(num > 9 || num <= 0){
			System.out.print("숫자 : ");
			num = sc.nextInt();
			
			for(int dan = 1; dan <= 9; dan++) {
				if(dan < num) {
					continue;
				}
					System.out.println("==== " + dan + "단" + " ====");
					for(int j = 1; j <= 9; j++) {
						System.out.println(dan + " * " + j + " = " + (dan*j));
				}
			}
			if(num > 9) {
				System.out.println("9 이하의 숫자만 입력해주세요.");
			}
		}
	}
	
	public void practice11() {
		
//		사용자로부터 시작 숫자와 공차를 입력 받아
//		일정한 값으로 숫자가 커지거나 작아지는 프로그램을 구현하세요.
//		단, 출력되는 숫자는 총 10개입니다.
//		* ‘공차’는 숫자들 사이에서 일정한 숫자의 차가 존재하는 것을 말한다.
//		ex) 2, 7, 12, 17, 22 …
//			  5  5   5   5 => 여기서 공차는 5
		
		// 출력횟수 = 10;  
		
		System.out.print("시작 숫자 : ");
		int fNum = sc.nextInt();
		System.out.print("공차 : ");
		int operatorNum = sc.nextInt();
				
		int maxPrint = 10;
		int num = fNum;
		
		
		while(operatorNum > 0 && num < fNum + (operatorNum * maxPrint)) {
			System.out.print(num + " ");
			num += operatorNum;
		}
		while(operatorNum < 0 && num > fNum + (operatorNum * maxPrint)) {
			System.out.print(num + " ");
			num += operatorNum;
		}
		
//		if(operatorNum > 0) {
//			while(num < fNum + (operatorNum * maxPrint)) {
//				System.out.print(num + " ");
//				num += operatorNum;
//			}
//		} else if(operatorNum < 0) {
//			while(num > fNum + (operatorNum * maxPrint)) {
//				System.out.print(num + " ");
//				num += operatorNum;
//			}
//		} else {
//			System.out.println("공차는 0이 올 수 없습니다.");
//		}
	}
	
	public void practice12() {
		
//		정수 두 개와 연산자를 입력 받고 입력된 연산자에 따라 알맞은 결과를 출력하세요.
//		단, 해당 프로그램은 연산자 입력에 “exit”라는 값이 들어올 때까지 무한 반복하며
//		exit가 들어오면 “프로그램을 종료합니다.”를 출력하고 종료합니다.
//		또한 연산자가 나누기이면서 두 번째 정수가 0으로 들어오면
//		“0으로 나눌 수 없습니다. 다시 입력해주세요.”를 출력하며,
//		없는 연산자가 들어올 시 “없는 연산자입니다. 다시 입력해주세요.”라고 출력하고
//		두 경우 모두 처음으로 돌아가 사용자가 다시 연산자부터 입력하도록 하세요.
		
		//변수를 따로 지정해보자.
		String strOp = " ";
		do {
			System.out.print("연산자(+, -, *, /, %) : ");
			strOp = sc.nextLine();
			char op = strOp.charAt(0);
			if(strOp.equals("exit")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			System.out.print("정수1 : ");
			int num1 = sc.nextInt();
			System.out.print("정수2 : ");
			int num2 = sc.nextInt();
			sc.nextLine();
			
			if( op == '/' && num2 == 0) {
				System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요.");
				continue;
			}
			
			double result = 0;
			switch(op) {
			case '+': result = num1 + num2; break;
			case '-': result = num1 - num2; break;
			case '*': result = num1 * num2;	break;
			case '/': result = num1 / num2;	break;
			case '%': result = num1 % num2;	break;
			default : System.out.println("없는 연산자입니다. 다시 입력해주세요.");
			}
			
			if(op == '+' || op == '-' || op == '*' || op == '/') {
				System.out.println(num1 + " " + op + " " + num2 + " = " + result);
			} 
		} while(!strOp.equals("exit"));
	}
	
	public void practice13() {
		
//		다음과 같은 실행 예제를 구현하세요.
//		ex.
//		정수 입력 : 4
//		*
//		**
//		***
//		****
		
		// 한줄에 *수 == 각 줄 수
		
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		for(int row = 1; row <= num; row++) {
			for(int star = 1; star <= row; star++) {
				System.out.print("*");
				}
			System.out.println();
			}
	}
	
	public void practice14() {
		
//		다음과 같은 실행 예제를 구현하세요.
//		ex.
//		정수 입력 : 4
//		****
//		***
//		**
//		*
		
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		for(int row = 1; row <= num; row++) {
			for(int star = num; star >= row; star--) {
				System.out.print("*");
				}
			System.out.println();
			}
	}
}
