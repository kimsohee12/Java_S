import java.util.Random;
import java.util.Scanner;

public class Ex05plusGame {

	public static void main(String[] args) {

		// int i= rd.nextInt(10)+1;// 범위를 줄수 있음-0~9사이의 랜덤 숫자 출력

//		int num1= rd.nextInt(50)+1;
//		int num2= rd.nextInt(50)+1;
//		System.out.println("=== Plus Game ===");
//		System.out.print(num1 + " + " + num2 + " = ");
//		int answer = sc.nextInt();
//		
//		if (answer==(num1+num2)) {
//			System.out.println("Success");
//		}else {
//			System.out.println("Fail");
//		}
//		
//		for (int i = 0; i<=3; i++) {
//			System.out.println("계속 하시겠습니까? >> " );
//			String  yn = sc.next();
//			
//			if ( yn.equals("y")) {
//				int num1= rd.nextInt(50)+1;
//				int num2= rd.nextInt(50)+1;
//				System.out.println("=== Plus Game ===");
//				System.out.print(num1 + " + " + num2 + " = ");
//				
//				int answer = sc.nextInt();
//				if (answer==(num1+num2)) {
//					System.out.println("Success");
//				}else {
//					System.out.println("Fail");
//				}
//			}
//		}
		
		
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		
		String yn = "y";
		int i = 0;
		System.out.println("=== Plus Game ===");
		do {
			int num1 = rd.nextInt(10) + 1;
			int num2 = rd.nextInt(10) + 1;

			System.out.print(num1 + " + " + num2 + " = ");
			int answer = sc.nextInt();

			if (answer == (num1 + num2)) {
				System.out.println("Success");
				break;
			} else {
				i++;
				if(i>5) {
					System.out.println("게임종료");
					break;
				}
				System.out.println("Fail");
				System.out.print("계속 하시겠습니까? >> ");
				yn = sc.next();
			}
			if (i > 3 || yn.equals("n")) {
				System.out.println("게임종료");
				break;
			}
		} while (yn.equals("y"));

	}

}
