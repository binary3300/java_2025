package com.company.java014;

public class Repeat003_OOP {
	public static void main(String[] args) {
		Fruit [] fruits = {new Apple() , new Banana() , new Coconut()};
		
	}//
}//
/*	
Q9.  abstract 란?
 		추상화, 일반화, 공통의 기능 -> IS A 고양이는 동물이다.

Q10.   interface 란?
		실체화 관계 -> can do this! 약속할꼐~! 구현객체를 통해서 이 서비스를 약속~~!!

Q11.  abstract 과 interface 의 차이점은?
		공통점: 자식클래스를 통해서 설계부분을 구현한다.
		차이점: abstract- 일반클래스 + 설계도
			  interface- 		   설계도
			  멤버변수는 public static final 이 붙은 함수
			  멤버함수는 public abstract		abstract 메서드

Q12. 다음과 같이 출력되게 코드를 작성하시오.
--------------------------------
ㅁ 출력된화면
사과는 빨갛다.
바나나는 노랗다.
코코넛은 코코하다.

----------------------------------------------
     Fruit
↑	    ↑	    ↑
Apple  Banana  Coconut
----------------------------------------------
*/

abstract class Fruit {
	@Override public String toString() { return "Fruit ";}
	public abstract void myfruit();
}  
class Apple extends Fruit{ 
	@Override public void myfruit() { System.out.println("사과는 빨갛다."); }
}
class Banana extends Fruit{ 
	@Override public void myfruit() { System.out.println("바나나는 노랗다."); }
}
class Coconut extends Fruit{ 
	@Override public void myfruit() { System.out.println("코코넛은 코코하다."); }
}



 /*

Q13.  다음코드를 확인하고 오류나는 부분을 체크하시오
--------------------------------
interface  Animal{
	String NAME"홍길동";  //1    public static final 상수 - method area
	void eat();			 //2 	public abstract 	추상메서드{}
}
 
class Saram implements Animal{ 
	@Override public void eat() {  
		//NAME = "아이유"; 에러남!! 변하지 않는 상수!!!
		System.out.println(NAME +"이 밥을 먹어요.");
	}
}
public class Interface001_basic {
  public static void main(String[] args) {
	 Animal  ani =  new Animal();   
	 Animal  ani = null;
	 ani         = new Saram();  ani.eat();
  }
}
 * 
 */