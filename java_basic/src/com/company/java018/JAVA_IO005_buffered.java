package com.company.java018;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class JAVA_IO005_buffered {
	public static void main(String[] args) {
		//1. 경로준비
		String folder_rel="src/com/company/java018/"; //src부터 넣는다!
		String file_rel="file005.txt";
		
		File folder = new File(folder_rel);
		File file = new File(folder_rel + file_rel);
		
		//2. 폴더 + 파일만들기  createNewFile를 쓰면 오류가 날텐데 그때 try&catch 를 해주고 다 집어넣기!
		try {
		if(!folder.exists()) {folder.mkdir();}
		if(!file.exists()) {file.createNewFile();}
		} catch(Exception e) {e.printStackTrace();}
		
		//3. 파일쓰기(byte)
		//byte 파일 읽기	InputStream > [프로그램] > OutputStream  byte 파일읽기는 프로그램기준으로 InputStream 이다
		//"InputStream" > [프로그램] > "OutputStream"
		// ButteredWriter(속도향상) - OutputStreamWriter(단어) - FileOutputStream(byte)
		try {
			BufferedWriter bw=
						new BufferedWriter( new OutputStreamWriter (new FileOutputStream(file)));
			bw.write("1, white, 1200 \n");
			bw.write("2, choco, 1500 \n");
			bw.write("3, banana, 1800 \n");
			bw.flush(); bw.close();
			System.out.println("쓰기 완료!");
		} catch (Exception e) {e.printStackTrace();}
		
		
		
		//4. 파일읽기(byte)
		//"InputStream"			 > 			[프로그램] 		> 		OutputStream
		//ButteredReader(속도향상) -	InputStreamReader(단어)	-	FileInputStream(byte)
		try {
			BufferedReader br =
				new BufferedReader (new InputStreamReader (new FileInputStream(file)));
			//System.out.println(br.readLine());
			String line = "";
			StringBuffer sb = new StringBuffer();
			while((line=br.readLine()) != null) {sb.append(line + "\n");} //while(  ()!= null ) 다 읽으면 null이니까, null이 될때까지!
			
			System.out.println(sb.toString());
			br.close();
		} catch (Exception e) {e.printStackTrace();}
		
		
		
		
		
		
		
	}
}
/* 
white  / 1000
choco  / 1200
banana / 1500 */