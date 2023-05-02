package model;

public class Archer extends Character {
	private Bow equippedItem;
	public Archer(int hp, int op, int dp) {
		super(hp, op, dp);
		
	}

	@Override
	public void printInfo() {
		System.out.println("hp"+hp);
		System.out.println("op"+op);
		System.out.println("dp"+dp);
		System.out.println("archer");
	}


	@Override
	public void attack() {
		System.out.println("Archer 공격");
		
	}

	@Override
	public void ItemUse(Item item) {
		if(item instanceof Bow) {
			this.equippedItem = (Bow)item;
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
	

}
