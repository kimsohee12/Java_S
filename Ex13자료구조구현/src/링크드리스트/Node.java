package 링크드리스트;

public class Node {
	
	private String data; // 실제데이터
	private Node next;// 다음 노드의 참조값 (주소값)
	
	public Node(String data, Node next) {
		this.data =data;// 필드 초기화
		this.next =next;
		
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	
	
}
