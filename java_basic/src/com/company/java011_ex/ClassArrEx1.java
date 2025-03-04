package com.company.java011_ex;

import com.company.java011.Apple;

public class ClassArrEx1 {
	  public static void main(String[] args) {
		  /* 
		   * ㅁ출력된 화면
				Apple [name=RED, order=iron, num=2, price=1000]
				Apple [name=GREEN, order=hulk, num=1, price=1500]
				Apple [name=GOLD, order=captain, num=3, price=2000]
		   */
		  	//int[]		arr		=	new int[3];  비교해서 참고~
	        Apple[] apples= new Apple[3];
	        
	        apples[0] = new Apple("RED", "iron",2,1000);
	        apples[1] = new Apple("GREEN", "hulk",1,1500);
	        apples[2] = new Apple("GOLD", "captain",3,2000);
	        
	        //위의 화면처럼 값 셋팅
	        //위의 화면처럼 출력
	        
	        for(int i=0; i<apples.length;i++ ){System.out.println(apples[i]);}
	        
	        //향상된 for( 해당자료형 one : 배열 ){}
	        for(Apple one: apples) { System.out.println(one); }
	        //와이거진짜신기하네
	        
//	        apples[0] = new Apple();
//	        apples[0].setName("Red"); 
//	        
//	        apples[1] = new Apple();
//	        apples[1].setName("Green");
//	        
//	        apples[2] = new Apple();
//	        apples[2].setName("Gold");
	        
	        
//	        System.out.println(Arrays.toString(apples[2]));
//	        System.out.println("갯수: " + apples.length);
	        
	        
	        
	  }
}
