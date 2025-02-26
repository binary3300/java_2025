package com.company.java007_ex;

import java.util.Arrays;

public class Array2Ex007 {
	public static void main(String[] args) {
		int [][] arr = new int[5][5];
		
		int data=1;
//		arr[0][0] = 1;  data; +=data;
//		arr[0][1] = 2;
//		arr[0][2] = 3;
//		arr[0][3] = 4;
//		arr[0][4] = 5;
		
		
//		1    2    3    4    5		00 01 02 03 04
//		6    7    8    9    10		10 11 12 13 14
//		11   12   13   14   15		20 21 22 23 24
//		16   17   18   19   20		30 31 32 33 34
//		21   22   23   24   25		40 41 42 43 44
		
		for(int ch=0; ch<arr.length; ch++) {
			for(int kan=0; kan<arr[ch].length; kan++) {
				arr[ch][kan]=data; data+=1;
				System.out.println(arr[ch][kan]);
				;}
			;}
		
		
		
		//하나도 안보고 다시도전!!!!
		//new로 선언하는거를 다시보면서 했다...그게 핵심인데...
		
		int [][] arr2 = new int[5][5];
		
		int data2 = 1; //한바퀴 돌고 리셋할필요 없음
		
		for(int ch=0; ch<arr2.length; ch++) {
			for(int kan=0; kan<arr2[ch].length; kan++) { 
				arr2[ch][kan]=data2; data2+=1;
				System.out.print( arr2[ch][kan] + "\t" );
				} System.out.println();
			}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}//
}//
