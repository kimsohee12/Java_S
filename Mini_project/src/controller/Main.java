package controller;

import java.util.Scanner;

import View.Main_dislplay;
import model.Turtle;

public class Main {

	public static void main(String[] args) {
		
	Main_dislplay dp = new Main_dislplay();
	Scanner sc = new Scanner(System.in);
	AllSelectItem allselect = new AllSelectItem();
	while (true) {
		dp.render();
		int select = sc.nextInt();
		
		if( select ==1) {
			System.out.print("1.전체 아이템 조회 2. 검 아이템 조회 3. 활 아이템 조회 >> ");
			select = sc.nextInt();
			allselect.rangeAll(select);
		}else if( select ==2) {
			
		}else if( select ==3) {
			
		}else {
			System.out.println("종료");
			break;
		}
		
		
	}
		
	
	
	
		
	}

}
