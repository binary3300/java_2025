package com.company.java019;
////클라이언트!!!!!!!!!!!!!!!!!!!!!
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

////클라이언트!!!!!!!!!!!!!!!!!!!!!
public class Network003_Client {
	public static void main(String[] args) {
		//#실행2 클라이언트
		Socket socket = null;
		
		try {
			//2. 고객이 통신사에 연락 - 127.0.0.1 /7703
			socket = new Socket("127.0.0.1",7703); //
			System.out.println("[CLIENT]2. as center에 고객문의!");
			//4. 데이터 주고받기
			Thread sender = new Sender(socket); sender.start();
			Thread receiver = new Receiver(socket); receiver.start();
			
			}catch (UnknownHostException e){e.printStackTrace();}
			catch (IOException e) {e.printStackTrace();}
	////클라이언트!!!!!!!!!!!!!!!!!!!!!		
		
		
		
		
		
	}//	메인
}//클래스
//클라이언트!!!!!!!!!!!!!!!!!!!!!