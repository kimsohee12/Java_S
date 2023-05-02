package 탐색;

public class Ex01순차검색 {

	public static void main(String[] args) {

		// 순차 검색 : 0~배열 끝까지 하나하나 비교해서 찾는 방법
		// 값을 찾은 후에 중복값이 없다는 가정하에 뒤쪽 인덱스는 확인하지 않음
		// 정렬되어 있을 필요가 없음
		
		int[] arr = {13,35,15,11,26,72,78,13,61,90};
		
		int num = 78;
		for (int i=0; i<arr.length; i++) {
			if(arr[i]==num) {
				System.out.println(num + " 은 " + i + "번 인덱스에 있습니다.");
				break;
			}
		}
		
		
		
	}

}
