package com.company.java011;
/*  1. 인스턴스변수, 클래스변수, 지역변수 를 구분하시오.
	2. 인스턴스메서드, 클래스메서드 구분하시오.
	3. 오류나는 이유는?
 * */

//클래스는 부품객체
//상태와 행위
class Sawon3 {
	//상태(멤버변수) -  클래스변수/인스턴스변수/지역변수
	int pay      =10000;    //인스턴스변수- heap new0 this, 생성자
	 static int su=10;     //클래스변수- method newX 공유
	  //static int basicpay=pay; //에러나는이유: 클래스변수= 인스턴스변수 형태로 써놓음! (클래스변수, 클래스메서드- this, 인스턴스 사용불가!!)
	 static int basicpay2;    
	 
	 //행위(멤버함수) 클래스함수/인스턴스함수
	 public static void showSu() {   System.out.println(su);  }     // 클래스함수- method- newX - 공유     
	 //public static void showPay() {   System.out.println(this.pay);  }   //에러남!! syso는 클래스변수인데 this를 못쓰는 변수임!!!
 
	 public  void  showAll001() {   //인스턴스변수= heap- newO- this, 생성자
		 System.out.println(su);  
		 System.out.println(this.pay);  
	 } 
//	 public static  void  showAll002() {   //클래스함수- method영역임- new로 쓰지못함- 공유
//		  showAll001();    //인스턴스 사용불가- heap- newO- this 생성자
//		 System.out.println(this.pay);
//	 } 
}
public class StaticEx003{
	  public static void main(String[] args) {//지역변수 args
		Sawon3   sola = new Sawon3();  //지역변수 sola
		sola.showAll001();
	  }
	}
