
public class Ex_01while문 {

	public static void main(String[] args) {
		
		// 1~5까지 출력
		
		// 지역변수 : 특정 구역에서만 사용 가능한 값
		// 전역변수 : 어디에서든 가능한 값
		int num = 1;

		while (num<6) {
			
			System.out.println(num++);
		}
		
		int num1 = 1;

		while (num1<6) {
			System.out.println(num1);
			num1++;
		}
		System.out.println("----------------");
		
		
		int num2 = 1;

		while (true) {
			if (num2>=6) {
				break;
			}
			System.out.println(num2++);
		}
		
		
		
		
		
		
		
	}

}
