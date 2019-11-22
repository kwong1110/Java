package com.kh.practice.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {

	public void practice1() {
		
//			���̰� 10�� �迭�� �����ϰ� 1���� 10������ ���� �ݺ����� �̿��Ͽ�
//			������� �迭 �ε����� ���� �� �� ���� ����ϼ���.
		
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public void practice2() {
		
//			���̰� 10�� �迭�� �����ϰ� 1���� 10������ ���� �ݺ����� �̿��Ͽ�
//			�������� �迭 �ε����� ���� �� �� ���� ����ϼ���.
		
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		for(int i = arr.length-1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public void practice3() {
		
//			����ڿ��� �Է� ���� ���� ������ŭ �迭 ũ�⸦ �Ҵ��ϰ�
//			1���� �Է� ���� ������ �迭�� �ʱ�ȭ�� �� ����ϼ���.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� ���� : ");
		int num = sc.nextInt();
		
		int[] arr = new int[num];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i+1;
			System.out.print(arr[i] + " ");
		}
	}
	
	public void practice4() {
		
//			���̰� 5�� String�迭�� �����ϰ� �������, ���֡�, ��������, �������ơ�, �����ܡ��� �ʱ�ȭ �� ��
//			�迭 �ε����� Ȱ���ؼ� ���� ����ϼ���.
		
		String fruit[] = {"���", "��", "����", "������", "����"};
		System.out.println(fruit[1]);
	}
	
	public void practice5() {
		
//			���ڿ��� �Է� �޾� ���� �ϳ��ϳ��� �迭�� �ְ� �˻��� ���ڰ� ���ڿ��� �� �� �� �ִ���
//			������ �� ��° �ε����� ��ġ�ϴ��� �ε����� ����ϼ���.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڿ� : ");
		String str = sc.nextLine();
		System.out.print("���� : ");
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
		System.out.print(str + "�� " + text + "�� �����ϴ� ��ġ(�ε���) : ");
		for(int j = 0; j < str.length(); j++) {
			if( arr[j] == text) {
				System.out.print(index[j] + " ");
			}
		}
		System.out.println();
		System.out.println(text + " ���� : " + count);
	}
	
	public void practice6() {
		
//			������ ~ ���ϡ����� �ʱ�ȭ�� ���ڿ� �迭�� ����� 0���� 6���� ���ڸ� �Է� �޾�
//			�Է��� ���ڿ� ���� �ε����� �ִ� ������ ����ϰ�
//			������ ���� ���ڸ� �Է� �� ���߸� �Է��ϼ̽��ϴ١��� ����ϼ���.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("0 ~ 6 ���� ���� �Է� : ");
		int intDay = sc.nextInt();
		
		String[] day = {"��", "ȭ", "��", "��", "��", "��", "��"};
		if(intDay >= 0 && intDay <= 6) {
			for(int i = 0; i <= 6; i++) {
				if(intDay == i) {
					System.out.println(day[i] + "����");
				}
			}
		} else {
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		}
//			switch(intDay) {
//			case 0: System.out.println(day[0]+"����"); break;
//			default : System.out.println("�߸� �Է��ϼ̽��ϴ�.");
//			}
	}
	
	public void practice7() {
		
//			����ڰ� �迭�� ���̸� ���� �Է��Ͽ� �� ����ŭ ������ �迭�� ���� �� �Ҵ��ϰ�
//			�迭�� ũ�⸸ŭ ����ڰ� ���� ���� �Է��Ͽ� ������ �ε����� ���� �ʱ�ȭ �ϼ���.
//			�׸��� �迭 ��ü ���� �����ϰ� �� �ε����� ����� ������ ���� ����ϼ���.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");
		int length = sc.nextInt();
		int arr[] = new int[length];
		int th = 0;
		int sum = 0;
		for(th = 0; th < length; th++) {
			System.out.print("�迭 " + th + "��°" + "�ε����� ���� �� : ");
			arr[th] = sc.nextInt();
		}
		for(th = 0; th < length; th++) {
			System.out.print(arr[th] + " ");
			sum += arr[th];
		}
		System.out.println();
		System.out.print("�� �� : " + sum);
	}
	
	public void practice8() {
		
//			3�̻��� Ȧ�� �ڿ����� �Է� �޾� �迭�� �߰������� 1���� 1�� �����Ͽ� ������������ ���� �ְ�,
//			�߰� ���ĺ��� �������� 1�� �����Ͽ� ������������ ���� �־� ����ϼ���.
//			��, �Է��� ������ Ȧ���� �ƴϰų� 3 �̸��� ��� ���ٽ� �Է��ϼ��䡱�� ����ϰ�
//			�ٽ� ������ �޵��� �ϼ���.
		// �Է��� ������ Ȧ���� �ƴϰ� 3�̸� ���.
		
		do{
			Scanner sc = new Scanner(System.in);
			System.out.print("���� : ");
			int num = sc.nextInt();
			if( num % 2 != 1 || num < 3) {
				System.out.println("�ٽ� �Է��ϼ���.");
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
		
//		����ڰ� �Է��� ���� �迭�� �ִ��� �˻��Ͽ�
//		������ ��OOO ġŲ ��� ���ɡ�, ������ ��OOO ġŲ�� ���� �޴��Դϴ١��� ����ϼ���.
//		��, ġŲ �޴��� ���ִ� �迭�� ���� ������ ���ϼ���.
		
		// !!!!!! index �� length -1 !!!!!!
		
		Scanner sc = new Scanner(System.in);
		System.out.print("ġŲ �̸��� �Է��ϼ��� : ");
		String chicken = sc.nextLine();
		
		String menu[] = {"���", "�Ķ��̵�", "�Ѹ�Ŭ", "���߹ٻ��", "Ȳ�ݿø���"};
		
		for(int i = 0; i < menu.length; i++) {
			if(menu[i].equals(chicken)) {
				System.out.println(chicken + "ġŲ ��� ����");
				break;
			}else if(i == menu.length-1) {
				System.out.println(chicken + "ġŲ�� ���� �޴��Դϴ�.");
			}
		}
	}
	
	public void practice10() {
		
//		�ֹε�Ϲ�ȣ �����ڸ� ���ĺ��� *�� ������ ����ϼ���.
//		��, ���� �迭 ���� ���� ���� �迭 ���纻���� �����ϼ���.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�ֹε�Ϲ�ȣ(-����) : ");
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
		
//		10���� ���� ������ �� �ִ� ������ �迭�� ���� �� �Ҵ��ϰ�
//		1~10 ������ ������ �߻����� �迭�� �ʱ�ȭ�� �� ����ϼ���.
		
		int[] arr = new int[10];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random()*10) + 1;
			System.out.print(arr[i] + " ");
		}
	}
	
	public void practice12() {
		
//		10���� ���� ������ �� �ִ� ������ �迭�� ���� �� �Ҵ��ϰ�
//		1~10 ������ ������ �߻����� �迭�� �ʱ�ȭ ��
//		�迭 ��ü ���� �� �� �߿��� �ִ밪�� �ּҰ��� ����ϼ���.
		
		int[] arr = new int[10];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random()*10) + 1;
			System.out.print(arr[i] + " ");
		}
		Arrays.sort(arr);
		System.out.println();
		System.out.println("�ִ밪 : " + arr[arr.length-1]);
		System.out.println("�ּҰ� : " + arr[0]);
	}
	
	public void practice13() {
		
//		10���� ���� ������ �� �ִ� ������ �迭�� ���� �� �Ҵ��ϰ�
//		1~10 ������ ������ �߻����� �ߺ��� ���� ���� �迭�� �ʱ�ȭ�� �� ����ϼ���.
		
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
			// 1~10������ ������ �߻� ����
			int random = (int)(Math.random() * 10) + 1;
			boolean check = false; // Ȯ�� ���� ����� �ְ�
			
			for(int j = 0; j < i; j++) {
				if(arr[j] == random) {
					check = true; // ���⼭ Ȯ���Ѵ�.
					break;
				}
			}
			
			if(!check) {
				arr[i] = random;
				System.out.print(arr[i] + " ");
				i++;
			}
			// �ߺ��� ���� ���� �迭�� �ʱ�ȭ�� �� ����ϼ���.
		}
	}
	
	public void practice14() {
		
//		�ζ� ��ȣ �ڵ� ������ ���α׷��� �ۼ��ϴµ� �ߺ� �� ���� ������������ �����Ͽ� ����ϼ���.
		
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
		
		// �̿ϼ�.
		
//		���ڿ��� �Է� �޾� ���ڿ��� � ���ڰ� ������ �迭�� �����ϰ�
//		������ ������ �Բ� ����ϼ���.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڿ� : ");
		String str = sc.nextLine();
		
		System.out.print("���ڿ��� �ִ� ���� : ");
		
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
		System.out.print("���ڿ� : ");
		String str = sc.nextLine(); // hello --> h e l o
		
		char[] chArr = new char[str.length()];
		chArr[0] = str.charAt(0); // ù��° ���ڴ� ������ �ߺ��� �ȵ�.
		
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
						// �����ڵ�� ����� ���� Ȯ���ϴ� ��.
						chArr[k] = str.charAt(i);
						break;
					}
				}
			}
			check = false; // false �� �ʱ�ȭ����� ���� ������ �����.
		}
	}
	
	public void practice16() {
		
		// �̿ϼ�.
		
//		����ڰ� �Է��� �迭�� ���̸�ŭ�� ���ڿ� �迭�� ���� �� �Ҵ��ϰ�
//		�迭�� �ε����� ���� �� ���� ����ڰ� �Է��Ͽ� �ʱ�ȭ �ϼ���.
//		��, ����ڿ��� �迭�� ���� �� ������ ����� �� ���� �� �Է��� ����,
//		�ø� ���� � �����͸� ���� ������ ��������.
//		����ڰ� �� �̻� �Է����� �ʰڴٰ� �ϸ� �迭 ��ü ���� ����ϼ���.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�迭�� ũ�⸦ �Է��ϼ��� : ");
		int size = sc.nextInt();
		sc.nextLine();

		int plusSize = 0;
		
		String str[] = new String[size];
		
		for(int i = 1; i <= size; i++) {
			if(plusSize != 0) {
			String str1[] = new String[size + plusSize];
			str = str1;
			}
			System.out.print(i + "��° ���ڿ� : ");
			str[i-1] = sc.nextLine();
		}
		do {
			System.out.print("�� ���� �Է��Ͻðڽ��ϱ�?(Y/N) : ");
			char go = sc.nextLine().charAt(0);
			if( go == 'y' || go == 'Y') {
				System.out.print("�� �Է��ϰ� ���� ���� : ");
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
		System.out.print("�迭�� ũ�⸦ �Է��ϼ��� : ");
		String[] strArr = new String[Integer.parseInt(sc.nextLine())];
		
		for(int i = 0; i < strArr.length; i++) {
			System.out.print((i + 1) + " ��° ���ڿ� : ");
			strArr[i] = sc.nextLine();
		}
		
		String user = null;
		
		do {
			System.out.print("�� �Է��Ͻðڽ��ϱ�?(y/n) : ");
			user = sc.nextLine();
			
			//***********************************//
			if(user.equalsIgnoreCase("Y")) { // ��ҹ��ڸ� �����ϰ� �������� Ȯ����!!
				System.out.print("�� �Է��ϰ� ���� ���� : ");
				int add = Integer.parseInt(sc.nextLine());
				String[] newArr = new String[strArr.length + add];
				System.arraycopy(strArr, 0, newArr, 0, strArr.length);
				
				for(int i = strArr.length; i < newArr.length; i++) {
					System.out.print((i+1) + "��° ���ڿ� : ");
					newArr[i] = sc.nextLine();
				}
				strArr = newArr; // �ѹ� �� �ϰڴٰ� �ϸ� new -> str�� �ǰ� new�� �����.
			}
		}while(!user.equalsIgnoreCase("N"));
		
		// char���� Igonore ����.
//		char ch = 'a';
//		String cap = ch + "";
//		!cap.equalsIgnoreCase("N")
		
		// �迭�� for���� �Ȱ�ġ�� �ִ� �״�� ����ϱ�.
//		System.out.println(Arrays.toString(strArr));
//		=> [ , ] ���·� ��µȴ�.([,]�� ���� ����)
	}
}
