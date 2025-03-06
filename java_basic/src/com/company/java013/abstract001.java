package com.company.java013;
/* ~는 ~이다
 * Is A
 * 고양이는 동물이다
 * 	  개는 동물이다.
 * Animal
 * △	△
 * Cat	Dog
 * 
 */
abstract class Animal{ //일반클래스 + 설계 라는 특징이 있다...
	String name; int age;
	abstract void eat(); //추상메서드가 있으면 반드시 추상클래스로 만들어줘야함.., 지금 이 클래스에 abstract도 내가 붙인거 아님,,,오류해결하려면 알아서붙음....
	abstract void sleep(); //추상메서드{} 구현부가 없음- 공통의 속성, 구체적인 내용이 없음...
	abstract void poo(); //추상화, 일반화, 설계: 공통적인 속성, 행동
}

//고양이는 동물이다. / abstract 구현
class Cat extends Animal{
	@Override void eat() {System.out.println(super.name + "고양이 밥주까~~");}
	@Override void sleep() {System.out.println(super.name + "고양이 잠잘까~~");}
	@Override void poo() {System.out.println(super.name + "고양이 똥치워줄까~~");}
	}

class Dog extends Animal{
	@Override void eat() {System.out.println(super.name + "게 밥주까~~");}
	@Override void sleep() {System.out.println(super.name + "강아지 잠잘까~~");}
	@Override void poo() {System.out.println(super.name + "괘 똥싸러갈까~~");}
	}

//아래로 메인
public class abstract001 {
	public static void main(String[] args) {
		//1. abstract class: 일반클래스 + 설계
		//Animal ani = new Animal(); new 메모리 빌리고, 객체생성/Animal()초기화/ {}구현없음
		Animal ani=null;
		ani = new Cat(); //부모=자식, 업캐스팅, 타입캐스팅 필요없음.
		ani.name="폰루루"; ani.eat();
		
		ani = new Dog();
		ani.name="루루"; ani.eat();
		
		//사용목적
		Animal[] arr = {new Cat(), new Cat(), new Dog(), new Dog()};
		int cnt=0;
		for(Animal a:arr) {a.name="ani"+ ++cnt; a.eat();}
		
		
		
	}//main
}//class
