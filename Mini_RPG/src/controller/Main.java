package controller;

import java.util.Scanner;

import model.Archer;
import model.Bow;
import model.Character;
import model.Item;
import model.Monster;
import model.Sword;
import model.Turtle;
import model.Warrior;
import view.Main_display;
import view.NewCharacter;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		AllSelectItem itemAll = new AllSelectItem();
		Main_display mainDisplay = new Main_display();
		NewCharacter newCharacter_display = new NewCharacter(); 
		CreateCharacter create = new CreateCharacter();
		SelectOneItem selectOneItem = new SelectOneItem();
		Monster turtle = new Turtle(0,1,0);
		
		Character character=null;
		while(true) {
			mainDisplay.render(); //메인화면 불러오기.
			int select = sc.nextInt();
			if(select==1) {
				System.out.print("1. 전체 아이템조회  2. 검 아이템 조회 3. 활 아이템 조회  >> ");
				select = sc.nextInt();
				itemAll.rangeAll(select);
			}else if(select==2) {
				newCharacter_display.render();
				select=sc.nextInt();
				character = create.Create(select);
			}else if(select==3) {
				if(character!=null) {
					System.out.print("장착할 장비 이름 : ");
					String selectStr=sc.next();
					Item selectitem = selectOneItem.selectItem(selectStr,character);
					character.ItemUse(selectitem);
					System.out.println("총 공격력 : "+character.getOp());
					
				}else {
					System.out.println("캐릭터부터 생성해 주세요.");
				}
			}else {
				System.out.println("종료");
				break;
			}
		}
		((Turtle)turtle).defence(); //turtle은 Monster 클래스인데 downcating으로 Turtle class의 기능을 사용
		character.attack();
		((Warrior)character).defence(); // 동일 
	}

}
