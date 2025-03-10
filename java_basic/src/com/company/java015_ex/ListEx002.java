package com.company.java015_ex;

import java.security.DrbgParameters.NextBytes;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListEx002 {
	public static void main(String[] args) {
//		1.  numbers ArrayList 만들기
		List numbers = new ArrayList();
		
//		2.  one, two, three 데이터 추가
		numbers.add("one");
		numbers.add("two");
		numbers.add("three");
		
//		3.  사용자에게 1,2,3 입력받기
		System.out.print("숫자 123중 아무거나 입력>");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
//		4. 1을 입력받으면 one 출력
//		   2를 입력받으면 two 출력
//		   3을 입력받으면 three 출력
//		if(num == 1) {System.out.println(numbers.get(0));}
//		else if(num == 2) {System.out.println(numbers.get(1));}
//		else if(num == 3) {i<numbers.size(); i++}
		
		//4번 다른버전~
//		for(int i=1; i<=numbers.size(); i++)
//		{ if(num == i) {System.out.println(numbers.get(i-1)); break;} }
		
		//다른버전2
		System.out.println(numbers.get(num-1));
		
		//재밌다
		
		
	}//
}//
