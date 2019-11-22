package com.kh.practice.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {

	public void practice1() {
		
//			길이가 10인 배열을 선언하고 1부터 10까지의 값을 반복문을 이용하여
//			순서대로 배열 인덱스에 넣은 후 그 값을 출력하세요.
		
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public void practice2() {
		
//			길이가 10인 배열을 선언하고 1부터 10까지의 값을 반복문을 이용하여
//			역순으로 배열 인덱스에 넣은 후 그 값을 출력하세요.
		
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		for(int i = arr.length-1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public void practice3() {
		
//			사용자에게 입력 받은 양의 정수만큼 배열 크기를 할당하고
//			1부터 입력 받은 값까지 배열에 초기화한 후 출력하세요.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("양의 정수 : ");
		int num = sc.nextInt();
		
		int[] arr = new int[num];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i+1;
			System.out.print(arr[i] + " ");
		}
	}
	
	public void practice4() {
		
//			길이가 5인 String배열을 선언하고 “사과”, “귤“, “포도“, “복숭아”, “참외“로 초기화 한 후
//			배열 인덱스를 활용해서 귤을 출력하세요.
		
		String fruit[] = {"사과", "귤", "포도", "복숭아", "참외"};
		System.out.println(fruit[1]);
	}
	
	public void practice5() {
		
//			문자열을 입력 받아 문자 하나하나를 배열에 넣고 검색할 문자가 문자열에 몇 개 들어가 있는지
//			개수와 몇 번째 인덱스에 위치하는지 인덱스를 출력하세요.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 : ");
		String str = sc.nextLine();
		System.out.print("문자 : ");
		char text = sc.nextLine().charAt(0);
		
		int count = 0;
		int[] index = new int[str.length()];
		char[] arr = new char[str.length()];
		
		for(int i = 0; i < str.length(); i++) {
			arr[i] = str.charAt(i);
			while(arr[i] == text) {
				index[i] = i;
				count++;
				break;
			}
		}
		System.out.print(str + "에 " + text + "가 존재하는 위치(인덱스) : ");
		for(int j = 0; j < str.length(); j++) {
			if( arr[j] == text) {
				System.out.print(index[j] + " ");
			}
		}
		System.out.println();
		System.out.println(text + " 개수 : " + count);
	}
	
	public void practice6() {
		
//			“월“ ~ “일”까지 초기화된 문자열 배열을 만들고 0부터 6까지 숫자를 입력 받아
//			입력한 숫자와 같은 인덱스에 있는 요일을 출력하고
//			범위에 없는 숫자를 입력 시 “잘못 입력하셨습니다“를 출력하세요.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("0 ~ 6 사이 숫자 입력 : ");
		int intDay = sc.nextInt();
		
		String[] day = {"월", "화", "수", "목", "금", "토", "일"};
		if(intDay >= 0 && intDay <= 6) {
			for(int i = 0; i <= 6; i++) {
				if(intDay == i) {
					System.out.println(day[i] + "요일");
				}
			}
		} else {
			System.out.println("잘못 입력하셨습니다.");
		}
//			switch(intDay) {
//			case 0: System.out.println(day[0]+"요일"); break;
//			default : System.out.println("잘못 입력하셨습니다.");
//			}
	}
	
	public void practice7() {
		
//			사용자가 배열의 길이를 직접 입력하여 그 값만큼 정수형 배열을 선언 및 할당하고
//			배열의 크기만큼 사용자가 직접 값을 입력하여 각각의 인덱스에 값을 초기화 하세요.
//			그리고 배열 전체 값을 나열하고 각 인덱스에 저장된 값들의 합을 출력하세요.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int length = sc.nextInt();
		int arr[] = new int[length];
		int th = 0;
		int sum = 0;
		for(th = 0; th < length; th++) {
			System.out.print("배열 " + th + "번째" + "인덱스에 넣을 값 : ");
			arr[th] = sc.nextInt();
		}
		for(th = 0; th < length; th++) {
			System.out.print(arr[th] + " ");
			sum += arr[th];
		}
		System.out.println();
		System.out.print("총 합 : " + sum);
	}
	
	public void practice8() {
		
//			3이상인 홀수 자연수를 입력 받아 배열의 중간까지는 1부터 1씩 증가하여 오름차순으로 값을 넣고,
//			중간 이후부터 끝까지는 1씩 감소하여 내림차순으로 값을 넣어 출력하세요.
//			단, 입력한 정수가 홀수가 아니거나 3 미만일 경우 “다시 입력하세요”를 출력하고
//			다시 정수를 받도록 하세요.
		// 입력한 정수가 홀수가 아니거 3미만 경우.
		
		do{
			Scanner sc = new Scanner(System.in);
			System.out.print("정수 : ");
			int num = sc.nextInt();
			if( num % 2 != 1 || num < 3) {
				System.out.println("다시 입력하세요.");
				continue;
			}
			int[] arr = new int[num];
			for(int i = 0; i < arr.length; i++) {
				if(i > arr.length/2) {
					arr[i] = arr[i-1]-1;
				} else {
					arr[i] = i + 1;
				}
				
				if(i == arr.length-1) {
					System.out.print(arr[i]);
				} else {
					System.out.print(arr[i] + ", ");
				}
				}
			break;
		}while(true);
	}
	
	public void practice9() {
		
//		사용자가 입력한 값이 배열에 있는지 검색하여
//		있으면 “OOO 치킨 배달 가능“, 없으면 “OOO 치킨은 없는 메뉴입니다“를 출력하세요.
//		단, 치킨 메뉴가 들어가있는 배열은 본인 스스로 정하세요.
		
		// !!!!!! index 는 length -1 !!!!!!
		
		Scanner sc = new Scanner(System.in);
		System.out.print("치킨 이름을 입력하세요 : ");
		String chicken = sc.nextLine();
		
		String menu[] = {"양념", "후라이드", "뿌링클", "고추바사삭", "황금올리브"};
		
		for(int i = 0; i < menu.length; i++) {
			if(menu[i].equals(chicken)) {
				System.out.println(chicken + "치킨 배달 가능");
				break;
			}else if(i == menu.length-1) {
				System.out.println(chicken + "치킨은 없는 메뉴입니다.");
			}
		}
	}
	
	public void practice10() {
		
//		주민등록번호 성별자리 이후부터 *로 가리고 출력하세요.
//		단, 원본 배열 값은 변경 없이 배열 복사본으로 변경하세요.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("주민등록번호(-포함) : ");
		String idNum = sc.nextLine();
//		char idCha = idNum.charAt(0);
		
		char[] idArr = new char[idNum.length()];
		for(int i = 0; i <= idNum.length()-1; i++) {
			idArr[i] = idNum.charAt(i);
		}
		char[] idArrCopy = new char[idArr.length];
		idArrCopy = Arrays.copyOf(idArr, idArr.length);
		for(int j = 0; j <= idArrCopy.length-1; j++) {
			if( j > 7 ) {
				idArrCopy[j] = '*';
//				System.out.print("*");
			} else {
//				System.out.print(idArrCopy[j]);
			}
		}
		System.out.println(idArrCopy);
		System.out.println(idArr);
	}
	
	public void practice11() {
		
//		10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고
//		1~10 사이의 난수를 발생시켜 배열에 초기화한 후 출력하세요.
		
		int[] arr = new int[10];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random()*10) + 1;
			System.out.print(arr[i] + " ");
		}
	}
	
	public void practice12() {
		
//		10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고
//		1~10 사이의 난수를 발생시켜 배열에 초기화 후
//		배열 전체 값과 그 값 중에서 최대값과 최소값을 출력하세요.
		
		int[] arr = new int[10];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random()*10) + 1;
			System.out.print(arr[i] + " ");
		}
		Arrays.sort(arr);
		System.out.println();
		System.out.println("최대값 : " + arr[arr.length-1]);
		System.out.println("최소값 : " + arr[0]);
	}
	
	public void practice13() {
		
//		10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고
//		1~10 사이의 난수를 발생시켜 중복된 값이 없게 배열에 초기화한 후 출력하세요.
		
		int[] arr = new int[10];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random()*10) + 1;
			for(int j = 0; j < i; j++) {
				if(arr[i] == arr[j]) {
					i--;
				}
			}			
		}
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public void practice13Kh(){
		
		int[] arr = new int[10];
		
		for(int i = 0; i < arr.length;) {
			// 1~10사이의 난수를 발생 시켜
			int random = (int)(Math.random() * 10) + 1;
			boolean check = false; // 확인 값을 만들어 주고
			
			for(int j = 0; j < i; j++) {
				if(arr[j] == random) {
					check = true; // 여기서 확인한다.
					break;
				}
			}
			
			if(!check) {
				arr[i] = random;
				System.out.print(arr[i] + " ");
				i++;
			}
			// 중복된 값이 없게 배열에 초기화한 후 출력하세요.
		}
	}
	
	public void practice14() {
		
//		로또 번호 자동 생성기 프로그램을 작성하는데 중복 값 없이 오름차순으로 정렬하여 출력하세요.
		
		int[] arr = new int[6];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random()*45) + 1;
			for(int j = 0; j < i; j++) {
				if(arr[i] == arr[j]) {
					i--;
				}
			}			
		}
		Arrays.sort(arr);
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public void practice15() {
		
		// 미완성.
		
//		문자열을 입력 받아 문자열에 어떤 문자가 들어갔는지 배열에 저장하고
//		문자의 개수와 함께 출력하세요.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 : ");
		String str = sc.nextLine();
		
		System.out.print("문자열에 있는 문자 : ");
		
		char[] charStr = new char[str.length()];
//		charStr[0] = str.charAt(0);
		
		for(int i = 0; i < str.length(); i++) {
			charStr[i] = str.charAt(i);
			for(int j = 0; j < i; j++) {
				if(charStr[i] == charStr[j]) {
					continue;
				} else {
					System.out.print(charStr[i] + ", ");
				}
			}
		}
			
//			if(i != charStr.length -1) {
//				System.out.print(charStr[i] + ", ");
//			} else {
//				System.out.print(charStr[i]);
//			}
//		for(int i = 0; i < str.length(); i++) {
//			
//		}
	}
	
	public void practice15Kh() {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 : ");
		String str = sc.nextLine(); // hello --> h e l o
		
		char[] chArr = new char[str.length()];
		chArr[0] = str.charAt(0); // 첫번째 문자는 무조건 중복이 안됨.
		
		boolean check = false;
		for(int i = 1; i < str.length(); i++) {
			for(int j = 0; j < chArr.length; j++) {
				if(str.charAt(i) == chArr[j]) {
					check = true;
					break;
				}
			}
			
			if(!check) {
				for(int k = 1; k < chArr.length; k++) {
					if(chArr[k] == '\u0000') {
						// 유니코드로 빈공간 임을 확인하는 것.
						chArr[k] = str.charAt(i);
						break;
					}
				}
			}
			check = false; // false 를 초기화해줘야 다음 문장이 수행됨.
		}
	}
	
	public void practice16() {
		
		// 미완성.
		
//		사용자가 입력한 배열의 길이만큼의 문자열 배열을 선언 및 할당하고
//		배열의 인덱스에 넣을 값 역시 사용자가 입력하여 초기화 하세요.
//		단, 사용자에게 배열에 값을 더 넣을지 물어보고 몇 개를 더 입력할 건지,
//		늘린 곳에 어떤 데이터를 넣을 것인지 받으세요.
//		사용자가 더 이상 입력하지 않겠다고 하면 배열 전체 값을 출력하세요.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("배열의 크기를 입력하세요 : ");
		int size = sc.nextInt();
		sc.nextLine();

		int plusSize = 0;
		
		String str[] = new String[size];
		
		for(int i = 1; i <= size; i++) {
			if(plusSize != 0) {
			String str1[] = new String[size + plusSize];
			str = str1;
			}
			System.out.print(i + "번째 문자열 : ");
			str[i-1] = sc.nextLine();
		}
		do {
			System.out.print("더 값을 입력하시겠습니까?(Y/N) : ");
			char go = sc.nextLine().charAt(0);
			if( go == 'y' || go == 'Y') {
				System.out.print("더 입력하고 싶은 개수 : ");
				plusSize = sc.nextInt();
			} else if ( go == 'N' || go == 'n') {
				plusSize = 0;
				for(int j = 0; j < size; j++) {
					if(j == 0) {
						System.out.print("[" + str[0]);
					} else if ( j == size - 1) {
						System.out.print(str[size-1] + "]");
					} else {
						System.out.print(str[j] + ", ");
					}
				}
			}
			break;
		} while(true);
	}
	
	public void practice16Kh() {
		Scanner sc = new Scanner(System.in);
		System.out.print("배열의 크기를 입력하세요 : ");
		String[] strArr = new String[Integer.parseInt(sc.nextLine())];
		
		for(int i = 0; i < strArr.length; i++) {
			System.out.print((i + 1) + " 번째 문자열 : ");
			strArr[i] = sc.nextLine();
		}
		
		String user = null;
		
		do {
			System.out.print("더 입력하시겠습니까?(y/n) : ");
			user = sc.nextLine();
			
			//***********************************//
			if(user.equalsIgnoreCase("Y")) { // 대소문자를 무시하고 같은지를 확인함!!
				System.out.print("더 입력하고 싶은 개수 : ");
				int add = Integer.parseInt(sc.nextLine());
				String[] newArr = new String[strArr.length + add];
				System.arraycopy(strArr, 0, newArr, 0, strArr.length);
				
				for(int i = strArr.length; i < newArr.length; i++) {
					System.out.print((i+1) + "번째 문자열 : ");
					newArr[i] = sc.nextLine();
				}
				strArr = newArr; // 한번 더 하겠다고 하면 new -> str이 되고 new가 생긴다.
			}
		}while(!user.equalsIgnoreCase("N"));
		
		// char형을 Igonore 쓰기.
//		char ch = 'a';
//		String cap = ch + "";
//		!cap.equalsIgnoreCase("N")
		
		// 배열을 for문을 안거치고 있는 그대로 출력하기.
//		System.out.println(Arrays.toString(strArr));
//		=> [ , ] 형태로 출력된다.([,]는 뺄수 없음)
	}
}
