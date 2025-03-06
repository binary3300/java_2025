package com.company.java013;

/* Q6. 컴파일에러
 * 1. 클래스는 부품객체(상태- 멤버변수와 행위-멤버함수)
 * 					클래스변수, 인스턴스변수, 지역변수/클래스메서드, 인스턴스메서드
 * 			
 * 			변수초기화단계
 * 						기본값			명시적초기화		초기화블록			생성자
 * classValue			1)0					2)20		3)20			4)X
 * instanceValue		5)0					6)10		3)10			4)10
 */

class MemberCall001{
	int instanceValue = 10; //인스턴스 변수
	static int classValue = 20; //클래스 변수
	
	int instanceValue2 = classValue; //인스턴스변수
	
	//static int instanceValue2 = instanceValue; //1  에러남. static은 instance사용불가
	//static jvm 로딩시 메모리 할당받음, instansce는 new를 사용해 메모리 할당받고 객체생성후 사용
	
//	static void staticMethod1() {
//		System.out.println(classValue);
//		System.out.println(instanceValue); //2 에러남. static은 instance사용불가
//	}
	
	
	void instanceMethod1() {
		System.out.println(classValue);
		System.out.println(instanceValue); //3
	}
	
//	static void staticMethod2() {
//		System.out.println(classValue);
//		instanceMethod1() //4 static은 instance사용불가
//	}//tatic jvm 로딩시 메모리 할당받음(바로사용), instansce는 new를 사용해 메모리 할당받고 객체생성후 사용
	
//	void staticMethod2() {
//		staticMethod1() //5
//	}

//Q7. private(클래스내부) < package(default: 폴더내부) < protected(extends: 상속) < public

//아래로 class
	public class Repeat002_OOP {
		public static void main(String[] args) {
			
		}
	}//main
}//class
