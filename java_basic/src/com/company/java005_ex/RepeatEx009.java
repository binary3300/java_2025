package com.company.java005_ex;

public class RepeatEx009 {
	public static void main(String[]args) {
		System.out.println("a b c d e");
//		
//	for ( int i=65; i <=90; i++ ) {
//		System.out.println(i);
//		if(i%5==4) {System.out.println(); }
//		
		
		
		
		//선생님 해설.
		
		/*System.out.println("A"); 
		 *System.out.println("B");
		 *System.out.println("C");
		 *System.out.println("D");
		 *System.out.println("E");
		 *System.out.println();
		 *System.out.println("F");
		 *System.out.println("G");
		 *System.out.println("H");
		 *System.out.println("I");
		 *System.out.println("J");
		 *System.out.println();
		 *....
		 *..
		 *
		 *
		 *위의 노가다를 정리하면
		 *System.out.println(); 줄바꿈(5번째마다)
		 *System.out.println('A'); 알파벳 A~Z.
		 *1) 줄바꿈코드를 5번째마다 넣어야하고
		 *2) 이걸 알파벳이랑 연결지어야한다. (아스키코드에서 A는 65 F는 70 K는 75... Z는 90)
		 *
		 *헷갈리니까 줄바꿈 먼저 하고 5글자출력하자
		 *System.out.println();
		 *System.out.println("A"); 
		 *System.out.println("B");
		 *System.out.println("C");
		 *System.out.println("D");
		 *System.out.println("E");
		 *System.out.println();
		 *System.out.println("F");
		 *System.out.println("G");
		 *System.out.println("H");
		 *System.out.println("I");
		 *....
		 *...
		 *..
		 * */
		
//		if('A'%5==0) {System.out.println();} System.out.println('A'); 
//		if('B'%5==0) {System.out.println();} System.out.println('B'); 
//		if('C'%5==0) {System.out.println();} System.out.println('C'); 
//		if('D'%5==0) {System.out.println();} System.out.println('D'); 
		
		for(char ch='A'; ch<='Z'; ch++) { if(ch%5==0) {System.out.println();} System.out.println(ch); }
		
		char ch='A'; while(ch<='Z') {if(ch%5==0) {System.out.println();} System.out.println(ch); ch++;}
		
		ch='A'; do{if(ch%5==0) {System.out.println();} System.out.println(ch); ch++;} while(ch<='Z');
		
	
	//변수
//	char a = ' ';
	
	
	//입력
//	for (a='A'; 'A'<='Z'; 'A'++ ) {
//		System.out.println(a);
//		if(a%5==4) {System.err.println();}
//	}
	
	//처리
	
	//출력
	
	
	
	
	
	
	
	/* for while do while 세가지방법으로
	 * 65 ABCDE
	 * FGHIJ
	 * KLMNO
	 * PQRST
	 * UVWXY
	 * Z 90
	 * */
}
}