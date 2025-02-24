package com.company.java005_ex;

import java.util.Scanner;

public class ForEx006 {
	public static void main(String[]args) {
		/* 1) 각 연산자에 맞게 계산처리
		 * 2) 숫자1, 숫자2는 0~100사이만 입력가능, 아니면 무한반복
		 * 3) 연산사는 더하기 뺴기 곱하기 나누기만 입력가능, 아니면 무한반복
		 * 
		 * 1. 정수를 하나 입력하시오>> 10
		 * 2. 정수를 하나 입력하시오>> 3
		 * 3. 연산자를 하나 입력하시오(+ * - /)>> +
		 * 10 + 3 = 131
		 * */
		
		//변수
		int num1, num2; //선생님버전  double result= ' '; 나는그냥 뚝심있게 나머지값을 버려. 언젠간 익숙해지겠지ForEx002.javaForEx002.java
		char yeon = ' ';
		
		//입력
		Scanner scan = new Scanner(System.in);
		
		for(;;) {
			System.out.println("정수를 하나 입력해주세요."); num1 = scan.nextInt();
				if( num1 <= 100 && num1 >= 0 ){ break;}
				else {System.out.print("0에서 100 사이의 ");}
		}
		
		for(;;) {
			System.out.println("정수를 또 하나 입력해주세요."); num2 = scan.nextInt();
				if(num2 <= 100 && num2 >= 1) {break;}
				else {System.out.print("0에서 100 사이의 ");}
		}
		
		for(;;) {
			System.out.println("연산자를 입력해주세요.( + - * / )"); yeon = scan.next().charAt(0);
				//잘 썼으면 나와!!
				if( yeon == '+' || yeon == '-' || yeon == '/' || yeon == '*' ) {break;}
				else {System.out.print("정해진 ");}
		}
		
		//처리  
			switch(yeon) {
			case '+': System.out.println( (num1) + "+" +(num2) + " = "+ (num1+num2)); break;
			case '-': System.out.println( (num1) + "-" +(num2) + " = "+ (num1-num2)); break;
			case '*': System.out.println( (num1) + "*" +(num2) + " = "+ (num1*num2)); break;
			case '/': System.out.println( (num1) + "/" +(num2) + " = "+ (num1/num2)); break;
				}
			
			/* if (yeon == '+') {result = num + num2;}
			/* else if (yeon == '-') {result = num - num2;}
			/* else if (yeon == '*') {result = num * num2;}
			/* else if (yeon == '/') {result = num / (double)num2;}
			 * 
			 * */
			
		//출력                ""+ 정수 문자(저장시 숫자)  정수
		/* 
		 		yeon!='/'? ""+(int)result : String.format("%.2f", result))
		 		
		 		System.out.println( "" + num1 + yeon + num2 + "=" +
		 		 					(op!='/' ? "" + (int)result: String.format("%.2f",result))
		 		 					);
		 		
		 * */
		//System.out.println(""+ num1+yeon+num+"="+result); 
		
			scan.close();
		
	}
}
