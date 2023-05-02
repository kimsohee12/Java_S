package Ex메서드;

import java.security.PublicKey;
import java.util.PrimitiveIterator.OfDouble;

public class Ex08완전수구하기 {

	public static void main(String[] args) {
		// true , false 10/2=0이면
		int num1 = 10;
		int num2 = 2;
		boolean divisor = isDivisor(num1, num2);
		System.out.println(divisor);
		// 10,16,24의 약수
		getDivsor(10);
		getDivsor(16);
		getDivsor(24);
		
		// 10의 약수의 합 
		int num = 10;
		int result = getsumOfDivisor(num);
		System.out.println(num +"의 약수의 합 : "+ result);
		getDivsor(num);
		
		int num3 = 6;
		boolean result2 = isperfectNumber(num3);
		System.out.println(result2);
		
		int startValue = 2;
		int endValue = 1000;
		getperfectNumber(startValue,endValue);
		
	}
///////////////////////////////////////////////////////////////////////////
	
	// isDivisor(a,b) a/b=0 이면 true , false 출력하는 메소드
	public static boolean isDivisor(int a, int b) {
		if (a % b == 0) {
			return true;
		} else {
			return false;
		}
	}
	// getDivsor(i)i의 약수를 구하는 메소드 
	public static void getDivsor(int a) {
		System.out.print(a + "의 약수 :");
	    for (int i = 1; i <= a; i++) {
	        if (isDivisor(a, i)) {
	            System.out.print(i + " ");
	        }
	    }
	    System.out.println();
	}
	// getsumOfDivisor(i) i안에 약수를 합하는 메소드
	public static int getsumOfDivisor(int num) {
		int sum = 0;
		for (int i = 1; i<=num; i++) {
			if(isDivisor(num, i)) {
				sum+=i ;
			}
		} 
		return sum;
		
	}
	//isperfectNumber (i)i가 완전수인지 아닌지 판단해주는 메소드
	public static boolean isperfectNumber (int num3) {
		if (getsumOfDivisor(num3)-num3==num3) {
			return true;
		}else {
			return false;
		}
	}
	// getperfectNumber (몇부터,몇까지)중에서 완전수 찾아주는 메소드 
	public static void getperfectNumber (int s, int e) {
		System.out.print(s + "~" + e + "까지의 완전수 : ");
		for (int i = s; i <= e; i++) {
			if(isperfectNumber(i)) {
				System.out.print( i +" ");
			}
		}
	}
	
	
}
