package model;

public class BowVo extends itemVo{

	private int durability;
	public BowVo(int itemNum, String name, int attackPower, int durability) {
		super(itemNum, name, attackPower);
		this.durability = durability;
	}
	
	public int getDurability() {
		return durability;
	}
	public void setDurability(int durability) {
		this.durability = durability;
	}
	
	
	
}

