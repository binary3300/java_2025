package com.company.java017;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntBinaryOperator;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Lambda004_api {
	public static void main(String[] args) {
		//#1 	Consumer<T> 받는도- accept
		// 		void java.util.function.Consumer.accept ( T t )
		//		()->{}  파라미터ㅇ 리턴값x
		//Consumer<String> consumer=(t)-> {System.out.println("Hello" + t); }; //ctrl shift o 눌러서 위에 임포트 하고, 임포트된 인터페이스에서 Consumer에 마우스올리면 나오는창에서 accept누르고 나오는거 복붙
		//Consumer<String> consumer= t ->  System.out.println("Hello" + t); ;  //줄일수있음
		  Consumer<String> consumer= System.out::println;  //또 줄일수있음
		
		consumer.accept("루루");
		consumer.accept("강아지");
		
		//#2
		//Supplier<String> supplier = null;
		//System.out.println(supplier.get());
		
		//supplier.get("뭐지?");
		// T java.util.function.Supplier.get ()
		//		()->{}  파라미터x 리턴값o
		//		()->{이런경우 꼭 리턴이 들어갸야}  파라미터x 리턴값o
		//이렇게 쓴다! Supplier<String> supplier = ()->{return "Hello";};
		Supplier<String> supplier = ()->"Hello"; //이렇게 줄일수가 있다!
		
		
		//#3
		//Predicate 	- 판단용도 	- test
		//1 메서드찾기
		//2 ()->{} 파라미터 / 리턴값 유무
		//boolean java.util.function.Predicate.test (T t)
		//Predicate<Integer> predicate;
		//System.out.println(predicate.test(-1));
		
		Predicate<Integer> predicate = t -> t<0;
		System.out.println(predicate.test(-1));
		
		
		//4. 
		//Function - 처리용도 - apply
		//1 메서드 찾기
		//2 (t) ->{return} 파라미터/리턴값
		//Function<String, Integer>  function;
		/* R java.util.function.Function.apply (T t)*/
	//	Function<String, Integer>  function= (t)->{return Integer.parseInt(t);};
	//	Function<String, Integer>  function= t->Integer.parseInt(t);
		Function<String, Integer>  function= Integer::parseInt;
		System.out.println(function.apply("10") + 3);
		
		
		//5. 
		//Operator - 연산용도 - apply
		//1 메서드 찾기
		//int java.util.function.IntBinaryOperator.applyAsInt (int left,int right)
		
		//2 (int left,int right) ->{return 가} 파라미터/리턴값
		//IntBinaryOperator operator;
	//	System.out.println(operator.applyAsInt(10, 3));
		
		//IntBinaryOperator operator  = (int left,int right) ->{return;};
		//IntBinaryOperator operator  = (left, right) ->{return left>=right? left:right ;};
		IntBinaryOperator operator  = (left, right) ->left>=right? left:right ;
		System.out.println(operator.applyAsInt(10, 3)); //큰 값을 리턴한다.
		
	}
}

/*
2. 자바 api의 함수형 인터페이스
	1. Consumer - 받는용도 - accept
	2. Supplier - 제공용도 - get
	3. Predicatr - 판단용도 - test
	4. Function - 처리용도 - apply
	5. Operator - 연산용도 - apply
*/
