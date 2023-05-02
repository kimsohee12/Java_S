package Ex메서드;

import java.util.Calendar;
import java.util.Scanner;

public class Javapastiver메소드 {

	public static void main(String[] args) {

		// 두 개의 정수를 매개변수로 받아 앞의 정수가 뒤의 정수로 나누어지는지를 판별하는 메소드
		// isDivide( ) 를 작성하세요. 이때, 나누어지면 true, 나누어지지 않으면 false을 반환함
		// 1번 문제!!
		int num1 = 10;
		int num2 = 2;
		boolean result = isdivide(num1, num2);
		System.out.println("결과 확인 : " + result);

		// 가운데 글자 구하기 getMiddle메소드는 하나의 단어를 입력 받습니다.
		// 단어를 입력 받아서 가운데 글자를 반환하도록 getMiddle메소드를 만들어 보세요.
		// 길이가 짝수일경우 가운데 두글자를 반환하면 됩니다.
		// 2번
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		System.out.println(getmiddle(input));

		// num1, num2, op (+, -, *, /) 를 매개변수로 받아 num1 과 num2를
		// op에 맞게 연산한 결과값을 반환해주는 cal 메소드를 작성하세요
		// 3번문제!!
		int num3 = 50;
		int num4 = 15;
		char op = '-';
		System.out.println(cal(num3, num4, op));

		// 2개의 정수 base, n을 받아 base의 n제곱 만큼 값을 반환하는 powerN() 메소드를 작성하세요
		// 4번문제!!
		int base = 2;
		int n = 3;
		int result1 = powerN(base, n);
		System.out.println("결과 확인 : " + result1);

	}

	// 1번 메소드
	public static boolean isdivide(int a, int b) {
		if (a % b == 0) {
			return true;
		} else {
			return false;
		}
	}
	// 2번 메소드

	public static String getmiddle(String a) {

		int i = a.length();
		if (i % 2 == 0) {

			return a.substring(i / 2 - 1, i / 2 + 1);

		} else {
			return a.substring(i / 2, i / 2 + 1);
		}

	}

	// 3번 메소드
	public static int cal(int a, int b, char c) {
		if (c == '-') {
			return a - b;
		} else if (c == '*') {
			return a * b;

		} else if (c == '+') {
			return a + b;
		} else if (c == '/') {
			return a / b;
		} else {
			return 0;
		}

	}

	// 4번 메소드
	public static int powerN(int base, int n) {
		int num = 1;// 곱하기에 영향을 주지 않는 초기화값
		for (int i = 0; i < n; i++) {
			num *= base;
		}
		return num;
	}

}
