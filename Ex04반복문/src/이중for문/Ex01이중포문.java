package 이중for문;

import java.util.Scanner;

public class Ex01이중포문 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);	
		
		
		for (int i = 2; i<=9; i++) {
			System.out.print(i+"단 : ");
			for (int j = 1; j<=9; j++) { 
				System.out.print(i + "*" + j + "=" + i*j + " ");
			}
			System.out.println();
		}
		
		
		
		int input;
		int sum =0;
		System.out.print("정수 입력 : ");
		input = sc.nextInt();
		for(int i = 1 ; i<=8; i++) {
			System.out.print(input);
			sum+=input;
		}
		System.out.println(sum);
			
		
		
		
	}

}
