package 쓰레드활용;

//동시 여러 스킬 사용할 수 없음
// 사용한 스킬이 오나료되기 전까지는 다른 스킬 사용 불가
// 멀티 쓰레딩 x  단일쓰레딩

public class Blitzcrank {

	
	private String skill;
	
	public Blitzcrank(String Key) {
		this.skill = Key;
	}
	
	public void run() {
		System.out.println("입력 키 : " + skill);
		for (int i=0; i<=3;i++) {
			System.out.println(skill + " 사용중 " + i + "s");
		
		}
		System.out.println(skill + "스킬 사용 종료");
		
		
	}
	
	
}
