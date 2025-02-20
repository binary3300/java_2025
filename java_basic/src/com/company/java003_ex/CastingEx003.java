package com.company.java003_ex;

import java.util.Scanner;

public class CastingEx003 {
	//Q2. 대문자 입력 받아서 소문자로 변경프로그램
	public static void main(String[]args) {
		//대문자 입력받기-소문자로 처리-출력
		//변수
		char ch = ' ';
		Scanner scan = new Scanner(System.in);
		//입력
		System.out.println("대문자로 입력해주세요.");
		ch = scan.next().charAt(0); //"A(0) B(1) C(2) D(3)..."
		//String bstr = scan.next();
		
		//처리   a(97임) = A(65임) + 32
		ch += 32;  //수를 더하고싶을때 +           대입하고싶을때 =
		//처리2
		ch = (char) (ch+32);
		
		
		
		//String sstr = (str)bstr += 32;
		System.out.println(ch);
		
		scan.close();
	}
}
