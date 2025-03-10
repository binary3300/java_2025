package com.company.java015;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class UserInfo{
	private String name;
	private int age;
	
	public UserInfo() { super();  }
	public UserInfo(String name, int age) { super(); this.name = name; this.age = age; }
	@Override public String toString() { return "UserInfo [name=" + name + ", age=" + age + "]"; }
	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
	public int getAge() { return age; }
	public void setAge(int age) { this.age = age; }

}//UserInfo

//class main
public class ListEx003 {
	public static void main(String[] args) {
		/*연습문제3)  Collection  Framework
			패키지명 : com.company.java015_ex
			클래스명 : ListEx003
			1. UserInfo    Dto 클래스만들기    - 속성 :  private  String name; private  int age;
			2. users ArrayList 만들기
			3. 다음의 데이터 넣기
			   new UserInfo("아이언맨" , 50) , new UserInfo("헐크" , 40) , new UserInfo("캡틴" , 120)
			 List(동적배열) . index(순서), 중복허용/ add, get, size, remove, contains
			   
			4. for+size / 향상된 for 이용해서 데이터 출력
			5. 사용자들의 이름 입력받기 - 이름을 입력받으면 해당하는  유저의 자료출력
			
			> 원하는 유저의 이름을 입력하세요    _예) 아이언맨
			"아이언맨" , 50  */
		
		List<UserInfo> users = new ArrayList<UserInfo>();
		
		users.add(new UserInfo("아이언맨" , 50));
		users.add(new UserInfo("헐크" , 40));
		users.add(new UserInfo("캡틴" , 120));
		
//		for(int i=0; i<users.size(); i++) {		왜 여기서는 temp.가 오류나지?
//			System.out.println(temp.getName() + "/" + temp.getAge());}    
		
		System.out.println("----------------");
		
		for(UserInfo temp : users) {
			System.out.println(temp.getName() + "/" + temp.getAge());
		}
		
		Scanner scan = new Scanner(System.in);
		System.out.println("이름을 입력하세요");
		String a = scan.next();
		
		if(users.get(0).getName().equals(a)) {
			UserInfo temp = usersNameget(i);
			System.out.println(temp.getName()+ "/" +temp.getAge());
			break;}
		
		
		
	}//main
}//class
