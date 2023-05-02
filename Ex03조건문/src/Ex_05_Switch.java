import java.util.Scanner;

public class Ex_05_Switch {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
//		int num = 20;
//		switch (num) {
//		case 20:
//			System.out.println("20");
//			break;
//		case 30 :
//			System.out.println("30");
//			break;
//		default:
//			System.out.println("다른수");
//			break;
//		}
		
//		System.out.print("입력 : ");
//		String lanuage = sc.next();
		
//		switch (lanuage) {
//		case "한국어" : System.out.println("안녕하세요");
//			break;
//		case "영어" : System.out.println("헬로");
//			break;
//		case "중국어" : System.out.println("니하오");
//			break;
//		case "일본어" : System.out.println("곤니찌와");
//			break;
//
//		default:
//			System.out.println("다른 값 입력 ");
//			break;
//		}
		
//		
//		System.out.print("월(1~12) 입력 : ");
//		int month = sc.nextInt();
//		
//		switch (month) {
//		case 1 : case 2: case 12: 
//			System.out.println("겨울");
//			break;
//		case 3 : case 4: case 5: 
//			System.out.println("봄");
//			break;
//		case 6 : case 7: case 8: 
//			System.out.println("여름");
//			break;
//		case 9 : case 10: case 11: 
//			System.out.println("가을");
//			break;
//		}
//		
		//------------------------------------

		int coke = 1800;
		int power = 2000;
		int sprit = 1200;
		
		
		System.out.print("넣을금액 : ");
		int money = sc.nextInt();
		
		System.out.println("---메뉴---");
		System.out.print("1.콜라(1800원) 2.파워에이드(2000원) 3.탄산수(1200원)>> ");
		int num = sc.nextInt();
		
		switch(num) {
		case 1 : money -= coke;
			break;
		case 2 : money -= power;
			break;
		case 3 : money -= sprit;
			break;
		}
		
		if (money >= 0) {
			System.out.printf(
		              "잔돈 : %d원\n"
		            + "천원 : %d\n"
		            + "오백원 : %d\n"
		            + "백원 : %d\n"
		            , money, money/1000, money%1000/500, money%1000%500/100);
		}else{
				System.out.println("금액이 부족합니다. ");
			}
	

		
		
		
		
		
	}

}
