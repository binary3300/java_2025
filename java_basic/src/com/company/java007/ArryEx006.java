package com.company.java007;

import java.util.Arrays;

public class ArryEx006 {
	public static void main(String[] args) {
		double[] arr = new double[5];
		
//		기본형
//		arr[0] = 1.1;
//		arr[1] = 1.2;
//		arr[2] = 1.3;
//		arr[3] = 1.4;
//		arr[4] = 1.5;
//		
//		for( int i = 0; i < arr.length; i++ ) {System.out.println( arr[i] );}
		
		
		//다음버전
		double data = 1.1;
		
//		arr[0] = data; data+= 0.1;
//		arr[1] = data; data+= 0.1;
//		arr[2] = data; data+= 0.1;
//		arr[3] = data; data+= 0.1;
//		arr[4] = data; data+= 0.1;
		
		for( int i = 0; i < arr.length; i++ ) { arr[i] = data; data+=0.1; }
		
		//포문 랭스 이용해서
		for( int i = 0; i < arr.length; i++ ) { System.out.println( String.format("%.1f", arr[i])); }
		
	}//
}//
