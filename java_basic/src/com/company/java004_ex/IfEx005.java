package com.company.java004_ex;

import java.util.Scanner;

public class IfEx005 {
	//문자하나 입력받기
	//대문자면 소문자로
	//소문자면 대문자로 변경
	//A는 65 a는 97
	//a = 'A'+32
	public static void main(String[]args) {
		//변수
		char ch =  ' ';
		//입력
		System.out.println("알파벳을 입력하세요");
		Scanner scan = new Scanner (System.in);
		ch = scan.next().charAt(0);
		//판단
		if (ch>='A' && ch<='Z') {ch = (char) (ch+32);}
		else if(ch>='a' && ch<='z') {ch = (char) (ch-32);}
		else {System.out.println("알파벳만 입력하세요");}
		
		System.out.println( ch ); 
		//ch가 대문자라면 32를 더해서
		//아니라면 32를 빼서 출력
		//출력
		scan.close();
	}
}
