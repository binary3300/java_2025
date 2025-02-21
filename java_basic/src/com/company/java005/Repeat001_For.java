package com.company.java005;

public class Repeat001_For {
	public static void main(String[]args) {
		// 1.
		System.out.println("step1)");
		System.out.println(1+"\t"); //{}  시작1
		System.out.println(2+"\t"); //{}  변화1
		System.out.println(3+"\t"); //{}  종료3
		
		// 2. 
		System.out.println("\n\nstep2)");
		//{반복}     {변수}   for(시작;종료;변화)
		
		for(int i=1; i<=3; i++)
		{System.out.println(i+"\t");}
		
		// 3. 
		System.out.println("\n\nstep3)");
		for(int i=11; i<=20; i++)
		{ System.out.println(i+"\t"); }  System.out.println();
		
		for(int i=3; i<=8; i++)
		{ System.out.println(i+"\t"); }  System.out.println();
		
		for(int i=1; i<=10; i++)
		{ System.out.println(i+"\t"); }  System.out.println();
		
		for(int i=1; i<=5; i+=2)
		{ System.out.println(i+"\t"); }  System.out.println();
	}
}
