package com.company.HELPjava;

import java.util.Scanner;

public class Scan {
	//기본문
	public static void main(String[]args) {
		
		//인트 스캔
		int num;
		
		System.out.println("숫자 int를 입력하세요. 임의의 변수 num으로 들어갑니다 ");
		Scanner scan1 = new Scanner (System.in);
		num = scan1.nextInt(); //입력된 숫자 전체를 이용
		scan1.close();
		
		
		
		
		
		
		//캬라 스캔
		char ch =  ' ';//변수 캐릭터는 쓰기전에 꼭 ' ';로 초기화를 해주세요.
		
		System.out.println("문자 chara를 입력하세요. 임의의 변수 ch로 들어갑니다.");
		Scanner scan2 = new Scanner (System.in);
		ch = scan2.next().charAt(0); //입력받은 문제에서 0번째를 이용
		scan2.close();
		
		
		
		
		
	}
}
