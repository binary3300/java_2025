package com.company.java0002;

public class Print001 {
	public static void main(String[]arg) {
		//1. System.out.println()
		System.out.println("1.\n 줄바꿈");
		
		//2. print()
		System.out.print("2. 줄바꿈 안됨(css의 인라인요소처럼) print");
		System.out.print("-줄바꿈은 println\n써야함.\n");
		
		//3.printf  %d123  %f1.3  %s"asd"
		System.out.printf("정수 %d,  실수 %f,  문자열 %s",73,3.1415926535897,"abc \n");
		
		//4. +의 의미
		System.out.println(100+3);  //숫자+숫자
		System.out.println(100+3+"+"+1+2); //103+12가 아니야!!!!!경악 "+"이후로 문자열로 인식해서 기냥 있는그대로 프린트함
		System.out.println(1+"+"+2+"="+3);  //1+2+3
		System.out.println("1+2=3");
	}//end main
}//end class
