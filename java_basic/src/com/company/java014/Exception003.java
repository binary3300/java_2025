package com.company.java014;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.company.HELPjava.Scan;

public class Exception003 {

	public static int nextInt() throws InputMismatchException {		//##2-2 발생한 지점
		int a = -1;
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자 1 입력>");
		a = scan.nextInt(); //nextInt() 숫자 입력받기를 기다림
		return a;
	}
	
	public static void main(String[] args) /*throws Exception 이것도 됨 */ {
		int a=-1;
		while(true) {
			try {
				a=nextInt();		//#2-2 오류났와!!! InputMismatchException
				if(a==1)break;
				System.out.println(nextInt());  	//##2-2
			} catch(Exception e) {System.out.println("오류났아!!");}
		}
		System.out.println("결과물: " + a);
	
	}//main
		
/*	1) main 안에서
Exception in thread "main" java.util.InputMismatchException
	at java.base/java.util.Scanner.throwFor(Scanner.java:964)
	at java.base/java.util.Scanner.next(Scanner.java:1619)
	at java.base/java.util.Scanner.nextInt(Scanner.java:2284)
	at java.base/java.util.Scanner.nextInt(Scanner.java:2238)
	at com.company.java014.Exception001.main(Exception001.java:13)
 
 	2) method로 만들때
Exception in thread "main" java.util.InputMismatchException		##1
	at java.base/java.util.Scanner.throwFor(Scanner.java:964)
	at java.base/java.util.Scanner.next(Scanner.java:1619)
	at java.base/java.util.Scanner.nextInt(Scanner.java:2284)
	at java.base/java.util.Scanner.nextInt(Scanner.java:2238)
	at com.company.java014.Exception003.nextInt(Exception003.java:12)	#2-2 발생한 지점
	at com.company.java014.Exception003.main(Exception003.java:17)		#2-1 호출한 애
 
 
 
 
 
 */
		
	
}//class
