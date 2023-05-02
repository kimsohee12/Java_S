package Ex메서드;

import javax.naming.spi.DirStateFactory.Result;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane.IconifyAction;

public class Ex07메서드 {

	public static void main(String[] args) {

		int num1 = 10;
		int num2 = 24;
		int result = largerNumber(num1, num2);
		System.out.println("큰 수 확인 : " + result);

	}

	public static int largerNumber(int a, int b) {
		if (a < b) {
			return b;
		} else if (a==b) {
			return 0;
		}else {
			return a;
		}
	}

}
