package com.company.java004_ex;

import java.util.Scanner;

public class IfEx003 {
	public static void main(String[]args) {
		//숫자 하나 입력
		int a = 0;
		System.out.println("숫자를 입력하세요");
		Scanner scan = new Scanner (System.in);
		a = scan.nextInt();
		
		//1입력시 {one
		if(a == 1) {System.out.println("one");}
		
		//2입력시 {two
		else if (a == 2) {System.out.println("two");}
		
		//3입력시 {three
		else if (a == 3) {System.out.println("three");}
		
		//셋 다 없으면 {1, 2, 3이 아니다.
		else {System.out.println("1, 2, 3이 아니다");}
	
		scan.close();
		
	}
}
