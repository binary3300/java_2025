package com.company.java019_ex;

import javax.swing.JOptionPane;

//방법1) Thread  1)Thread 2)run 실행하는내용 3) start실행 
class QuestionCount extends Thread{ //#1
//~~~~class QuestionCount implements Runnable 로 했을때~~~~
	@Override public void run() {
		for(int i=10; i>0; i--) {//#2
		System.out.println(i);
		try {Thread.sleep(1000);} catch (InterruptedException e) {e.printStackTrace();}
		}
	}
}


//
public class ThreadEx001_ssam {
	public static void main(String[] args) {
		Thread count = new CountDown(); count.start();//#3
		
		String answer = JOptionPane.showInputDialog("사과의 영어 알파벳을 입력하세요");
		System.out.println(answer);
		
		if(answer.equals("apple")){//정답이라면
				System.out.println("정답입니다");
					}
				else {System.out.println("정답이 아닙니다");
				System.out.println("main-end");
		}
//문제점! 1)정답 말했는데 안멈춤! 2)main끝났는데 다른프로세스 실행중~~		
		
		
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
