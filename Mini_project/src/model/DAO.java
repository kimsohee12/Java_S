package model;

import java.awt.event.ItemEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DAO {

	Connection conn ;//DB연결
	PreparedStatement pstm ;//쿼리문 실행시키는 객체 생성
	ResultSet rs ; // 쿼리문 통해 발생한 응답 담는 객체
	
		//DB 연결메소드
 private void getConn() {
	 try { 
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";//주소값
			String db_id = "service";
			String db_pw ="12345";
			conn = DriverManager.getConnection(url,db_id,db_pw);
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
 }
	 
		 
		// 연결해제 메소드
 private void getclose() {
	 try {
		 if(rs != null) {
			rs.close();
		}
		 if(pstm != null) {
			pstm.close();
		}
		 if(conn != null) {
			conn.close();
		}
	 } catch (SQLException e) {
			e.printStackTrace();
		}
 }

 //활 정보를 전부 가져오는 메서드
 public ArrayList<itemVo> BowchekAll(){
	ArrayList<itemVo> BowList = new ArrayList<>();
	
	getConn();
	try {
		String sql = "select *from Bow";
		pstm = conn.prepareStatement(sql);
		rs = pstm.executeQuery();
		//rs 의 커서를 기준으로 다음에 데이터가 있는지 없는지 확인한
		while(rs.next()) {
			BowVo item = new BowVo(0, null, 0, 0);
			item.setItemNum(rs.getInt(1));
			item.setName(rs.getString(2));
			item.setAttackPower(rs.getInt(3));
			item.setDurability(rs.getInt(4));
			BowList.add(item);// 업캐스팅 => BowVo는 itemVO 보다 아래있지만 업캐스팅 해서 해당 ArrayList에 들어갈 수 있따.
		
		}
		getclose();
		
		
	} catch (SQLException e) {
		e.printStackTrace();
	}
	return BowList;
 }
 
 //칼 정보를 전부 가져오는 메서드
 public ArrayList<itemVo> SwordcakAll(){
	 ArrayList<itemVo> swordList = new ArrayList<>();
	 getConn();
	 try {
		String sql = "select *from sword";
		pstm = conn.prepareStatement(sql);
		rs = pstm.executeQuery();
		while(rs.next()) {
			SwordVo item = new SwordVo(0, null, 0);
			item.setItemNum(rs.getInt(1));
			item.setName(rs.getString(2));
			item.setAttackPower(rs.getInt(3));
			swordList.add(item);
		}
		getclose();
	} catch (SQLException e) {
		e.printStackTrace();
	}
	 
	 return swordList;
 }
 
 public itemVo SelectItem(String itemname,Character character) {
		itemVo selectItem=null;
		getConn();
		itemVo item1 = new BowVo(0, null, 0, 0);
		itemVo item2 = new SwordVo(0, null, 0);
		itemVo item;
		try {
			String sql=null;
			if(character instanceof Archer) {
				sql = "select * from Bow where name=?";
				item=item1;
			}else {
				sql = "select * from Sword where name=?";
				item=item2;
			}
			pstm = conn.prepareStatement(sql);
			pstm.setString(1,itemname);
			rs = pstm.executeQuery();
			
			while(rs.next()) {
				
				item.setItemNum(rs.getInt(1));
				item.setName(rs.getString(2));
				item.setAttackPower(rs.getInt(3));
				if(character instanceof Archer) {
					((BowVo)item).setDurability(rs.getInt(4));//downcasting
				}
				selectItem = (itemVo)item;
			}
		}catch(SQLException e){
			e.printStackTrace();
		}
		
		return selectItem;
	}
 
 

}

