package com.company.java019;

import java.awt.Toolkit;

//1. 프로세스- 실행중인 프로그램!
//2. 자원+Thread(작업수행)
//3. 작업수행클래스 1)상속,Runnable 2)run() 해야할 일 구현 3)start() 실행한다!

class PigSound extends Thread { // #1 상속 Run 해야할 일	extends Thread를 만들고 그 안에서 오버라이드 만드는 그거
	@Override public void run() {//#2 해야할 일
		try { Thread.sleep(10); } catch (InterruptedException e) {  e.printStackTrace(); }
		
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i =0; i<5; i++) {
			toolkit.beep();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {  e.printStackTrace(); }
		}
	}//#1. 상속 Thread(작업수행 클래스)	
} //PigSound class end

class PigCount extends Thread{ //1단계 작업수행클래스 상속!
	@Override public void run() { //2단계 run에 해야할 일 작성
		for(int i=1; i<=5; i++) {
		System.out.println(i + " 마리 꿀...");
		try { Thread.sleep(1000); } catch (InterruptedException e) {  e.printStackTrace(); }
		}
	}
	
}

//아래로 메인클래스
public class Thread002 {
	public static void main(String[] args) { //1개의 스레드
		//여러가지 일을 동시에! ˙Ꙫ˙  ˙Ꙫ˙  ˙Ꙫ˙  ˙Ꙫ˙  ˙Ꙫ˙  ˙Ꙫ˙  ˙Ꙫ˙  ˙Ꙫ˙  ˙Ꙫ˙  ˙Ꙫ˙ 
		// ˙Ꙫ˙ 5번
		//#3 작업스레드 3단계
		Thread count = new PigCount(); count.start();
		Thread sound = new PigSound(); sound.start();
		
		for(int i =0; i<5; i++) {
			System.out.print(" ˙Ꙫ˙ ");
			try { Thread.sleep(1000); } catch (InterruptedException e) {  e.printStackTrace(); }
		}
		
		
		
		
		
	}//main
}//class
