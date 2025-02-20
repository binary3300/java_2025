package com.company.java004_ex;

import java.util.Scanner;

public class IfEx002 {
	public static void main(String[]args) {
		//숫자 한개 입력
		float a = 0;
		System.out.println("숫자를 입력하세요");
		Scanner scan = new Scanner (System.in);
		a = scan.nextFloat();
		//양라면 출력 양수
		if (a > 0) {System.out.println("양수");}
		
		//음수라면 출력 음수
		else if(a < 0) {System.out.println("음수");}
		
		//0이라면 zero출력
		else {System.out.println("ZERO");}
		
		scan.close();
	}
}
