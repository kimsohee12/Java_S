import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.StringTokenizer;

import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

import oracle.net.aso.l;

public class JDBC회원가입 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//2번 문제 입력값
		System.out.print("직원 이름 입력 >> ");
		String inputName = sc.next();
		System.out.print("비밀번호 입력 >> ");
		String inputPw = sc.next();
		//3번 문제 입력값
		System.out.print("성별 입력 >>");
		String inputGender = sc.next();
		System.out.print("나이 입력 >>");
		int inputAge = sc.nextInt();
		System.out.print("연봉 입력 >>");
		int inputMoney = sc.nextInt();
		
		
		//1.DB 연결 (접속방법)
		Connection conn = null;
		
		// 쿼리문을 실행시키는 객체
		// Java에서 문자열로된 쿼리문을 Oracle의 쿼리문으로 바꿔서 실행시켜줌
		PreparedStatement pstm = null;
		
		
		//쿼리문을 통해서 발생한 응답을 담을 수 있는 객체 생성
		ResultSet rs = null;
		
		
		try {//DB 연결할 수 있는 외부 클래스 가져오기
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//연결시 필요한 값 ( url,id,pw)
			String url = "jdbc:oracle:thin:@localhost:1521:xe";//주소값
			String id = "service";
			String pw ="12345";
			
			//DriverManager --> DB랑 연결
			//-> JAVA ,DB 통로 만들어줌
			conn = DriverManager.getConnection(url,id,pw);
			//위에 입력한 값으로 DB에 접속
			//-> try catch
			System.out.println("접속성공");
			
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println("접속실패");
			e.printStackTrace();
		}
		
		//2.접속후 실행하고 싶은 쿼리문 실행 
		 try {
			 //String sql = "select * from 직원";
			 //3번문제) 이름, 패스워드, 성별, 나이, 연봉 입력 받아서 데이터 추가하기
			 String sql = "insert into 직원 values('A0011',?,?,?,?,null,'123-123',?,'D006')";
			 //insert into 직원 values (직원id_seq.nextval(제약조건),'1234','승환','남',20,null,'123-123',3000,'D006');
			 pstm = conn.prepareStatement(sql);
			 pstm.setString(1,inputPw);//넣을 위치를 잘 입력해야 값이 안바뀜 
			 pstm.setString(2,inputName);
			 pstm.setString(3,inputGender);
			 pstm.setInt(4,inputAge);
			 pstm.setInt(5,inputMoney);
			 
	//2번문제 pstm.setString(1,inputName);// ?에 위치에 내가 넣고 싶은 데이터 지정할때 set
	//	 	pstm.setString(2,inputPw);
			// pstm.executeQuery() 쿼리문을 통해서 발생한 응답 
			 //pstm.executeUpdate(); -> 변경된 행의 갯수를 반환
			 int result = pstm.executeUpdate();//-> insert, update, delete 같이 데이터 변경이 있을때 사용
			 //rs = pstm.executeQuery();//"select * from 직원"을 실행 시켜달라는 메소드
			 //executeQuery -> select 같은 데이터 변경이 없을때, 데이터 가져오는,조회시 사용
			 if(result>0) {
				 System.out.println("회원가입 성공");
			 }
			//if(rs.next()) {//rs.next()->주소값을 바꿔 데이터가 있는지 없는지 판단-> boolean type
				 // 전부 출력하려면 rs가 가리키고 있는 주소값을 다음으로 바꿔줘야함 
				 //while-> 다음 주소값이 있으면 True로 반환 //없을때까지 출력 
				// if -> 다음 주소값이 있으면 그 주소값만 출력 
				
			 
			 // 1번 문제) 나이가 40살 이상인 직원의 이름만 출력 
			 
			// 1. String sql = "select * from 직원 where 나이 >=40";
//				while (rs.next()) {
					
			//2번 문제) 위에 입력받은 name과 pw를 이용해 해당하는 직원의 나이 출력 
			//String sql = "select * from 직원 where 이름 = '"+inputName +"'and 패스워드 ='"+inputPw+"'";
			// 위에 쓴것처럼도 가능 ->한번 걸러서 가져오는게 효율적	
			//		 Stirng sql = "select * from 직원 where 이름 = ? and 패스워드 = ? ";//이렇게 쓰는거 더 보기 쉬움
			//		pstm.setString(1,inputName);// ?에 위치에 내가 넣고 싶은 데이터 지정
			//		 pstm.setString(2,inputPw);		
					
//					if(rs.getString("이름").equals(inputName) && rs.getString("패스워드").equals(inputPw)) {
//						System.out.println("입력한 직원의 나이는 >> " + rs.getInt("나이") + "살");
//					} 
			//2.
					//if문으로 출력방법 말고도 
					//String sql = "select 이름 from 직원 where 나이>=40");
					//while (rs.next()) {
					//String name = rs.getString(1);
					//System.out.println(name); }도 가능 
					
//					if(rs.getInt(5)>=40) {
				// getStirng ("이름") 이름 컬럼에서 문자열 데이터를 가져옴
				// getInt("나이") 나이 컬럼에서 정수형 데이터를 가져옴
//				 String name = rs.getString("이름");
//				 int age = rs.getInt("나이");
				 // "이름" 이라고 적어도 되고 인덱스 번호를 입력해줘도 됨
				 //("이름") = (3);
				 // 3번째 위치한 이름이라는 컬럼( DB는 인덱스는 1부터 시작 )
//				 System.out.println(name + " " + age);
//					}
//			 }
			 
			 
		} catch (SQLException e) {
			System.out.println("쿼리문 오류");
			 e.printStackTrace();
		}
		 
		 // 3. DB 연결 제거 -> 역순으로 제거 
		 //계속 연결되어있으면 메모리 용량을 많이 차지함 사용후 꼭 연결제거 해줘야함
		 try {
			 if(rs != null) {
				rs.close();// rs가 실행 안될수도 있으니 try catch 넣어줘야함
			}if(pstm !=null) {
				pstm.close();
			}
			if(conn != null) {
				conn.close();
			}
		 } catch (SQLException e) {
				e.printStackTrace();
			}
		 
		 
	}

}
