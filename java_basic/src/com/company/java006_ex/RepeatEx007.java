package com.company.java006_ex;

public class RepeatEx007 {
	public static void main(String[]args) {
		//1번
		for(int i=1; i<=5; i++) {System.out.println(i);} System.out.println();
		
		int i = 1;
		while (i<=5) {System.out.println(i); i++;} System.out.println();
		
		i = 1;
		do {System.out.println(i); i++;}while (i<=5);  System.out.println();
		
		//2번
		for(int a=5; a>0; a--) {System.out.println(a);} System.out.println();
		
		int a=5;
		while (a>0) {System.out.println(a); a--;} System.out.println();
		
		a = 5;
		do {System.out.println(a); a--;} while(a>0); System.out.println();
		
		//3번
		for(int b=1; b<=3; b++) {System.out.println("JAVA"+b);} System.out.println();
		
		int b=1;
		while(b<=3) {System.out.println("JAVA"+b); b++;} System.out.println();
		
		b=1;
		do {System.out.println("JAVA"+b); b++;} while(b<=3); System.out.println();
		
		
		
		
		
		
	}//
}//
