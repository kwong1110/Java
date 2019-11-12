package com.kh.practice.chap01;

import java.util.Scanner;

public class ControlPractice {
	
	Scanner sc = new Scanner(System.in);
	
	public void practice1() {
		
		// �Ʒ� ���ÿ� ���� �޴��� ����ϰ� �޴� ��ȣ�� ������ ��OO�޴��Դϴ١���,
		// ���� ��ȣ�� ������ �����α׷��� ����˴ϴ�.���� ����ϼ���
		
		System.out.println("1. �Է�");
		System.out.println("2. ����");
		System.out.println("3. ��ȸ");
		System.out.println("4. ����");
		System.out.println("7. ����");
		System.out.print("�޴� ��ȣ�� �Է��ϼ��� : ");
		int menuNum = sc.nextInt();
		
		switch(menuNum) {
		case 1:
			System.out.println("�Է� �޴� �Դϴ�.");
			break;
		case 2:
			System.out.println("���� �޴� �Դϴ�.");
			break;
		case 3:
			System.out.println("��ȸ �޴� �Դϴ�.");
			break;
		case 4:
			System.out.println("���� �޴� �Դϴ�.");
			break;
		case 7:
			System.out.println("���� �޴� �Դϴ�.");
			break;
		}
	}
	
	public void practice2() {
		
		// Ű����� ������ �Է� ���� ������ ����̸鼭 ¦���� ���� ��¦���١��� ����ϰ�
		// ¦���� �ƴϸ� ��Ȧ���١��� ����ϼ���.
		// ����� �ƴϸ� ������� �Է����ּ���.���� ����ϼ���.
		
		System.out.print("���ڸ� �� �� �Է��ϼ��� : ");
		int num = sc.nextInt();
		if(num > 0 && num % 2 == 0) {
			System.out.print("¦����!");
		} else if(num % 2 != 0) {
			System.out.print("Ȧ����!");
		} else {
			System.out.print("����� �Է����ּ���.");
		}
	}
	
	public void practice3() {
		
		// ����, ����, ���� �� ������ ������ Ű����� �Է� �ް� �հ�� ����� ����ϰ�
		// �հ�� ����� �̿��Ͽ� �հ� / ���հ� ó���ϴ� ����� �����ϼ���.
		// (�հ� ���� : �� ������ ������ ���� 40�� �̻��̸鼭 ����� 60�� �̻��� ���)
		// �հ� ���� ��� ���� �� ������ �հ�, ���, �������մϴ�, �հ��Դϴ�!���� ����ϰ�
		// ���հ��� ��쿡�� �����հ��Դϴ�.���� ����ϼ���.
		
		System.out.print("�������� : ");
		int korScore = sc.nextInt();
		System.out.print("�������� : ");
		int mathScore = sc.nextInt();
		System.out.print("�������� : ");
		int engScore = sc.nextInt();
		
		int totalScore = korScore + mathScore + engScore;
		double average = totalScore / 3;
		
		if(average >= 60 && korScore >= 40 
				&& mathScore >= 40 && engScore >= 40) {
			System.out.println("���� : " + korScore);
			System.out.println("���� : " + mathScore);
			System.out.println("���� : " + engScore);
			System.out.println("�հ� : " + totalScore);
			System.out.println("��� : " + average);
			System.out.println("�����մϴ�, �հ��Դϴ�!");
		} else {
			System.out.println("���հ��Դϴ�.");
		}
	}
	
	public void practice4() {
		
		// ���� �ڷ�(7page)���� if������ �Ǿ��ִ� 
		// ��, ����, ����, �ܿ� ������ switch������ �ٲ㼭 ����ϼ���.
		
		System.out.print("1~12 ������ ���� �Է� : ");
		int num = sc.nextInt();
		
		switch(num) {
		case 1: case 2: case 12:
			System.out.print(num + "���� �ܿ��Դϴ�.");
			break;
		case 3: case 4: case 5:
			System.out.print(num + "���� ���Դϴ�.");
			break;
		case 6: case 7: case 8:
			System.out.print(num + "���� �����Դϴ�.");
			break;
		case 9: case 10: case 11:
			System.out.print(num + "���� �ܿ��Դϴ�.");
			break;
		default:
			System.out.print(num + "���� �߸� �Էµ� ���Դϴ�.");
		}
	}
	
