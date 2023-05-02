package model;

public class Turtle extends Monster implements Defensible {

	public Turtle(int hp, int op, int dp) {
		super(hp, op, dp);
	}

	@Override
	public void denfence() {
		System.out.println("거북이 방어!");
	}

	@Override
	public void attack() {
		System.out.println("거북이 공격");
	}

	@Override
	public void printinfo() {
		 System.out.println("거북이 정보");
		
	}

}
