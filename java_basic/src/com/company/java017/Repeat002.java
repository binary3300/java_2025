package com.company.java017;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;

//main class
public class Repeat002 {
	static class Milk{
	private int no;  private String name;  private int price;
	public Milk() { super();  }
	public Milk(int no, String name, int price) { super(); this.no = no; this.name = name; this.price = price; }
	@Override public String toString() { return "Milk [no=" + no + ", name=" + name + ", price=" + price + "]"; }
	public int getNo() { return no; }
	public void setNo(int no) { this.no = no; }
	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
	public int getPrice() { return price; }
	public void setPrice(int price) { this.price = price; }
	@Override public int hashCode() { return Objects.hash(no, name, price); }
	@Override public boolean equals(Object obj) { if (this == obj) return true; if (obj == null) return false; if (getClass() != obj.getClass()) return false; Milk other = (Milk) obj; return Objects.equals(name, other.name) && no == other.no && price == other.price; }
	
	}
	
	public static void main(String[] args) {
/*
 1. dto
      class Milk{
      	private int no;  private String name;  private int price;
      }  */  
/*2. dto 를 이용하여 ArrayList + Iterator  이용해서 만들기
 * 		List: index O, 중복허용// add, get, size, remove, contains
 * 
     >>> ArrayList<Milk> */
     List<Milk> milk1 = new ArrayList<Milk>();
     milk1.add(new Milk(1,	"white",	1000));
     milk1.add(new Milk(2,	"choco",	1200));
     milk1.add(new Milk(3,  "banana",	1300));
     
     System.out.println(" ======================\r\n"
     		+ " NO	NAME	PRICE\r\n"
     		+ " ======================");
     Iterator <Milk> iter1 = milk1.iterator();
     while(iter1.hasNext()) {
    	 Milk temp = iter1.next();
    	 System.out.println(temp.getNo() +"\t"+ temp.getName() +"\t"+ temp.getPrice());
     }
     
		/*3. dto 를 이용하여 HashSet   + Iterator  이용해서 만들기
     >>> HashSet<Milk>  */
     // 		Set: index X, 중복비!!!허용// add, get안됨, size, remove, contains
		Set<Milk> milk2 = new HashSet<>();
		milk2.add(new Milk(1,	"white",	1000)); //new로 만들깨 heap area에서
		milk2.add(new Milk(2,	"choco",	1200)); //add(주소값)
		milk2.add(new Milk(3,	"banana",	1300));
		milk2.add(new Milk(3,	"banana",	1300));
		//System.out.println(milk2.size()); ->3개나옴. 위에서 해시코드 생성하고 중복값 걸르는거 만들어서
		
		System.out.println(" ======================\r\n"
	     		+ " NO	NAME	PRICE\r\n"
	     		+ " ======================");
		Iterator <Milk> iter2 = milk2.iterator();
	     while(iter2.hasNext()) {
	    	 Milk temp = iter2.next();
	    	 System.out.println(temp.getNo() +"\t"+ temp.getName() +"\t"+ temp.getPrice());
	     }
		
     
		/*4. dto 를 이용하여 HashMap   + Iterator  이용해서 만들기
     >>> HashMap<Integer, Milk>     */
		Map<Integer,Milk> map = new HashMap<>();
		//Map : Map<Key: Integer: 객체, Value:Milk: 객체>    put, get(key), size, remove, contains
		map.put(1, new Milk(1,	"white",	1000));
		//Key: 		Integer i  = 1;						- Wrapper - boxing
		//Value: 	Milk  milk = (1, "White", 1000)		- Wrapper - boxing
		map.put(2, new Milk(2,	"choco",	1200));//add 주소값
		map.put(3, new Milk(3,	"banana",	1300));
		
		System.out.println(map.entrySet());
		//[1=Milk [no=1, name=white, price=1000], 2=Milk [no=2, name=choco, price=1200], 3=Milk [no=3, name=banana, price=1300]]
		
		Iterator <Entry<Integer,Milk>> iter3 = map.entrySet().iterator(); //1 모으기.
		while(iter3.hasNext()) {
			Entry <Integer,Milk> key_value = iter3.next();
			System.out.println(key_value.getKey());
			System.out.println(key_value.getValue());
			Milk temp = key_value.getValue();
			//Milk temp = map.get(key_Value.getKey());		map에서 key를 넣으면 값이 나옴;
			System.out.println( temp.getNo() +"\t"+ temp.getName() +"\t"+ temp.getPrice() );
			
		}
		
		
		



/*ㅁ 출력된결과   (3번이 나와야함)
 ======================
 NO	NAME	PRICE
 ======================
 1	white	1000
 2	choco	1200
 3	banana	1300
 */
		
		
		
	}//main
}//class
