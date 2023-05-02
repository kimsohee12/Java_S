package 쓰레드활용;

//여러개 스킬을 동시 사용 가능 -> 멀티쓰레딩
//1. Thread 클래스를 확장(상속)하는 방법으로 사용 가능
public class Ari extends Thread {
	
	private String skill;
	
	public Ari (String Key) {
		this.skill = Key;
	}
	
	//Thread 클래스 => run메서드를 오버라이딩 무조건 해줘야함
	//run(깡통상태)-> 실제 실행할 기능 정의, 하나의 쓰레드가 수행할 한가지 작업
	//			-> 쓰레드 시작의미 , run () 종료-> 쓰레드 종료 
	
	public void run() {
		System.out.println("입력 키 : " + skill);
		for (int i=0; i<=3;i++) {
			System.out.println(skill + " 사용중 " + i + "s");
		
		}
		System.out.println(skill + "스킬 사용 종료");
		
		
	}


}
