package com.company.java015;

import java.util.ArrayList;
import java.util.Scanner;

class Fruits{
	private int no;   private  String name; private  int price;
	
	public Fruits() { super(); }
	public Fruits(int no, String name, int price) { super(); this.no = no; this.name = name; this.price = price; }
	@Override public String toString() { return "Fruits [no=" + no + ", name=" + name + ", price=" + price + "]"; }
	public int getNo() { return no; }
	public void setNo(int no) { this.no = no; }
	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
	public int getPrice() { return price; }
	public void setPrice(int price) { this.price = price; }
}

public class ListEx004 {
	public static void main(String[] args) {
		ArrayList<Fruits> fruits = new ArrayList<>();
		
		fruits.add( new Fruits(1, "apple" , 2000));
		fruits.add( new Fruits(2, "banana" , 2500));
		fruits.add( new Fruits(3, "coconut" , 4500));
		
		for(int i=0; i<fruits.size();i++) {
			Fruits temp = fruits.get(i);
			System.out.println(temp.getNo()+"/"+temp.getName()+"/"+temp.getPrice());}
		System.out.println("------------------------------------------------------------------");
		for(Fruits temp : fruits) {System.out.println(temp.getNo()+"/"+temp.getName()+"/"+temp.getPrice());}
		System.out.println("------------------------------------------------------------------");
		
		Scanner scan = new Scanner(System.in);
		String[] fruitsinfo = {"사과는 빨갛다", "바나나눈 노랗다", "코코넛은 코코코"};
		System.out.print("1, 2, 3 원하는 과일 번호를 입력>");
		int num = scan.nextInt();
		
		int find = -1;
		//과일꺼내오기->과일번호==입력한 값
		for(int i=0; i<fruits.size(); i++) {
			if(fruits.get(i).getNo()==num){find=i; break;}
		}
		
		System.out.println("번호: "+ fruits.get(find).getNo());
		System.out.println("이름: "+ fruits.get(find).getName());
		System.out.println("가격: "+ fruits.get(find).getPrice());
		System.out.println(fruitsinfo[find]);
		
		
		
		
		
		
		
	}//main
}//class
