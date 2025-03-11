package com.company.java016;

class Sawon005{  
		//1) 인스턴스변수, heap, new 가능, 실체화, this 각각
	   int pay      =10000;
	    //2) 클래스변수, method, new 불가능, 공유
	   static int su=10;   
	    //3) 클래스변수(main 위에있는 class에서 static으로 시작하는거) - 인스턴스 사용불가
	   static int basicpay=pay;  
	    
	   	//4) 클래스변수, method, new 불가능, 공유
	   static int basicpay2;
	   static {  basicpay2=20000; }
	 
	   //5) 클래스메서드, Sawon005.showSu(); 이렇게 쓰는거임. ethod, new 불가능, 공유
	   public static void showSu() {   System.out.println(su);  }         

	   //6) 인스턴스변수, heap, new 가능, 실체화, this
	   public  void  showAll001() {   
	       System.out.println(su);
	       System.out.println(this.pay);
	   }
	   
	   //7) 클래스변수(main 위에있는 class에서 static으로 시작하는거) - 인스턴스 사용불가
	   public static  void  showAll002() {
	       showAll001();     
	       System.out.println(this.pay); 
	   } 
	} 

public class Repeat001_oop3 {
	public static void main(String[] args) {
		Sawon005  sola = new Sawon005();  
		sola.showAll001();
		
		
/*package java027_part002_정리문제;
class Sawon005{  
   int pay      =10000;      
   static int su=10;   
   static int basicpay=pay;  
    
   static int basicpay2;
   static {  basicpay2=20000; }
 
   public static void showSu() {   System.out.println(su);  }         

   public  void  showAll001() {   
       System.out.println(su);
       System.out.println(this.pay);
   }

   public static  void  showAll002() {
       showAll001();     
       System.out.println(this.pay); 
   } 
} 
public class Repeat003_ {
  public static void main(String[] args) {
   Sawon005  sola = new Sawon005();  
   sola.showAll001();
  }
}

/* 이론
8.  static
   1. jvm이    method area  에 1번만 메모리를 올림
   2. 클래스명.변수명, 클래스명.메서드명
   3. 예시)
    가. 클래스변수        나. method area  다. new X  공용   라. A.company
     class A{ static String company; }
*/




		
		
	}
}
