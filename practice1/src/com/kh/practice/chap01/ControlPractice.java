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
		
		double result = 0;
		
		switch(op) {
		case '+':
			result = num1 + num2;
			break;
		case '-':
			result = num1 - num2;
			break;
		case '*':
			result = num1 * num2;
			break;
		case '/':
			result = (double)num1 / (double)num2;
			break;
		case '%':
			result = num1 % num2;
			break;
		default:
			System.out.println("�߸� �Է��ϼ̽��ϴ�. ���α׷��� �����մϴ�.");
		}
		
		if(op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
			System.out.println(num1 + " " + op + " " + num2 + " = " + result);
		}
		
		// ?? : 3.75�� ������ ���´�. (double)�� �־����!
		
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
		double perAtt = (double)att / (double)maxAtt * 100.0;
		
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
		
		// ?? : perAtt < 70 �⼮�� 70%���ϸ� ǥ���ߴµ� �Ἦ���� ǥ���Ϸ��� �ٽ� �����ϴ¼��ۿ�����?
		
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
		
		switch(menu) {
		case 1: case 2: case 3: case 4: case 5:
		case 6: case 7: case 8: case 9:
			System.out.println("(�ǽ�����" + menu + " ����!)");
			break;
		}
		
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
		}
		
		// ?? : �� �ٹٲ޵Ǿ� (�ǽ�����n ����!)�� ��� �Ǵ°�?
		// ?? : �޼ҵ�/Ŭ�������� ������ �� �� �ִ°�? 
	}
}