	public void practice5() {
		
//		���̵�, ��й�ȣ�� ���صΰ� �α��� ����� �ۼ��ϼ���.
//		�α��� ���� �� ���α��� ������,
//		���̵� Ʋ���� �� �����̵� Ʋ�Ƚ��ϴ�.��,
//		��й�ȣ�� Ʋ���� �� ����й�ȣ�� Ʋ�Ƚ��ϴ�.���� ����ϼ���.
		
		System.out.print("���̵� : ");
		String id = sc.nextLine();
		System.out.print("��й�ȣ : ");
		String pw = sc.nextLine();
		
		if(id.equals("myId") && pw.equals("myPassword12")) {
			System.out.print("�α��� ����!");
		} else if(!id.equals("myId")){
			System.out.print("���̵� Ʋ�Ƚ��ϴ�.");
		} else {
			System.out.print("��й�ȣ�� Ʋ�Ƚ��ϴ�.");
		}
	}
	
	public void practice6() {
		
//		����ڿ��� ������, ȸ��, ��ȸ�� �� �ϳ��� �Է� �޾� �� ����� ���� �� �ִ� ������ ����ϼ���.
//		��, �����ڴ� ȸ������, �Խñ� ����, �Խñ� �ۼ�, �Խñ� ��ȸ, ��� �ۼ��� �����ϰ�
//		ȸ���� �Խñ� �ۼ�, �Խñ� ��ȸ, ��� �ۼ��� �����ϰ�
//		��ȸ���� �Խñ� ��ȸ�� �����մϴ�
		
		System.out.print("������ Ȯ���ϰ��� �ϴ� ȸ�� ��� : ");
		String level = sc.nextLine();
		
		String nonMember = "�Խñ� ��ȸ";
		String member = nonMember + ", �Խñ� �ۼ�" + ", ��� �ۼ�";
		String master = member + ", ȸ������" + ", �Խñ� ����";
		
		if(level.equals("��ȸ��")) {
			System.out.print(nonMember);
		} else if(level.equals("ȸ��")) {
			System.out.print(member);
		} else if(level.equals("������")) {
			System.out.print(master);
		} else {
			System.out.print("��ȸ��/ȸ��/������ �� �Է����ּ���.");
		}
	}
	
	public void practice7() {
		
//		Ű, �����Ը� double�� �Է� �ް� BMI������ ����Ͽ� ��� ����� ����
//		��ü��/����ü��/��ü��/���� ����ϼ���.
//		BMI = ������ / (Ű(m) * Ű(m))
//		BMI�� 18.5�̸��� ��� ��ü�� / 18.5�̻� 23�̸��� ��� ����ü��
//		BMI�� 23�̻� 25�̸��� ��� ��ü�� / 25�̻� 30�̸��� ��� ��
//		BMI�� 30�̻��� ��� �� ��
		
		System.out.print("Ű(m)�� �Է��� �ּ��� : ");
		double height = sc.nextDouble();
		System.out.print("������(kg)�� �Է��� �ּ��� : ");
		double weight = sc.nextDouble();
		
		double bmi = weight / (height * height);
		System.out.println(bmi);
		
		if(bmi < 18.5) {
			System.out.print("��ü��");
		} else if (bmi < 23) {
			System.out.print("����ü��");
		} else if (bmi < 25) {
			System.out.print("��ü��");
		} else if (bmi < 30) {
			System.out.print("��");
		} else {
			System.out.print("�� ��");
		}
	}
	
	public void practice8() {
		
//		Ű����� �� ���� ������ ���� ��ȣ�� �Է� �޾� ���� ��ȣ�� ���� ���� ����� ����ϼ���.
//		(��, �� ���� ���� ��� ����� ���� �۵��ϸ� ���� ���� ��ȣ�� �Է� ���� ��
//		���߸� �Է��ϼ̽��ϴ�. ���α׷��� �����մϴ�.�� ���)
		
		System.out.print("�ǿ�����1 �Է� : ");
		int num1 = sc.nextInt();
		System.out.print("�ǿ�����2 �Է� : ");
		int num2 = sc.nextInt();
		System.out.print("�����ڸ� �Է�(+,-,*,/,%) : ");
		sc.nextLine();
		char op = sc.nextLine().charAt(0);
		
		double result = 0; // ��� ����� ��� ����.
		
		if(num1 > 0 && num2 > 0) {
			switch(op) {
			case '+': result = num1 + num2;	break;
			case '-': result = num1 - num2;	break;
			case '*': result = num1 * num2;	break;
			case '/': result = (double)num1 / num2;	break;
			case '%': result = num1 % num2;	break;
			default:
				System.out.println("�߸� �Է��ϼ̽��ϴ�. ���α׷��� �����մϴ�.");
			}
			
			if(op == '/') {
				System.out.printf("%d %c %d = %f", num1, op, num2, result);
			}else if(op == '+' || op == '-' || op == '*' || op == '%') {
				System.out.printf("%d %c %d = %d", num1, op, num2, (int)result);
			}
		} else {
			System.out.println("������� �Է����ּ���. ���α׷��� �����մϴ�.");
		}
		
		// ���������� printf()�� ���� ������ double������ ����ؾ��ϴ°� �� �´�. 
//		if(op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
//			System.out.println(num1 + " " + op + " " + num2 + " = " + result);
//		}
		
	}
	
