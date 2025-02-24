package com.company.java006;

public class Repeat002_while_dowhile {
	public static void main(String[]args) {
		//1. for (반복 횟수를 알 때.) {반복} {변수} for(시작; 종료; 변화)
		for(int i=1; i<=3; i++) { System.out.println(i + "\t"); } System.out.println();
		
		//2. while (반복 횟수를 모를때.-게시판) 초기값은 while보다 앞으로, 증감 맨 끝.
		for(int i=1; i<=3; i++) { System.out.println(i + "\t"); } System.out.println();
		//위의 for문을 while문으로 바꾼게 아래임
		int i=1;  while ( i<=3) { System.out.println(i + "\t");  i++;} System.out.println();
		
		//3. do while (무조건 1번은 실행해야 할 때.) 초기값은 while위치를 맨 끝으로
		//위 while문을 do while문으로 바꿈
		//int i=1;  위에 이미 int로 선언해서 오류나서 뺐음. 
		do { System.out.println(i + "\t");  i++; } while ( i<=3); System.out.println();
		
	}//end main
}//end class
