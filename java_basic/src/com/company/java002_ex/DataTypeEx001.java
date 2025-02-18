package com.company.java002_ex;

import java.util.Scanner;

public class DataTypeEx001 {
	public static void main(String[]args) {
		//GI GO 
		//변수-입력-처리-출력
		//1단계 변수↓
		int age = 0;
		//2단계 입력↓
		Scanner scanner = new Scanner(System.in);
		System.out.print("당신의 나이를 입력하세요.>");
		age = scanner.nextInt();
		//(지금은 처리할거 없음. 패스)4단계 출력↓
		System.out.println("내 나이는" + age + "살 입니다.");
		System.out.printf("내 나이는 %d살 입니다.", age);
		
		scanner.close();//안닫아도 나중에 가비지콜랙터가 닫아놓고가긴 함.
	}// end main
}//end class
