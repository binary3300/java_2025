package com.company.java016;

interface InterA2{  void hi1();}    
interface InterB2{  void hi2(String name);}  
interface InterC2{  String hi3();}   
interface InterD2{  String hi4(int num, String name);}   

public class Lambda002 {
	public static void main(String[] args) {
/*
interface InterA2{  void hi1();}    
interface InterB2{  void hi2(String name);}  
interface InterC2{  String hi3();}   
interface InterD2{  String hi4(int num, String name);}   
 */
	System.out.println("[Step1] 매개변수X, 리턴값X "); //void hi1
	//1-1 익명개체	hi출력
	InterA2 a1 = new InterA2() {@Override public void hi1() {System.out.println("hi!");}}; a1.hi1();
	
	//1-2 람다식
	InterA2 a2 = ()->{ System.out.println("hi!"); }; a2.hi1();
	
	//허전해진것이 눈에띄나요? 이럴수가! 람다는 한 줄 따리면 {}도 생략가능!!!
	InterA2 a3 = ()-> System.out.println("hi!"); ; 	a3.hi1();
	
		
	
	
	
	
	
	
	
	System.out.println("[Step2] 매개변수O, 리턴값X "); 
	//2-1 익명개체 hi sally!
	InterB2 b1 = new InterB2() {
		@Override public void hi2(String name) {  System.out.println("hi" + name ); }
	}; b1.hi2("sally");
	
	//2-2 람다식 ()->{}
	InterB2 b2= (String name)->{System.out.println("hi" + name);  }; b2.hi2("sally");
	
	//줄이는거 될듯
	InterB2 b3= (name)->System.out.println("hi" + name); b2.hi2("sally");
		
	
	
	
	
	
	System.out.println("[Step3] 매개변수X, 리턴값O "); 
	//3-1
	InterC2 c1 = new InterC2() {
		@Override public String hi3() { return "hi!!"; }
	};
	System.out.println(c1.hi3());
	
	//3-2 fkaektlr
	InterC2 c2 = ()->{return "hi!!";}; System.out.println(c2.hi3()); 
	InterC2 c3 = ()->"hi!!!"; System.out.println(c3.hi3()); 
	
	
	
	
	
	
	
	
	
	System.out.println("[Step3] 매개변수O, 리턴값O "); 
	//4-1  interface InterD2{  String hi4(int num, String name);}   
	//익명개체 ★문자열 추가 System.out.println(d1.hi4(1,"Sally!"));
	InterD2 d1 = new InterD2() {
		@Override public String hi4(int num, String name) { 
			return "Hi" + name + "★".repeat(num); //repeat 문자열 반복
		}}; System.out.println(d1.hi4(1," Sally!"));
	
	//4-2 fkaekgud
	// ★문자열 추가 System.out.println(d1.hi4(1,"Sally!"));	
	InterD2 d2 = (int num, String name)->{return "Hi" + name + "★".repeat(num);};
	System.out.println(d1.hi4(1," Sally!"));
	
	//4-2를 극한까지 줄여보자
	InterD2 d3 = (	  num, 		  name)-> "Hi" + name + "★".repeat(num);;
	System.out.println(d1.hi4(1," Sally!"));
	
	
	
	
	
	
	
		
	}//
}//
