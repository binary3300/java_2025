package com.company.java015;

import java.util.ArrayList;
import java.util.List;

//1. Dto (데이터 전달: 생성자, toString, getters/setters)

class Milk{
	private int Mno;
	private String name;
	private int mprice;
	
	public Milk() { super();  }
	public Milk(int mno, String name, int mprice) { super(); Mno = mno; this.name = name; this.mprice = mprice; }
	@Override public String toString() { return "Milk [Mno=" + Mno + ", name=" + name + ", mprice=" + mprice + "]"; }
	public int getMno() { return Mno; }
	public void setMno(int mno) { Mno = mno; }
	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
	public int getMprice() { return mprice; }
	public void setMprice(int mprice) { this.mprice = mprice; }
	
}


//main class
public class Collection002 {
	public static void main(String[] args) {
		//2. Milk자료형으로 ArrayList 동적배열만들기 milks
		List<Milk> milks = new ArrayList<>();
		
		//3. data넣기
		milks.add(new Milk(1, "white", 1200));
		milks.add(new Milk(2, "chocolate", 1800));
		milks.add(new Milk(3, "banana", 1400));
		
		//4. 출력
		for(int i=0; i<milks.size();i++) {
			Milk temp = milks.get(i);
			System.out.println( temp.getMno() + "/" + temp.getName() + "/" + temp.getMprice());
			}
		System.out.println("-------------------------------------");
		
		//4번의 결과를 향상된 for문으로
		for(Milk temp : milks){ //for(꺼내올 자료형 a : 배열 or list)
			System.out.println(temp.getMno() + "/" + temp.getName() + "/" + temp.getMprice());
		}
		
		
		
		
		
		
	}//main
}//class
