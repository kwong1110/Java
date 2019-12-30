package ncs.test1;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayTest {

	// 1차원 배열에 들어 있는 데이터들의 최대값, 최소값, 짝수의 개수, 홀수의 개수, 합계와 평균을 구한다.
	// int [] array = new int[10];
	// 각 index 별 값은 java.util.Random 으로 1부터 100사이의 임의의 정수로 기록 처리
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("할당된 배열의 크기 : ");
		int size = Integer.parseInt(sc.nextLine());
		int [] array = new int[size];
		for(int i = 0; i < array.length; i++) {
			int random = (int)((Math.random() * 99) +1);
			array[i] = random;
		}
			
		ArrayTest at = new ArrayTest();
		at.print(array);
		System.out.println("가장 큰 값 : " + at.max(array));
		System.out.println("가장 작은 값 : " + at.min(array));
		System.out.println("짝수의 개수 : " + at.evenCount(array) + " 개");
		System.out.println("홀수의 개수 : " + at.oddCount(array) + " 개");
		System.out.println("합계 : " + at.sum(array));
		System.out.printf("평균 : %.2f", at.avg(array));
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
