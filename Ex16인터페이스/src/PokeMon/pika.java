package PokeMon;

public class pika implements PokeMon,DigMon {

	//인터페이스 상속 : implements(구현하다)
	
	@Override
	public void atk() {
		System.out.println("주먹 날리기");
	}

	@Override
	public void specialatk() {
		System.out.println("백만볼트");
		
	}

	
	
	
}
