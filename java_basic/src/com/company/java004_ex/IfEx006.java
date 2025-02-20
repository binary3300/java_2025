package com.company.java004_ex;

import java.util.Scanner;

public class IfEx006 {
	//숫자를 입력받기
	//홀수면 남자
	//짝수면 여자 출력
	//num%2 == 0
	public static void main(String[]args) {
		//변수 정해서 스캔으로 입력받기
		int a;
		System.out.println("숫자를 입력하세요");
		Scanner scan = new Scanner (System.in);
		a = scan.nextInt();
		//이프 홀수 {남자 출력
		if (a %2 == 0) {System.out.println("여자입니다.");}
		//엘스 {여자 출력
		else {System.out.println("남자입니다.");}		
		
		scan.close();
		
		/*쌤버전
		 * 변수란에 String result = "여자입니다";
		 * if (a %2 == 1) {System.out.println("남자입니다.");}
		 * System.out.println(result);
		 * */
		
		
	}
}
