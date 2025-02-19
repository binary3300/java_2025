package com.company.java003;

import java.util.Scanner;

public class Casting002 {
	public static void main(String[]args) {
		//1 문자초기화
		//문자는 저장시 숫자로/출력시 문자
		char ch1 = ' ';//공백 하나라도 있어야함.
		char ch2 = '\u0000';//자바는 기본적으로 유니코드를 지원하기때문에 따로 초기화를 준 것
		
		System.out.println( ">< 1: "+ ch1 + "\t" + ch2 ); //   \t 탭누른효과
		System.out.println( ">< 1: "+ (int)ch1 + "\t" + (int)ch2 );
		
		//2 문자의 연산
		char c = 'A';
		System.out.println(">< 3: " + c + "\t" + (int)c);
		
		System.out.println(">< 4: " + (char) (c + 1));
		//A(65) - B(66) - C(67) ~
		
		//1) + 는 더하기연산
		//2) 숫자 + 숫자  더하기가 성립함
		//3) 'A' + 1 = 'A'(char | 2byte) + 1(int | 4byte)
		//	 'A' + 1 = 'A'(char | 2byte) + 1(int | 4byte)
		// byte - short(2byte)/char(2byte) - int
		//4) 결과물 int
		
		byte ex1 = 1;
		//byte result = ex1 + 10; //byte(1) + int(4)
		int result = ex1 + 10; //해결!
		
		//Q1. 대문자 "A"를 소문자 "a"로 변환시키기
		
		System.out.println("힌트: "+ 'A' + "\t" + (char)('A'+32) );
		
		char q1 = 'A';
		System.out.println( "이런 답도: " + (q1+=32) );
		// += >>>> + 더하기를 하고 =대입한다!
		
		
		//3 문자열
		//자료형의 분류는 기본형과 참조형
		String str1 = "abc";  //객체 사용시 				str1 주소
		Scanner scanner = new Scanner(System.in);	//	scanner 주소

		
		System.out.print(str1);
		System.out.println(scanner);
		
		System.out.println(str1.charAt(0));//a
		System.out.println(str1.charAt(1));//b
		System.out.println(str1.charAt(2));//c
		
		String str = scanner.next();
		System.out.println("입력한 문자열: " + str);
		
		char ch = scanner.next().charAt(0);
		System.out.println("입력한 문자열: " + ch);
		
		//System.out.println(scanner);
		
		
		
		
		
		
		
		
		
		
		
		
	}//end main
}//end class
