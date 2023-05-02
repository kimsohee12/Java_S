import java.util.Scanner;

public class Ex04for문 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		for (int i = 1; i <= input; i++)
			if(input % i == 0) {
				System.out.println(input + "의 약수 : " + i);
			}
		
		
		
		
	}

}
