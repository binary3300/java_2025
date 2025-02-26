package com.company.java007_ex;

public class Arry2Ex008 {
	public static void main(String[] args) {
		int [][] arr = new int [4][4];
//		1   2   3   4
//		1   2   3   4
//		1   2   3   4
//		1   2   3   4
		
		int data = 1; //+= data; //한바퀴 끝날때마다 data 다시1로 선언
		
		for(int ch=0; ch<arr.length; ch++) {
			for(int kan=0; kan<arr[ch].length; kan++) {
				arr[ch][kan]=data; data+=1;
				System.out.print(arr[ch][kan] + "\t");
				}  data=1; System.out.println();
			}//
		
		
		System.out.println(); System.out.println();
		
		
		//이것도 안보고 다시 도전!
		
		int[][] arr2 = new int[4][4];
		
		int data2=1; //한바퀴 돌때마다 1로 리셋
		
		for(int ch=0; ch<arr2.length; ch++) { 
			for(int kan=0; kan<arr2[ch].length; kan++) { 
				arr2[ch][kan]=data2; data2+=1;
				System.out.print(arr2[ch][kan] + "\t");
				} data2=1; System.out.println();
			}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}//
}//
