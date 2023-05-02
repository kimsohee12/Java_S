import java.util.Scanner;

public class Ex03_if_elseif문 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("점수 입력 : ");
		int score = sc.nextInt();
		
		if (score>=90) {
			System.out.println("A학점 입니다.");
		}else if (score>=80) {
			System.out.println("B학점 입니다.");
			
		}else if (score>=70) {
			System.out.println("C학점 입니다.");
			
		}else {
			System.out.println("F학점 입니다.");
		}
		
		
			
		
		
		
		
	}

}
