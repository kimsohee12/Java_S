package 게임캐릭터;

public class Main {

	public static void main(String[] args) {
		//추상 클래스는 객체생성이 불가능
		
		//마법사
		Wizard harry = new Wizard();
		harry.run();
		harry.jump();
		harry.stk();
		
		
		//전사
		Warrior War = new Warrior();
		War.run();
		War.jump();
		War.stk();
		
		
		
	}

}
