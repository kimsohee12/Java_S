package model;

public class Warrior extends Character implements Defensible{
	
	private Sword equippedItem;

	public Warrior(int hp, int op, int dp) {
		super(hp, op, dp);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void printInfo() {
		System.out.println("hp"+hp);
		System.out.println("op"+op);
		System.out.println("dp"+dp);
		System.out.println("warrior");
	}

	@Override
	public void attack() {
		System.out.println("warrior 공격");
		
	}

	@Override
	public void ItemUse(Item item) {
		if(item instanceof Sword) {
			System.out.println("장착");
			this.equippedItem = (Sword)item;
			this.op += item.getAttackPower();
		}
		
	}

	@Override
	public void ItemUnuse() {
		if(equippedItem != null) {
			this.op -= equippedItem.getAttackPower();
			this.equippedItem = null;
		}
		
	}

	@Override
	public void defence() {
		System.out.println("Warrior 방어");
		
	}

}
