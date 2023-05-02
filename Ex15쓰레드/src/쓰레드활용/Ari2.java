package 쓰레드활용;

//2. Runnable 인터페이스 구현
public class Ari2 implements Runnable{

	private String skill;
	
	
	public Ari2(String Key) {
		this.skill=Key;
	}
	
	public void run() {
		System.out.println("입력 키 : " + skill);
		for (int i=0; i<=3;i++) {
			System.out.println(skill + " 사용중 " + i + "s");
		
		}
		System.out.println(skill + "스킬 사용 종료");
		
		
	}

	
	

	
	
	
}
