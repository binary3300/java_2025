package com.company.java013;

/*
Object			Object()			{#3				   		}#4
 △
Parent i, j   Parent (int i,int j)	{#2 		  i=10, j=20}#5
 △
Child k     Child(10,20,30)			{#1					k=30}#6

*/

class Parent extends Object{
	int i, j;
	public Parent() {super();}  //1 뭘 호출했나요? 마우스를 슥 올려보세요 자바가 알려줍니다. Object ()
	public Parent(int i, int j) {
		super(); //2Object ()
		this.i = i;
		this.j = j;
	}
}  
class Child extends Parent{
	int k ;
	public Child() {super();} //3 Parent ()
	public Child(int i, int j,int k) {
		super(i,j); 	 //4  Parent (int i,int j)
		this.k = k;
	}
}


public class Repeat005_OOP_15{

	public static void main(String[] args) {
		
		Child child = new Child(10,20,30);
		System.out.println(child.i);  //10
		System.out.println(child.j);  //20
		System.out.println(child.k);  //30

	}

}
