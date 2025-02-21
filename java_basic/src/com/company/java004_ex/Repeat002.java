package com.company.java004_ex;

import java.util.Scanner;

public class Repeat002 {
	public static void main(String[]args) {
		//변수
		int a;
		//입력
		Scanner scan = new Scanner(System.in);
		a = scan.nextInt();
		//입력받기
		
		//판단
		switch (a) {
		case 1: System.out.println("1이다."); break;
		case 2: System.out.println("2이다."); break;
		case 3: System.out.println("3이다."); break;
		}
		
		scan.close();
		//출력
		
		
	}
}
