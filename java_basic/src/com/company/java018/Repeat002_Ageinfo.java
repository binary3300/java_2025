package com.company.java018;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;

class Ageinfo{
	private int no; private String name; private int age;

	public Ageinfo() { super();  }
	public Ageinfo(int no, String name, int age) { super(); this.no = no; this.name = name; this.age = age; }
	@Override public String toString() { return "Ageinfo [no=" + no + ", name=" + name + ", age=" + age + "]"; }
	public int getNo() { return no; }
	public void setNo(int no) { this.no = no; }
	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
	public int getAge() { return age; }
	public void setAge(int age) { this.age = age; }
	
}

//아래로 메인클래스
public class Repeat002_Ageinfo {
	public static void main(String[] args) {
//		 Q7.  ArrayList
// 		 * 	 dto 를 이용하여 ArrayList + Iterator  이용해서 만들기  
		List<Ageinfo> agif = new ArrayList<Ageinfo>();
		agif.add(new Ageinfo(1, "iron", 45));
		agif.add(new Ageinfo(2, "hulk", 38));
		agif.add(new Ageinfo(3, "captain", 120));
		
		
		
		System.out.println("======================\r\n"
				+ "NO	NAME	AGE\r\n"
				+ "======================");
//		int total = 0; double avg = 0;
//		while(iter.hasNext()) {
//			Ageinfo a = iter.next();
//			total = a.getAge();
//			avg = total/3.0;
//			System.out.println(a.getNo()+"\t"+a.getName()+"\t"+a.getAge() + "\t" + "나이총합: "+ total +"\r\n"
//					+"나이 평균 "+avg);
//		}
//		System.out.println(); 출력에서 오류가 났다 어캐 고쳐야할지 좀 고민하면 알것같은데 시간다되서 쌤이랑 같이풀이해야지
		System.out.println("======ArrayList======");
		
		Iterator<Ageinfo> iter = agif.iterator();
		while(iter.hasNext()) {
			Ageinfo temp=iter.next();
			System.out.println(temp.getName()+"\t"+temp.getAge());
		}
		
		
		/*
		 Q8.   HashSet
		 *   dto 를 이용하여 HashSet   + Iterator  이용해서 만들기  */
		System.out.println("======HashSet======");
		
		HashSet<Ageinfo> agifH = new HashSet<>();
		agifH.add(new Ageinfo(1, "iron", 45));
		agifH.add(new Ageinfo(2, "hulk", 38));
		agifH.add(new Ageinfo(3, "captain", 120));
		
		Iterator<Ageinfo> iter2 = agifH.iterator();
		int total = 0;
		while(iter2.hasNext()) {
			Ageinfo temp=iter2.next();
			total += temp.getAge(); //총나이누적
			System.out.println(temp.getName() +"\t"+ temp.getAge());
		}
		System.out.println("총나이: " + total);
		System.out.println("평균나이: " + total/agifH.size());
		
		
		
		
		 /*Q9.   HashMap
		 *   dto 를 이용하여 HashMap   + Iterator  이용해서 만들기 */
		System.out.println("======HashMap======");
		
		HashMap<Integer, Ageinfo> agifM = new HashMap<>(); 
		agifM.put(1, new Ageinfo(1, "iron", 45));
		agifM.put(2, new Ageinfo(2, "hulk", 38));
		agifM.put(3, new Ageinfo(3, "captain", 120));
		
		//System.out.println(agifM.entrySet());
		total=0;
		Iterator <Entry<Integer, Ageinfo>> iter3=agifM.entrySet().iterator();
		while(iter3.hasNext()) {
			Ageinfo temp = iter3.next().getValue();
			total += temp.getAge();
			System.out.println(temp.getName()+"\t"+temp.getAge());
		}
		
		
		 /* ㅁ 출력된결과
		 ======================
		 NO	NAME	AGE
		 ======================
		 1	iron		45
		 2	hulk		38
		 3	captain	120
		 
		 나이총합 : 203
		 나이평균 : 67.67
		 */
		
		
		
		
		
		
	}//main
}//class
