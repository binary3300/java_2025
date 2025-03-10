package com.company.java015;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;//컨트롤 쉬프트 o 하면 불러옴

//1. 콜랙션 프레임워크는 동적배열
//2. 배열의 단점 개선- 한가지 자료형의 사이즈 고정


//main class
public class Collection001 {
	public static void main(String[] args) {
		//step1. Array
		String[] arr = new String[3];//공간 3개 고정~
		arr[0]="헐크!";
		System.out.println(Arrays.toString(arr));
		
		//step2. 동적배열 -List (add-추가, get-가져오기, size-갯수, remove-삭제, contains-포함하니?)
		List list = new ArrayList();  //여러 자료형. 공간은 내가 원하는 만큼
		list.add("햄버거");
		list.add("0.356");
		list.add(0.356);
		list.add("Hello World!");
		System.out.println(list);
		
		//step3. <>
		//	부모				 =	자식 /업캐스팅
		//List<String> list2 = new ArrayList<>();
		//List<String> list2 = new ArrayList<String>();
		//String이라는 자료형만 듬을 수 있는 동적배열
		List<String> list2 = new ArrayList<>();
		list2.add("햄버거");
		list2.add("ABC");
		//list2.add(34);
		
		//step4. add, get, size, remove, contains
		list2.add("three");
		list2.add("four");
		
		System.out.println("갯수 : "+ list2.size());
		System.out.println("꺼내오기: "+ list2.get(1));
		System.out.println("포함여부: "+ list2.contains("tho"));
		System.out.println("삭제: "+ list2.remove(1));
		System.out.println(list2
				);
	}//main
}//class
