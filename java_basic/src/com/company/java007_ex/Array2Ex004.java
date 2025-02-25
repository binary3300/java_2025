package com.company.java007_ex;

import java.util.Arrays;

public class Array2Ex004 {
	public static void main(String[] args) {
		char [][] al = new char[2][3];
		//ver1
//		al[0][0] ='A'; // 00
//		al[0][1] ='B'; // 01
//		al[0][2] ='C'; // 02
//		
//		al[1][0] ='B'; // 10
//		al[1][1] ='C'; // 10
//		al[1][2] ='D'; // 10
		//ver2
//		char data = 'A';
//		al[0][0] =data++; // 00
//		al[0][1] =data++; // 01
//		al[0][2] =data++; // 02
//		
//		data = 'B';
//		
//		al[1][0] =data++; // 10
//		al[1][1] =data++; // 10
//		al[1][2] =data++; // 10
		
		//ver3
//		char data = 'A';
//		
//		for(int kan=0; kan<al[0].length; kan++) { al[0][kan]= data++ ;}
//		data = 'B';
//		
//		for(int kan=0; kan<al[1].length; kan++) { al[1][kan]= data++ ;}
//		data = 'B';

		//ver4
		char data = 'A';
		for (int ch = 0; ch < al.length; ch++) {  //#1 ch의 정보
			for (int kan = 0; kan < al[ch].length; kan++) { //#2 kan의 정보
				al[ch][kan] = data++;
			}
			//#3 안쪽에 있는 한 층 끝날 일
			data = 'B';
		}
		
		//for(int ch = 0; ch < al.length; ch++) {for (int kan = 0; kan < al[ch].length; kan++) {al[ch][kan] = data++;}data = 'B';}
		//위에 정답을 한줄로 줄인거.
	
		
		
		System.out.println(Arrays.deepToString(al));
//		System.out.print(al[0][1]); System.out.print(al[0][2]); System.out.print(al[1][0]);
	}//
}//
