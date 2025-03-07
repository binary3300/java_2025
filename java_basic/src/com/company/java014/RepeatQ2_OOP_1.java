package com.company.java014;

import java.util.ArrayList;

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
 * 1. 클래스는 부품객체
 * 2. 멤버변수/멤버함수
 * 
 * Object									Object(){#3		}#4
 *  △
 * Papa		money=10			/toString	Papa(){#2		}#5
 *  △
 * Son		money = 150,car=2	/toString	Son(){#1		}#6	@Override
 */

//main class
public class RepeatQ2_OOP_1 {
	public static void main(String[] args) {
		//---------------------------step1
		Papa p1 = new Papa(); //[money=10/toString]=1번지 Papa(){money=10/toString}
		System.out.println(p1);
		//Q3) 출력되는화면을 적으시오. 만일 오류가 난다면 그 이유는?
		//  Papa[money=10] 오류가 날 이유가 없다. papa로 papa의 값을 불렀기때문
		
		//---------------------------step2
		Son s2 = new Son(); //Son s2[money = 150,car=2/toString]-[money=10/toString]
		System.out.println(s2);
		//Q4) 출력되는화면을 적으시오. 만일 오류가 난다면 그 이유는?
		//Son [money=150, car=2]
		
		//---------------------------step3
		//원래문제 Son s3 = new Papa();
		Son s3 = new Son();
		System.out.println(s3);
		//Q5) 출력되는화면을 적으시오. 만일 오류가 난다면 그 이유는?
		//오류남...Son s3 = (Son) new Papa();로 캐스팅 했는데도 오류남...왜지...?
		//똑같이 따라쓰면서 투스트링 컨스트럭터필드 컨스트럭터슈퍼클래스를 만들었는데 문제화면이랑 똑같이 만들기위해
		//@Overrid를 지웠는데 그거때문인가
		
		//Son s3[money = 150,car=2/toString]-[money=10/toString]
		//		Son은 이미 이거를 부를수있지만
		//Son s3 = new Son();으로하면 상속받아올수있는데 Son s3 = new Papa();는 Papa에서 메모리청소를 안해서 불러올수없다구함!! 
		//	Papa(){money=10/toString}
		
		
		
		//---------------------------step4
		Papa p4 = new Son();
		System.out.println(p4);
		//Q6-1) 출력되는화면을 적으시오. 만일 오류가 난다면 그 이유는?
		//  Son [money=150, car=2]
		System.out.println(p4.money);
		//Q6-2) 출력되는화면을 적으시오.
		//  10
		
		//---------------------------step5
//		Papa p5 = new Son(); //1. 부모=자식 / 업캐스팅 / 타입캐스팅 필요없음
//		Son s4 = (Son)p5;	//2. 자식=부모 / 다운캐스팅 / 타입캐스팅 필요함! 부모는 자식생성자를 호출한 적이 있어야함!!!!
//		System.out.println(s5.money);
//		//Q7-1) 출력되는화면을 적으시오. 만일 오류가 난다면 그 이유는?
//		//Son				s5[money=150, car=2/ toString]-[money=10/ toString]
//		//		p5= 5번지 Son(){money=150, car=2/ toString}-Papa(){money=10/---------}
//		System.out.println(s5.money);
//		System.out.println(((Papa)s5).money);
//		System.out.println(((Papa)s5).toString);
//		
//		ArrayList<String> List = new ArrayList<>();
//		
//		
//		System.out.println(s5.money);
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
		 *
		 *
		 *
		 *오버로딩: 메서드의 이름을 같게, 알규먼트(파라미터/인수)자료형과 갯수를 다르게 해 구분한다.
		 *비슷한 기능의 메서드를 같게 만든다
		 *
		 *오버라이딩: 상속시 부모의 메서드를 자식에게 맞게 수정해서 사용.
		 *
		 */
				
		
		
	}//main
}//class
