package com.company.java009;

import java.util.Arrays;

public class Method4_1 {
	
	public static void show(int a) {System.out.println(a*10);}//예시메서드1. 입력에서 *10의 값을 보여줌
	public static void show(int a , int b, int c)
						{ System.out.println(a*100 + "\t" + b*100 + "\t" + c*100 + "\t");
						}//예시메서드2 입력한 배열에서 *100의 값을 보여줌

	//조졌네 이거
	//아니다 쌤 답지받음 할수이씀
	
	public static void main(String[] args) {
		int[] a= {1,2,3};
		
		show(1); // 값 - value → call by value
		show( a[0] );
		
		show(1, 2, 3); // 값 - value → call by value
		show(a[0], a[1], a[2]);
		System.out.println( "main1. 배열값: " + Arrays.toString(a) );
		System.out.println( "main2. 배열의 주소값: " + System.identityHashCode(a) );
		
		//public static void show(int [] a){}
		show(a); // 주소 - reference  → call by reference
		System.out.println("main4. 배열값 : "      +  Arrays.toString(a));
		
		
	}
	public static void show(int a[]) {
		System.out.println("show3. 배열의 주소값: "+ System.identityHashCode(a));
		a[0]+=10; a[1]+=10; a[2]+=10;
		}
}
