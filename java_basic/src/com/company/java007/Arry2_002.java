package com.company.java007;

import java.util.Arrays;

public class Arry2_002 {
	public static void main(String[] args) {
	
		int [][]arr= new int[2][3];
		
		//ver1
		arr[0][0]=1;
		arr[0][1]=2;
		arr[0][2]=3;
	
		
		arr[1][0]=4;
		arr[1][1]=5;
		arr[1][2]=6;
		
		//ver2
//		int data=1;
//		arr[0][0]=data++; arr[0][1]=data++; arr[0][2]=data++; 
//		arr[1][0]=data++; arr[1][1]=data++; arr[1][2]=data++;
	
		int data=1;
		for( int ch=0; ch<arr.length; ch++ ) { for(int kan=0; kan<arr[ch].length; kan++) { arr[ch][kan]= data++; } }
		
		
		
		
		
		System.out.println(Arrays.deepToString(arr));
		
		
		
	}//
}//
