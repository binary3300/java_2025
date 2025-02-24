package com.company.java005_ex;

import java.util.Scanner;

public class ForEx006_2 {
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
		
		//선생님버전&한단계 더 버전
		
		//변수
		int num1 = -1, num2 = -1; double result= ' '; 
		char yeon = ' ';
		
		//입력
		Scanner scan = new Scanner(System.in);
		/*  break 빠져나와!  continue 믿에거를 스킵
		 * 
		 * for(;;){  (1-1)무한반복
		 *   #todo1 잘못썼으면 숫자1 입력받기
		 *   #todo2 잘못썼으면 숫자2 입력받기
		 *   #todo3 잘못썼으면 연산자 입력받기
		 *   (1-2) 빠져나올조건 -빠져나오기
		 * }
		 * for(;;){  위를 코드로
		 *   #todo1 it(잘못썼으면) {숫자1 입력받기} >> if( !(0 <= num1 && num1 <= 100) ) {숫자입력받기}
		 *   #todo2 if(잘못썼으면) {숫자2 입력받기}
		 *   #todo3 if(잘못썼으면) {연산자 입력받기}
		 *   (1-2) 빠져나올조건 -빠져나오기
		 * }
		  */
		
		for(;;) {
			if( !(0 <= num1 && num1 <= 100) ) { //잘 쓴 범위가 아니라면 입력시도/ 잘 쓴 범위면 입력X
				System.out.println("숫자1 입력>"); num1 = scan.nextInt(); continue;
				//만약에 -1을 넣으면 if에 맞으니까 안으로 들어가서 continue때문에 위로 다시 가서 반복함.
				//잘못입력받았으면 아래로 진행하면 안됨. 
				//입력이 올바르게되면 if를 충족하지 않으니까 아래로 진행함.
			}
			if( 0 > num2 || num2 > 100 ) {
				System.out.println("숫자2 입력>"); num2 = scan.nextInt(); continue;
			}
			if(!(yeon == '+' || yeon == '-' || yeon == '/' || yeon == '*')) {
				System.out.println("연산자를 입력해주세요.( + - * / )"); yeon = scan.next().charAt(0); continue;
			}
			break;
			
		}
		
		if (yeon == '+') {result = num1 + num2; System.out.println( "" + num1 + yeon + num2 + "=" + (int)result );}
		 else if (yeon == '-') {result = num1 - num2; System.out.println( "" + num1 + yeon + num2 + "=" + (int)result );}
		 else if (yeon == '*') {result = num1 * num2; System.out.println( "" + num1 + yeon + num2 + "=" + (int)result );}
		 else if (yeon == '/') {result = num1 / (double)num2; System.out.println( "" + num1 + yeon + num2 + "=" +
														    	(yeon!='/' ? "" + (int)result: String.format("%.2f",result))
																);
		
		/*
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
			
			 
		
		*/
		
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
}