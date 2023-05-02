package controller;

import java.util.ArrayList;

import model.Bow;
import model.DAO;
import model.Item;

public class AllSelectItem {

	public void rangeAll(int select) {
		if(select==1) {
			allWeapon();
		}else if(select==2) {
			allSword();;
		}else if(select==3) {
			allBow();
		}else {
			System.out.println("잘못된 선택");
		}
	}
	
	public void allWeapon() {
		DAO dao = new DAO();
		
		ArrayList<Item> bowList = dao.BowChekALL();
		ArrayList<Item> SwordList = dao.SwordChekALL();
		ArrayList<Item> itemList = new ArrayList<>();
		itemList.addAll(SwordList); //같은 타입 ArrayList 합치기
		itemList.addAll(bowList); //같은 타입 ArrayList 합치기
		
		System.out.println("num\tname\tpower\tdurability");
		System.out.println("-----------------------------");
		for(Item item:itemList) {
			System.out.print(item.getItemNum()+"\t");
			System.out.print(item.getName()+"\t");
			System.out.print(item.getAttackPower()+"\t");
			try { //sword는 durability가 없으니까 class가 없다는 예외처리 발생할거임. 그래서 사용
				System.out.print(((Bow)item).getDurability());//downcasting
			}catch(Exception classCastException){		
			}
			System.out.println();
		}
		
		
		}
	
	public void allSword() {
		
		DAO dao = new DAO();
		ArrayList<Item> Sword_db = dao.SwordChekALL();
		System.out.println("num\tname\tpower");
		System.out.println("-----------------------------");
		for(Item SwordObject :Sword_db) {
			System.out.print(SwordObject.getItemNum()+"\t");
			System.out.print(SwordObject.getName()+"\t");
			System.out.println(SwordObject.getAttackPower()+"\t");
		}
	}
	
	public void allBow() {
		DAO dao = new DAO();
		ArrayList<Item> bow_db = dao.BowChekALL();
		System.out.println("num\tname\tpower\tdurability");
		System.out.println("-----------------------------");
		for(Item bowObject :bow_db) {
			System.out.print(bowObject.getItemNum()+"\t");
			System.out.print(bowObject.getName()+"\t");
			System.out.print(bowObject.getAttackPower()+"\t");
			System.out.println(((Bow)bowObject).getDurability()+"\t");
		}
	}
	
}
