import java.util.Random;
import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		
		System.out.println("====== 1부터 100 사이 숫자 맞추기 게임! ======\n");
		int num= rd.nextInt(100)+1;
		
		while (true) {
			System.out.print("1과 100사이의 정수를 입력하세요 >> ");
			int input = sc.nextInt();
			if(num == input) {
				System.out.println(num + " 정답입니다 ! ");
				break;
			}else if (num>input) {
				System.out.println("더 큰수로 다시 시도 해보세요 ");
				
			}else {
				System.out.println("더 작은수로 다시 시도 해보세요 ");
			}
		}
		
		
		
	}

}
