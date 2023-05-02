package Ex메서드;

public class Ex09오버로딩 {

	public static void main(String[] args) {

		//sum
		sum(3,5);
		sum(3,5,7);
		
		
		
		
	}

	public static void sum(int num1, int num2) {
		System.out.println(num1+num2);
		
	}
	
	public static void sum(int num1, int num2, int num3) {
		System.out.println(num1+num2+num3);
	}
}
