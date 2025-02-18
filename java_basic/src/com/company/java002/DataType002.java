package com.company.java002;

import java.util.Scanner;

public class DataType002 {
	public static void main(String[]args) {
		//자료형의 분류: 기본형(값), 참조형(주소)
		//기본형: 논리형, 정수형(byte-short-int-long), 실수형(float-double)
		 
		// OOP? 클래스(부품객체)를 조립해 완성 해 가는 프로그램. (같이 일하는 협력업체)
		int 	a=1;  	  //기본형
		Scanner scanner = new Scanner(System.in); // 참조형   컨트롤+쉬프트+알파벳O
		//1. new 공간 빌리기 heap 1000번지[] (협력업체랑 같이 손님 맞을겁니다.)
		//2. Scanner(System.in)  사용할 수 있게 초기화-키보드로 입력(이 다음에 손님이 입력하실겁니다. 입력할 수 있는 공간을 만들어주세요.)
		//    heap 1000번지[[키보드로 입력받는 기능]] <- scanner [1000번지]
		// OOP!!!!!!
		
		System.out.print("좋아하는 숫자를 입력>");
		a= scanner.nextInt(); // 자료형에 맞게 입력받고 처리. 콘솔창에서 내가 (맞는 자료형을)입력하기를 기다리고있음.
		System.out.println("좋아하는 숫자는 : " + a);
	}
}
