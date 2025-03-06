package com.company.java013;

public class Repeat001_OOP {
	class A11{
		int a; //1) 인스턴스변수!!! heap area - new O - this 각각
		A11(){}
		A11(int a){this.a=a;} //2) 지역변수 - stack area
		//3) void show() 2)인스턴스메서드(static이 없으니까)
		void show() {this.a=11; System.out.println(this.a);}
		//4) static void classMethod()
		static void classMethod() {this.a=12;}//4)클래스메서드 method area new X 공유영역 
		//static이 tvm로딩시 제일먼저 메모리상에 올라감. 순서가 안맞음
		//5) int show2()
		int show2() {int a; return a;} //인스턴스메서드 heap area / new O this각각, 지역변수 int a때문에 오류남.
		//int show2() {int a; return a;} 는 show2메서드 안에 있는 int a는 지역변수
		//int a는 stack- 임시공간이다. 임시공간은 알아서 변수초기화가 안됨. 내손으로 해야함. 주의ㅣ......
	}
	
	//아래로 메인
	public static void main(String[] args) {
		A11 a1 = new A11(); //(b) 지역변수!! stack영역 
	}//class
}	
/* Q1) 클래스변수, 인스턴스변수, 지역변수 / 클래스메서드, 인스턴스 메서드?
 * 		
 * Q3) 메모리 빌려오고 객체 생성하는역할: new
 * 	   String은 null, int는 0으로 초기화하는역할: 내 답: String[] args  정답: A11()
 * 	   new A11()한 주소를 갖고있는것은: a1
 * 
 * Q4) 기본생성자를 반드시 선언해야하는 경우: 생성자 오버로딩, 상속
 * 
 * Q5) 오버로딩성립조건이 아닌것을 모두 고르시오..
 * 비슷한 기능의 메서드들의 이름을 같게 만들고, 자료형과 갯수로 구분,,,,,, 그것이 메서드 오버로딩,,,,
 * a 메서드의 이름이 같아야한다...
 * b 매개변수의 개수나 타입이 달라야한다... 맞는말이다ㅏ...
 * 
 * c 리턴타입이 달라야한다...
 * d 매개변수의 이름이 달라야한다.... 꼭 그렇지는 않다...
 * 
 * 
 * */
