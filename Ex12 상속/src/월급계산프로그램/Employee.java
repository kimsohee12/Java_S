package 월급계산프로그램;

public abstract class Employee {

	protected String empno;
	protected String name;
	protected  int pay;
	
	public Employee(String empno, String name, int pay) {
		super(); //부모 클래스의 생성자 -> 자식클래스도 가지고있어야만함 
		this.empno = empno;
		this.name = name;
		this.pay = pay;
	}
	
	
	
	public abstract int getMoneypay ();
	public String print () {
		return empno + " : " + name + " : " + pay;
		
	}
	
	
}
