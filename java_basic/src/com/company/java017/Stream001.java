package com.company.java017;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Stream001 {
	public static void main(String[] args) {
		Integer[] 		arr = {1,2,3,4,5};				//배열
		List<Integer> 	list = Arrays.asList(arr);	//리스트
		
		
		System.out.println("----------배열 Array---------------");
		//Arrays.stream(arr).forEach((t)->{System.out.println(t);}); 줄일수있다!!!
		//Arrays.stream(arr).forEach(	  t -> System.out.println(t)); 더 줄일수잇다!
		Arrays.stream(arr).forEach(	           System.out::print); //이만큼 줄이려면 원래가 뭔지는 알고있어야한다
		
		//Consumer<? super Integer> action; //<? super Integer> Integer 포함 (super는 부모)
		//Consumer<Integer> action; Consumer <Number>action;
		//풀이2
		Consumer<Integer> action;
		// void java.util.function.Consumer.accept (T t)
		//파라미터 (T t) / 리턴값 X
		System.out.println();
		System.out.println("----------리스트 list---------------");
		
		
		list.stream().forEach(System.out::print);
		
		
	}//
}//
