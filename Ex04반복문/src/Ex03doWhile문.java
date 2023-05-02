import java.util.Scanner;

public class Ex03doWhile문 {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		
		int num = 0;
		int odd = 0;
		int even = 0;
		
		do {
			num = sc.nextInt();
			if (num%2==1) {
				odd+=1;
			}else {
				even+=1;
			}
			
		} while (num>0);
		System.out.println("짝 개수 : " + odd+ "\n홀 개수 : " + even);
		
		
		
	}

}
