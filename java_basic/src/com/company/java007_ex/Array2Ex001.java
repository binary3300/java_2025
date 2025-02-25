package com.company.java007_ex;

public class Array2Ex001 {
public static void main(String[] args) {
	int[] [] arr2 = {{100, 200, 300},
					{400, 500, 600}
					};
	//arr2 [ch] [kan]
//	
//	System.out.println(arr2[0][0]); System.out.println(arr2[0][1]); System.out.println(arr2[0][2]);
//	System.out.println();
//	System.out.println(arr2[1][0]); System.out.println(arr2[1][1]); System.out.println(arr2[1][2]);
//	
//	for(int kan=0; kan<=2; kan++) {System.out.println(arr2[0][kan]);}
//	
	//2중으로 ch먼저
	for(int ch=0; ch<2; ch++) { for(int kan=0; kan<=2; kan++) {System.out.println(arr2[ch][kan]);} }
	
	System.out.println("층의 갯수: "+ arr2.length);   //2층
	System.out.println("칸의 갯수: "+ arr2[0].length);//3칸
	
	for( int ch=0; ch<arr2.length; ch++ ) {//몇층?
		for( int kan=0; kan<arr2.length; kan++ ) {//몇칸?
			System.out.println(arr2[ch][kan]);}//한 층이 끝나고나면 할 일.
		};
	
	
}//
}//
