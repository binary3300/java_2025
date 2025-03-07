package com.company.java014;

import java.util.Calendar;

interface Launch{int MONEY = 10000; void eat();}
class Burger implements Launch{
	int Price;
	public Burger() {this.Price=3900;}
	@Override public void eat() {System.out.println("Buger 냠냠!");}
	@Override public String toString() { return "Burger"; }
}//Burger

class Kimjji implements Launch{
	int Price;
	public Kimjji() {this.Price=4000;}
	@Override public void eat() {System.out.println("Kimjji 냠냠!");}
	@Override public String toString() { return "Kimjji"; }
}//Kimjji

class User{
	int MONEY; int cnt;
	Launch[]plate;
	private int money;
	public User() {
		this.money = Launch.MONEY;
		plate	   = new Launch[3];
		cnt		   = 0;
	}
	
	void order(Launch a) { // Launch a = new Burger();/Launch a = new Kimjji();
		//1. 주문한 메뉴의 값 확인
		int temp = 0;
			 if( a instanceof Burger ) {System.out.println("버거 하나요~"); temp = ((Burger)a).Price;}
		else if( a instanceof Kimjji ) {System.out.println("김찌 하나요~");temp = ((Kimjji)a).Price;}
		
		//2. 내가 가진 돈 확인
		if(money<temp) {System.out.println(">>잔액부족 주문불가능"); return;}
		money-=temp;
		
		//3. plate 에 주문받은거 넣기
		plate[cnt++] = a;	//System.out.println(money+"-"+ Arrays.toString(plate));
		
		//버거하나요~ 김찌하나요~ 버거하나요~ / 잔액부족주문불가능  요 3개 나와야함
		
	} //주문
	void show() {
		String order="주문: ";
		for(int i=0; i<cnt; i++) {order+= ((i!=0)? ",":"")+plate[i];}
		System.out.println("\n\n"+ order);
		System.out.println("주문금액 "+ (Launch.MONEY - money));
		System.out.println("잔액 "+money);
		
		Calendar today = Calendar.getInstance();
		System.out.println( today.get(1) 	+ "년 " + //년도
						  ( today.get(2)+1) + "월 " + //월 0~11기입 (0이 1월을 출력함)
							today.get(5)	+ "일"); //일
		//for(Launch a : plate) {a.eat();}//java.lang.NullPointerException:
		for(int i=0; i<cnt; i++) {plate[i].eat();}		
				//System.out.println( Arrays.toString(plate) );
		
	}	//출력
	//주문
	//주문금액
	//잔액
	//날짜
	//뭐먹었는지 냠냠()
}

/*	
									 <<interface>> 	상수: 		MONEY = 10000
				User  -▷			Launch		abstract: 	void eat();
			money						△				△
			plate						|				|
								  Burger				Kimjji
								Price=3900				Price=4000
								eat()					eat()		@Override
	


 */

//main class
public class InterfaceEx004 {
	public static void main(String[] args) {
		User launch_order = new User();
											//리턴값 메서드명(파라미터)
		launch_order.order(new Burger());	//void order(Launch a) {}
		launch_order.order(new Kimjji());	//Launch a = newKimjji()	부모=자식 형태
		launch_order.order(new Burger());	//Launch a =new Burger()	부모=자식 형태
		
		launch_order.show();
		
		
	}//main
}//class
