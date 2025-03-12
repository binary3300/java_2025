package com.company.java017;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream002 {
	public static void main(String[] args) {
		//데이터 종류 상관 없이 같은 방식으로 처리~~~~!
		Integer[] arr = {3,5,4,1,2,3,4,};
		List<Integer> list = Arrays.asList(arr);
		
		//#1 stream
		Stream <Integer> stream_arr = Arrays.stream(arr);
		Stream <Integer> stream_list =  list.stream();
		
		//#2 중간연산
		//predicate : java.util.function.Predicate <T>  ??Toadlfksekfmsel?
		//stream_arr.filter((t) -> {return t%2!=0;});  줄일수있다
		stream_arr.filter(t -> t%2!=0)	//홀수만 필터링한다.  	3513
				   .distinct()		//중복만 제거한다.. 		351
				   .sorted()		//정렬...				135
				   .skip(1)			//(1)개 출력스킵			35
				  .forEach(t -> {System.out.print(t);});
		
		System.out.println();
		System.out.println();
		
		stream_list.filter(t -> t%2!=0)	//홀수만 필터링한다.  		3513
		   .distinct()					//중복만 제거한다.. 		351
		   .sorted()					//정렬...				135
		   .skip(1)						//(1)개 출력스킵			35
		  .forEach(System.out::print);
		//arr이던걸 list로 바꿔도, 줄여도!!! 또옥같이 작동한다
		
		System.out.println();
		System.out.println();
		
		
		
		//#3 Collect
		System.out.println( Arrays.stream(arr).collect(Collectors.toList()) );
		System.out.println( list.stream().collect(Collectors.toList()) );
		
		
		
		
	}//
}//
