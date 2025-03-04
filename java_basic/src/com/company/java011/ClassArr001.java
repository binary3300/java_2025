package com.company.java011;

import java.util.Arrays;

class A1{String name;}

public class ClassArr001 {
	public static void main(String[] args) {
		//int[]		arr		=	new int[3];  비교해서 참고~
		   A1 []		carr	=	new A1[3];
		   
		   System.out.println(Arrays.toString(carr)); //[null, null, null]
		   System.out.println("갯수>" + carr.length); //갯수3: index- 0~2. (0, 1, 2 이렇게 세개)
		   //carr[0].name="apple";System.out.println(carr[0]);   java.lang.NoSuchFieldError
		
		   carr[0]=new A1(); //1 new 메빌, 객체생성 2)A() 초기화  3)cass[0]번지
		   carr[0].name = "apple"; System.out.println(carr[0].name);
		   
		   carr[1]=new A1(); //1 new 메빌, 객체생성 2)A() 초기화  3)cass[0]번지
		   carr[1].name = "banana"; System.out.println(carr[1].name);
		   
		   carr[2]=new A1(); //1 new 메빌, 객체생성 2)A() 초기화  3)cass[0]번지
		   carr[2].name = "tomato"; System.out.println(carr[2].name);
		   
	}//
}//
