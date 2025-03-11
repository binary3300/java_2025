package com.company.java016;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

class UserInfo99{
	private  String name; private  int age;
	public UserInfo99() {super();}
	public UserInfo99(String name, int age) { super(); this.name = name; this.age = age; }
	@Override public String toString() { return "UserInfo [name=" + name + ", age=" + age + "]"; }
	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
	public int getAge() { return age; }
	public void setAge(int age) { this.age = age; }
	@Override public int hashCode() { return Objects.hash(age, name); }
	@Override public boolean equals(Object obj) { if (this == obj) return true; if (obj == null) return false; if (getClass() != obj.getClass()) return false; UserInfo99 other = (UserInfo99) obj; return age == other.age && Objects.equals(name, other.name); }
	
}//UserInfo

//mainclass
public class Repeat_0311_ArrayList {
	public static void main(String[] args) {
		List<UserInfo99> users = new ArrayList<UserInfo99>();
		users.add(new UserInfo99("아이언맨" , 50));
		users.add(new UserInfo99("헐크" , 40));
		users.add(new UserInfo99("캡틴" , 120));
	
		System.out.println("==for문==");
		for(int i=0; i<users.size(); i++) {
			UserInfo99 temp = users.get(i);
			System.out.println(temp.getName()+temp.getAge());
		}//물어보고나서 전에 푼 예제 보니가 답 찾았음!
		
		System.out.println("==for문.코파일럿한테 물어본것==");
		for(int i=0; i<users.size(); i++) {
			System.out.println(users.get(i).getName()+ " / " + users.get(i).getAge());
		}
		
		System.out.println("==향상된 for문==");
		for(UserInfo99 temp : users) {System.out.println(temp.getName()+ " / " +temp.getAge());}
		
		
		
	}//main
}//class
