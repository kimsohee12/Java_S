package controller;

import model.Archer;
import model.BowVo;
import model.Character;
import model.DAO;
import model.itemVo;

public class SelectOneItem {

	public itemVo selectItem(String itemname, Character character) {
		DAO dao = new DAO();
		
		itemVo item = dao.SelectItem(itemname, character);
		if(item!=null) {
			System.out.println("아이템 이름 : "+item.getName());
			System.out.println("아이템 공격력 : "+item.getAttackPower());
			if(character instanceof Archer) {
				System.out.println("아이템 내구도 : "+((BowVo)item).getDurability());
			}
		}else {
				System.out.println("존재하지 않는 아이템");
		}return item;
		
	}
}
