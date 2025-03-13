package com.company.java018;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class JAVA_IO002_byte {
	public static void main(String[] args) {
		//1. 경로준비
		String folder_rel="src/com/company/java018/"; //src부터 넣는다!
		String file_rel="JavaIO002.txt";
		
		File folder = new File(folder_rel);
		File file = new File(folder_rel + file_rel);
		
		//2. 폴더 + 파일만들기  createNewFile를 쓰면 오류가 날텐데 그때 try&catch 를 해주고 다 집어넣기!
		try {
		if(!folder.exists()) {folder.mkdir();}
		if(!file.exists()) {file.createNewFile();}
		} catch(Exception e) {e.printStackTrace();}
		
		//3. byte 파일 쓰기	InputStream > [프로그램] > "OutputStream"  byte 파일쓰기는 프로그램기준으로 OutputStream 이다
		//컨트롤 쉬프트 o 눌러서 아웃풋스트림을 임포트한다
		try {
			OutputStream output = new FileOutputStream(file) ;
			output.write('j');
			output.write('a');
			output.write('v');
			output.write('a');
			output.flush();
			output.close(); //닫기
			System.out.println(" OutputStream 쓰기완료!!!!! ");
		} catch (Exception e) {
			e.printStackTrace();
		}//와 해냄!!
		
		
		//4. byte 파일 읽기	"InputStream" > [프로그램] > OutputStream  byte 파일읽기는 프로그램기준으로 InputStream 이다
		try {
			InputStream input = new FileInputStream(file);
			//System.out.println(input.read());//아스키코드로나온다 우효   문자-저장할떗 숫자로, 출력할땐 문자로
			int cnt = 0;
			
			while( (cnt=input.read()) !=-1 ) { //-1은 읽어들인 파일이 끝났을때. 그니까 -1이면 읽을 바이트가 없는거임. while(-1이 될때까지 읽으세요~)
				System.out.print((char)cnt);
			}
			input.close();
			
		} catch (Exception e) { //처음 트라이캐치로 만들면 FileNotFoundException e로 돼있을텐데 지우고 Exceptionfh 로 만든다
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
	}
}
