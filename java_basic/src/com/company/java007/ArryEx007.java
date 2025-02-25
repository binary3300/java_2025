package com.company.java007;

public class ArryEx007 {
	public static void main(String[] args) {
		/* new 이용해서 배열만들기
		 * 배열명 arr
		 * 값넣기 A B C D E
		 * 포랭스이용해보기
		 * 출력 포랭스로
		 * */
		
		char arr[] = new char[5];
		arr[0] = 'A';
		arr[1] = 'B';
		arr[2] = 'C';
		arr[3] = 'D';
		arr[4] = 'E';
		
		for(int i = 0; i < arr.length; i++) {System.out.println(arr[i]);} //버전1
		
		//
		
		char data = 'A';
		
//		arr[0] = data; data += 1;
//		arr[1] = data; data += 1;
//		arr[2] = data; data += 1;
//		arr[3] = data; data += 1;
//		arr[4] = data; data += 1; 참고하지마세요
		
//		arr[0] = data++; //++로 됨
//		arr[1] = data++; 
//		arr[2] = data++; 
//		arr[3] = data++; 
//		arr[4] = data++; 
		
		
		for(int i =0; i< arr.length; i++) {arr[i] = data; data+=1; }
		
		
		for(int i =0; i< arr.length; i++) {System.out.println( arr[i] );}
		
		
		
		
		
		
	}//
}//
