package com.company.java012;


/*
 * 	Object						Object
 * 	  △							  △	
 * test A(int a)			test A(int a)
 */

class testA extends Object{		int a; }
class testB extends Object{		int b; }

public class Poly001 {
	public static void main(String[] args) {
		testA v110 = new testA();
//		testB v220 = v110; //Type mismatch: cannot convert from testA to testB
		//오류나는 이유는?
		//Type mismatch: cannot convert from testA to testB
		//클래스도 자료형(틀- Object)
	}//main
}//class
