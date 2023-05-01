package 돼지저금통프로그램;

public class PiggyBank {
// 필드 - money
	int money;
// 메소드 - deposit, withdraw, 
//	      showMoney
	public PiggyBank() {
		
	}
	public void deposit(int inputMoney) {
		money += inputMoney;
	}
	public void withdraw(int outputMoney) {
		if(money >= outputMoney) {
			money -= outputMoney;
		}
	}
	public int showMoney() {
		return money;
	}
}
