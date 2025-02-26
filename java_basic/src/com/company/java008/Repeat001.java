package com.company.java008;

public class Repeat001 {
	public static void main(String[] args) {
		/* 1) 클래스명 : Repeat001
			다음 오류를 해결하시오.  오류가 나는 이유는?
			byte b1=1;   byte b2=2;   byte result = b1+b2;
		 * 
		 * 결괏값을 byte에 담을수 없다.
		 * 
		 * int result = b1+b2; 로 바꾸거나
		 * byte result2 = (byte) (b1+b2); 처럼 억지로 형 변환을 해야한다.
		 * 
		 * */
		
//			int b1=1;   int b2=2;   int result = b1+b2;
//			byte bb1=1;   byte bb2=2;   byte result2 = (byte) (b1+b2);
//			
		System.out.println("int보다 작은 자료형은 연산시 기본 자료형으로 변환한다!!");
		
	}//
}//
