package 링크드리스트;

public class LinkedList {

	
	//링크드리스트는 가장먼저 head를 만들어줘야함
	private Node head; //head 포인터 (첫번째 노드의 주소값을 저장할 노드)
	private Node ptr; //선택 포인터 (검색에 사용)
	
	public LinkedList() {
		head = ptr = null;//초기 상태는 다 비워둠
		
	}
	
	//head 쪽으로 노드 삽입
	public void addFirst(String data) { // 삽입할 데이터만 지정
		
		Node a = head; //현재  첫번째1번 데이터의 참조값을 저장 해놓괴 위함
		head = new Node(data, a);//새로 삽입할 노드 (주소부에원래 있던 첫번째였던 노드의 참조값을 저장할수 있음)
		
	}
	
	//head쪽에서 노드 삭제(첫번째 데이터 삭제)
	public void remover() {
		if(head!=null) {//head : 첫번째 노드에 주소값
		//첫번째 노드가 가지고 있는 주소부->head.getnext() (두번째 노드의 참조갑 ->head
			head = head.getNext();
			
		}
	}
	
	
	
}
