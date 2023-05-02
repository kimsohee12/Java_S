package 탐색;

import java.util.Arrays;

public class Ex03이진탐색 {

	public static void main(String[] args) {

		int arr[] = { 10, 24, 7, 68, 42, 82, 3, 43, 22, 84 };

		int temp;
		int num =82;
		boolean sw = true;
		int lowIndex = 0;
		int highIndex = arr.length-1;
		//정렬
		for (int i = 0; i < arr.length-1; i++) {
			sw =false;
			for (int j = 0; j < arr.length-1; j++) {
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j]= arr[j+1];
					arr[j+1] =temp;
					sw=true;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		// 이진탐색
		while(true) {
			int middleIndex = (lowIndex + highIndex)/2;
			if(arr[middleIndex]==num) {
				System.out.println(middleIndex);
				break;
			}else if (arr[middleIndex]<num) {
				lowIndex = middleIndex+1;
				
			}else {
				highIndex = middleIndex-1;
			}
		}
		
		
		
		
		
		
		
	}

}
