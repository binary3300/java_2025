package com.company.java019;

//1 프로세스 - 실행중인 프로그램
//2 프로세스 = 자원 + Thread(실제작업)
//Synchronized

//#1 공유자원
class Rank{
	int num = 0;
	public synchronized void plusnum() {
		int rank=num;
		try { Thread.sleep(3000); } catch (InterruptedException e) {  e.printStackTrace();}
		num=rank+=1; //등수 올리기
	}
}

//#2. 실행클래스
class User extends Thread{
	Rank rank; //각 유저마다 몇등이야.
	public User(Rank rank) { this.rank=rank; }
	@Override public void run() {
		rank.plusnum();//등수올리기
		System.out.println(rank.num + "번>> " + super.getName()); //Thread가 가지고있는 getName()라서 호출해서 쓸수있음
	}
}


public class Thread005_Synchronized {
public static void main(String[] args) {
	Rank rank = new Rank(); //공유자원 num=1, num=2,,,, 등수
	
	Thread user1 = new User(rank); user1.setName("루루"); user1.start();//몇번째인지
	
	try { Thread.sleep(1000); } catch (InterruptedException e) {  e.printStackTrace(); }
	
	Thread user2 = new User(rank); user2.setName("냄비"); user2.start();//몇번째인지
	
	
	
	
	}//
}//



/*
	Synchronized		before)
			 공용공간
user1	#1→	[Rank: num  (1) ]		←#2	user2
루루								냄비
		#3출력						#바뀌지않고 그대로 똑같이 출력

1번>> 루루
1번>> 냄비

==========================================

	Synchronized		after)
user1	#1(1가져옴)			→	[Rank: num(1) ]		←#3	user2
루루		#2(1출력하기위해갖고있음)						#4냄비

						↓↓↓↓↓↓↓↓↓↓

	Synchronized		after)
user1	#1(1갖고있음)			→	[Rank: num(2) ]		←#3(2가져옴)	user2
루루		#2(1출력하기위해갖고있음)						#4(2출력하기위해갖고있음)냄비




Thread클래스가 작동중인동안에는 Rank클래스가 작동할 틈이 없었는데
synchronized를 Rank클래스에 붙여주면
Thread클래스가 작동하는동안에 Rank로 같이 싱크로하면서 동일한 순서로 작동하게 만들어준다!


 */












