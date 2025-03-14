package com.company.java019;

//1. 프로세스- 실행중인 프로그램
//2. 자원 + Thread(작업수행)
//3. 작업수행 클래스~!!!! 1)Thread 상속/'Runnable'  2단계)run 해야할 일 3)start 실행

class Animal{} // "class DogSound extends Animal, Thread" 라는건 안도ㅑㅐ~~!!!
class DogSound extends Animal implements Runnable { //1)Thread 상속/'Runnable' 이렇게 이미 상속받은 클래스가 있다면 Thread를 상속받지 못하니까 Runnable을 이용해서 구현한다!!!!
	@Override public void run() { //2단계)run 해야할 일
		try { Thread.sleep(10); } catch (InterruptedException e) {  e.printStackTrace(); }
		
		for(int i=0; i<5;i++) {
		System.out.println("멍....");
		try { Thread.sleep(100); } catch (InterruptedException e) {  e.printStackTrace(); }
		}
	}
}


//Runnable class
public class Thread003_Runnable {
	public static void main(String[] args) {//﻿੯∙̀͡u\
		Thread sound = new Thread( new DogSound() ); sound.start();
		
		Thread count = new Thread( new Runnable() { //#1 Runnable
			@Override public void run() { //#2 run todo
				for(int i=0; i<5;i++) {
					System.out.println(i + " 마리");
					try { Thread.sleep(100); } catch (InterruptedException e) {}
				}
			}
		}); count.start();
		
		
		for(int i=0; i<5;i++) {
			System.out.print("(´ᴥ`) ");
			try { Thread.sleep(100); } catch (InterruptedException e) {}
		}
		
		
	}//
}//
