package com.company.java008;

public class Method002 {

	//#1 함수정의
	//public static 리턴값 메서드명(파라미터){}
	
	public static void myint(int a) { System.out.println(a); }
	public static void myadd(int a, int b) { System.out.println(a+b); }
	
	//
	
	public static void test1(int c) {System.out.println(c);}
	public static void test2(double d) {System.out.println(d);}
	public static void hap(int e, int f){ 
		//입력받은 e와 입력받은 f 사이의 수를 모두 더해서 g에 대입하고 출력한다.
		//시작은 e, f가 되면 멈춤, e System.out.println(g);
		//누적박스 만들기
		int box=0;
		//박스+=3 box+=3
		//박스+=4 box+=4 
		//박스+=5 box+=5
		for(int data=e; data<=f; data++){ box+= data;}
		System.out.println(box);
	}
	public static void disp(int g, char h) {
		//h의 값을 출력한다 입력받은 g만큼 반복.
		//for문으로 반복을 하는데, 더하기만 안하고 걍 입력들어온 갯수까지 반복출력!!!!
		for( int data2=1; data2<=g; data2++ ){System.out.print(h);}
	}
	
	
	
	public static void main(String[] args) {
		myint(1); //1출력
		myint(3);
		myadd(2,10);
		
		System.out.println("======");
		
		test1(10);
		test2(3.5);
		hap(3,5);
		disp(7,'*');
		
	}//
}//
