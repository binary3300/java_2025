package com.company.java003_ex;

import java.util.Scanner;

public class CastingEx001_2 {
	public static void main(String[]args) {
		//변수
		int first, second; float summit;
		Scanner scan = new Scanner (System.in);
		//입력
		System.out.print("숫자를 입력해주세요> ");
		first = scan.nextInt();
		System.out.print("숫자를 입력해주세요> ");
		second = scan.nextInt();
		//처리
		summit = (float)first / (float)second;
		//출력
		System.out.println(summit);
		System.out.println( first + "/" + second + "=" + String.format( "%.2f",summit));
		
		
		//System.out.println( first + "/" + second + "=" + String.format( "%.2f",summit));
		//출력서식 String.format("출력서식", 처리할 값)
	}
}
