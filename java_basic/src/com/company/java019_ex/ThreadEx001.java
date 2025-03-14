package com.company.java019_ex;

import javax.swing.JOptionPane;

class CountDown extends Thread{
	@Override public void run() {
		for(int i=10; i>0; i--) {
		System.out.println(i);
		try {Thread.sleep(1000);} catch (InterruptedException e) {break;} // e.printStackTrace();
		}
	}
}



//
public class ThreadEx001 {
	public static void main(String[] args) {
		Thread cntd = new CountDown(); cntd.start();
		
		String answer = JOptionPane.showInputDialog("사과의 영어 알파벳을 입력하세요");
		System.out.println(answer);
		
		if(answer.equals("apple")) {
			System.out.println("정답입니다~"); cntd.interrupt();
			cntd.interrupt();
		}else {System.out.println("정답이 아닙니다"); cntd.interrupt();}
		System.out.println("메인 카운트다운을 멈춥니다");
		
		
		
	}//
}//





/*
연습문제1)  Thread
패키지명 : com.company.java016_ex
클래스명 : ThreadEx001

1.  QuestionCount  - 10부터 1까지 
      카운트 1초에 10 ,
                2초에 9, 
                3초에  8.....

2. 사과알파벳을 입력하세요.
   사과를 입력을받으면 정답입니다 / 정답이 아닙니다.
  */
