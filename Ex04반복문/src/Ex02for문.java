import java.util.Scanner;

public class Ex02for문 {

	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	
		
	//1-100까지 출력
	for ( int i = 3; i<=100; i+=3) {
		System.out.print(i+" ");
	}
	System.out.println();	
	
	for (int i = 3; i<=100; i++) {
		if (i%3==0||i%5==0) {
			System.out.print(i + " ");
		}
	}
	//2의 배수 10개
	System.out.println();
	System.out.print("자연수를 입력하세요 : ");
	int input = sc.nextInt();	
	for (int i = 1; i<=10; i++) {
	System.out.print(input*i+ " ");
	}	
	//구구단 2단
	System.out.println();
	System.out.println("구구단 ");
	for (int i = 1; i<=9; i++) {
		int k = 2*i;
	System.out.println(2+"+"+ i +"="+k);
	}	
	
	
	
	
	}

}
