import java.util.ArrayList;

public class Ex01ArrayList {

	public static void main(String[] args) {

		//1. ArrayList 생성 ->heap
		// -> ArrayList 생성된 참조값 저장 -> 참조변수 (레퍼런스변수 선언)
		ArrayList<String> a1 = new ArrayList<String>();
		//ArrayList<E> (초기 크기 -> 생략가능 (10));
		
		//2. 요소 삽입
		 //ArrayList의 0번에 들어감
		a1.add("Hi"); //1번 
		a1.add("Java"); //2번

		//3.요소 개수 
		System.out.println(a1.size());
		
		//4. 요소 중간 삽입
		a1.add(1,"Python");
		System.out.println(a1.size());
		
		//5. 특정 인덱스에 있는 요소 알아내기
		System.out.println(a1.get(0)); // get ->값만 가져오는 출력기능 없는 메소드
		System.out.println(a1.get(1)); 
		System.out.println(a1.get(2)); 
		System.out.println(a1.get(3)); 
		//ArrayList 는 초기값이 없음 안넣어주면 값이 없음
		// 넣은 값까지만 출력 가능 공간 은 있어도 값이 없으면 출력 안됨
		for (int i=0; i<a1.size(); i++){ // ArrayList에는 length말고 size 사용
			System.out.println(a1.get(i)); 
		}
		//확장 for문 (for~each)
		for (String s : a1) {
			System.out.println(s);
		}
		
		//6.특정 요소 삭제
		String a = a1.remove(2);
		System.out.println(a1.size());
		a1.remove(2);
		
		//7. 모든 요소 삭제
		a1.clear();
		System.out.println(a1.size());// 0개 나옴 
		
		
		
		
		
		
	}

}
