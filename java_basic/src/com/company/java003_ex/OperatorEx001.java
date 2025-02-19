package com.company.java003_ex;

public class OperatorEx001 {
	public static void main(String[]args){
		
	
	int a=3, b=10;
	System.out.println( b += 10 - a-- );  
	//자바 연산자를 숙지해야함~~~~
	//산술보다 단한(--   ++)이 먼저 계산한다
	//그러므로 1)a--  2)10-a   3)b+=(2)  4)프린트 출력
	System.out.println( a += 5 ); 
	//위에서 연산이 이어지기때문이 이곳의 a는 2다
	//그러므로 1)a의 값인 2에 5를 더해서 7을 만들고, 이 값을 다시 a에 보관. 그러므로 7
	System.out.println( a >= 10 || a<0 && a>3 ); //
	//&&가 우선순위 더 높음. 몰랐는데 꽁으로맞았다 우하하
	
	
	
	}
}