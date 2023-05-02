package 채팅프로그램;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import javax.net.ssl.SSLContext;

public class SocketServerMain {

	public static void main(String[] args) {

	int socketPort = 1234; // 서버채팅 포트 설정
	 try {
		ServerSocket serverSocket =new ServerSocket(socketPort);
		//서버가 종료될 때까지 클라이언트칵 접속할 경우 해당 정보를 socketserver의 list에 저장
		while(true) {
			Socket socketUser = serverSocket.accept();
			SocketServer socketServer = new SocketServer(socketUser);
			socketServer.start();
		}
		
	} catch (IOException e) {
		e.printStackTrace();
	} // 채팅 서버 열기
	 
	
		
		
	}

}
