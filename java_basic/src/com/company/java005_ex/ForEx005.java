package com.company.java005_ex;

public class ForEx005 {
	public static void main(String[]args) {
		/* 1~10까지 3의 배수 갯수를 출력, 소문자 a~z중 모음의 갯수 출력!!!
		 * a 97 z 122
		 * */
		
		//변수
		int count = 0, count2 = 0;
		
		//입력
		
		//처리
		for(int i=1; i<=10; i++ ) {
			if(i%3 == 0) { System.out.print(+ i); count++; };
		}
		
		for(char ch=97; ch<=122; ch++) {
			switch(ch) {
			case 97: case 101: case 105: case 111: case 117: count2++; break;
			}
		}//for문 배우고있는데 왜 스위치를 쓰고 난리니....
		//아니 뭘 입력할일도 없는데 왜 숫자랑 문자를 생각해서int로한거임???????????
		//그냥 바로 cha로하면 됐을텐데 바보바보
		
		//출력  소문자 a~z중 모음의 갯수 출력
		System.out.println("\n3의 배수 갯수는: " + count);
		System.out.println("소문자 알파벳에서 모음의 갯수는: " + count2);
		
		/* 선생님 예시
		 * 
		 * ver1 대상, 어떠하다
		 * a가 모음이라면 카운트 증가
		 * b가 모음이라면 카운트 증가
		 * c가 모음이라면 카운트 증가 ...
		 * 
		 * ver2.
		 * if(a=='a' ||a=='e' || a=='u' || a=='e' || a=='i' || a=='o'  ){카운트 개수 증가}
		 * if(b=='a' ||b=='e' || b=='u' || b=='e' || b=='i' || b=='o'  ){카운트 개수 증가}
		 * if(c=='a' ||c=='e' || c=='u' || c=='e' || c=='i' || c=='o'  ){카운트 개수 증가}
		 * if(b가 모음이라면){카운트 개수 증가}
		 * if(c가 모음이라면){카운트 개수 증가}...
		 * 
		 * for( char ch='a'; ch<='z'; ch++ ) {if( ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ){ count++ }}
		 * */
		
	}//메인끝
}//클래스끝
