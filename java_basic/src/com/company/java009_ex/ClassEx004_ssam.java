package com.company.java009_ex;

import java.util.Scanner;

//1. 클래스는 부품객체
//2. 클래스는 상태(멤버변수)와 행위(멤버함수)
//3. 생성자호출 초기화
class TV{
	//상태-멤버변수  채널/볼륨
	String channel; int volume;
	//행위-멤버함수 채널, 볼륨 입력: input() / 출력 : show()
	void input() {  
		//변수-입력-처리-출력
		Scanner scanner = new Scanner(System.in);
		System.out.print("* channel입력>"); this.channel= scanner.next();
		System.out.print("* volume 입력>"); this.volume= scanner.nextInt();
	}
	void  show() { System.out.println(this.channel + "\t" + this.volume); }
	TV(String channel, int volume){ this.channel=channel;  this.volume=volume;}
	TV(){}  //기본생성자: TV() 컴파일러 기본 자동생성, 
	        //but,,,,, 생성자를 개발자가 손대는순간 자동생성취소
}
public class ClassEx004_ssam {
    public static void main(String[] args) {
		TV  t1 = new TV("JDBC" , 8);
		t1.show(); 
		TV  t2 = new TV();
		t2.input();  t2.show();
	}
}





/*
class TV{
//상태-멤버변수  : 채널/볼륨 String channel; int volume;	
//행위-멤버함수  : 채널, 볼륨 입력: input() / 출력 : show()
}
public class ClassEx004 {
    public static void main(String[] args) {
		TV  t1 = new TV("JDBC" , 8);
		t1.show(); 
		TV  t2 = new TV();
		t2.input();  t2.show();
	}
}
출력내용 :
JDBC	8

* channel입력>youtube
* volume 입력>10
youtube	10
*/