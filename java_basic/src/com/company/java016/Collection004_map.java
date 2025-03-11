package com.company.java016;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;


//main class
public class Collection004_map {
	public static void main(String[] args) {
		//   key값   value값 - add(x) put, get, size, remove, contains
		Map<String, String> map = new HashMap<>();
		map.put("one", "하나");
		map.put("two", "둘");
		//map.put("one", "셋");	키값이 같으면 덮어쓴다. 지우기 전 출력:{one=셋, two=둘, three=셋}
		map.put("three", "셋");
		
		System.out.println(map);
		System.out.println(map.get("one")); //가져오기. key줄게 value다오
		System.out.println(map.size());//갯수
		System.out.println(map.remove("three"));  //삭제  key를 쓴다!!! 밸류ㄴㄴ 
		System.out.println(map.containsKey("one")); //키가 one인거 있니~~~ 밸류가 둘인거 있니~~~~(네/아니요)
		
		System.out.println(map.keySet()); //키만 모아주세요~~ syso로 출력해주세요~~
		System.out.println(map.values());//값만 모아주세요~~~
		System.out.println(map.entrySet());//키랑 벨류값 다~~주세요~!
						//Set <Entry <String, String>>
		
		//출력 향상된 for
		for(Entry <String, String> e: map.entrySet() ) {
			System.out.println(e.getKey() +"/"+ e.getValue());
		}
		
		//iter = ver1
		//1. key모으기 2. 처리대상 확인 hasNext 3. 값 꺼내오기 next
		Iterator<String> iter = map.keySet().iterator();//iter->[one.two]
		while(iter.hasNext()) {
			String key = iter.next();
			System.out.println(key + map.get(key));
		}
		
		System.out.println("====");
		
		//iter - ver2
		//1 entry모으기  2. 처리대상확인		3. 값꺼내오기 4/
		Iterator <Entry<String,String>> eter = map.entrySet().iterator();
		//iter->[하나,ㄷ ㅜㄹ]
		while(eter.hasNext()) {
			Entry <String, String>
		}

		
		//iter = ver2
		//1. Entry모으기 2. 처리대상 확인 3. 값 꺼내오기
				
		
		
		
		
	}//main
}//main class
/*
  List : ##5.   기차      인덱스여부 [ 가능! ] ,  중복허용여부 [ 허용 ] ,  
 				[ " add, get(index), size, remove, contains " ] 
  Set  : ##6.   주머니   인덱스여부  [ 불가능! ] ,  중복허용여부  [ 비허용 ]  ,  
  				[ " add, 향상된 for 문/Iterator, size, remove, contains " ] 
  Map  : ##7.   사전      [ "키: 값" ] - 쌍(Entry),       
  				[ "put, get(key), size, remove, contains " ] 
 */