import java.util.LinkedList;
import java.util.Queue;

public class Ex03큐 {

	public static void main(String[] args) {
		
		// 메모리 공간을 효율적으로 활용하기 위해
		// 큐는 링크드리스트를 활용한다
		Queue<Integer> q = new  LinkedList<Integer>();
		
		//1. 큐에 요소 삽입
		q.add(1);
		q.add(2);
		q.add(3);
		// add -> 큐 맨뒤에 여유공간이 없으면 오류
		//offer -> 큐 맨뒤에 여유공간 없으면 false리턴
		
		//3. 가장 먼저 나갈 데이터를 반환
		System.out.println(q.peek());
		
		//4.요소 삭제
		System.out.println(q.remove());
		System.out.println(q.remove());
		//remove ->   큐 맨앞에 값 삭제 (큐 비어있으면 오류)
		//poll -> 큐 맨앞에 값 삭제 (큐 비어있으면 null리턴)
		
		
	}

}
