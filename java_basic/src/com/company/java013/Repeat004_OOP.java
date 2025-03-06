package com.company.java013;

//Q12 Dto 역할 하는 A
class A{
	private String name;
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	public A(String name) {super();this.name = name;}
	public A() {super();}
	@Override
	public String toString() {return "A [name=" + name + "]";}
	
}
//Q13 클래스배열
public class Repeat004_OOP {
	public static void main(String[] args) {
		A[] arr = new A[3]; //arr[null, null, null]
		arr[0] = new A();
		arr[1] = new A();
		arr[2] = new A();
		//주의! 생성자를 호출해 인스턴스변수를 사용가능하게 만들어야함.
		//향상된포문으로도 쓸수있음 for(int i=0; i<arr.length;i++) {System.out.println(arr[i]);}
		for(A a : arr) {System.out.println(a);}
	}//
}//
//Q14 상속시 부모메서드와 같은 메서드를 무엇이라고 하는가?
//		오버라이딩