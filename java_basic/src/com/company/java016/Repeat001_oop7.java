package com.company.java016;
/*
Object
↑
Papa {int money = 10000;/sing()}
↑
Son2 {int money = 1500;/sing()}


 */


class Papa extends Object{  
	   int money = 10000;     
	   public Papa() { super(); }
	   public void sing() {  System.out.println("GOD-거짓말");  }
	}// end class

	class Son2 extends Papa{ 
	   int money = 1500;
	   public Son2() { super(); }
	   @Override public void sing() { super.sing(); System.out.println("빅뱅-거짓말"); }
	} // end class

public class Repeat001_oop7 {
	public static void main(String[] args) {
		   Papa mypapa = new Son2(); 
		   //Papa mypapa							{int money = 10000;/sing()}
		   //new Son2()- {int money = 1500;/sing()}-{int money = 10000;/------}
		   System.out.println(((Son2)mypapa).money);      
		   mypapa.sing();      //빅머시기 거짓말 출력됨
		    // 1500 출력되게 해주세요.
		  }

}
