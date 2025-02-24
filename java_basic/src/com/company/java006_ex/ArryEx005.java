package com.company.java006_ex;

public class ArryEx005 {
	/* 배열명 ch
	 * 값넣기 B a n a n a
	 * ch배열에서 대문자의 갯수 카운트, 소문자의 갯수 카운트.
	 * */
	public static void main(String[]args) {
		
		
	char[] ch = { 'B', 'a', 'n', 'a', 'n', 'a'};
	int count1 = 0;
	int count2  = 0;
	
	for( int i = 0; i < ch.length; i++ ){
		if(ch[i] == 'B') {count1 += 1;}
		else if (ch[i] >= 1) {count2 +=1;}
	}//좋은 답은 아닌게 보이지만 오답을 존중하는 마음으로 어쩌구..
	
	/* 율비가 알려준 맞는방식
	 * +쌤버전 추가
	 * for( int i =0; i < ch.length; i++ ){
		if(ch[i]>='A'&& ch[i]<= 'Z') { count1 += 1 ;}
		else if (ch[i]>='A'&& ch[i] <= 'z') {count2 +=1;}
	 * */
		
	System.out.println("대문자의 갯수는: " + count1);
	System.out.println("소문자의 갯수는: " + count2);
		
	/* i는 자릿수니까 arry의 내용이 뭐든 상관없이 자릿값 0부터 n개니까 int로만 하면됨
	 * 그런데 내용물이 대문자인지 소문자인지 확인하려면 i만으로는 그게 대문자인지 소문자인지 알수없음
	 * ch[i] 이렇게 써야만 말이 된다!!!!!!!!!!!!!!!!!!!!!!!!!!
	 * i자체로는 01234~ 지만 ch[i]는 ch배열속의 i번째니까 내용물을 비교할수있음!!!!!!!!!!!!!!!!!!!!!!!!!!!
	 * */
		
	
	}//
}//

