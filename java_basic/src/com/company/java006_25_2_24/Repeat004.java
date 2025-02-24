package com.company.java006_25_2_24;

import java.util.Scanner;

public class Repeat004 {
	public static void main(String[]args) {
		//변수
		int i = 0;
		
		//입력
		Scanner scan = new Scanner(System.in);
		
		//처리
		for (;;) {
			System.out.println("숫자를 입력하세요.");
			i = scan.nextInt();
			if(i == 1) {break;}
			
		}
		
		//출력
		
		
		
		
		scan.close();
		
	}
}
