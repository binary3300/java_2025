package com.company.java003;

public class Casting001 {
	public static void main(String[]args) {
		//#1. 형변환(캐스팅) -자동타입변환
		// byte < short < int < long < float < double
		byte by = 1;
		short sh = 2;
		int in = 4;
		long l = 8L;
		
		float f = 3.14f;
		double d = 3.14d;
		
		sh = by;  //정수(2byte) - 정수(1byte)
		in = by;  //정수(4byte) - 정수(1byte)
		l = by;   //정수(8byte) - 정수(1byte) 
		
	//	l = f;	//정수(8byte) - 실수(4byte)   정수<실수 (자세히 알려고 하진 마)
				//Type mismatch: cannot convert from float to long
		f = l;	//실수(4byte) - 정수(8byte)
		
		//boolean 1byte
		//boolean bl = true;
		//in = bl; boolean은 형변환 안됨.그사세
		
		//#2. 형변환(캐스팅) -강제타입변환
		by = (byte) in;   //정수(1byte)  -  정수(4byte)
		
		int in2 = (int) 1.2;  // 정수(4byte)  -  실수 double(8byte)  실수를 쓰면 자동으로 더블로 인식함.
		float f12 = (float) 3.14;   // 실수(4byte) - 실수 double(8byte)  실수를 쓰면 자동으로 더블로 인식함!!!
									// float: 소수점 7자리까지 보장함, double: 소수점 15자리까지 보장함.
		
		System.out.println(in2); //1 출력됨
		System.out.println(f12);
		
		//Q1. 다음의 구문을 3으로 나오게 만들기!!
		
		int a = (int) 1.5;
		int b = (int) 2.7;
		System.out.println( a + b );
		
		System.out.println( (int)1.5 + (int)2.7 );
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
