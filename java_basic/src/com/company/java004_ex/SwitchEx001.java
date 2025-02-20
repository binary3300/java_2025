package com.company.java004_ex;

import java.util.Scanner;

public class SwitchEx001 {
	public static void main(String[]args) {
		//숫자한개 입력받아 3봄 6여름 9가을 12겨울
		//변수
		int a;
		System.out.println("숫자를 하나 입력해주세요");
		
		//입력
		Scanner scan = new Scanner (System.in);
		a = scan.nextInt();
		
		//판단
		switch(a) {
		case 3 : System.out.println("봄 입니다"); break;
		case 6 : System.out.println("여름 입니다"); break;
		case 9 : System.out.println("가을 입니다"); break;
		case 12 : System.out.println("겨울 입니다"); break;
		}
		
		//츨략
		scan.close();
	}//end main
}//end class
