package model;

public abstract class Creature {

	protected int hp;
	protected int op;
	protected int dp;
	
	public Creature(int hp, int op, int dp) {
		this.hp = hp;
		this.op = op;
		this.dp = dp;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getOp() {
		return op;
	}

	public void setOp(int op) {
		this.op = op;
	}

	public int getDp() {
		return dp;
	}

	public void setDp(int dp) {
		this.dp = dp;
	}
	
	public abstract void attack();
	public abstract void printinfo();

	public void itemUse(itemVo item) {
		// TODO Auto-generated method stub
		
	}
	
}