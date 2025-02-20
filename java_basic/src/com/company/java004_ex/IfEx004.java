package com.company.java004_ex;

import java.util.Scanner;

public class IfEx004 {
	//문자 하나 입력받기
	//대문자인지 소문자인지 판별
	//대문자 ch>='A' && ch<='Z'      소문자 ch>='a' && ch<='z'
	public static void main(String[]args) {
		//변수
		char ch =  ' ';
		//입력
		System.out.println("알파벳을 입력하세요");
		Scanner scan = new Scanner (System.in);
		ch = scan.next().charAt(0); //scanner.next(여기있는 문자열 전부 사용함)    "여(0)기(1)있(2)는(3) 문자열 전부 사용함"/.charAt(0) (0번째 문자 사용함)
		//ch = 'A'; 문자열이 한개일때 ' '         String str="asdf"; 문자열일때 " "
		
		//판볖
		if (ch>='A' && ch<='Z') {System.out.println("대문자입니다.");}
		else if (ch>='a' && ch<='z') {System.out.println("소문자입니다.");}
		else {System.out.println("알파벳만 입력해주세요.");}
		
		//출력
		scan.close();
		/*
		 * 쌤 버전
		 * 변수부분에 String result = " "; 라는 변수 추가함
		 * if문 {}안에 각각 맞춰서 result="대문자";  result="소문자"; 넣기
		 * 이제 if문에서 모든 출력을 삭제하고 바깥에 따로 System.out.println(result); 를 놓는다
		 * */
		
	}
}
