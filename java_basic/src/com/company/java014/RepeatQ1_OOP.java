package com.company.java014;

/* 1. 클래스는 부품객체
 * 2. 상태(멤버변수)와 행위(멤버함수)
 * 		Object 															 	 Object(){#3	}#4 객체 틀
 * 		  △
 * 		  |
 * 		Parant	x = 100  					33번줄에서[x = 100/method] 		 Parant(){#2	}#5 x = 100/------
 * 				method(Parant method)
 * 		  △
 * 		  |
 * 		Child	x = 200
 * 				method(Child method)									1번지 Child() {#1	}#6 x = 200/method 이때 자식의 정보값으로 오버라이드 됨!
 */		//																										내가 따로 오버라이드안해도 extends하면
//																												자바가 알아서 오버라이딩 함

class Parant{
	int x = 100; //명시적 초기화 라고 한다
	void method() {
		System.out.println("Parant method");
	}
}//class parant

class Child extends Parant{
	int x = 200;
	void method() {
		System.out.println("Child method");
	}
}//class child

//class
public class RepeatQ1_OOP {
	public static void main(String[] args) {
		Parant p = new Child(); //1. 메모리 빌려오고 객체를 생성함!! 
		Child c = new Child();
		System.out.println("p.x="+p.x);
		p.method();//#1 자식생성자 호출시 #2부모생성자 호출(부모 인스턴스 청소 x=100) #3같은 메서드가 있다면 자식메서드로 오버라이딩. 결과적으로 자식메서드를 호출한게 됨
		System.out.println("c.x="+c.x);
		c.method();
		
		
		//내 예상 답: p.x= 100.200 .이 뭐야?  c.x=200?
		//실제 결과: p.x=100
		//		Child method
		//		c.x=200
		//		Child method

	}//main
}//class
