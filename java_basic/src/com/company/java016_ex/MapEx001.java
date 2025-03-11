package com.company.java016_ex;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

//main class
public class MapEx001 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Map<String, String> map = new HashMap<>();
		map.put("피구왕", "통키");
		map.put("제빵왕", "김탁구");
		map.put("요리왕", "비룡");
		
		//1 줄서시오
		Iterator <Entry<String, String>> iter = map.entrySet().iterator();
		while(iter.hasNext()) {//2 처리대상 확인
			Entry<String,String> temp = iter.next();
			System.out.println(temp.getKey() + " "+ temp.getValue());
			System.out.println("=======================");
		}
		
		System.out.println("=====================\r\n"
				+ "KING   NAME\r\n"
				+ "=====================");
		for( Entry <String, String> e  : map.entrySet() ) {
			System.out.println(e.getKey() + "\t" + e.getValue()+"\n"
								+ "-------------------"
								);
		}
		System.out.print("KING의 정보를 제공중입니다\r\n"
				+ "왕을 입력하세요>");
		String name = scan.next();
		String result = "왕의 정보를 확인해주세요";
		
		if(map.containsKey(name)) {
			result = "ㅁ " + name + ":" +map.get(name);
		}
		//System.out.println(map.get(name));
		System.out.println(result);
		
		
	}//main
}//main class


/*
1. MAP 만들기
KEY   VALUE
피구왕   통키
---------------------
제빵왕   김탁구
---------------------
요리왕   비룡

Map<String, String> map = new HashMap<>();

2 다음과 같이 문제풀기
==============================
KING   NAME
==============================
피구왕   통키
---------------------
제빵왕   김탁구
---------------------
요리왕   비룡
---------------------
KING의 정보를 제공중입니다
이름을 입력하세요> 제빵왕

ㅁ제빵왕 : 김탁구
 */