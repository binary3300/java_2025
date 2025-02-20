package com.company.java004;

import java.util.Scanner;

public class Switch001 {
	public static void main(String[]args) {
		//변수
		int a=0;
		Scanner scan = new Scanner(System.in);
		
		//입력
		System.out.println("숫자 하나 입력>");
		a = scan.nextInt();
		
		//처리 (if 혹은 switch) (내일 for, while do while 배운다)
		// if ver - a가 1이면 1이다, 2이면 2이다, 3이면 3이다.
		if (a == 1) {System.out.println("1이다");}		//if 조건이 맞다면
		else if (a == 2) {System.out.println("2이다");}	//else 아니라면
		else if (a == 3) {System.out.println("3이다");}
		
		System.out.println();
		//switch는 break.를 만날때 빠져나옴
		//scb
		switch(a) {
		case 1: System.out.println("1이다"); break;
		case 2: System.out.println("2이다"); break;
		case 3: System.out.println("3이다"); break;
		}
		
		scan.close();
		
		//출력
		
		//
	}
}
