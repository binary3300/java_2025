package com.company.java014;

//1. 다중상속!
//	 interface = 설계하는걸 목적으로 만들어진 함수(함수맞나?) / 멤버변수 상수, 멤버함수 abstract
class Class1{}
class Class2{}
//class ClassExtends extends Class1, Class2{}  불가능함!! 단일상속!!

interface Inter21{ void method1(); }
interface Inter22{ void method2(); }
interface Inter23 extends Inter21, Inter22{  }  //interface는 다중상속 가능!!

//2. 많이 쓰는 형식
//어레이리스트
class Using1 extends Class1 implements Inter21, Inter22{
	@Override public void method2() {  }
	@Override public void method1() {  }
}


//class
public class Interface002 {
	public static void main(String[] args) {
		Using1 my = new Using1();
		//instanceof 클래스 확인, 상속 확인
		
		if(my instanceof Object) {System.out.println("1. Object");}
		if(my instanceof Class1) {System.out.println("2. Class1");}
		if(my instanceof Inter21) {System.out.println("3. Inter21");}
		if(my instanceof Inter22) {System.out.println("4. Inter22");}
		
	}//main
}//class
