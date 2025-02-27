package com.company.java007_ex;

import java.util.Arrays;

public class Arrey2E006_1 {
	public static void main(String[] args) {
		
//		/datas를 arr로 바꿈
		
//		int[][] arr = { { 10, 10, 10, 10 }, // 00 01 02 03
//						{ 	20, 20, 20, 20 }, // 10 11 12 13
//						{ 	30, 30, 30, 30 }, // 20 21 22 23
//						};
//		int[][] result = new int[arr.length + 1][arr[0].length + 1];  result라는 새로운 2차원배열 선언.
		
		int[][] arr= new int[3][4];
		int data = 10;
		
		for(int ch=0; ch<arr.length; ch++) { for(int kan=0; kan<arr[ch].length; kan++) { arr[ch][kan]=data; data+=1; } }

		
	}//
}//
