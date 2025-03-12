package com.company.java017;

import java.io.File;
import java.io.IOException;

public class JAVA_IO001 {
	public static void main(String[] args) {
		String folder_rel="C:\\java017\\";
		//String folder_rel="src/com/company/java017/"; //이 클래스가 있는 패키지폴더 경로 복붙하고 / 를 꼭 붙여준다!
		String file_rel="file001.txt";				  //  /java_basic/src/com/company/java017
		
		File folder = new File(folder_rel);
		File file = new File(folder_rel + file_rel);
		try {
		if(!folder.exists()) { folder.mkdir(); }
		if(!file.exists()) { file.createNewFile(); }
		System.out.println("폴더/파일 준비완료");
		}catch(IOException e) {e.printStackTrace();}
		
		//컨트롤+에프11   안될때....   새로고침 백만번
		
		
	}//
}//
