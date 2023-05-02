package 월급계산프로그램;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		RegularEmployee regular = new RegularEmployee("SMHRD001", "홍길동", 4000, 400);
		TempEmployee temp = new TempEmployee("SMHRD002", "박문수", 3000);
		PartEmployee part = new PartEmployee("SMHRD003", "임성훈", 10,20);
		PartEmployee part1 = new PartEmployee(s, "임성훈", 10,20);
		
		
		
		
		System.out.println(regular.print());
		System.out.println(regular.getMoneypay()+ "만원");
		
		System.out.println(temp.print());
		System.out.println(temp.getMoneypay()+ "만원");
		
		System.out.println(part.print());
		System.out.println(part.getMoneypay()+ "만원");
		
		
	}

}
