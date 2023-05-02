import java.util.Scanner;

public class Ex01_IF문 {

	public static void main(String[] args) {
		
				
		Scanner sc = new Scanner(System.in);
		
		
//		int age = sc.nextInt();
//		
//		if (age>=20) {
//			System.out.println("성인입니다.");
//			
//		}
//		System.out.println("맨 아랫줄 !");
		
//		System.out.print("숫자 입력 : ");
//		int num = sc.nextInt();
//		
//		if (num%3==0||num%5==0) {
//			System.out.println("3 또는 5의 배수 입니다.");
//		}

		
		
		System.out.print("JAVA 점수 입력 : ");
		int java = sc.nextInt();
		System.out.print("python 점수 입력 : ");
		int python = sc.nextInt();
		System.out.print("Android 점수 입력 : ");
		int android = sc.nextInt();
		int sum = java + python + android;
				
		if ((sum/3)>80) {
			System.out.println("합격");
		}else { System.out.println("불합격");
		} System.out.println("맨아랫줄");
		
		System.out.print("총 금액 : ");
		int money = sc.nextInt();
		System.out.print("사람 명 수 : ");
		int p = sc.nextInt();
		int i = money/p;
		
		if (i >=10000) {
			System.out.println("10000원 이상 지불");
		}else System.out.println("10000원 미만 지불");
		
		
		
		
	}

}