	public void practice9() {
		
		//�߰����, �⸻���, ��������, �⼮ȸ���� �Է��ϰ� Pass �Ǵ� Fail�� ����ϼ���.
		//�� ������ �߰���� 20%, �⸻��� 30%, ���� 30%, �⼮ 20%�� �̷���� �ְ�
		//�� ��, �⼮ ������ �⼮ ȸ���� �� ���� ȸ�� 20ȸ �߿��� �⼮�� ���� ���� ������ ����ϼ���.
		//70�� �̻��� ��� Pass, 70�� �̸��̰ų� ��ü ���ǿ� 30% �̻� �Ἦ �� Fail�� ����ϼ���
		
		System.out.print("�߰� ��� ���� : ");
		int mid = sc.nextInt(); 
		System.out.print("�⸻ ��� ���� : ");
		int finals = sc.nextInt(); 
		System.out.print("���� ���� : ");
		int assignment = sc.nextInt();
		System.out.print("�⼮ ȸ�� : ");
		int att = sc.nextInt();
		System.out.println("================= ��� =================");
		
		int maxAtt = 20;
		double perAtt = (double)att / maxAtt * 100.0;
		
		double totalMid = mid * 0.2;
		double totalFinal = finals * 0.3;
		double totalAss = assignment * 0.3;
		double totalAtt = perAtt * 0.2;
		double total = totalMid + totalFinal + totalAss + totalAtt;
		
		
		if(perAtt < 70) {
			System.out.println("Fail [�⼮ ȸ�� ���� " + "(" + att + "/" + maxAtt + ")]");
		} else {	
			System.out.println("�߰� ��� ����(20) : " + totalMid);
			System.out.println("�⸻ ��� ����(30) : " + totalFinal);
			System.out.println("���� ����       (30) : " + totalAss);
			System.out.println("�⼮ ����       (20) : " + totalAtt);
			System.out.println("�� �� : " + total);
			if(total >= 70) {
				System.out.println("PASS");
			} else if(total < 70) {
				System.out.println("Fail [���� �̴�]");
			}
		}
	}
	
	public void practice9_1() {
		
		System.out.print("�߰� ��� ���� : ");
		int midTerm = sc.nextInt(); 
		System.out.print("�⸻ ��� ���� : ");
		int finalTerm = sc.nextInt(); 
		System.out.print("���� ���� : ");
		int homework = sc.nextInt();
		System.out.print("�⼮ ȸ�� : ");
		int att = sc.nextInt();
		
		if(att > 20*0.7) { // �⼮ ����
			System.out.println("�߰� ��� ����(20) : " +  midTerm * 0.2);
			System.out.println("�⸻ ��� ����(30) : " +  finalTerm * 0.2);
			System.out.println("���� ����       (30) : " +  homework * 0.2);
			System.out.println("�⼮ ����       (20) : " +  att * 0.2);
			
			double sum
				= midTerm * 0.2 + finalTerm * 0.3 
				+ homework * 0.3 + (att / 20.0 * 100 * 0.2);
			System.out.println("���� : " + sum);
			
			if(sum >= 70 ) {
				System.out.println("PASS");
			} else {
				System.out.println("Fail [���� �̴�]");
			}
		} else {
			System.out.print("Fail [�⼮ ȸ�� ���� (" + att + "/20)]");
		}
	}
	
