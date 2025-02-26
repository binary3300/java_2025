package com.company.java008;

public class Repeat002 {
	public static void main(String[] args) {
		for(int i=100; i<301; i+=100) { System.out.println(i); }
		
		int i=100;
		while(i<301) {System.out.println(i); i+=100;} 
		
		i=100;
		do {System.out.println(i); i+=100;} while(i<301); 
		
		System.out.println("하지만 어제 예제 보고했으니 무효다");
	}//
}//
