import java.util.Scanner;

public class Ex02_ifelse문 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
//		System.out.print("총 금액 : ");
//		int money = sc.nextInt();
//		System.out.print("사람 명 수 : ");
//		int p = sc.nextInt();
//		int i = money/p;
//		
//		if (i >=10000) {
//			System.out.println("10000원 이상 지불");
//		}else System.out.println("10000원 미만 지불");
//		
		
		System.out.print("소프트웨어 설계 : ");
		int a = sc.nextInt();
		System.out.print("소프트웨어 개발 : ");
		int b = sc.nextInt();
		System.out.print("데이터베이스 구축 : ");
		int c = sc.nextInt();
		System.out.print("프로그래밍 언어 활용 : ");
		int d = sc.nextInt();
		System.out.print("정보시스템 구축 관리 : ");
		int e = sc.nextInt();
		int sum = a+b+c+d+e;
		
		if (a>8 && b>8 && c>8 && d>8 && e>8 && sum >= 60) {
			System.out.println("합격 입니다. ");
		}else {
			System.out.println("불합격 입니다 ");	
		}
		

		
	
				
		
		
	}

}
