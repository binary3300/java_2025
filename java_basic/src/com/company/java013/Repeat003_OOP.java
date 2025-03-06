package com.company.java013;

/* Q)8 DTO
 * 8-1 private(클래스내부) - getters/setters
 * 8-2 객체의 상태를 표현하는 출력- toString
 */

class Car4 extends Object{
	private String color;

	public Car4() {super();}
	@Override public String toString() {return "Car4 [color=" + color + "]";}
	//9-1
	public String getColor() {return color;}
	public void setColor(String color) {this.color = color;}
}


/*
 * Q10) 클래스를 상속하는 이유:
 * 		클래스의 재사용
 * Q11) 상속의 형식?
 * 		class A 자식클래스 extends 부모클래스
 */


public class Repeat003_OOP {
	public static void main(String[] args) {
		
	}//
}//
