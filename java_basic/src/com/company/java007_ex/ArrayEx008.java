package com.company.java007_ex;

import java.util.Arrays;

public class ArrayEx008 {
	public static void main(String[] args) {
		/* 
		 * 1. 평균 구하시오
		 * 2. 합격,불합격= 평균이 60점 이상은 합격, 아니면 불합격
		 * 3. 장학생= 평균 95점 이상이면 장학생처리
		 * =======================
		 * 이름		국어 영어 수학 평균 합격여부 장학여부
		 * =======================
		 * 아영맨		~~~~~~~~~~~~~~~~~~합격     장학생
		 * 헐크  ```````````````````````````````----
		 * 캡
		 * 토르
		 * 호크
		 * */
		
		String[] name = {"아이언맨", "헐크", "캡틴", "토르", "호크아이"};
		int[] kor= {100, 20, 90, 70, 35};
		int[] eng= {100, 50, 95, 80, 100};
		int[] mat= {100, 30, 90, 60, 100};
		int[] aver= new int[5];
		String [] pass= new String[5]; //합격/불합격이라는 단어가 담겨야하니까 char보다 긴 String으로 했다
		String [] jang= new String[5];
		
		
		//1. 평균 구하기
//		aver[0] = ( kor[0]+eng[0]+mat[0] )/3;
//		aver[1] = ( kor[1]+eng[1]+mat[1] )/3;
//		aver[2] = ( kor[2]+eng[2]+mat[2] )/3;
//		aver[3] = ( kor[3]+eng[3]+mat[3] )/3;
//		aver[4] = ( kor[4]+eng[4]+mat[4] )/3;
		
		//aver[i] = ( kor[i]+eng[i]+mat[i] )/3;
				
				
		for(int i=0; i<kor.length; i++) {aver[i] = (kor[i]+eng[i]+mat[i])/3;}
		//for(int i=0; i<kor.length; i++) { System.out.println(aver[i]);}
		
		
		//2. 합격불합격
		
		for(int i=0; i<kor.length; i++) {
			if(aver[i] >=60) {pass[i] = "합격";}
			else { pass[i]="불합격" ;}
		}			
					
	
		
//		
//		if( aver[i] <= 60 ) { System.out.println("합격"); }
//		else {System.out.println("불합격");}
//		
//		//3. 장학생
		for(int i = 0; i < aver.length; i++) {
		if( aver[i]>=95 ) { jang[i] = "장학생"; }
		else { jang[i] = "-"; }
		}
//		
//		
		
		
//		
//		System.out.println(Arrays.toString(name));
//		System.out.println(Arrays.toString(kor));
//		System.out.println(Arrays.toString(eng));
//		System.out.println(Arrays.toString(mat));
//		System.out.println(Arrays.toString(aver));
//		System.out.println(Arrays.toString(pass));
//		System.out.println(Arrays.toString(jang));
//		
		System.out.println("=========================================================");
		System.out.println("이름\t국어\t영어\t수학\t평균\t합격여부\t장학여부");
		//System.out.printf("%s\t %d\t %d\t %d\t %d\t %s\t %s", name[i], kor[i], [i], mat[i], aver[i], pass[i], jang[i] );
		System.out.println("=========================================================");
		for(int i=0; i<kor.length;i++) {System.out.println(name[i] +"\t"+ kor[i] +"\t"+ eng[i] +"\t"+ mat[i] +"\t"+ aver[i] +"\t"+ pass[i] +"\t"+ jang[i]);}
		System.out.print("=========================================================");
	}//
}//그래도 끝내니까 맘이 든든하다
