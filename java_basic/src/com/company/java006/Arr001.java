package com.company.java006;

public class Arr001 {
	public static void main(String[]args) {
		int[] arr = null; //int자료형[] 연달아서 입력받을게요~~~~
						  //null공간은 있지만 값을 넣지 않음!
		int[] arr2 = {1,2,3};
						  // heap(동적메모리)    stack(임시공간)
						  //1번지 {1,2,3};   <- arr2+1번지
		
		System.out.println(arr);
		System.out.println(arr2); //주소삽ㄱ이 컴푸터마다 다름
		
		System.out.println(arr);
		
		//
		
		System.out.println("1 꺼내기:" + arr2[0]);
		System.out.println("2 꺼내기:" + arr2[0]);
		System.out.println("3 꺼내기:" + arr2[0]);
		
		//배열명: arr3=( 1, 2, 3, 4, 5); 0~4
		int[] arr3= {1, 2, 3, 4, 5};
		System.out.println(arr3[0]);
		
		int[] arr4= {100, 200, 300};
		System.out.println(arr4[2]);
		
		double[] arr5= {1.1, 1.2, 1.3};
		System.out.println(arr5[1]);
		
		//arr5 a b c
		
		char[] arr6 = {'a','b','c'};
		
		System.out.println("배열의 갯수-" + arr6.length);
		System.out.println(arr6[0]);
		System.out.println(arr6[1]);
		System.out.println(arr6[2]);
		
		for(int i=0; i <= 3; i++) {System.out.println( arr6[i]);}
		System.out.println();
		
		for(int i=0; i <=arr6.length; i++) {System.out.println( arr6[i]);} //위랑 같다!
		
		
	}//
}//
