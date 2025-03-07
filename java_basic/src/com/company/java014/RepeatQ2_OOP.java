package com.company.java014;

class Papa{
	int money=10;
	public Papa() {}
	public Papa(int money) {this.money=money;}
	public String toString() {return "Papa[money=" + money + "]";}
}//class papa

class Son extends Papa{
	int money = 150;
	int car=2;
	public Son() {super();}
	public Son(int money) { this.money = money;  }
	public Son(int money, int car) {this.money = money; this.car = car; }
	public String toString() { return "Son [money=" + money + ", car=" + car + "]"; }
}//class son

/* Q2) Papa와Son의 상속도
 * 
 * Papa
 *  △
 * Son
 */

//main class
public class RepeatQ2_OOP {
	public static void main(String[] args) {
		//---------------------------step1
		Papa p1 = new Papa();
		System.out.println(p1);
		//Q3) 출력되는화면을 적으시오. 만일 오류가 난다면 그 이유는?
		//  Papa[money=10]
		
		//---------------------------step2
		Son s2 = new Son();
		System.out.println(s2);
		//Q4) 출력되는화면을 적으시오. 만일 오류가 난다면 그 이유는?
		//Son [money=150, car=2]
		
		//---------------------------step3
		Son s3 = new Papa();
		System.out.println(s3);
		//Q5) 출력되는화면을 적으시오. 만일 오류가 난다면 그 이유는?
		//오류남...Son s3 = (Son) new Papa();로 캐스팅 했는데도 오류남...왜지...?
		//똑같이 따라쓰면서 투스트링 컨스트럭터필드 컨스트럭터슈퍼클래스를 만들었는데 문제화면이랑 똑같이 만들기위해
		//@Overrid를 지웠는데 그거때문인가
		
		//---------------------------step4
		Papa p4 = new Son();
		System.out.println(p4);
		//Q6-1) 출력되는화면을 적으시오. 만일 오류가 난다면 그 이유는?
		//  Son [money=150, car=2]
		System.out.println(p4.money);
		//Q6-2) 출력되는화면을 적으시오.
		//  10
		
		//---------------------------step5
		Papa p5 = new Son();
		Son s4 = (Son)p5;
		System.out.println(s5);
		//Q7-1) 출력되는화면을 적으시오. 만일 오류가 난다면 그 이유는?
		//
		System.out.println(s5.money);
		//Q7-1) 출력되는화면을 적으시오. 만일 오류가 난다면 그 이유는?
		//
		
		
		//Q8) 오버로딩과 오버라이딩의 차이점을 적으시오
		/* 오버로딩은 메서드를 쓸 때 사용하는 용어다.
		 * 같은 메서드를 사용하는데 다른 파라미터 값을 주고싶을때 오버로딩한다고 말하는거고
		 * 
		 * 오버라이딩은 클래스 상속에서 사용하는 용어다
		 * 부모클래스에서 자식클래스로 자료를 물려받고, 자식클래스에서 다른 값을 주고싶을때 이 값을 수정하는것을
		 * 오버라이딩이라고 말한다.
		 * 
		 * 아닐시 머쓱
		 *
		 */
				
		
		
	}//main
}//class
