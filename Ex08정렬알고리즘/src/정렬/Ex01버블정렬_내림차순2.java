package 정렬;

import java.util.Arrays;

import javax.print.attribute.standard.JobMessageFromOperator;

public class Ex01버블정렬_내림차순2 {

	public static void main(String[] args) {

		int temp; // 치환을 위한 임시공간
		int[] arr = {10, 24, 7, 68, 42, 82, 3, 43};
		System.out.println("정렬전 " + Arrays.toString(arr));
		boolean sw;

		for (int j = 0; j < arr.length - 1; j++) {
			sw = true;
			for (int i = 0; i < arr.length - 1 - j; i++) {
				if (arr[i] < arr[i + 1]) {
					temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
					sw = false;
				}
			}
			if (sw) {// 정렬이 됐다면 break -> boolean 변수를 넣어서 종료 가능
				System.out.println("정렬종료");
				break;
			}
			System.out.println(j + 1 + "회차 : " + Arrays.toString(arr));
		}

	}

}
