package com.company.java016;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

class UserInfo123{
	private  String name; private  int age;
	public UserInfo123() { super();  }
	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
	public int getAge() { return age; }
	public void setAge(int age) { this.age = age; }
	public UserInfo123(String name, int age) { super(); this.name = name; this.age = age; }
	@Override public String toString() { return "UserInfo123 [name=" + name + ", age=" + age + "]"; }
	@Override public int hashCode() { return Objects.hash(age, name); }
	@Override public boolean equals(Object obj) { if (this == obj) return true; if (obj == null) return false; if (getClass() != obj.getClass()) return false; UserInfo123 other = (UserInfo123) obj; return age == other.age && Objects.equals(name, other.name); }
}

//main class
public class Repeat_0311_HashSet {
	public static void main(String[] args) {
		Set<UserInfo123> sets = new HashSet<>();
		
		sets.add(new UserInfo123("아이언맨" , 50));
		sets.add(new UserInfo123("헐크" , 40));
		sets.add(new UserInfo123("캡틴" , 120));
		System.out.println("==몇명?== " + sets.size());
		
		System.out.println("==향상된 for문== ");
		for(UserInfo123 s : sets) {System.out.println(s.getName() +"/"+s.getAge());}
		
		System.out.println();
		
		System.out.println("==iterator==");
		Iterator<UserInfo123> iter=sets.iterator();
		
		
	}//main
}//class
/*
5. sets  HashSet 만들기
6. 다음의 데이터 넣기
	 new UserInfo("아이언맨" , 50) ,
	 new UserInfo("헐크" , 40) , 
	 new UserInfo("캡틴" , 120)
7. for+size / 향상된 for 이용해서 데이터 출력
 */
