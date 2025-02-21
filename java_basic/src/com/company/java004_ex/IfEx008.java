package com.company.java004_ex;

import java.util.Scanner;

public class IfEx008 {
	//성적처리 프로그램입니다
	/*1 총점구하기
	 * 2 평균구하기
	 * 3 평균이 60점이상이고 각과목이 40점미만이면 아니라면 합격/아니면 불합격?
	 * 4 평균이 95점이상이면 장학생
	 * 5 평균이 90점 이상이면 수, 80점이상이면 우, 70점이상이면 양, 엘스 가
	 * */
	public static void main(String[]args) {
		//변수 전부int  학번 num,  국어점수 kor,  수학점수 math,  영어점수 eng,  총점 sum,  평균점수 arry,  합격여부 thx,  레벨 lv,  장학생 money;
		int num, kor, math, eng, sum;
		String money, lv, thx;
		float  arry = 0.0f; //선생님 답안 보고 참고. 전에는 int 였음. 이후 f를 붙인 arry는 모두 참고하여 고친것
		
		//입력
		Scanner scan = new Scanner (System.in);
		System.out.println("학번 입력"); num = scan.nextInt();
		System.out.println("국어점수 입력"); kor = scan.nextInt();
		System.out.println("수학점수 입력"); math = scan.nextInt();
		System.out.println("영어점수 입력"); eng = scan.nextInt();
		
		
		//판단
		sum = kor + math + eng;
		arry = sum/3.0f; //float랑 +-*/하는 정수1234657은 .0으로 쓰고 뒤에 f를 붙여야 float로 인식하고 연산이 됨 
		//String arry2 = Integer.toString(arry); 코파일럿한테 물어봤음..
		
		if (arry >=60 && kor < 40 || eng < 40 || math < 40) {thx = "불합격";}
			else{thx ="합격";} 
		
		/*if (arry>=60 && kor >=40 && eng >= 40 && math>=40) {thx = "합격";}
		 * 
		 * */
		
		
		/*if (평균 >= 95) {money = 장학생}
		 * else{money = "-"}
		 * */
		if(arry >= 90) {money = "장학생";}
			else {money = "-";}
		
		/*if (평균>=90) {lv = 수}
		 * else if(평균>=80) {lv = 우}
		 * else if(평균>=70) {lv = 미}
		 * else if(평균>=60) {lv = 양}
		 * else{lv = 가}
		 * */
		if (arry >= 90) {lv = "수";}
		else if (arry >= 80) {lv = "우";}
		else if (arry >= 70) {lv = "미";}
		else if (arry >= 60) {lv = "양";}
		else {lv = "가";}
		
		
		//출력
		/*System.out.println("학번 국어 영어 수학 총점 평균 합격여부 레벨 장학생");
		*System.out.println( num +""+ kor +""+ eng +""+ math +""+ arry +""+ thx +""+ lv +""+ money );
		*/
		System.out.println("학번 \t 국어 \t 영어 \t 수학 \t 총점 \t 평균 \t 합격여부 레벨 \t 장학생");
		System.out.println(num +"\t"+ kor +"\t"+ eng +"\t"+ math +"\t"+ sum +"\t"+ String.format("%.2f", arry)+"\t"+ thx +"\t"+ lv +"\t"+ money);
		
		scan.close();
		//총합의 arry는 선생님 답안 참고함!!!!
	}
}
