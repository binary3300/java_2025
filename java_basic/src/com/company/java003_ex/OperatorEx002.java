package com.company.java003_ex;

import java.util.Scanner;

public class OperatorEx002 {
	public static void main(String[]args) {
		//Q1 
		int x=5;
		
		//쌤이 임의의 수르 ㄹ넣으셔서 나도 걍넣음  System.out.println("숫자입력");
		//Scanner scan = new Scanner(System.in);
		//x = scan.nextInt();
		System.out.println( ( 3<x ) && (x<10) );
		
		//Q2
		char ch = ' ';
		ch = 'b';
		//System.out.print("문자 입력");
		//ch = (char)scan.nextdouble();
		System.out.println( (ch == 'a')||(ch == 'A') ); //보기에 틀린점을 모르겠지만 오류가 나니까 물어보기
		 
		//Q3 여기부터 못풀음
		System.out.println( ch>='0' && ch<='9' );
		//Q4
		System.out.println( ch>='A' && ch<='Z' || ch>='a' && ch<='z' );
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
