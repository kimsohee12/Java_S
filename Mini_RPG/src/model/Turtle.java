package model;

public class Turtle extends Monster implements Defensible {

	public Turtle(int hp, int op, int dp) {
		super(hp, op, dp);
	}

	@Override
	public void attack() {
		System.out.println("거북이 공격");
	}
	
	@Override
	public void printInfo() {
		System.out.println("거북이 정보");
		
	}

	@Override
	public void defence() {
		System.out.println("거북이의 방어");
		
	}

}
