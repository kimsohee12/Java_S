package model;

abstract public class Character extends Creature {
	public Character(int hp, int op, int dp) {
		super(hp, op, dp);
		// TODO Auto-generated consstructor stub
	}

	public abstract void ItemUse(Item item);
	public abstract void ItemUnuse();
	
	//public abstract void ItemUserble(); 캐릭터별 같은 기능이므로 추상메서드
	


}
