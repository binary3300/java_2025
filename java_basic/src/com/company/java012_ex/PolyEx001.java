package com.company.java012_ex;
//Q1. 상속도 그리기
//Q2. 각클래스에서 사용할수있는 멤버변수/멤버메서드


/* 
 * Object 
 * 	△
 * Papa {money = 10000/sing() S.E.S - 드림스 컴 트루}
 * 	△
 * Son {money = 1500/sing() 에스파 - 드림스 컴 트루}
 * */


class Papa extends Object{  
	   int money = 10000;     
	   public Papa() { super(); }
	   public void sing() {  System.out.println("S.E.S - 드림스 컴 트루");  }
	}// end Papa class

class Son extends Papa{ 
	   int money = 1500;
	   public Son() { super(); }
	   @Override public void sing() {  System.out.println("에스파 - 드림스 컴 트루"); }
	} // end Son class

public class PolyEx001 {
	public static void main(String[] args) {
		Papa mypapa = new Son();    
	      // Q3. Papa mypapa 의미? {money = 10000/sing()} 를 가져올수있음
	      // Q4. 인스턴스화한 실제 메모리 빌려온그림 
		  // 1번지 {money = 1500/sing() 에스파 - 드림스 컴 트루} - {money = 10000/------------}
			//							  [여기서부터 							여기까지 보장]
		  // mypapa = 1번지 {money = 1500/[sing() 에스파 - 드림스 컴 트루} - {money = 10000]/------------}
		
	      System.out.println(mypapa.money); // Q5.  출력   10000
	      mypapa.sing();  //Q6. 출력 
	       //Q7. mypapa.money 를 이용해서  1500 출력되게 해주세요.  
	      System.out.println( ((Son)mypapa).money );
	      
	      
	      
	      
	}//main
}//class