package com.company.java005_ex;

public class FoeEx004 {
	public static void main(String[]args) {
		/* 1~10까지 3의 배수 갯수 출력
		 * 
		 * 
		 * */
		//변수
		int count = 0;
		
		//입력
		
		//처리
		for(int i=1; i<=10; i*=3 ) {
			//if(i%3==0)  이 이프문을 넣어야 i가 3의 배수일때 {}를 실행한다!!!!!!!!!!!!!!!! 쌤꺼랑 율비꺼 참고함
			count++;
		}
		
		/*
		 * 만약 1이 3의 배수라면 갯수 카운트 출력구문 3,6,9
		 * 만약 2이 3의 배수라면 갯수파운트
		 * 만약 3이 3의 배수라면 갯수파운트
		 * 만약 4이 3의 배수라면 갯수파운트
		 * 
		 * 위의 저녀석이 이제
		 * if(만약 1이 3의 배수라면) {갯수 카운트}
		 * 로 바뀐다 이후
		 * 
		 * if(1%3==0){갯수카운트???어떻게하는거지????가됨 나는}
		 * 
		 *for(int i=1; i<=10; i++) { if(1%3==0){count++; System.out.println(count++1?"":",")+i; } }
		 * 
		 * */
		
		
		//출력
		System.out.println(count + "개");
	}
}
