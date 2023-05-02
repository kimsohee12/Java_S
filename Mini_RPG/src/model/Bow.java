package model;

public class Bow extends Item{
	private int durability;
	public Bow(int itemNum, String name, int attackPower, int durability) {
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
