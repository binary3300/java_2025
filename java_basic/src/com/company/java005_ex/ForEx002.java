package com.company.java005_ex;

import java.util.Scanner;

public class ForEx002 {
	public static void main(String[]args) {
		//변수
		int  a;
		
		
		//입력
		System.out.println("구구단 몇단?");
		Scanner scan = new Scanner (System.in);
		a = scan.nextInt();
		//처리
		//2*1=2
		//2*2=4
		//2*3=6
//		System.out.println(a      +     " * "     +      1      +   "="     +   a*1 );
//		System.out.println(a      +     " * "     +      2      +   "="     +   a*2 );
//		for(b=1;b<=9;b++);
//		{ System.out.println(b + ); }
		
		
		for(int i=1; i<=9; i++){
			System.out.println(a + " * " + i + "=" + a*i);}
		
		scan.close();
	}
}
//사용자에게 단을 입력답아 해당하는 단을 출력,... 구구단 그건가
		//사용자가 2를 입력->변수에 넣음->처리->출력
		//스캔 프린트 입력받은게 a
		//1~9커지는게 b
		//최종계산 c
		//출력형태 a*b=c
		// 
		//for(a=1; a<=9; a++)
		//{i}
		//2*1=2
		//2*2=4
		//2*3=6