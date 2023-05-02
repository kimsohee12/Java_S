import java.util.LinkedList;

public class Ex04연결리스트 {

	public static void main(String[] args) {

		LinkedList<Integer> list = new LinkedList<Integer>();
		
		list.addFirst(1);// 가장 앞에 데이터 추가
		list.addLast(2);// 가장 뒤에 데이터추가 
		list.add(1,5); // 1번 인덱스에 데이터 추가 
		// 리스트도 for ~each문 사용가능
		for (Integer i :list) {//전부 출력
			System.out.println(i);
		}
		
		System.out.println(list.get(1));// 가장 앞 데이터 출력
		
		//삭제
		list.removeFirst(); //가장 앞에 데이터 삭제
		list.removeLast(); //가장 뒤에 데이터 삭제
		list.remove(0); // 인덱스 0번 데이터 삭제
		list.remove(); // 인덱스 0번 데이터 삭제
		list.clear(); // 모든값 제거
		
		System.out.println(list.size()); // 요소 개수 출력
		
	}

}
