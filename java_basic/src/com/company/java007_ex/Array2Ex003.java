package com.company.java007_ex;

import java.util.Arrays;

public class Array2Ex003 {
 public static void main(String[] args) {
	int [][] arr = new int[2][3];
	arr[0][0]=101;
	arr[0][1]=102;
	arr[0][2]=103;
	
	arr[1][0]=104;
	arr[1][1]=105;
	arr[1][2]=106;
	
	int data=101;
	for(int ch=0; ch<arr.length; ch++) {for(int kan = 0; kan<arr.length; kan++) {arr[ch][kan] = data++;}};
	
	System.out.println(Arrays.deepToString(arr));
	
}//
}//
