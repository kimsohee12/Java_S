package 동물;

public class Main {

	public static void main(String[] args) {

		Cham c1 = new Cham();
		Peng p1 = new Peng();
		
		
		
		//Bird를 상속
		c1.eat();
		c1.sleep();
		c1.move();
		c1.cry();
		
		//Bird를 상속
		p1.eat();
		p1.sleep();
		p1.move();
		
		//  형변환 (casting)
		//기본 데이터 타입에 대한 형변환은 데이터의 크기를 변환하는 기능
		//객체 타입네 대한 형변환 : 객체의 타입 변환
		//객체 타입에대하여 형변환을 진행할때는 꼭 상속에 대한 개념이 포함되어있어야 한다
		//(형변환 하고자 하는 객체들끼리 상속 관계가 되어있어야함)
		// 명시적vs묵시적 형변환
		//업캐스팅 vs다운캐스팅
		// 묵시정(자동 ) 형변환 -> (업캐스팅 개념)
		// : 자식 클래스가 부모 클래스의 타입으로 형태가 변형되는 것 
		
		Animal a2 = new Peng();
		Animal a3 = new Cham();
		//다운캐스팅 :  부모클래스를 자식 클래스로 바꿔주는것
	//	Cham c2 = new Animal();
		//업캐스팅된 객체들만 다운캐스팅 할수 있다.
		Peng p3 = (Peng)a2;
		
		
		
		
		
		
		
		
		
	}

}
