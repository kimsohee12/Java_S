package 스택;

import javax.swing.plaf.synth.SynthDesktopIconUI;

public class IntStack {

	// 필드
	private int[] stk; //값을 저장할 배열
	private int capacity; //스택의 용량 저장(최대 몇개의 데이터가 저장될수 있는지)
	private int ptr; //스택 포인터 (현재까지 쌓여있는 데이터의 수 나타냄 )
				// 비어있으면 -> 0/ 가득 차있으면 ->capacity
	// 생성자
	public IntStack(int maxlen) {// 스택을 생성할때 크기를 지정할수 있도록
		stk	= new int[maxlen]; // 지정된 크기의 정수형 배열 생성->참조값(주소값)을 stk 변수에 저장
		capacity = maxlen;//지정된 크기로 스택 용량  설정
		ptr = 0; //최초로 스택이 생성되었을때는 비어있음
				// ptr++; 데이터 개수 운팅
	}
	
	
	// 메서드(getter, setter, toString)
	//데이터 삽입 :  무조건 위(뒤)쪽에서만 삽입가능
	public int push(int x) {//원하는 값(X)를 스택에 삽입0번 인덱스부터 차근차근 채우기
		stk [ptr++]= x ;//ptr ++ : 데이커 개수 카운팅, 그다음 데이터는 그 다음칸에 들어갈수 있도록
		// 포인터가 가리키는 위치에 값을 삽입한 후 포인터를 1증가
		return x; //삽인된 데이버 변환
	}
	
	//데이터 꺼내기 :  위(뒤)쪽에서만 꺼내는 작업
	public int pop() {
		return stk[--ptr];//포인터가 가리키는 값 -1 먼저 시킨 후 데이터 반환
	}
	
	//재일 위에 있는 데이터 확인
	public int peek() { //ptr(현재까지 데이터 수) 바꾸면 안됨 
		return stk[ptr-1];
	}
	
	//모든 데이커 전체 삭제
	public void clear() {
		ptr = 0;//현재 데이터 개수-> 0 : 아무것도 없다
	}
	
	
	//특정 값 몇번 인뎃그에 있는지 찾기
	//x: 찾고 싶은 값
	public int indexOf(int x) {
		for (int i =ptr-1; i>=0;i--) { // 제일 위에 있는 데이터 ~0번까지 1칸씩 내려오면서 탐색
			if(stk[i]== x) {// 찾고차 하는 데이터와 같은값을 발견했을 때
				return i; // 그 데이터가 있는 인덱스 번호 반환
			}
		}
		return -1;// 찾고자 하는 값이 스택에 없는 경우에는 -1반환
	}
	//스택에 쌓여있는 총 데이터 개수 반환 
	public int size() {
		return ptr;
		
	}
	
	//스택이 현재 비어있는지 확인
	public boolean isEmpty () {
		return ptr ==0; // ptr이 0이면 (데이터가 없으면 )-> true반환/0보다 크면 False반환
	}
	
	//스택이 가득 차 있는지 확인
	public boolean isFull() {
		return capacity == ptr; // 최대 용량과 현재 용량과 같으면(가득 차있으면) true 반환
								//같지 않으면(ptr이 더 적으면)False반환
	}
	
	//스택 안에 있는 모든 데이터 출력 
	//먼저 들어온 데이터부터 출력 0번부터 순서대로 출력
	public void dump() {
		if(ptr==0) {// 스택이 비어있는경우
			System.out.println("스택이 비어있습니다. ");
		}else {
			for (int i=0; i<ptr;i++) { //0번 인덱스부터 마지막 데이터가 있는 자리까지
				System.out.println(stk[i]+" ");
			}
			System.out.println();
		}
	}
	
	
	
	
	
}

