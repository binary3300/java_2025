package com.company.java005_ex;

public class ForEx001 {
	public static void main(String[]args) {
		//For문을 이용해서 각종 출력
		System.out.println("연습문제1");
		for(int i=1; i<=5; i++)
		{ System.out.println(i+"\t"); }  System.out.println();
		
		System.out.println("연습문제2");
		for(int i=5; i>=1; --i)
		{ System.out.println(i+"\t"); }   System.out.println();
		
		System.out.println("연습문제3");
		for(int i=1; i<=3; i++)
		{ System.out.println("JAVA" + i +"\t"); }   System.out.println();
		
		System.out.println("연습문제4");
		for(int i=3; i>=1; i--)
		{ System.out.println("HAPPY" + i +"\t"); }   System.out.println();
		
		System.out.println("연습문제5");
		for(int i=0; i<3; i++)
		{ System.out.println(i+"\t"); }   System.out.println();
		
		/*for(int i=0;i<3; i++){ System.out.println( (i==0 ?" ":",") + i); }
		 * 이 후에 콤마가 잘 찍힌건 선생님 답지 보고 참고해서 고친것
		 * */

		System.out.println("연습문제6");
		for(int i=0; i<100; i++)
		{ System.out.println( i + (i==0 ?" ": ",") +"\t"); }   System.out.println();
		
		System.out.println("연습문제7");
		for(int i=10; i>0; i--)
		{ System.out.println(i +"\t"); }   System.out.println();
		
		System.out.println("연습문제8");
		for(int i=0; i<9; i+=2)
		{System.out.print( i + ((i==0) ?" ":",") +"\n");}   System.out.println();
		
		System.out.println("연습문제9");
		for(int i=0; i<19;i+=2)
		{System.out.println(i);}
	}
}