package com.company.java008_Ex;

import java.util.Arrays;

public class MethodEx005 {
	
	public static void upper(char[]ch) {//메인에 있는 주소값을 참조해서 변경하겠다!
		System.out.println("2. upper.배열의 주소: " + System.identityHashCode(ch) );
		//대문자로 변경=> A65=a97-35
		for(int i=0; i<ch.length;i++) { ch[i]-=32; }
	}
	
	public static void main(String[] args) {
		char[]ch= {'a','b','c'};
		System.out.println("main.배열의 주소: "  + System.identityHashCode(ch) );
		
		upper(ch);
		//public static 리턴값 메서드명 (파라미터){해야할일}
		//public static void upper(ch){대문자로 변경 'a','b','c'}
		System.out.println("main.배열값: "  + Arrays.toString(ch) );
		
		
	}//
}//
/* 
*		연습문제5)  method
		패키지명 : com.company.java008_ex
		클래스명 :  MethodEx006
	
	public class MethodEx006{ 
	    char[] ch = {'a','b','c'};
	    upper(ch);     
		System.out.println("main. 배열값 : "      +  Arrays.toString(ch)          );  // [A,B,C]
}

 * */
