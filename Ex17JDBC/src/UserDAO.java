import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class UserDAO {

	//DAO : Data Access Object
	//데이터에 접근하는 기능을 가지고 있다
	
	Connection conn = null;//DB연결
	PreparedStatement pstm = null;//쿼리문 실행시키는 객체 생성
	ResultSet rs = null; // 쿼리문 통해 발생한 응답 담는 객체
	
	//DB 연결메소드
	 public void getConn() {
		 try { //DB에 연결할 수 있는 외부 클래스 가져오기 
				Class.forName("oracle.jdbc.driver.OracleDriver");
				String url = "jdbc:oracle:thin:@localhost:1521:xe";//주소값
				String id = "service";
				String pw ="12345";
				// 자바랑 DB통로 만들어줌
				conn = DriverManager.getConnection(url,id,pw);
				
			} catch (ClassNotFoundException | SQLException e) {
				e.printStackTrace();
			}
	 }
	// 연결해제 메소드
	 public void close() {
		 try {
			 if(rs != null) {
				rs.close();// rs가 실행 안될수도 있으니 try catch 넣어줘야함
			}
			 if(pstm !=null) {
				pstm.close();
			}
			if(conn != null) {
				conn.close();
			}
		 } catch (SQLException e) {
				e.printStackTrace();
			}
	 }
	 //로그인 메소드
	 public String login(String inputId, String inputPw) {
		 getConn();
		 String nick = null;
		 try {
				String sql = "select nick from member where id =? and pw =?";
				pstm = conn.prepareStatement(sql);
				pstm.setString(1,inputId);
				pstm.setString(2,inputPw);
				
				rs = pstm.executeQuery();
				
				if(rs.next()) {
					nick = rs.getString("NICK");
				}	return nick;
			} catch (SQLException e) {
				e.printStackTrace();
			
		 }
		 close();
		 return nick;
	 }
	 // 회원가입 메소드
	 public int join(String inputId, String inputPw, String inputNick) {
		 int result = 0 ;
		 String sql = "insert into member values(?,?,?)";
			try {
				pstm = conn.prepareStatement(sql);//
				pstm.setString(1,inputId);
				pstm.setString(2,inputPw);
				pstm.setString(3,inputNick);
				result = pstm.executeUpdate();//1
				return result;
				
			} catch (SQLException e) {
				 e.printStackTrace();
			}
			return result;
			
	 }
	 
	 // 전체 회원 조회하는 메소드
	 public ArrayList<userDTO> userList() {
		 ArrayList<userDTO> userlist = new ArrayList<userDTO>();
		 getConn(); // 연결후에 쿼리문을 가져와야함
		 
		 try {
			 String sql = "select * from member";
			 pstm =conn.prepareCall(sql); // 쿼리문을 실행 가능하게 변경
			 rs = pstm.executeQuery();
			 
			while(rs.next()) { // next()-> 포인터 역할
				String id = rs.getString("id");
				String pw = rs.getString("pw");
				String nick = rs.getString("nick");
				userDTO dto = new userDTO(id, pw, nick);
				userlist.add(dto);
			 }
		} catch (SQLException e) {
			e.printStackTrace();
		}
		close();
		 
		 return userlist;
	 }
	 
}
