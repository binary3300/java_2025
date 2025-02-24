package com.company.java006_25_2_24;

import java.util.Scanner;

public class Repeat001 {
	public static void main(String[] args) {
		//변수
		int a;
		
		//입력
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력해주세요.");
		a = scan.nextInt();
		
		//처리
		if(a== 10) {System.out.println("10이다.");}
		else if(a== 20) {System.out.println("20이다.");}
		else if (a == 30) {System.out.println("30이다");}
		
		//출력
		
		scan.close();
	}
}
