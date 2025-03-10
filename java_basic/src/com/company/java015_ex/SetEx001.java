package com.company.java015_ex;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*연습문제1)  Collection  Framework
패키지명 : com.company.java015_ex
클래스명 : SetEx001
다음과 같이 코드를 작성하시오.
 1.  Hash 이용해서 colors 만들기
 2. red, green, blue ,green 데이터 추가
 3. 출력
 4. 갯수출력 */

//main class
public class SetEx001 {
	public static void main(String[] args) {
		Set<String> colors = new HashSet<>();
		
		colors.add("red");
		colors.add("green");
		colors.add("blue");
		colors.add("green");
		colors.add("초록");
		System.out.println("----그냥-----");
		System.out.println(colors);  //[red, green, blue]
		System.out.println("-----갯수----");
		System.out.println( colors.size() + "개" );
		
		//Set으로 만든 배열이기때문에 겹치는 내용물은 무시한다.
		
		//향상된for문
		System.out.println("----향상된 포문-----");
		for (String c: colors){System.out.println(c);}
		
		//iterator
		System.out.println("----이터레이터-----");
		Iterator<String> iter= colors.iterator(); //1 set요소들 꺼내오기
		while(iter.hasNext()) { //2 처리대상 확인.
			System.out.println(iter.next());
		}
		
		System.out.println(colors.size());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}//main
}//class
