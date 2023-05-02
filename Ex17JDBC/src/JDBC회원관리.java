import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import oracle.jdbc.OracleTranslatingConnection.SqlTranslationVersion;

public class JDBC회원관리 {

	public static void main(String[] args) {

		//(1)로그인 (2)회원가입 (3)닉네임 조회 (4)종료
		
		Scanner sc = new Scanner(System.in);
		UserDAO dao = new UserDAO();
		
		int input;
		String inputId;
		String inputPw;
		String inputNick;
		
		while (true) {
			System.out.print("(1)로그인 (2)회원가입 (3)전체 회원 조회 (4)종료 >> ");
			input = sc.nextInt();
			if(input==1) {
				System.out.println("---로그인 시도---");
				System.out.print("아이디를 입력 >> ");
				inputId = sc.next();
				System.out.print("패스워드를 입력 >> ");
				inputPw = sc.next();
				
				dao.getConn();
				
				String nick= dao.login(inputId, inputPw);
				if(nick != null) {
					System.out.println(nick + "님 환영합니다");
					
				}
				dao.close();
				
			}else if (input == 2) {
				System.out.println("---회원가입 시도---");
				System.out.print("아이디를 입력 >> ");
				inputId = sc.next();
				System.out.print("패스워드를 입력 >> ");
				inputPw = sc.next();
				System.out.print("닉네임을 입력 >> ");
				inputNick = sc.next();
				
				dao.getConn();
				
				int result = dao.join(inputId, inputPw, inputNick);
				if(result>0) {
				 System.out.println("회원가입 성공");
				}System.out.println("회원가입 실패");
				
				dao.close();
				
			}else if (input ==3) {
				System.out.println("---전체 회원 조회---");
				ArrayList<userDTO>userlist = dao.userList();
				for(int i=0;i<userlist.size();i++) {
					String id = userlist.get(i).getId();
					String pw = userlist.get(i).getPw();
					String nick = userlist.get(i).getNick();
					System.out.println("ID : " + id + " PW : " + pw + " NICK : " + nick );
				}
				
			}else if (input==4) {
				System.out.println("----종료----");
				break;
			}else {
				System.out.println("다시 입력");
			}
			
		}
		
		
		
		
	
		
	}

	
}
