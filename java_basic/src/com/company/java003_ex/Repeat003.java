package com.company.java003_ex;

import java.util.Scanner;

public class Repeat003 {
	public static void main(String[]args) {
		float kor = 0; float eng = 0; float math = 0;
		float summit = 0; float arry = 0;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("국어 점수를 입력하시오 >");
		kor = scan.nextFloat();
		System.out.print("영어 점수를 입력하시오 >");
		eng = scan.nextFloat();
		System.out.print("수학 점수를 입력하시오 >");
		math = scan.nextFloat();
		
		summit = kor + eng + math;
		arry = (kor + eng + math)/3;
		
		System.out.println("총점: " + summit);
		System.out.println("평균: " + arry);

		scan.close();
	}
}
