package kwong.kh;

import java.util.Arrays;

public class Practice {

//	public void method1(){
//		
//		int[][] arr = new int[2][2];
//		
//		// �� �迭�� 1���� ���������� �ֱ�.
//		System.out.println("==== 1�� ====");
//		int num = 1;
//		for(int i = 0; i < arr.length; i++) {
//			for(int j = 0; j < arr[i].length; j++) {
//				arr[i][j] = num;
//				num++;
//				System.out.print(arr[i][j]);
//			}
//			System.out.println();
//		}
//		
//		
//		// ���� ���ڸ� �������� ������.
//		// �켱 4���� ����غ���. 
//		
//		int turn = 1;
//		
//		do{
//			int[][] arr2 = arr;
//			turn++;
//			System.out.println("====" + turn + "��" + "====");
//			for(int i = 0; i < arr.length; i++) {
//				for(int j = 0; j < arr[i].length; j++) {
//					if(j != arr[i].length-1 && i != arr.length-1) {
//						arr2[i][j] = arr[i][j+1];
//					} else if(j == arr[i].length-1 && i != arr.length-1) {
//						arr2[i][j] = arr[i+1][j];
//					} else if(j != arr[i].length-1 && i == arr.length-1) {
//						arr2[i][j] = arr[i-1][j];
//					} else if(j == arr[i].length-1 && i == arr.length-1) {
//						arr2[i][j] = arr[i][j-1];
//					}
//					System.out.print(arr2[i][j]);
//				}
//				System.out.println();
//			}
//		}while(turn < 4);
//	}
	
	// ������ �ȵ�����. �ٽ��� �������迭�� ������ 4���� ���� �ѹ��� ������ �ִٴ°�..
	public static void picture() {
		int [][] picture = new int [3][3];
	      picture[0][0]= 1;
	      picture[0][1]= 2;
	      picture[0][2]= 3;
	      picture[1][0]= 4;
	      picture[1][1]= 5;
	      picture[1][2]= 6;
	      picture[2][0]= 7;
	      picture[2][1]= 8;
	      picture[2][2]= 9;
	      Rotate(picture);
	}
	public static int[][] Rotate (int [][] picture) {
      int n = 2;
      for(int i=0; i <= (n+1)*(n+1)/4; i++) {
         int temp = picture [i][i];
         picture[i][i] = picture[n-i][i];
         picture[n-i][i] = picture[n-i][n-i];
         picture[n-i][n-i] = picture[i][n-i];
         picture[i][n-i] = temp;
      }
      System.out.println(Arrays.deepToString(picture));
      return picture;
	}
}
		
