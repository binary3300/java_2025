package com.company.java011;
//final 변경하지마~!
//부품객체(멤버변수 + 멤버함수)
// 상속x		상수		Override x

//final class 상속받지마! 개너무함 그 뜻이 아닌거 알지만 암튼 너무함 
class FinalEx extends Object{//생략됐지만 늘 쓰고있었음.		1. object- 자바팀이 객체틀 만들어놓음!!!	2. extends 상속(앞에 객체 그대로 사용)
	//static String tree="4-5";//식목일- 나무 심는날 기념일
	final static String tree="4-5";
	String name;
	final void show() {System.out.println(FinalEx.tree + "/" + name);}
}

class MyDate extends FinalEx{
	//@Override void show() {super.show() ;}//오버라이드: 자식클래스에서 매서드 재수정. 파이널은 이것도 못하게한다는의미!
}

public class Final001 {
	public static void main(String[] args) {
		//FinalEx.tree="4-6"; //static은 공용으로 쓴다는 선언이라서 안바뀜...근데 이렇게 아래에서 변경할수있음! 
							//그래서 변경할수없게 6번줄에 final static로 선언했고, 그로인해 11번에 오류가 났음. 
		System.out.println("식목일- 나무심는날, 기념일(공유, 변경 안되는 값)"+ FinalEx.tree);
		
	}

}
