import java.util.Random;

public class Ex03배열 {

	public static void main(String[] args) {

		
		int num = 0;
		int array[] = { 5, 6, 13, 27, 34, 35, 78, 2, 3, 1 };
		System.out.print("배열 홀수 :");
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 != 0) {
				System.out.print(array[i] + " ");
				num++;
			}
		}
		System.out.print("\n총 개수 : " + num + "개\n");

		
		
	}

}
