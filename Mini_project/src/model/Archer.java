package model;

public class Archer  extends Character{

	private BowVo equippedItem;
	
	public Archer(int hp, int op, int dp) {
		super(hp, op, dp);
	}

	public void itemUse(itemVo item) {
		System.out.println("아처 아이템 사용");
		// A instanceof B => A 객체가 B 클래스에 속하면 true, 아니면 false
		if(item instanceof BowVo) {
			this.equippedItem = (BowVo)item;
			this.op += item.getAttackPower();
		}
	}

	@Override
	public void itemUnUse() {
		 System.out.println("아처 아이템 해제");
		 if(equippedItem != null) {
				this.op -= equippedItem.getAttackPower();
				this.equippedItem = null;
			}
	}

	@Override
	public void attack() {
		System.out.println("아처 공격");
		
	}

	@Override
	public void printinfo() {
		System.out.println("hp"+hp);
		System.out.println("op"+op);
		System.out.println("dp"+dp);
		System.out.println("archer");
		
	}

		
	
}
