package com.company.java015_ex;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Scanner;
import java.util.Set;

class UserInfo2{
	private int no; private  String name; private  int age;

	public UserInfo2() { super();  }
	public UserInfo2(int no, String name, int age) { super(); this.no = no; this.name = name; this.age = age; }
	@Override public String toString() { return "UserInfo2 [no=" + no + ", name=" + name + ", age=" + age + "]"; }
	public int getNo() { return no; }
	public void setNo(int no) { this.no = no; }
	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
	public int getAge() { return age; }
	public void setAge(int age) { this.age = age; }
	
	//알트 쉬프트 s - 제너레이트 해시코드 앤 이퀄즈
	//나온것중에 hashCode가 순서를 똑같이 맞춰준다.
	@Override public int hashCode() { return Objects.hash(no, name, age  ); }
			//객체기반으로 만든건지 확인
	
	//Set, Map 중복허용  1)hashCode  2)equals
	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		UserInfo2 other = (UserInfo2) obj;
		return age == other.age && Objects.equals(name, other.name) && no == other.no;
	} //객체 안에 값이 같은지 확인해준다.
	
	
	
	
	
}
/*
 * 연습문제2)  Collection  Framework
패키지명 : com.company.java015_ex
클래스명 : SetEx002
1. UserInfo2    Dto 클래스만들기  - 속성 : private int no; private  String name; private  int age;
2. users   HashSet만들기
3. 다음의 데이터 넣기
   new UserInfo(1, "아이언맨" , 50) ,
   new UserInfo(2, "헐크" , 40) , 
   new UserInfo(3, "캡틴" , 120)
4. 향상된 for / Interator 이용해서 데이터 출력
5. 사용자들의 이름 입력받기 - 이름을 입력받으면 해당하는  유저의 자료출력
 */

//class main
public class SetEx002{
	public static void main(String[] args) {
		Set<UserInfo2>  users = new HashSet<>();
		
		users.add( new UserInfo2(1, "아이언맨" , 50) );
		users.add( new UserInfo2(2, "헐크" , 40) );
		users.add( new UserInfo2(3, "캡틴" , 120) );
		users.add( new UserInfo2(3, "캡틴" , 120) );
		System.out.println("회원 수: " + users.size());
		System.out.println(users.getClass());
		//중복정보때문에 4명이 나오는데, 3명이 나와야 한다면.....
		
		
		
		
		//for(꺼내올 자료형 a : 배열 or list)
		System.out.println("---for---");
		for( UserInfo2 temp : users ) { System.out.println(temp.getNo() + "/" + temp.getName() + "/"+ temp. getAge()); }
		System.out.println("---Iterator---");
		Iterator<UserInfo2> iter = users.iterator(); //1. set모으기 iter-> [1"아이언맨"50/2"헐크"40;;;;]
		while(iter.hasNext()) {//2 처리대상 확인 
			UserInfo2 u = iter.next();//3 꺼내오기
			System.out.println(u.getNo() + "/" + u.getName() + "/" + u.getAge());
		}
		System.out.println(users.size());
		
		//while(iter.hasNext()) {
//			System.out.println(iter.hasNext());
//		}
		System.out.println(users.size());
		//순서가 맘대로 나온다!
		
		Scanner scan = new Scanner(System.in);
		System.out.print("유저이름검색>");
		String name = scan.next();
		
		//set에서 데이터 꺼내와/ 해당 데이터의 이름과 입력한 값이 같다면/해당유저자료출력
		iter = users.iterator(); //1. 모으기
		while(iter.hasNext()) { //2. 처리대상확인
			UserInfo2 u = iter.next(); //3. 꺼내오기
			if(u.getName().equals(name)){
			System.out.println(u.getNo() + "/" + u.getName() + "/" + u.getAge());
			}
		}
		
		
		
		
		
		
	}//main
}//class
