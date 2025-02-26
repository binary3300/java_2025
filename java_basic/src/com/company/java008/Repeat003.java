package com.company.java008;

import java.util.Arrays;

public class Repeat003 {
	public static void main(String[] args) {
		int[] arr2 = new int[3];
		int data=10;
		
		arr2[0]= 10;
		arr2[1]= 20;
		arr2[2]= 30;
		
		for(int i=0; i<arr2.length; i++){arr2[i]= data; data+=10;}
		
		System.out.println( Arrays.toString(arr2) );

		
	}//
}//
