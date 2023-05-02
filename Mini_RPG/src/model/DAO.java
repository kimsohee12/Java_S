package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DAO {

	Connection conn;
	PreparedStatement psmt = null;
	ResultSet rs;
	boolean result;
	
	private void connect() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
			String db_id = "hr";
			String db_pw ="hr";
			conn = DriverManager.getConnection(url,db_id,db_pw);
			
		} catch (ClassNotFoundException e) {
			System.out.println("DB 로딩 실패");
			e.printStackTrace();
		} catch(SQLException e) {
			System.out.println("DB연결 실패");
			e.printStackTrace();
		}
	}
	public void getClose() {
		try {
			if(rs!=null) {
				rs.close();
			}
			if(psmt!=null) {
				psmt.close();
			}
			if(conn!=null) {
				conn.close();
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	public ArrayList<Item> BowChekALL() {
		ArrayList<Item> BowList = new ArrayList<>();
		
		connect();
		try {
		String sql = "select * from Bow";
		psmt = conn.prepareStatement(sql);
		rs = psmt.executeQuery();
		//rs의 커서를 기준으로 다음에 데이터가 있는지 없는지 확인
		while(rs.next()) {
			Bow item = new Bow(0, null, 0, 0);
			item.setItemNum(rs.getInt(1));
			item.setName(rs.getString(2));
			item.setAttackPower(rs.getInt(3));
			item.setDurability(rs.getInt(4));
			BowList.add(item);
		}
		getClose();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return BowList;
	}
	
	public ArrayList<Item> SwordChekALL() {
		ArrayList<Item> SwordList = new ArrayList<>();
		
		connect();
		try {
		String sql = "select * from Sword";
		psmt = conn.prepareStatement(sql);
		rs = psmt.executeQuery();
		//rs의 커서를 기준으로 다음에 데이터가 있는지 없는지 확인
		while(rs.next()) {
			Sword item = new Sword(0, null, 0);//upcasting
			item.setItemNum(rs.getInt(1));
			item.setName(rs.getString(2));
			item.setAttackPower(rs.getInt(3));
			SwordList.add(item);
		}
		getClose();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return SwordList;
	}
	
	public Item SelectItem(String itemname,Character character) {
		Item selectItem=null;
		connect();
		Item item1 = new Bow(0, null, 0, 0);
		Item item2 = new Sword(0, null, 0);
		Item item;
		try {
			String sql=null;
			if(character instanceof Archer) {
				sql = "select * from Bow where name=?";
				item=item1;
			}else {
				sql = "select * from Sword where name=?";
				item=item2;
			}
			psmt = conn.prepareStatement(sql);
			psmt.setString(1,itemname);
			rs = psmt.executeQuery();
			
			while(rs.next()) {
				
				item.setItemNum(rs.getInt(1));
				item.setName(rs.getString(2));
				item.setAttackPower(rs.getInt(3));
				if(character instanceof Archer) {
					((Bow)item).setDurability(rs.getInt(4));//downcasting
				}
				selectItem = (Item)item;
			}
		}catch(SQLException e){
			e.printStackTrace();
		}
		
		return selectItem;
	}
}
