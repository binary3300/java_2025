package com.company.java013;
//1 클래스는 부품객체
//2 상태와 행위
//can do this

interface Animal1{
	String COMPANY="(주) 동물농장"; // static final - method area, new 관련없음
	abstract void eat(); //abstract - {} 없어서 new 못함
}
class Saram implements Animal1{ 
	@Override public void eat() {/* COMPANY="해물탕회사";*/ System.out.println("먹든가..."); }
}//The final field Animal1.COMPANY cannot be assigned

class Pig implements Animal1{ 
	@Override public void eat() {/* COMPANY="해물탕회사";*/ System.out.println("진주줄까!!!!!"); }
}

//아래로 클래스
public class Interface001 {
	public static void main(String[] args) {
		//Animal1 ani = new Animal1(); 주석풀고 확인해보면 인스턴스화 못한다고 안내나옴. 인스턴스화 못함....설계가 목적이라서...
		System.out.println(Animal1.COMPANY);
		//하나의 자료형으로 여러개의 타입을 관리하려고 사용
		Animal1[] anis = {new Saram(), new Saram(), new Pig(),new Pig(),};
		for(Animal1 a: anis) { a. eat(); } //@Override - 자식 eat()
		
	}//main
}//class
