package com.company.java003;

import java.util.Scanner;

public class Operator001 {
	public static void main(String[]args) {
		//먼저 ()   값(+,-,*,/, ++ , --)  비교(> < >= =<)  조건 (&&, ||, ?:) 대입 (=)
		//1. 값(+,-,*,/, ++ , --)
		int a = 10, b = 3;
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);//몫
		System.out.println(a%b);//나머지
		
		//Q1. 나머지 연산자 - 짝수냐 홀수냐
		//Q2/ 3의 배수?
		//짝수: 0(짝수) 1(홀수) 2(짝수) 3(홀수).... 2로 나눴을때 나머지가 0이면 짝수
		// 0%2 = 0
		// 1%2 = 1
		// 2%2 = 0
		//A1
		System.out.println( 0%2 + " " + 1%2 + " " + 2%2 + " " + 3%2);
		//A2
		//3의 배수
		// 1%3 = 1  나머지 1
		// 2%3 = 2  나머지 2
		// 3%3 = 0  나머지 3  - 3의 배수라면 0, 나머지는 (0?)1이나 2
		System.out.println(1%3 + " " + 2%3 + " " + 3%3);
		
		//2. 비교 (== , != , < , > , <=이하, >=이상)
		//Q1. 나머지 연산자 - 짝수냐 홀수냐
		//Q2. 3의 배수라면 true
		System.out.println( 10>3 );  //	true	
		System.out.println( 10<3 );  // false
		//a=10   a의 2나머지연산식
		System.out.println( a%2 == 0 ); //짝수 표현 
		System.out.println( a%2 == 1 ); //홀수 표현
		//b=3   b를 3으로 나머지연산식
		System.out.println( b%3 == 0 );
		
		//3. 조건 ( &  &&(조건1그리고조건2모두 만족시)  |  ||(조건1혹은조건2 여러조건 중 하나 만족시) )
		System.out.println( true & true );
		System.out.println( true && true );  //
		System.out.println( false & true );  //&는 처음이 false여도 끝까지 읽어들인다. 
		System.out.println( false && true ); //Dead code. &&는 처음에 false가 뜨면 뒤는 읽지않고 버려서 데드코드로 만든다
		
		System.out.println( true | true );  // ||은 하나라도 조건이 맞으면 true임
		System.out.println( true || true );
		System.out.println( false | true ); // 그래서 처음에 false가 떠도 끝까지 읽는다.
		System.out.println( false || true );
		
		//4.  (조건) ?    참:거짓
		System.out.println( (a>b)? "a>b" : "a<b" );
		System.out.println( (3%2==0)? "짝수":"홀수" );
		
		// q1 2의 배수이면서 5의 배수라면 트루/펄스
		// q2 2의 배수이거나 3의배수라면 트루/펄스
		// q3 숫자를 입력받아 0보다 크면 양수, 0보다 작으면 음수, 아니라면 0
		
		//a=10
		System.out.println( (a%2 == 0) && (a%5 == 0) );
		System.out.println( (a%2)==0 || (a%3 == 0) );  //둘 다 괄호 없어도 됨
		
		//변수
		int num = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자 입력>");
		num = scan.nextInt();
		System.out.println( (num>0)?"양수": (num<0)?"음수":"0" );
		//System.out.printf( (num>0),(num<0) ? "양수":"음수" );
		
		//5. 대입
		a=10;
		System.out.println( a+=b );    //1)a+b    2)a=1번한결과
		System.out.println( a-=b );   
		System.out.println( a*=b );   
		System.out.println( a/=b );    
		System.out.println( a%=b );    
		
		//() 값 비교조건 대입
		//6. ++  --  (단항)
		int a1=1, b1=1, c1=1, d1=1;
		System.out.println( ++a1 );  //2	증가하고 출력하세요.
		System.out.println( a1 );	 //2	위 연산의 결과를 완전히 출력
		
		System.out.println( b1++ );  //1	출력하고 증가하세요
		System.out.println( b1 );	 //2	위 연산의 결과를 완전히 출력

		System.out.println( --c1 );	//0		감소하고 출력하세요
		System.out.println( c1 );	//0		완전히 출력하세요
		
		System.out.println( d1-- ); //1		출력하고 감소하세요
		System.out.println( d1 );	//0		완전히 출력하세요
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
