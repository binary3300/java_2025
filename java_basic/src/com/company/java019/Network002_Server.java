package com.company.java019;
////서버!!!!!!!!!!!!!!!

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;

////서버!!!!!!!!!!!!!!!
public class Network002_Server {
	public static void main(String[] args) {
		//1. 서버소켓 -  [ , , , ,] #실행1 ascenter
		ServerSocket ascenter=null;
		Socket 		 socket;
		
		//localhost, 127.0.0.1/port 	80은 웹/ 443은 보안/ 등등
			try {
				ascenter = new ServerSocket(7703);
				System.out.println("[SERVER] 1. 서버준비완료 A/S센터 "
						+ "OPEN!! ...2.고객님 기다리는중");
			} catch (IOException e) {e.printStackTrace();} 
			
		//3. 클라이언트의 요청(accept)이 오면  상담사(Socket)랑 연결
			try {
				socket = ascenter.accept(); //scoket은 고객의 정보를 갖고있음
				System.out.println("3. 고객님 연락와서 상담사랑 연결함...");
				
				Thread sender = new Sender(socket); sender.start();
				Thread receiver = new Receiver(socket); receiver.start();
				
			} catch (IOException e) {e.printStackTrace();}
			
			//4. 데이터 주고받기
			
			
			
	}//
}//



////서버!!!!!!!!!!!!!!!
//Thread 1) extends상속 -> run구현 -> start 작업수행클래스 실행
//말하기 기능 클래스 				>[프로그램]>출력 OutputStream
class Sender extends Thread{
	Socket socket; DataOutputStream out; String who; SimpleDateFormat sdf;
	
	public Sender() {}
	public Sender(Socket socket) {
		this.socket = socket;
		try {
			out = new DataOutputStream(socket.getOutputStream());
			out.writeUTF("Hello.... START!!>>");
			this.who="[" + ( socket.getPort() == 7703 ? "Client" : "Server" );
			this.sdf = new SimpleDateFormat(" hh:mm:ss]");
		} catch (IOException e) {e.printStackTrace();}
	}

	@Override public void run() { 
		//Scanner scan = new Scanner(System.in); 이거써도됨
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		try {
		while(out != null) {
			String data = in.readLine();
			String time = sdf.format(System.currentTimeMillis());
			out.writeUTF( who + time + data );
		}
		}catch(Exception e){//e.printStackTrace();
			System.out.println("통신을 마무리합니다>>" + socket);
		}
		finally {
			try {
				if(out != null) {out.close();}
				if(in != null) {in.close();}
				if(!socket.isClosed()) {socket.close();}
			}catch(Exception e) {e.printStackTrace();}
		}
	}
}//class Sender extends Thread
////서버!!!!!!!!!!!!!!!

//듣기 기능 클래스	 InputStream 입력>[프로그램]>
class Receiver extends Thread{
	Socket socket; DataInputStream in;
	
	public Receiver() {}
	public Receiver(Socket socket) {
		this.socket = socket;
		try { in = new DataInputStream(socket.getInputStream()); }
		catch (IOException e) {e.printStackTrace();}
	}
	
	@Override public void run() { 
		try {
			while( in != null ) {
				System.out.println(in.readUTF());
			}
			}catch(Exception e) {//e.printStackTrace();
				System.out.println("통신을 마무리합니다>>" + socket);
			}finally {
				try {
					if(in != null		) {in.close();}
					if(socket.isClosed()) {socket.close();}
				}catch(Exception e) {e.printStackTrace();}
			}
	}
	
}//class Receiver extends Thread
////서버!!!!!!!!!!!!!!!

















