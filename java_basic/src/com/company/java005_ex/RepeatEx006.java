package com.company.java005_ex;

import java.util.Scanner;

public class RepeatEx006 {
	public static void main(String[]args) {
		//변수
		Scanner scan = new Scanner (System.in);
		int input = 0;
		
		
		//입력
		for (;;) {
			System.out.println("메뉴판입니다. 종료는 9>");	
			input = scan.nextInt();
			if(input == 9) {break;}			
		}
		
		//판단
		
		//출력
		
	}
}
