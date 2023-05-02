package controller;

import model.Archer;
import model.Warrior;
import model.Character; 
public class CreateCharacter {

	public Character Create(int select) {
		Character character = null;
		if(select==1) {
			Archer archer = new Archer(5, 10, 5);
			character = (Character)archer;
		}else if(select==2) {
			Warrior warrior = new Warrior(15, 5, 10);
			character = (Character)warrior;
		}else {
			System.out.println("잘못된 선택");
		}
		
		return character;
	}
}
