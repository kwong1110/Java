package com.kh.practice.dimension;

import java.util.Scanner;

public class DimensionPractice {

	public void practice1() {
		
//		3�� 3��¥�� ���ڿ� �迭�� ���� �� �Ҵ��ϰ�
//		�ε��� 0�� 0������ 2�� 2������ ���ʴ�� �����Ͽ� ��(0, 0)���� ���� �������� ���� �� ����ϼ���.
		
		int[][] arr = new int[3][3];
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print("("+ i + ", ");
				System.out.print(j + ")");
			}
			System.out.println();
		}
	}
	
	public void practice2() {
		
//		4�� 4��¥�� ������ �迭�� ���� �� �Ҵ��ϰ�
//		1) 1 ~ 16���� ���� ���ʴ�� �����ϼ���.
//		2) ����� ������ ���ʴ�� ����ϼ���.
		
		int[][] arr = new int[4][4];
		
		int value = 1;
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = value;
				value++;
				System.out.printf("%3d",arr[i][j]);
			}
			System.out.println();
		}
	}
	
	public void practice3() {
		
//		4�� 4��¥�� ������ �迭�� ���� �� �Ҵ��ϰ�
//		1) 16 ~ 1�� ���� ���� �Ųٷ� �����ϼ���.
//		2) ����� ������ ���ʴ�� ����ϼ���.
		
		int[][] arr = new int[4][4];
		
		int value = 16;
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = value;
				value--;
				System.out.printf("%3d",arr[i][j]);
			}
			System.out.println();
		}
	}
	
	public void practice4() {
		
//		4�� 4�� 2���� �迭�� �����Ͽ� 0�� 0������ 2�� 2�������� 1~10������ ������ ���� �� ���� ��
//		�Ʒ��� ����ó�� ó���ϼ���.
		
		int[][] arr = new int[4][4];
		
		int lineSum = 0;
		int rowSum = 0;
		int lineRowSum = 0;
		
		for(int line = 0; line < arr.length; line++) {
			for(int row = 0; row < arr[line].length; row++) {
				
				int random = (int)(Math.random() * 10) + 1;
				
				// 3�� ���� ���� ����. �� ���� ��
				if(line != arr.length-1 && row == arr.length-1) {
					arr[line][row] = lineSum;
					lineSum = 0;
				} else if(line != arr.length - 1 && row != arr.length -1) {
					arr[line][row] = random;
					lineSum += random;
				}
				
				// ������ ���� �� ���� ���� ���ؾ���.
				// ������ ���� �� ���̴ϱ� arr.length-1
				if(line == arr.length-1 && row != arr.length-1) {
					for(int i = 0; i < arr.length-1; i++) {
						rowSum += arr[i][row];
					}
					arr[line][row] = rowSum;
					rowSum = 0;
					
				// ������ ���� �հ� ������ ���� ���� ���ؾ���.
				} else if(line == arr.length-1 && row == arr.length-1) {
					for(int i = 0; i < arr.length-1; i++) {
						lineRowSum += arr[i][row];
						lineRowSum += arr[line][i];
					}
					arr[line][row] = lineRowSum;
				}
				System.out.printf("%3d",arr[line][row]);
			}
			System.out.println();
		}
	}
	
	public void practice4Kh() {
		
		// 4�� 4�� 2���� �迭�� �����Ͽ�
		int[][] arr = new int[4][4];
		
		// 0�� 0�� ���� 2�� 2�������� 1~10������ ������ ���� �� ���� ��
		for(int i = 0; i < arr.length-1; i++) {
			for(int j = 0; j < arr[i].length-1; j++) {
				arr[i][j] = (int)(Math.random() * 10) +1;
			}
		}
		
//		arr[0][3] = arr[0][0]
//				  + arr[0][1]
//				  + arr[0][2];
//		arr[1][3] = arr[1][0]
//				  + arr[1][1]	
//				  + arr[1][2];
//		arr[2][3] = arr[2][0]
//				  + arr[2][1]
//				  + arr[2][2];
//	
//		
//		
//		arr[3][0] = arr[0][0]
//				  + arr[1][0]
//				  + arr[2][0];
//		arr[3][1] = arr[0][1]
//				  + arr[1][1]
//				  + arr[2][1];
//		arr[3][2] = arr[0][2]
//				  + arr[1][2]
//				  + arr[2][2];
		
		for(int i = 0; i < arr.length-1; i++) {
			for(int j = 0; j < arr[i].length-1; j++) {
				arr[i][3] += arr[i][j];
				arr[3][i] += arr[j][i];
			}
		}
		
		for(int i = 0; i < arr.length-1; i++) {
			arr[3][3] += arr[i][3] + arr[3][i];
		}
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.printf("%3d", arr[i][j]);
			}
			System.out.println();
		}
	}
	
	public void practice5() {
		
//		2���� �迭�� ��� ���� ũ�⸦ ����ڿ��� ���� �Է¹޵�, 1~10���� ���ڰ� �ƴϸ�
//		���ݵ�� 1~10 ������ ������ �Է��ؾ� �մϴ�.�� ��� �� �ٽ� ������ �ް� �ϼ���.
//		ũ�Ⱑ ������ ������ �迭 �ȿ��� ���� �빮�ڰ� �������� ���� �� �� ����ϼ���.
//		(char���� ���ڸ� ���ؼ� ���ڸ� ǥ���� �� �ְ� 65�� A�� ��Ÿ��)
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�� ũ�� : ");
		int line = sc.nextInt();
		System.out.print("�� ũ�� : ");
		int row = sc.nextInt();
		
		int[][] arr = new int[line][row];
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j <arr[i].length; j++) {
				int random = (int)(Math.random()* 26) + 65;
				arr[i][j] = random;
				System.out.printf("%-2c",arr[i][j]);
			}
			System.out.println();
		}
	}
	
	public void practice6() {
		
//		String[][] strArr = new String[][] {{"��", "��", "��", "��", "��"}, 
//		{"��", "��", "��", "��", "��"}, {"��", "��", "��", "��", "��"},
//		{"��", "��", "��", "��", "��"}, {"��", "��", "! ", "��", "!! "}};
		
//		���� �ʱ�ȭ�Ǿ� �ִ� �迭�� ������ �Ʒ��� ��[�׸�] �ǽ�����4 �帧���� ���� ������� ����ϼ���.
//		��, print()�� ����ϰ� �� ���̿� ����(�� ��)�� �����ϵ��� ����ϼ���.
		
		String[][] strArr = new String[][] {{"��", "��", "��", "��", "��"}, 
			{"��", "��", "��", "��", "��"}, {"��", "��", "��", "��", "��"},
			{"��", "��", "��", "��", "��"}, {"��", "��", "!", "��", "!!"}};
		
		for(int i = 0; i < strArr.length; i++) {
			for(int j = 0; j < strArr[i].length; j++) {
				System.out.print(strArr[j][i] + " ");
			}
			System.out.println();
		}
	}
	
	public void practice7() {
		
//		����ڿ��� ���� ũ�⸦ �Է� �ް� �� ����ŭ�� �ݺ��� ���� ���� ũ�⵵ �޾�
//		������ ���� �迭�� ���� �� �Ҵ��ϼ���.
//		�׸��� �� �ε����� ��a������ �� �ε����� ������ŭ �ϳ��� �÷� �����ϰ� ����ϼ���.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� ũ�� : ");
		int line = sc.nextInt();
		int[][] arr = new int[line][];
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(i + "���� ũ�� : ");
			int row = sc.nextInt();
			arr[i] = new int[row];	
			if(row != 0) {
				continue;
			}
		}
		int a = 97;
		for(int i = 0; i < arr.length; i++) {
			for(int j =0; j <arr[i].length; j++) {
				arr[i][j] = a++;
//				a++;
				System.out.printf("%-2c",arr[i][j]);
			}
			System.out.println();
		}
	}
	
	public void practice7Kh() {
		// ����ڿ��� ���� ũ�⸦ �ް�
		Scanner sc = new Scanner(System.in);
		System.out.print("���� ũ�� : ");
		int row = sc.nextInt();
		
		// �� ����ŭ �ݺ��� ���� ���� ũ�⵵ �޾� ������ ���� �迭�� ���� �� �Ҵ�
		char[][] chArr = new char[row][];
		for(int i = 0; i < row; i++) {
			System.out.print(i + "���� ũ�� : ");
			chArr[i] = new char[sc.nextInt()];
		}
		
		char data = 'a';
		for(int i = 0; i < chArr.length; i++) {
			for(int j = 0; j < chArr[i].length; j++) {
				chArr[i][j] = data++;
				System.out.print(chArr[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public void practice8() {
		
//		1���� �迭�� 12���� �л����� �⼮�� ������ �ʱ�ȭ �ϰ�
//		2�� 3������ 2���� �迭 2���� �̿��Ͽ� �д��� ����
//		1�д� ���ʺ��� ������, 1�࿡�� �Ʒ� �� ������ �ڸ��� ��ġ�ϼ���.
//		<�⼮��>
//		1. ���ǰ� 2. ������ 3. ����� 4. ����� 5. ���̹� 6. �ں���
//		7. �ۼ��� 8. ������ 9. ������ 10. ��õ�� 11. ��ǳǥ 12. ȫ����
		
		// 1�д� ���� 2�д�
		String student[] = {"���ǰ�", "������", "�����", "�����", "���̹�", "�ں���",
							"�ۼ���", "������ ", "������", "��õ��", "��ǳǥ", "ȫ����"};
		
		String group1[][] = new String[3][2];
		String group2[][] = new String[3][2];
		
		int studentP = 0;
		System.out.println("== 1�д� ==");
		for(int i = 0; i < group1.length; i++) {
			for(int j = 0; j < group1[i].length; j++) {
				group1[i][j] = student[studentP];	
				studentP ++;
				System.out.printf("%-5s",group1[i][j]);
			}
			System.out.println();
		}
		
		System.out.println("== 2�д� ==");
		for(int i = 0; i < group2.length; i++) {
			for(int j = 0; j < group2[i].length; j++) {
				group2[i][j] = student[studentP];	
				studentP ++;
				System.out.printf("%-5s",group2[i][j]);
			}
			System.out.println();
		}
	}
	
	public void practice9() {
		
//		�� �������� �ڸ� �踮 ��ġ�� ���� ������ �л� �̸��� �˻��Ͽ�
//		�ش� �л��� ��� �ڸ��� �ɾҴ��� ����ϼ���.
		
		String student[] = {"���ǰ�", "������", "�����", "�����", "���̹�", "�ں���",
				"�ۼ���", "������", "������", "��õ��", "��ǳǥ", "ȫ����"};
		
		String group1[][] = new String[3][2];
		String group2[][] = new String[3][2];
		
		int studentP = 0;
		System.out.println("== 1�д� ==");
		for(int i = 0; i < group1.length; i++) {
			for(int j = 0; j < group1[i].length; j++) {
				group1[i][j] = student[studentP];	
				studentP ++;
				System.out.printf("%-5s",group1[i][j]);
			}
			System.out.println();
		}
		System.out.println("== 2�д� ==");
		for(int i = 0; i < group2.length; i++) {
			for(int j = 0; j < group2[i].length; j++) {
				group2[i][j] = student[studentP];	
				studentP ++;
				System.out.printf("%-5s",group2[i][j]);
			}
			System.out.println();
		}
		System.out.println("============================");
		Scanner sc = new Scanner(System.in);
		System.out.print("�˻��� �л� �̸��� �Է��ϼ��� : ");
		String searchName = sc.nextLine();
		
		String dan = null;
		String rine = null;
		String rightLeft = null;
		
		for(int i = 0; i < group1.length; i++) {
			for(int j = 0; j < group1[i].length; j++) {
				if(group1[i][j].equals(searchName)) {
					dan = "1�д�";
					switch(i) {
						case 0 : rine = "ù ��° ��"; break;
						case 1 : rine = "�� ��° ��"; break;
						case 2 : rine = "�� ��° ��"; break;
					}
					switch(j) {
						case 0 : rightLeft = "����"; break;
						case 1 : rightLeft = "������"; break;
					}
				} else if(group2[i][j].equals(searchName)) {
					dan = "2�д�";
					switch(i) {
						case 0 : rine = "ù ��° ��"; break;
						case 1 : rine = "�� ��° ��"; break;
						case 2 : rine = "�� ��° ��"; break;
					}
					switch(j) {
						case 0 : rightLeft = "����"; break;
						case 1 : rightLeft = "������"; break;
					}
				}
			}
		}
		System.out.printf("�˻��Ͻ� %s �л��� %s %s %s �� �ֽ��ϴ�.", searchName, dan, rine, rightLeft);
	}
	
	public void practice9Kh() {
		// 1���� �迭�� 12���� �л����� �⼮�� ������ �ʱ�ȭ �ϰ�
		String[] student = {"���ǰ�", "������", "�����", "�����", "���̹�", "�ں���",
							"�ۼ���", "������", "������", "��õ��", "����ǥ", "ȫ����"};
		
		// 2�� 3������ 2���� �迭 2���� �̿��Ͽ� �д��� ����
		String[][] seat1 = new String[3][2];
		String[][] seat2 = new String[3][2];
		
		// 1�д� ���ʺ��� ������, 1�࿡�� �Ʒ� �� ������ �ڸ� ��ġ.
		int count = 0;
		// �л� ���� ���� ���ؼ�, �̾ ���� �� �ֵ��� ������ ���� ���ش�.
		System.out.println("== 1�д� ==");
		for(int i = 0; i < seat1.length; i++) {
			for(int j = 0; j < seat1[i].length; j++) {
				seat1[i][j] = student[count];
				count++;
				System.out.print(seat1[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("== 2�д� ==");
		for(int i = 0; i < seat2.length; i++) {
			for(int j = 0; j < seat2[i].length; j++) {
				seat2[i][j] = student[count];
				count++;
				System.out.print(seat2[i][j] + " ");
			}
			System.out.println();
		}
		
		// �˻�
		System.out.println("=============================");
		
		// �л� �̸��� �˻��Ͽ� �ش� �л��� ��� �ڸ��� �ɾҴ��� ���
		Scanner sc = new Scanner(System.in);
		System.out.print("�˻��� �л� �̸��� �Է��ϼ��� : ");
		String name = sc.nextLine();
		
		String partName = null; // �д�
		String rowName = null;	// �� ��° ��
		String colName = null;	// ����, ������
		
		for(int i = 0; i < seat1.length; i++) {
			for(int j = 0; j <seat1[i].length; j++) {
				if(seat1[i][j].equals(name)) {
					partName = "1�д�";
					if(i == 0) {
						rowName = "ù ��° ��";
					} else if(i == 1) {
						rowName = "�� ��° ��";
					} else {
						rowName = "�� ��° ��";
					}
					
					if(j == 0) {
						colName = "����";
					} else {
						colName = "������";
					}
					break;
				}
				if(seat2[i][j].equals(name)) {
					partName = "2�д�";
					if(i == 0) {
						rowName = "ù ��° ��";
					} else if(i == 1) {
						rowName = "�� ��° ��";
					} else {
						rowName = "�� ��° ��";
					}
					
					if(j == 0) {
						colName = "����";
					} else {
						colName = "������";
					}
					break;
				}
			}
		}
		System.out.println("�˻��Ͻ� " + name + " �л���" + partName + " " + rowName + " " + colName + "�� �ֽ��ϴ�.");
 	}
}
