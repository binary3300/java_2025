package com.company.java015_ex;

import java.util.HashSet;
import java.util.Set;

//main class 
public class SetEx003 {
	public static void main(String[] args) {
		/* 연습문제3)  Collection  Framework
			패키지명 : com.company.java015_ex
			클래스명 : SetEx003
			- 중복되는 숫자없이  랜덤으로 숫자6개를 받는 로또를 만들려고 한다.
			1. 알맞은 콜렉션프레임워크는?
				>동적배열
					-List	기차: index(O), 중복허용!, add/get/size/remove/contains
					-Set	주머니: index(X), 중복비허용!, add/get(X) 향상된 for문, Iterator/size/remove/contains
					-Map (오늘은안배움)
			2. 프로그램을 작성하시오.*/
		
		Set<Integer> lotto = new HashSet<>(); //1~45
		System.out.println();
		
		System.out.println("1. 랜덤:  ~0.99999		>" + Math.random()); //(int)(Math.random() * 원하는갯수) +1
		System.out.println("2. *45:  ~0.99999*45		>" + Math.random()*45); 
		System.out.println("3. 소수점 떼버리기 			>" + (int)(Math.random()*45)); 
		System.out.println("4. +1 				>" + ((int)(Math.random()*45)+1)); 
		
		
		while(lotto.size()<6) { //6개보다 작다면 계속 로또 추가
		lotto.add((int)(Math.random()*45)+1 );
		//int)(Math.random()*원하는 갯수)+1
		}
		System.out.println(lotto);
		
		
		
		
	}//main
	/*
	 * 
	 */
	
	
	
}//class
