package com.company.java016;

//1. 클래스는 부품변수
//2. 상태(멤버변수)와 행위(멤버변수)

class A{
	int A; //인스턴스변수, heap area, new 가능, 실체화 this 각각
	static String company;//클래스변수, method area, new 불가능, 공용
//	void method() {int a;System.out.println(a);}//지역변수, stack, 임시...주의사항!!!초기화 해야함!! 여긴 지금 안해서 오류남!
	void method() {int a=0;System.out.println(a);}//지역변수, stack, 임시...주의사항!!!초기화 해야함!!
}
public class Repeat001_oop2 {
	public static void main(String[] args) {
		
	}
}
