package com.company.java018;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;

public class JAVA_IO004_img {
	public static void main(String[] args) throws Exception {
		//1. 경로
		String origin = "src/com/company/java018/dog.jpg";
		String target1 = "src/com/company/java018/dog1.jpg";
		String target2 = "src/com/company/java018/dog2.jpg";
		
		
		//2. byte단위로 이미지파일 읽어들여서 쓰기 (가능할듯)
		//dogdogdog.jpg -> dogdogdog1.jpg
		//InputStream(읽기) -> [program] -> OutputStream(쓰기)
		InputStream bis = new FileInputStream(origin);		//dog.jpg
		OutputStream bos = new FileOutputStream(target1);   //dog1.jpg  트라이캐치말고 다른거해서 위에  throws Exception만 남게 지움
		
		int cnt1=0;
		while( (cnt1=bis.read()) !=-1 ) {bos.write((byte)cnt1);}		//while( () !=-1 )로 시작해서 bis에서 읽은게 -1이 될때까지   {cnt1으로 바이트로 읽겠다}
		bos.flush(); bos.close(); bos.close();
		System.out.println(">>>byte 단위로 이미지 복사 완료!!");
		
		
		//3. char단위로 이미지파일 읽어들여서 쓰기 (안될듯)
		//dogdogdog.jpg -> dogdogdog2.jpg
		//Reader(읽기) -> [program] -> Writer(쓰기)
		Reader cr = new FileReader(origin);	//dog.jpg
		Writer cw = new FileWriter(target2);	//dog2.jpg
			
		int cnt2=0;
		while((cnt2 = cr.read()) !=-1) { cw.write((char)cnt2); }
		cw.flush(); cw.close(); cr.close();
		System.out.println(">>> char 이미지 복사완료!!");
		
		
	}
}
