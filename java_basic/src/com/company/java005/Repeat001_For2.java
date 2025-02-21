package com.company.java005;

import java.util.Scanner;

public class Repeat001_For2 {
	public static void main(String[]arge) {
		
		Scanner scan = new Scanner(System.in);
		
		//무한반복 시작 몰라요 끝 몰라요 얼마나 해야할지 모르곘어요 실행하지마세요 영원히 작동해요
		for(;;) {// #1조건이 없으면 무한반복
			System.out.println("숫자 1을 입력하시요");
			int a = scan.nextInt();
			if(a == 1) {break;}
			//a가 1이면 나가기, #2나갈조건	
		}
		
		//for - break
		//1 2 .... 3 뒤로 없어짐...
		for(int i=1; i<=10; i++) {
			if(i==3) {break;}
			System.out.println(i + "\t");
		}
		
		//for - continue
		//1 2 4 5 6 7 8 9.... 3만 스킵...
		for(int i=1; i<=10; i++) {
			if(i==3) {continue;}
			System.out.println(i + "\t");
		}
		
		
		//메뉴판 만들기
		// RepeatEx006 - 무한반복을 하는데, 9를 입력받으면 종료.
		
	}
}
