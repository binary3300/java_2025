package com.company.java015_ex;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

class Score{
	private String name; private int kor, eng, math;

	public Score() { super();  }
	public Score(String name, int num1, int num2, int num3) { super(); this.name = name; this.kor = num1; this.eng = num2; this.math = num3; }
	@Override public String toString() { return "Score [name=" + name + ", num1=" + kor + ", num2=" + eng + ", num3=" + math + "]"; }
	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
	public int getNum1() { return kor; }
	public void setNum1(int num1) { this.kor = num1; }
	public int getNum2() { return eng; }
	public void setNum2(int num2) { this.eng = num2; }
	public int getNum3() { return math; }
	public void setNum3(int num3) { this.math = num3; }
	@Override public int hashCode() { return Objects.hash(name, kor, eng, math); }
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Score other = (Score) obj;
		return Objects.equals(name, other.name) && kor == other.kor && eng == other.eng && math == other.math;
	}
	
}


//main class
public class SetEx004 {
	public static void main(String[] args) {
		/* 연습문제3)  Collection  Framework
			패키지명 : com.company.java015_ex
			클래스명 : SetEx004
			1. HashSet 만들기  
			2. 아래데이터 넣기
			scores.add(new  Score("아이언맨",30,40,50)); 
			scores.add(new  Score("아이언맨",30,40,50)); 
			scores.add(new  Score("아이언맨",30,40,50)); 
			scores.add(new Score("헐크"   ,40,60,70)); 
			scores.add(new  Score("캡틴",80,90,100));
			> 갯수는 3개로 나오게 만들기   ( hashCode, equals)
			3. Iterator로 출력하기 - 사용자정보,총점, 평균*/
		
		HashSet<Score> scores = new HashSet<>();
		scores.add(new  Score("아이언맨",30,40,50)); 
		scores.add(new  Score("아이언맨",30,40,50)); 
		scores.add(new  Score("아이언맨",30,40,50)); 
		scores.add(new Score("헐크"   ,40,60,70)); 
		scores.add(new  Score("캡틴",80,90,100));
		
		System.out.println("유저수: " + scores.size());
		
//		Iterator<Score> iter = scores.iterator(); //1. set모으기!
//		while(iter.hasNext()) { //2. 처리대상 확인!
//			Score s = iter.next();
//			System.out.println(s.getName()+"/"+ s.getNum1()+"/"+s.getNum2()+"/"+s.getNum3());
//		}
		
		/*3. Iterator로 출력하기 - 사용자정보,총점, 평균*/
		
		Iterator<Score> iter = scores.iterator(); //1. set모으기!
		
		System.out.println("["+"이름" + "\t"+ "국어" + "\t"+ "영어" +"\t"+ "수학" +"\t"+"총점" +"\t"+"평균" +"]");
		while(iter.hasNext()) { //2. 처리대상 확인!
			Score s = iter.next();
			int total = s.getNum1() + s.getNum2() + s.getNum3();
			double avg = total/3.0;
			
			System.out.println(
					s.getName()+"\t"+ s.getNum1()+"\t"+s.getNum2()+"\t"+s.getNum3() +
					"\t" + total + "\t" + avg
					);
		}
		
		
		
		
		
		
		
	}//main
}//class
