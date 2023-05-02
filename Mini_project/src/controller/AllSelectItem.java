package controller;

import java.util.ArrayList;


import model.BowVo;
import model.DAO;
import model.itemVo;

public class AllSelectItem {

	public void rangeAll(int select) {
		if(select == 1) {
			AllWeapon();
		}else if(select==2) {
			
		}else if (select==3) { 
			
		}else {
			System.out.println("잘못된 선택입니다.");
		}
	
	}
	
	public void AllWeapon() {
		DAO dao = new DAO();
		ArrayList<itemVo>bowList = dao.BowchekAll();
		ArrayList<itemVo>SwordList = dao.SwordcakAll();
		ArrayList<itemVo>itemList = new ArrayList<>();
		itemList.addAll(SwordList);
		itemList.addAll(bowList);
		System.out.println("num\tname\tpower\tdurability");
		System.out.println("-----------------------");
		for(itemVo item:itemList) {
			System.out.print(item.getItemNum()+"\t");
			System.out.print(item.getName()+"\t");
			System.out.print(item.getAttackPower()+"\t");
			try { //sword는 durability가 없으니까 class가 없다는 예외처리 발생할거임. 그래서 사용
				System.out.print(((BowVo)item).getDurability());//downcasting
			}catch(Exception classCastException){		
			}
			System.out.println();
		}
		
	}
	
	public void allSword() {
		
		DAO dao = new DAO();
		ArrayList<itemVo> Sword_db = dao.SwordcakAll();
		System.out.println("num\tname\tpower");
		System.out.println("-----------------------------");
		for(itemVo SwordObject :Sword_db) {
			System.out.print(SwordObject.getItemNum()+"\t");
			System.out.print(SwordObject.getName()+"\t");
			System.out.println(SwordObject.getAttackPower()+"\t");
		}
	}
	public void allBow() {
		DAO dao = new DAO();
		ArrayList<itemVo> Bow_db = dao.BowchekAll();
		System.out.println("num\tname\tpower\tdurability");
		System.out.println("-----------------------");
		for(itemVo BowObject:Bow_db) {
			
			System.out.println(BowObject.getItemNum()+"\t");
			System.out.println(BowObject.getName()+"\t");
			System.out.println(BowObject.getAttackPower() +"\t");
			
			System.out.println(((BowVo)BowObject).getDurability());
			
		}
		
	}
	
	
}
