package com.company.java018;

import java.io.File;
import java.io.IOException;

//
public class JAVA_IO001_repeat {
	public static void main(String[] args) {
		/*
		 Q10.  다음과 같이 폴더와 파일을 만들어주세요!
			1. folder 만들기   - 금일 패키지  com.company.java018
			2. 파일만들기      - 위의폴더에   JavaIO002.txt
		 */
		
		//경로잡기
		String folder_rel="src/com/company/java018/"; //src부터 넣는다!
		String file_rel="JavaIO002.txt";
		
		File folder = new File(folder_rel);
		File file = new File(folder_rel + file_rel); //폴더 + 파일인걸 잘 봐야한다!!!
		
		//폴더와 파일만들기
		try {
		if(!folder.exists()) {folder.mkdir();} //if(folder.exists(src/com/company/java018/라는 폴더가 존재...... !) 하니??){folder폴더를 .mkdir(만들어!!!);}
		if(!file.exists()) {file.createNewFile();} //!file.exists()
		System.out.println("폴더/파일 준비완료, 10번문제 끝!");
		}catch(IOException e) {e.printStackTrace();}
	}//
}//
