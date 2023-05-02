import java.util.Scanner;

public class Ex03for문 {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("구구단 ");
		for (int i = 1; i<=9; i++) {
		System.out.println(2+"*"+ i +"="+2*i);
		}	
		
		System.out.println();
		
		System.out.print("자연수를 입력하세요 : ");
		int input = sc.nextInt();	
		for (int i = 1; i<=9; i++) {
		System.out.println(input+"*"+i+"=" + input*i);
		}	
		
		
	}

}
