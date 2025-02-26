package com.company.java008_Ex;

import java.util.Scanner;

public class MethodEx004 {
	
	//총점
	public static int process_total(int kor , int eng, int math){return kor + eng + math;}
	
	//평균
	public static float process_avg(float total){return total / 3f;}
	
	//합격
	public static String process_pass(float avg ,int kor,int eng,int math){ 
		return avg<60? "불합격": kor<40 || eng<40 || math<40? "재시험": "합격" ;
	}
	/* String result = "불합격";
	 * if(avg>=60 && kor>=40 && eng>=40 && math>=40){result = "합격";}
	 * else if(kor<40 || eng<40 || math<40 ){result = "재시험";}
	 * else{"불합격";}
	 * */
	
	//장학생여부
	//이프나 3문항쓸때 부정을 먼저 쓰면 조금 더 식이 간단해진다 avg<95?"---":"장학생"
	public static String process_scholar(float avg ){return avg >= 95? "장학생": "" ;}
	
	//별점
	//다음에 repeat로 더 짧게 만들어볼수있다 해보자
	public static String process_star(float avg){ 
		String result="";
		//70점대이면 별7개, 80점대이면 별8개, 90점대이면 별9개 , 100점이면 별10개  
		//88/10= 8  92/10=9
		for(int i=0; i<(int)avg/10; i++) { result+="★"; }
		
		return result;
	}
	
	//출력
	//있는거 그냥 출력만 하니까 void입니다 아자자화이팅
	public static void process_show(String name, int kor, int eng, int math,int  total,float avg, String pass,String jang, String star){
		System.out.printf("%s\t%d\t%d\t%d\t%d\t%.2f\t%s\t%s\t%s\t",name, kor, eng, math, total, avg, pass, jang, star); 
	}
	
	//이 아래로 메인이다
	public static void main(String[] args) {
		
		
//(1)  변수
	String name  = ""; 
	int kor, eng, math, total ;
	float avg = 0.0f; 
	String pass = "";
	String jang = "";
	String star= ""; 
	String level_kor="" , level_eng="" , level_math="";
	String re = "";
	Scanner scanner = new Scanner(System.in);

//(2) 입력 : 이름, 국어, 영어, 수학점수를 입력받으시오.

	System.out.println("이름을 입력하세요: "); name = scanner.next();
	System.out.println("국어점수를 입력하세요: "); kor = scanner.nextInt();
	System.out.println("영어점수를 입력하세요: "); eng = scanner.nextInt();
	System.out.println("수학점수를 입력하세요: "); math = scanner.nextInt();
	
//(3) 처리 : 
	//public static int process_total(kor , eng, math){총점처리}
	//public static int process_total(kor , eng, math){kor + eng + math}
	total = process_total(kor , eng, math);    // 1. 총점처리
	//
	
	//public static float process_avg(total){평균처리}
	//public static float process_avg(total){total/3;}	
	avg = process_avg(total);    //2.  평균처리
	//
	
	//public static String process_pass(avg , kor, eng, math){ 평균이 60이상이니? "합격": 국어>=40 영어>=40 수학>=40? "불합격": 국어<40||영어<40||수학<40?"재시험":"" }
	//3.  합격  평균이60이상이고, 각각 국어, 영어, 수학40이상/불합격/재시험-각각 40미만인게 있다면  
	pass = process_pass(avg , kor, eng, math);  
	//
	//public static process_scholar(float??  avg  ){ avg가 95 이상이면? "장학생": "" }
	//4. 평균이 95점이상이면 장학생
	jang = process_scholar(  avg  ); 
	//
	//public static String process_star(avg){ 70점대이면 별7개, 80점대이면 별8개, 90점대이면 별9개 , 100점이면 별10개  }
	//5. 평균점수대로 별표 붙이기 , 예) 70점대이면 별7개, 80점대이면 별8개, 90점대이면 별9개 , 100점이면 별10개 
	star = process_star(avg);  
//
//
//(4) 출력
	//public static void process_show(name, kor, eng, math, total, avg, pass, jang, star){출력하세요};
	process_show(name, kor, eng, math, total, avg, pass, jang, star);

	
}//이 위로 메인이다.
	
}//
