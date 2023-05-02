import java.util.Scanner;

public class Ex02산술연산 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int num = 456;
		int num1 = 111;
		
		System.out.println(num-(num%100));
		System.out.println(num1-(num1%100));
		
		
		
		int num2 = 456;
		int num3 = 777;
		
		System.out.println(((num2/10) * 10)+ 1);
		System.out.println(((num3/10) * 10)+ 1);
		
				
		System.out.print("첫번째 정수 입력 : ");
		int num4 = sc.nextInt();
		System.out.print("두번째 정수 입력 : ");
		int num5 = sc.nextInt();
		
		System.out.println();
		
		System.out.println("두수의 더하기 : "+ (num4+num5));
		System.out.println("두수의 빼기 : "+ (num4-num5));
		System.out.println("두수의 곱하기 : "+ (num4*num5));
		System.out.println("두수의 나누기(몫): "+ (num4/num5));
		
		System.out.println();
		
		System.out.print("JAVA 점수 입력 : ");
		int java = sc.nextInt();
		System.out.print("WEB 점수 입력 : ");	
		int web = sc.nextInt();
		System.out.print("ANDROID 점수 입력 : ");	
		int android = sc.nextInt();
		
		System.out.println("합계 : " + (java+web+android));
		System.out.println("합계 : " + (java+web+android));
		
	}

}