	public void practice10() {
		
		// �տ� ������ �ǽ������� �����Ͽ� ������ �� �ִ� �޴�ȭ���� �����ϼ���.
		
		System.out.println("������ ����� �����ϼ���.");
		System.out.println("1. �޴� ���");
		System.out.println("2. ¦��/Ȧ��");
		System.out.println("3. �հ�/���հ�");
		System.out.println("4. ����");
		System.out.println("5. �α���");
		System.out.println("6. ���� Ȯ��");
		System.out.println("7. BMI");
		System.out.println("8. ����");
		System.out.println("9. P/F");
		System.out.print("���� : ");
		int menu = sc.nextInt();
		sc.nextLine();		
//		���� Ŭ���� ���̱� ������ ���� ��ü������ �ҷ����� �ʾƵ� �޼ҵ带 ȣ�� �� �� ����. 
		
//		switch(menu) {
//		case 1: case 2: case 3: case 4: case 5:
//		case 6: case 7: case 8: case 9:
//			System.out.print("(�ǽ�����" + menu + " ����!)");
//			String enter = sc.nextLine();
//			break;
//		}

//		���� ���ص� �Ǵ� �κ�
		
		switch(menu) {
		case 1: practice1();
			break;
		case 2: practice2();
			break;
		case 3: practice3();
			break;
		case 4: practice4();
			break;
		case 5: practice5();
			break;
		case 6: practice6();
			break;
		case 7: practice7();
			break;
		case 8: practice8();
			break;
		case 9: practice9();
			break;
		default:
			System.out.println("�߸��Է��ϼ̽��ϴ�.");
		}
		
		// ?? : �� �ٹٲ޵Ǿ� (�ǽ�����n ����!)�� ��� �Ǵ°�? switch���� ����ɋ�??
		// ?? : �޼ҵ�/Ŭ�������� ������ �� �� �ִ°�? ����.
	}
	
	public void practice11() {
		
//		������ �̿��ؼ� 4�ڸ� ��й�ȣ�� ������� �ϴµ�
//		�� �� 4�ڸ� ������ �Է� �޾� �� �ڸ� ���� �ߺ��Ǵ� ���� ���� ��� ������ ������
//		�ߺ� ���� ������ ���ߺ� �� ������
//		�ڸ����� �� ������ ���ڸ� �� �� ������ ���
//		��, ���� ���ڸ� ���� ���� 1~9 ���� ����
		
		System.out.print("��й�ȣ �Է�(1000~9999) : ");
		String strPw = sc.nextLine(); 
		int pw = Integer.parseInt(strPw);
//		=2 int pw = Integer.parseInt(sc.nextLine());
//		-> String �ڷ����� ����ϱ� ������ �ȵ�
		int length = String.valueOf(pw).length(); 
//		= int length = (int)(Math.log10(pw)+1);
		
		
		// ����2 (��й�ȣ �ִ� �ڸ����� �����ϰ� ������)
		// ����(���)�� �� ���� �� �غ����Ѵ�.
		
//		int maxLength = 4; 
//		if(strPw.charAt(0) == '0') {
//			System.out.print("���� ���ڸ� ���� 0�� �ü� ����!");
//		} else if(length != maxLength){
//			System.out.print("�ڸ��� �ȸ���");
//		} else if(length == maxLength){
//			for (int i = 0; i < length; i++) {
//				for (int j = 0; j < length; j++) {
//					if(strPw.charAt(i) != strPw.charAt(j)) {
//						System.out.print("����!");
//					} else {
//						System.out.print("����, �ߺ� �� ����");
//						System.out.println(strPw.charAt(i));
//						System.out.println(strPw.charAt(j));
//						break;
//					}
//				}
//				break;
//			}
//		}
		
		
		// ����1
		
//		int num1 = strPw.charAt(0);
//		int num2 = strPw.charAt(1);
//		int num3 = strPw.charAt(2);
//		int num4 = strPw.charAt(3);
//		-> ������ ������ ��� ���� �ڸ����� ������־�, 1,2,3�ڸ��� �Է��ϸ� ����������.
//		-> �� �ڵ�� ����� ��������.
		
		if(strPw.charAt(0) == '0') {
			System.out.print("���� ���ڸ� ���� 0�� �ü� ����!");
		} else if(length != 4){
			System.out.print("�ڸ��� �ȸ���");
		} else if(strPw.charAt(0) == strPw.charAt(1) || strPw.charAt(0) == strPw.charAt(2) 
				|| strPw.charAt(0) == strPw.charAt(3) || strPw.charAt(1) == strPw.charAt(2)
				|| strPw.charAt(1) == strPw.charAt(3) || strPw.charAt(2) == strPw.charAt(3)){
			System.out.print("����, �ߺ� �� ����");
		} else {
			System.out.print("����!");
		}
		
		
		// ����1
//		if(strPw.charAt(0) != strPw.charAt(1)){
//			System.out.print("����!");
//		} else if(strPw.charAt(0) == strPw.charAt(1)){
//			System.out.print("����, �ߺ� �� ����");
//		}
		
	}
}
