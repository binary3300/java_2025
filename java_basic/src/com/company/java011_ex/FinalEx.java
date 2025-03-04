package com.company.java011_ex;

//1. 클래스 부붐객체- 상태와 행위
//2. final- 수정하지마~

/* 초기화순서: 		기본값	->	명시적초기화	->	초기화블록		->		생성자
 * 	final nation	null		korea			korea(안건들임)		korea(안건들임)
 * 	final jumin		null		null(안건들임)	null(안건들임)		"00000" (가능)
 * 	name			null		null(안건들임)	null(안건들임)		연산자 이용해서 수정가능
 * */
class User002 {
	   final String nation = "Korea";   //수정하지마
	   final String jumin;   //수정하지마
	   String name;

	   public User002() { this.jumin="00000"; }
	   //여기서 제댜로함
	   public User002(String jumin, String name) {
	      this.jumin = jumin;
	      this.name = name;
	   }
	@Override
	public String toString() {
		return "User002 [nation=" + nation + ", jumin=" + jumin + ", name=" + name + "]";
	}
	   
	   
	   
	}

	 public class FinalEx {
	   public static void main(String[] args) {
	      User002 user1 = new User002("123456-1234567", "아이유");
	      System.out.println(user1);   
	      
	      //user1.nation = "USA";      //4번줄에서 final로 선언해서 값을 바꾸지 못한다!//수정하지마
	     // user1.jumin  = "123123-1234321"; 	//5번줄에서 final로 선언!//수정하지마
	      user1.name = "IU"; 
	      System.out.println(user1);   
	   }
	}
	 
/* 
 * -----------------------------------------------------------------------------------------------
 * [method: 정보] User002.class, FinalEx.class   ##1
 * -----------------------------------------------------------------------------------------------
 * [heap]																			| [stack]
 * 1번지: {nation=korea, jumin="123456-1234567", name="아이유"}<-user1	(1번지)			|
 * 																					| main  ##2
 * -----------------------------------------------------------------------------------------------
 * */


	 
	 
	 