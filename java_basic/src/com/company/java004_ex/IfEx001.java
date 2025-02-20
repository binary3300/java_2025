package com.company.java004_ex;

import java.util.Scanner;

public class IfEx001 {
	public static void main(String[]args) {
		//입력하기
		int a = 0;
		System.out.println("평균을 입력하세요");
		Scanner scan = new Scanner (System.in);
		a = scan.nextInt();
		
		//이프 60점이상 {합격
		if (a >= 60) {System.out.println("합격입니다.");}
		
		//else if (a > 100) {System.out.println("전산 오류입니다. 교무실로 찾아오세요.");}
		
		//엘스 불합격
		else {System.out.println("불합격입니다.");}
		
		scan.close();
		
		/*
		 * int = a; String result="불합격";
		 * (스캐너 동일)
		 * if (a>=60) {result = "합격";}
		 * System.out.println(result);
		 * 
		 * 이렇게 하면 기본출력은 result("불합격")이고, 60점 이상만 합격으로 대입해서 출력한다.
		 * */
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
