import java.util.Scanner;

public class Ex01이차원배열생성 {

	public static void main(String[] args) {
		
		int[][] arr = new int[3][5];
		// 일차원배열 3개 -각 배열은 5칸 짜리
		// 레퍼런스 배열 -한개 (배열 길이는 3)
		// 3행5열

		arr[0][0] = 10;
		// arr[0] = 1; ->레퍼런스 배열은 초기화 불가능
		System.out.println(arr[0][0]);

		char[][] charArr = { { 'a', 'b', 'c' }, { 'd', 'e', 'f' } };
		System.out.println(charArr.length);// ->2 레퍼런스 배열의 길이 (일차원배열이 몇개인지)
		System.out.println(charArr[0].length);// ->3 일차원 배열의 길이
		System.out.println();
		
		int[][] arr1 = new int[5][5];
		int num = 1;
		for (int i = 0; i < arr1.length; i++) {// 행
			for (int j = 0; j < arr1[i].length; j++) {// 열
				arr1[i][j] = num++;
				System.out.printf("%-3d", arr1[i][j]); // \t-> tap키
			}
			System.out.println();
		}
		System.out.println();
		int num1 = 21;
		int n[][] = new int[4][6];
		for (int i = 0; i < n.length; i++) {
			for (int j = 0; j < n[i].length; j++) {
				n[i][j] = num1;
				num1++;
				System.out.printf("%-3d", n[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		
		int num2 = 1;
		int n1[][] = new int[5][5];

		for (int i = 0; i < n1.length; i++) {
			for (int j = n1[i].length - 1; j >= 0; j--) {
				n1[i][j] = num2;
				num2++;
			}
		}
		for (int i = 0; i < n1.length; i++) {
			for (int j = 0; j < n1[i].length; j++) {
				System.out.printf("%-3d", n1[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		
		int num3 = 1;
		int n2[][] =new int [5][5];
		
		for (int i =0; i<n2.length; i++) {
			if (i%2==0) { // 순차적 0,2,4
				for (int j = 0; j<n2[i].length; j++) {
					n2[i][j]= num3++; 
				}
			}else {//역방향 1,3
				for (int j= n2[i].length-1; j>=0; j--) {
					n2[i][j]= num3++; 
				}
			}
		}
		
		for (int i = 0; i < n2.length; i++) {
			for (int j = 0; j < n2[i].length; j++) {
				System.out.printf("%-3d", n2[i][j]);
			}
			System.out.println();
		}
		
		
	}

}
