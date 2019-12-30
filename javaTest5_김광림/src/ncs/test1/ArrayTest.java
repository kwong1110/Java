package ncs.test1;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayTest {

	// 1���� �迭�� ��� �ִ� �����͵��� �ִ밪, �ּҰ�, ¦���� ����, Ȧ���� ����, �հ�� ����� ���Ѵ�.
	// int [] array = new int[10];
	// �� index �� ���� java.util.Random ���� 1���� 100������ ������ ������ ��� ó��
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�Ҵ�� �迭�� ũ�� : ");
		int size = Integer.parseInt(sc.nextLine());
		int [] array = new int[size];
		for(int i = 0; i < array.length; i++) {
			int random = (int)((Math.random() * 99) +1);
			array[i] = random;
		}
			
		ArrayTest at = new ArrayTest();
		at.print(array);
		System.out.println("���� ū �� : " + at.max(array));
		System.out.println("���� ���� �� : " + at.min(array));
		System.out.println("¦���� ���� : " + at.evenCount(array) + " ��");
		System.out.println("Ȧ���� ���� : " + at.oddCount(array) + " ��");
		System.out.println("�հ� : " + at.sum(array));
		System.out.printf("��� : %.2f", at.avg(array));
	}
	
	public int sum(int[] arr) {
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}
	
	public double avg(int[] arr) {
		double avg = sum(arr) / arr.length;
		
		return avg;
	}
	
	public int max(int[] arr) {
		Arrays.sort(arr);
		
		return arr[arr.length - 1];
	}
	
	public int min(int[] arr) {
		Arrays.sort(arr);
		return arr[0];
	}
	
	public int evenCount(int[] arr) {
		int evenCount = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % 2 == 0) {
				evenCount++;
			}
		}
		return evenCount;
	}
	
	public int oddCount(int[] arr) {
		int oddCount = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % 2 != 0) {
				oddCount++;
			}
		}
		return oddCount;
	}
	
	public void print(int[] arr) {
//		System.out.println("array : " + Arrays.toString(arr));
		System.out.print("array : ");
		for(int i = 0; i < arr.length; i++) {
			if(i == arr.length - 1) {
				System.out.println(arr[i]);
			} else {
				System.out.print(arr[i] + " ");
			}
		}
	}
}
