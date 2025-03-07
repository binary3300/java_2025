package com.company.java014;

//
public class Exception002 {
	public static void main(String[] args) {
		//1. try{에바 에러날듯} catch(이런 에러가){} finally{맨 마지막 무조건처리.. 생략가능}
		try{System.out.println(10/0);}//로베르트도 이거 수학귀신한테 물어봤다가 수학귀신 개화나서 갈갈이 날뛰다가 꿈에서 깼음
		catch(			  Exception e){System.out.println("관리자에게 문의주세요");}
		//catch(ArithmeticException e){System.out.println("관리자에게 문의주세요");}
		finally{System.out.println("무조건 걍 해!!");} 
		
		//업캐스팅: 부모는 자식을 담을 수 있다.
		
		//2. throw 메소드 :
		
	}//
}//
/*
																	#1 복사 ArithmeticException
Exception in thread "main" java.lang.ArithmeticException: / by zero
	at com.company.java014.Exception002.main(Exception002.java:7)	#2 에러가 있는 줄 번호 Exception


 */
