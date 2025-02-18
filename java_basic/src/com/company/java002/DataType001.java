package com.company.java002;

public class DataType001 {
	public static void main(String[]args) {
		//1. 자바의 자료형 분류 (기본형/참조형)
		//2. 기본형: 값 저장 (vip손님, 명함안보고 얼굴만봐도 알음)(어디소속인지 안알리고 예약 안해도 방이 있음)
		//		논리, 정수, 실수 
		//			vip손님인 회사의 각 부서.
		//				실수는 각종실무담당이라 하는일이 진짜많음. 사람에 따라 진상고객담당, 야근도 함.(소숫점 아래로 내려감)
		//				정수는 정해진 일만 함. 모든 사람들이 추가업무가 없음.(자연수만 있음)
		//				논리는 공무원
		boolean bl = true;  //true/false
		System.out.println("1. 논리: " + bl);
		
		//정수 (1,2,4,8 : byte-short-int◈-long:L)
		byte by=1; short sh=2; int in=4; long lo=8L;
		System.out.println(" 2 정수 byte-short-int-long: "+lo );
		
		// 1. 연산시 + 2. int(기본 자료형보다 작은거: byte, short) 연산시 주의바람 
		//short result = by+sh; // 1(int로 인식함)+2(int로 인식함)
		//System.out.println(result);
		
		//실수 (float/double)
		float fl=3.14f; double d=3.14;
		System.out.println("3. 실수 float - double◈: " + fl + "\t" + d);
		
		System.out.println("4. 실수 > 정수");
		fl = lo;  //fl(은 실수니까 4byte)- long (는 정수라서 8byte)
		System.out.println(fl);
		
		
		System.out.println("5. 정밀도");
		
		float fper = 1.0000001f; //0이 6개
		float fper2 = 1.00000001f; //0이 7개
		double dper = 1.000000000000001; //0이 14개
		double dper2 = 1.0000000000000001; //0이 15개
		System.out.println(fper + "\t" + fper );
		System.out.println(dper + "\t" + dper2 );
		
		System.out.println("6. 문자는 저장시 숫자로/출력시 문자로.");
		char ch = 'A';	//문자 ' '
		System.out.println(ch);
		System.out.println((int)ch);
		
		//int a = 2>>32;
		//int b = 2>>33;
		//System.out.println(a + "\t" + b);
		
		
		
		
		
		
		
	}
}
