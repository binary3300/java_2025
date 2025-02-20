package com.company.java004_ex;

import java.util.Scanner;

public class IfEx007 {
	//계산기
	//스캐너로 a를 입력받음
	/*이프 a가 정수인지 판단
	 * 다시 스캐너로 b를 입력받음
	 * b가 정수인지 판단
	 * 다시 스캐너로 c를 입력받음
	 * c가 연산자인지 판단
	 * 계산 (a + c + b) 을 result에 넣음
	 * result를 출력 
	 * 엘스 올바른 순서로 입력하세요
	 * ##############################################
	 * 일단 틀린입력은 염두에 두지말고 순서만 짜보가.
	 * 변수 a b c가 있음;  
	 * 스캐너 준비
	 * 일단 정수를 입력해주세요 출력하기
	 * 스캐너로 int 받기
	 * if (방금 입력받은 a는 정수인가요) {정수(b) 를 입력해주세요 출력함 ; 넥스트 인트를 a에 넣음
	 * else if(방금 입력받은 b는 정수인가요) {연산자 (c)를 입력해주세요 출력함 ; 넥스트 인트를 b에 넣음
	 * else if(연산자인가요) {넥스트 캐릭터를 c에 넣음}
	 * else (올바르게 입력해주세요.)
	 * 처리 a c b 더한값을 r에 넣음
	 * 출력 "a" + "c" + "b" + "=" + "r" 
	 * 
	 * */
	public static void main(String[]args) {
		int a, b;
		String d = ""; char c =  ' '; 
		Scanner scan = new Scanner (System.in);
		
		System.out.println("정수를 하나 입력하세요"); a = scan.nextInt();
		System.out.println("정수를 하나 더 입력하세요"); b = scan.nextInt();
		System.out.println("연산자 하나 입력하세요(+, -, *, /)"); c = scan.next().charAt(0);
		
		if ( c == '+' ) { d = "" + (a + b); } //d를 String으로 잡고 { d = a + b; } 에서 지금처럼 바꾼건 선생님 답 보고 참고함
	 	else if (c == '-') { d = "" + (a-b); }
		else if (c == '*' ) {d = "" + (a*b);}
		else {d = String.format("%.2f",(a/(float)b));} //  전에는 d를 int로 잡았어서  { d = a / c }로만 해서 결과값의 몫을 버렸었다.
		
		
		//else {System.out.println("올바르게 입력해주세요.");}
		
		System.out.println(a + "" +c+ "" + b + "=" + d);
		
		/*출력 쌤버전1
		 * if(c == '+'){System.out.printf("%d %c %d = %d", a, c, b, a+b);}
		 * else if(c == '-'){System.out.printf("%d %c %d = %d", a, c, b, a-b);}
		 * else if(c == '*'){System.out.printf("%d %c %d = %d", a, c, b, a*b);}
		 * else if(c == '/'){System.out.printf("%d %c %d = %.2f", a, c, b, a/(float)b);}
		 * 
		 * 쌤버전2
		 * if(c == '+'){System.out.printf("" + a + c + b + "=" + (a+b));}
		 * if(c == '-'){System.out.printf("" + a + c + b + "=" + (a-b));}
		 * if(c == '*'){System.out.printf("" + a + c + b + "=" + a*b);}
		 * if(c == '/'){System.out.printf("" + a + c + b + "=" + String.format("%.2f", (a/(float)b)));}
		 * 
		 * */
		
		scan.close();
	}
}
