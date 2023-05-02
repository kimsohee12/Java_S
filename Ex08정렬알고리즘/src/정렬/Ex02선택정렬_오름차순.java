package 정렬;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Ex02선택정렬_오름차순 {

	public static void main(String[] args) {
		
		
		int []arr = {98,7,70,13,24};
		System.out.println("정렬전 "  + Arrays.toString(arr));
		
		int index ;//내가 지금까지 본숫자중에 가장 작은 수의 인덱스 번호 기억
		int temp ;// 치환시 사용
		
		for(int j= 0; j<arr.length-1; j++) {
			
			index = j;
			for(int i= index+1; i<arr.length;i++) {
				if(arr[index] > arr[i]) {
					index = i; //배열 안에서 가장 작은값이 존자하는 인덱스 번호 
				}
			}
			
			temp = arr[j];
			arr[j] = arr[index]; // 가장 작은숫자 ->0
			arr[index] = temp; // 원래 0번에 있던값을 index로 옮기기
		}
		System.out.println(1+ "회차 : " + Arrays.toString(arr));
			
		// 버블 정렬 -> 하나씩 비교해서 값을 바꾸는
		// 선택 정렬 -> 전부 비교해서 배열의 자리를 바꾸는 (인덱스 번호만 기억하도록) 
		// 내림차순 , 오름차순-> 부등호만 바꾸면 됨 	
		
		
	}

}
