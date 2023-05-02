package 월급계산프로그램;

public class PartEmployee extends Employee {
	
	int workDay;
	
	public PartEmployee(String empno, String name, int pay,int workDay) {
	super(empno, name, pay);
	this.workDay = workDay;
		
	}
	@Override
	public int getMoneypay () {
		 return  pay*workDay;
	}
	
	
}
