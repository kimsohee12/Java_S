package 게임캐릭터;

public class Wizard extends Charac {

	
	//추상 클래스가 물려주는 추상메서드는 반드시 구현 해야한다
	@Override
	public void run() {
		System.out.println("빗자루 타고 슝~");
	}

	@Override
	public void jump() {
		System.out.println("포털로 이동 !");
		
	}

	@Override
	public void stk() {
		System.out.println("아브라카다브라");
		
	}
	
	
	// 전진, 점프, 공격 기능을 상속받게 

	// 전진 --> 빗자루 타고 전진
	
	// 점프 --> 포털로 이동
	
	// 공격 --> 아브라카다브라
	
	
	
	
	
}
