import java.util.Stack;

public class Ex01스택 {

	public static void main(String[] args) {

		
		//1.스택 생성
		Stack<String> st = new Stack<String>();
		
		//2.요소 삽입 (push)
		st.push("Hello");
		st.push("Hi");
		st.push("Java");
		
		//3.가장 마지막 요소(top에서 제일 가까운요소) 확인 -> 출력하려면 출력문을 따로 써야함 
		st.peek();
		System.out.println(st.peek());
		
		//4. 특정 요소의 위치 확인
		st.search("Hello");
		System.out.println(st.search("Hello"));//3
		System.out.println(st.search("Hi"));//2
		System.out.println(st.search("Java"));//1
		System.out.println(st.search("Java"));//1
		
		//5.요소 삭제
		String a =st.pop();// 무조건 마지막 요소만 
		System.out.println(a);
		
		//6. stack 이 비어있는지 확인
		st.empty();//-> 비어있으면 True, 요소가 하나라도 있으면 -> False
		System.out.println(st.empty());
		
		
	}

}
