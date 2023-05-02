import java.util.Scanner;

public class Ex02while문 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		
//		int input=0;
//		while(input<10) {
//			input = sc.nextInt();
//		}
//		System.out.println( "while 문 탈출!");
//		
//		do {
//			
//			input = sc.nextInt();
//		}while();
//		
//		while (true) {
//			input = sc.nextInt();
//			if (input>=10) {
//				break;
//			}
//		}
	
		int num1 =0;
		int sum = 0;
		// 0보다 큰수 합계 구하기
		while(true) {
			System.out.print("숫자 입력 >> ");
			num1 = sc.nextInt();
			sum+=num1;
			if (num1 < 0) {
				break;
			}
		}
		System.out.println("누적결과 : "+ sum);
		System.out.println("--------------");
		sum = 0;		
		do {
			num1 = sc.nextInt();
			sum+=num1;
			
		} while (num1>0);
		System.out.println("누적결과 : "+ sum);
		
		       
		
		
		
		
		
		
	}

}
