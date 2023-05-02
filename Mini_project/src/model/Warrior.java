package model;

public class Warrior extends Character implements Defensible{
	
	private SwordVo equipedItem;
	
	public Warrior(int hp, int op, int dp) {
		super(hp, op, dp);
	}
	
	@Override
	public void printinfo() {
		System.out.println("hp"+hp);
		System.out.println("op"+op);
		System.out.println("dp"+dp);
		System.out.println("warrior");
	}
	
	@Override
	public void attack() {
		System.out.println("전사 공격");
	}

	@Override
	public void denfence() {
		System.out.println("전사 방어!");
	}

	@Override
	public void itemUse(itemVo item) {
		if(item instanceof SwordVo) {
			System.out.println("전사 아이템 사용");
			this.equipedItem = (SwordVo)item;
			this.op += item.getAttackPower();
		}
	}

	@Override
	public void itemUnUse() {
		if(equipedItem != null) {
			System.out.println("전사 아이템 해제");
			this.op -= equipedItem.getAttackPower();
			this.equipedItem = null;
		}
		
	}


	


	
}
