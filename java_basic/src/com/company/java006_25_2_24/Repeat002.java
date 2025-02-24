package com.company.java006_25_2_24;

import java.util.Scanner;

public class Repeat002 {
	public static void main(String []arge) {
		//변수
		int a;
		
		//입력
		System.out.println("숫자를 입력하시오.");
		Scanner scan = new Scanner(System.in);
		a = scan.nextInt();
		
		//처리
		switch (a) {
			case 10: System.out.println("10이다"); break;
			case 20: System.out.println("20이다"); break;
			case 30: System.out.println("30이다"); break;
		}
		
		//출력
		
		scan.close();
	}
}
