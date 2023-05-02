package 월급계산프로그램;

public class RegularEmployee extends Employee {

	int bouse;
	
	public RegularEmployee(String empno, String name, int pay,int bouse) {
	super(empno, name, pay);
	this.bouse = bouse;
		
	}

	@Override
	public int getMoneypay() {
		return (pay + bouse)/12;
		 
	}

	

	
	
	
}
