package 쓰레드활용;

import java.awt.Toolkit;

public class ThreadSLeepMain {

	public static void main(String[] args) {

		Toolkit toolkit =Toolkit.getDefaultToolkit(); //삐 소리 사용하기 위함
		
		for (int i=1; i<=10;i++) {
			toolkit.beep();
			System.out.println("3초 후에 beep음 울림");
			
			// try~catch : 예외 처리 -> 런타임오류 (실행오류 처리할때 사용)
			try { // 내가 실행하고 싶은 코드
				Thread.sleep(3000);// 1000->1초
			} catch (Exception e) {
				//try문 실행 시 예외상화 발생하면 catch블록 호출
				//InterruptedException(오류상황) 
				//-> 캐치블록이 이 InterruptedException 이상황만 예외처리 
				// Exception -> 모든 예외상황(오류)의 부모 모든 예외상황 한번에 처리
				// 예외 상황 별로 처리 하고싶으면 예외 상황마다 따로 설정해주면 됨 
				e.printStackTrace();//발생한 예외상황의 이유를 절차적으로 출력(설명해주는것)
			} 
//			catch(IndexOutOfBoundsException e) {
//				
//			}
		}
		
		
	}

}
