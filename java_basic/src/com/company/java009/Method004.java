package com.company.java009;

public class Method004 {
	
	public static void show(int a) {System.out.println(a*10);}
	public static void show(int a , int b, int c) { System.out.println(a*100 + "\t" + b*100 + "\t" + c*100 + "\t"); }
	
	public static void main(String[] args) {
		int[] a= {1,2,3};
		//[heap]1번지{0:1, 1:2 ,2:3}← [stack]a:1번지
		
		//1
		show(a[0]); //10출력
		//2
		show( a[0], a[1], a[2] ); //100 200 300출력
		//public static void( int a, a[1], a[2] ){}
		
		//1. 위에 메서드 작성
		//2. 메서드 이름이 같고 마라미터가 다르면? 오버로딩
		
		//1
		//public static 자료값 show(a[0]){ 할일? };
		//public static void(=으로 답을 구하는것이 없다)  show(a[0]){ 프린트 *10 };
		//public static void show(int a){Ststem.out.print(a*10);};
		
		//2
		show(1, 2, 3);
		show(a[0], a[1], a[2]);
		
		
		
	}
}
