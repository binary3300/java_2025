package com.company.java014;

import java.util.InputMismatchException;
import java.util.Scanner;

//
public class Exception001 {
	public static void main(String[] args) {
		int a = -1;
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			try {
				System.out.println("숫자 1 입력>");
				a = scan.nextInt();
				
				if(a==1) {break;}
			}catch(InputMismatchException e) {
				scan.next();
				System.out.println("숫자만 입력해주세요");
				}
			}
		
		
/*
Exception in thread "main" java.util.InputMismatchException
	at java.base/java.util.Scanner.throwFor(Scanner.java:964)
	at java.base/java.util.Scanner.next(Scanner.java:1619)
	at java.base/java.util.Scanner.nextInt(Scanner.java:2284)
	at java.base/java.util.Scanner.nextInt(Scanner.java:2238)
	at com.company.java014.Exception001.main(Exception001.java:13)
 */
		
		
		System.out.println("결과물: " + a);
		scan.close();
	}//
}//
