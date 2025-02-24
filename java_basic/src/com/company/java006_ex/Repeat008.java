package com.company.java006_ex;

public class Repeat008 {
	public static void main(String[]arge) {
		/*
		int count = 1;
		
		for(int i=1; i<=10; i++) {if(i%3==0)count++;}
		System.out.println(count);
		
		*<1번>
		* 1이 3의 배수라면 합을 더해서 변수에 누적
		* 2가 3의 배수라면 합을 더해서 변수에 누적
		* ,,
		* ,,
		* ,
		* ,
		*
		*<2번>
		*if (1이 3의 배수라면) {합을 더해서 변수에 누적}
		*if (2가 3의 배수라면) {합을 더해서 변수에 누적}
		*if (3이 3의 배수라면) {합을 더해서 변수에 누적}
		*,,,
		*,,
		*,
		*/
		
		//변수
		int sum=0;
		
		//입력, 처리
		//if(1%==0) {sum +=1;} //
		//if(2%==0) {sum +=2;} //
		//if(3%==0) {sum +=3;} //<2번>을 코드로 바꾼것
		
		for(int i=1; i<=10; i++) {if(i%3==0) { sum +=i;}}
		System.out.println("1~10까지 3의 배수의 합: " + sum + "\n");
		
		sum=0; int i=1;
		while(i<=10) {if(i%3==0) { sum +=i;} i++;}
		System.out.println("1~10까지 3의 배수의 합: " + sum + "\n");
		
		sum=0; i=1;
		do { if(i%3==0) { sum +=i;} i++;} while(i<=10);
		System.out.println("1~10까지 3의 배수의 합: " + sum + "\n");
		
		//출력
		
		
		
		
		
	}

}
