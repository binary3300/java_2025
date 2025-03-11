package com.company.java016;

class Coffee{
	String name; int price, num;

	public Coffee() { super();  }
	public Coffee(String name, int price, int num) { super(); this.name = name; this.price = price; this.num = num; }
	@Override public String toString() { return "Coffee [name=" + name + ", price=" + price + ", num=" + num + "]"; }
	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
	public int getPrice() { return price; }
	public void setPrice(int price) { this.price = price; }
	public int getNum() { return num; }
	public void setNum(int num) { this.num = num; }
	public void show() {}
}


public class Repeat001_oop1 {
	public static void main(String[] args) {
/*=====커피
커피명 : 까페라떼
커피잔수 : 2
커피가격 : 4000
=====커피
커피명 : 아메리카노
커피잔수 : 1
커피가격 : 2000 */
		Coffee a1 = new Coffee("카페라떼", 2, 4000);
		a1.show();
		Coffee a2 = new Coffee();
		a2.show();
		
	}//
}//
