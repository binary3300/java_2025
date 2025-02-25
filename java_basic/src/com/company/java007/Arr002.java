package com.company.java007;

import java.util.Arrays;

public class Arr002 {
	public static void main(String[]args) {
		//1. new 연산자 이용해 처리
		int[] arr = {1, 2, 3};
		//1번지{1,2,3} <- arr 1번지	갯수3 / index 0~2 
		
		int[] arr2 = new int[3]; //배열 생성만. new(공간 빌리기) int[3] 힙에서 int를 넣을 빈공간 3개
		//2번지{ , , } <- arr2: 2번지
		
		System.out.println(arr2); //[I@372f7a8d 주소값만 나옴
		System.out.println( Arrays.toString(arr2) );  //초기값을 알아내는 어쩌구로 알아낸 결과, new로 자리만 잡아둔 배열은 기본값이 0이다.
		
		arr2[0] = 10;
		arr2[1] = 20;
		arr2[2] = 30;	//for로 줄여보기
		
		/* 10에서 20에서 30으로
		 * 여기가 i라고치면
		 * i는 10에서 시작해서 arr.length까지 반복하고, 10씩 늘어난다.
		 * (i=10; i<arr.length; i+=10)
		 * 이제 for을 붙여서 for(i=10; i<arr.length; i+=10)
		 * */
		
		int data = 10;
		
//		arr2[0] = data; data+=10;
//		arr2[1] = data; data+=10;
//		arr2[] = data; data+=10;
		
		for(int i=0; i<arr2.length; i++) { arr2[i] = data; data+=10;}
		
		
		
		System.out.println( Arrays.toString(arr2) );

		
		
	}//
}//
