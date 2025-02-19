package com.company.java003_ex;

import java.util.Scanner;

public class CastingEx002 {
	public static void main(String[]args) {
		//변수
		int kor, eng, math, lev;
		float summit, arry;
		//입력
		Scanner scan = new Scanner(System.in);
		System.out.print("국어점수 입력> "); kor = scan.nextInt();
		System.out.print("영어점수 입력> "); eng = scan.nextInt();
		System.out.print("수학점수 입력> "); math = scan.nextInt();
		//처리
		summit = kor + eng + math;
		arry = summit/3;
		lev = (int)arry/10;
		//출력
		System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n"
				+":::GOOD IT SCORE:::\r\n"
				+":::::::::::::::::::::::::::::::::::::::::::::::::::::::::"
				+"국어\t영어\t수학\t총점\t평균\t\t레벨");
		System.out.println(kor+"\t"+eng+"\t"+math+"\t"+summit+"\t"+(float)arry+"\t"+lev);
	}
}
