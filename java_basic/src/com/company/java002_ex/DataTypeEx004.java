package com.company.java002_ex;

import java.util.Scanner;

public class DataTypeEx004 {
	public static void main(String[]args) {
		float kscore = 0;
		float escore = 0;
		float mscore = 0;
		//쌤 방식 int kscore, escore, mscore, total; double avg;
		 
		Scanner kscan = new Scanner (System.in);
		System.out.print("국어 점수를 입력하시오.\n");kscore = kscan.nextFloat();
		System.out.print("영어 점수를 입력하시오.\n");escore = kscan.nextFloat();
		System.out.print("수학 점수를 입력하시오.\n");mscore = kscan.nextFloat();
		
		//System.out.print(kscore);
		//System.out.print(escore);
		//System.out.print(mscore);
		
		//쌤 방식
		//total = kscore + escore + macore;
		//avg = total/3.0;
		
		System.out.print("총점: " + (kscore + escore + mscore));
		System.out.print("평균: " + ((kscore + escore + mscore) /3));
		
		//쌤방식
		//System.out.printf("총점: %d \n평균: %.2f",total,avg);
		
		kscan.close();
	}
}
