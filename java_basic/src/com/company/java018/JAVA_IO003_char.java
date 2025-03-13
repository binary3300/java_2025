package com.company.java018;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class JAVA_IO003_char {
	public static void main(String[] args) {
		//1. 경로
		String folder_rel="src/com/company/java018/"; //src부터 넣는다!
		String file_rel="JavaIO003.txt";
		
		File folder = new File(folder_rel);
		File file = new File(folder_rel+file_rel);
		
		//2. 폴더+파일만들기 (컨트롤 f11로 실행하고 폴더에서 새로고침도 해야한다!!!!!!!!)
		
		try {
			if(!folder.exists()) {folder.mkdir();}
			if(!file.exists()) {file.createNewFile();}
		} catch (Exception e) {e.printStackTrace();}
		
		//3. char 쓰기		Reader > [프로그램] > ""Writer""		프로그램기준으로 작성은 라이터
		try { //Writer writer = new FileWriter(file);까지 쓰면 트라이캐치 나올것임
			Writer writer = new FileWriter(file);
			writer.write("hello");
			writer.flush();
			writer.close();
			System.out.println("Writer 쓰기완료!");
		} catch (IOException e) {e.printStackTrace();}
		
		
		
		//4. char 읽기		""Reader"" > [프로그램] > Writer		프로그램기준으로 읽어오는건 리더
		try { 
			Reader reader = new FileReader(file);
			//System.out.println(reader.read()); 여기서 아스키코드로 읽는다. 아래가 한글로 나오게 출력하는방법이다!!!
			int cnt=0;
			while( (cnt=reader.read()) != -1 ){
				System.out.print((char)cnt);
			}
			reader.close();
			System.out.println("Reader 읽기완료!");
		} catch (Exception e) {e.printStackTrace();}
		
		
		
		
		
		
		
		
	}//
}//
