package com.company.java002;

import java.util.Scanner;

public class DataType003 {
	public static void main(String[]args){
		//1 자료형-기본형/참조형
			//2 기본형 
				//논리형
				//정수형
					//(byte(1) - short(2) - int(4) - long(8))
				//실수형
					//(float - double)
		//GIGO 변수-입력-처리-출력
		//변수
		float f = 3.14f;
		double d = 3.14;
		Scanner scan = new Scanner(System.in);
		
		//입력
		System.out.print("실수를 입력하세요");
		d = scan.nextDouble();
		//처리
		
		//출력
		System.out.println("입력하신 값은?" + d);
		
		scan.close();
	}//end main
}//end class
