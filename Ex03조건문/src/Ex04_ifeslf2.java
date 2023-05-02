import java.util.Scanner;

public class Ex04_ifeslf2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
//		System.out.print("A,B,C 중 하나 입력 : ");
//		String s = sc.next();
//		
//		if (s.equals("A")) {
//			System.out.println("A 입력");
//		}else if (s.equals("B")) {
//			System.out.println("B 입력");
//			
//		}else if (s.equals("C")) {
//			System.out.println("C 입력");
//			
//		}else {
//			System.out.println("A,B,C 외 입력해주세요 ");
//		}
		
		System.out.print("잔액 : ");
		int money = sc.nextInt();
		System.out.print("성임/청소년/어린이 : ");
		String old = sc.next();
		
		if (old.equals("성인") && money >=1800 ) {
			System.out.println("감사합니다");
		}else if (old.equals("청소년") && money >=1500 ) {
			System.out.println("반갑습니다");
		}else if (old.equals("어린이") && money >=1000 ) {
			System.out.println("안녕하세요");
			
		}else {
			System.out.println("잔액이 부족합니다");
		}
		

	}

}
