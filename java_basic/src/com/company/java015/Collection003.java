package com.company.java015;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List; //컨트롤 쉬프트 o!!!!!!!!!!
import java.util.Set;

//1. 콜렉션프레임워크 - [배열]의 단점을 개선한 [객체]만 저장가능(동적배열)
//2. List, Set, Map
//	 List - index O, 중복허용 O, add/get(번호-0번부터~)/size/remove/contains
//	 Set - index X, 중복허용 X,  add/for, Iterator/size/remove/contains


//main c;ass
public class Collection003 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("one"); 
		list.add("one"); 
		list.add("two"); 
		list.add(new String("three")); //객체
		System.out.println(list.size() + "/" + list); // 4개
		
		Set<String> set = new HashSet<>(); //주머니: index없음, 중복허용 안됨!! 순서도 없음.. 지금 어쩌다보니 순서대로 나오는데, 원래 출력하면 순서도 멋대로임
		set.add("one"); 
		set.add("one"); 
		set.add("two"); 
		set.add(new String("three")); //객체
		System.out.println(set.size() + "/" + set); //3개!
		
		//add/size/remove/contains 해바
		
		//Set<int> set2 = new HashSet<>();  숫자자료형만 모으고싶어서 int로했더니 오류!!
		Set<Integer> set2 = new HashSet<>();  //int는 숫자자료형... 객체만 저장한다... int의 객체형인 Integer를 써야한다...!!!
		//int->Integer, float->Float, double->Double........ Wrapper Class...
		set2.add(1); //Integer e = 1;  이랑 같음.
		set2.add(new Integer(2)); //The constructor Integer(int) has been deprecated since version 9 and marked for removal
		set2.add(3);  //Integer e = 1;
		
		int a = 1;		//값		기초값 
		Integer e = 1;	//부품객체		wrapper - boxed 
		System.out.println(		a				 +"/"+ e			); //  1/1
		System.out.println( /*a.byteValue() + */ "/"+ e.byteValue() );
		//1) 부품객체(클래스) = 기초값 boxed
		//2) 클래스가 만들어놓은 기능들 사용가능.wrapper
		// 	 int->Integer, float->Float, double->Double....... Wrapper Class.!!!!!
		//3) Integer.parseInt, DoubleparseDouble, String.valueOf
		
		//	for + size - get
		for(Integer e1 : set2) {System.out.println(e1);} //향상된 for문이랑 합쳐서 꺼내오기 가능!!
		System.out.println(" 1. add   2. size- " + set2.size());
		System.out.println(" 3. remove- " + set2.remove(2));
		System.out.println(" 4. contains- " + set2.contains(1));
		System.out.println(set2);
		
		
		System.out.println("-------------------------------------------------");
		Iterator <Integer> iter = set2.iterator();	//1. 줄서시오 iter->[1,3]
		while(iter.hasNext()) {/* 2. 처리대상 확인   iter[->1,3]*/
			System.out.println(iter.next());//3. 꺼내오기
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}//main
}//class
