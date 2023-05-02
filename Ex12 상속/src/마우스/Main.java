package 마우스;

public class Main {

	public static void main(String[] args) {

	
		Mouse m1 = new Mouse();
		WheelMouse m2 = new WheelMouse();
		HealthMouse m3 = new HealthMouse();
		
		m1.rightClick();
		m1.IeftClick();
		m1.drag();
	
	
		m2.scroll();
		m2.IeftClick();
		m2.rightClick();
		
		m3.IeftClick();
		m3.rightClick();
		m3.drag();
		m3.healthDown();
		
	}

}
