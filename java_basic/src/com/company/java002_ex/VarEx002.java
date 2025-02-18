package com.company.java002_ex;

public class VarEx002 {
	public static void main(String[]arg) {
		/*int a=0
		 * a=10
		 * int b=0
		 * b=3
		 * 이렇게도 됨
		 * */
		int a = 10;
		int b = 3;
		 
		System.out.println(a +"+"+ b +"="+(a+b));
		System.out.println(a + "-"+ b + "=" +(a-b));
		System.out.println(a + "*"+ b + "=" +(a*b));
		System.out.println(a + "/" + b + "="+(a/b));
		System.out.printf("%d / %d = %f",a,b,((float)a/b)); //형태변환
		System.out.printf("\n %d + %d = %d",a,b,a+b);
		System.out.printf("\n %d - %d = %d",a,b,a-b);
		System.out.printf("\n %d * %d = %d",a,b,a*b);
		System.out.printf("\n %d / %d = %d",a,b,a/b);
	}
	
}
//10+3=13
//10-3=7
//10*3=30
//10/3=3