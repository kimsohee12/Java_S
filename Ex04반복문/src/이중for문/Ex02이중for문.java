package 이중for문;

import java.util.Scanner;

public class Ex02이중for문 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		for (int i = 2; i <=30 ; i++) {
			System.out.print(i+ "의 약수 : ");
			for (int j=1; j<=i;j++) {
				if (i % j == 0) {
					System.out.print(j+" ");
				}
			}System.out.println();
		}
		
			

		
		
		
		
		
		
		
		
	}

}
