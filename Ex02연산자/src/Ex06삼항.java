import java.sql.Time;
import java.util.Scanner;

public class Ex06삼항 {

	public static void main(String[] args) {
		
			
		Scanner sc = new Scanner(System.in);
		
//		System.out.print("첫번째 정수 입력 : ");
//		int a = sc.nextInt();
//		System.out.print("두번째 정수 입력 : ");
//		int b = sc.nextInt();
//		
//		System.out.print("두 수의 차 : "+ (a<b ? b-a : a-b));
//		
//		System.out.print("농구공의 개수를 입력하세요 : ");
//		int ball = sc.nextInt();
//		
//		System.out.println("필요한 상자의 수 : "+((ball%5)==0? ball/5 : (ball/5)+1));
//		System.out.println();
//		
		System.out.print("노동시간을 입력하세요 : ");
		int time = sc.nextInt();
		int 기본시급 = 9000;
		double money = time <=8 ? time *기본시급 : ((time%8)*(기본시급*1.5))+(8*기본시급);
		
		
		
		System.out.println("총 임금은 " +(int)money + "원 입니다 ");
				
		
		
	}

}
