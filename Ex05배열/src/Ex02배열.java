import java.lang.reflect.Array;
import java.util.Arrays;

import javax.lang.model.type.ArrayType;

public class Ex02배열 {

	public static void main(String[] args) {
		// 
		int[] array;
		array = new int[10];
		array[0] = 1;
		array[1] = 33;
		array[2] = 41;
		array[3] = 12;
		array[4] = 7;
		array[5] = 21;
		array[6] = 5;
		array[7] = 16;
		array[8] = 8;
		array[9] = 5;
		
		for (int i =0; i<array.length; i++) {
			System.out.println(array[i]);
			System.out.println(Arrays.toString(array));
		}
		int sum = 0;
		for (int i =0; i<array.length; i++) {
			sum+=array[i];
		}
		System.out.println(sum/(double)array.length);

		
		
	}

}
