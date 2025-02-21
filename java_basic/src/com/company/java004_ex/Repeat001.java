package com.company.java004_ex;

import java.util.Scanner;

public class Repeat001 {
	public static void main(String []args) {
		//변수
		int a;
		//입력
		System.out.println("아자자자ㅏ자");
		Scanner scan = new Scanner(System.in);
		a = scan.nextInt();
		//처리
		if(a == 1) {System.out.println("1이다");}
		else if (a == 2) {System.out.println("2이다");}
		else if (a == 3) {System.out.println("3이다");}
		else {System.out.println("123중에 입력해주세요");}
		
		//출력
				
		scan.close();
	}//maie end
}//class end
