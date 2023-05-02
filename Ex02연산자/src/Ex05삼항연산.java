import java.util.Scanner;

public class Ex05삼항연산 {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		int i = sc.nextInt();
		
		System.out.println((i%2) == 0? i + "는(은) 짝수 입니다":i + "는(은) 홀수 입니다");
		
		
		
		
	}

}
