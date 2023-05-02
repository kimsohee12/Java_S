package 쓰레드활용;

public class Thread_ {

	public static void main(String[] args) {

		
		String[]key = {"Q","W","E"};
		
		System.out.println("====단일 쓰레드====");
		
		for(int i=0; i<key.length;i++) {
			Blitzcrank b = new Blitzcrank(key[i]);
			b.run();
		}
		
		System.out.println("====멀티 쓰레드====");
		
		for(int i=0; i<key.length;i++) {
			Ari a = new Ari(key[i]);
			// run(): 실제 쓰레드가 동작할 코드를 작성(한가지 작업)
			//start() : 쓰레드 여러개가 동시에 동작할 수 있도록 하는 메서드
			// start()는 절대로 오버라이딩 하면 안됨 
			a.start();
			
		}
		System.out.println("====멀티 쓰레드 : Runnable구현====");
		
		for(int i=0; i<key.length;i++) {
			
			//Runnable 을 구현한 객체를 사용해 Thread 객체를 생성
			Thread thread = new Thread(new Ari2(key[i]));
			thread.start();
			
		}
		
	}

}
