package com.company.java007_ex;

public class Array2Ex005 {
	public static void main(String[] args) {
		//1. 다음의 조건을 이용해서 총점과 평군을 구하시오.
		int[][] arr = {
				{1,1,1},	//00 01 02
				{2,2,2},	//10 11 12
				{3,3,3},	//20 21 22
				{4,4,4},	//30 31 32
		};
		
		int total=0; double avg= 0.0;
		
		/* 출력내용
		 * 총점: 3.3
		 * 평균: 2.5
		 * 
		 * */
		
		
		//아래 필기는 모두 선생님풀이
		
		//ver1					ver2						ver3. 이걸 갖고 다음으로 감
		//총점에 00의 데이터 누적	total+= arr[0][0];
		//총점에 01의 데이터 누적	total+= arr[0][1];
		//총점에 02의 데이터 누적	total+= arr[0][2]; ....		for(int kan=0; kan<arr[0].lrngth; kan++){ total+= arr[0][kan]; }
		
		//ver4 각 층 계산
//		for(int kan=0; kan<arr[0].length; kan++){ total+= arr[0][kan]; }
//		for(int kan=0; kan<arr[1].length; kan++){ total+= arr[1][kan]; }
//		for(int kan=0; kan<arr[2].length; kan++){ total+= arr[2][kan]; }
//		for(int kan=0; kan<arr[3].length; kan++){ total+= arr[3][kan]; }
//		
		 for(int ch=0; ch<arr.length; ch++) { //층의 정보
			 for(int kan=0; kan<arr[ch].length; kan++){ //칸의 정보
				 total+= arr[ch][kan];
				 }
			 //한 층이 끝나고 할 일
			 }
		 
		 avg= (double)total/( arr.length * arr[0].length ); 
		 
		
		System.out.println( "총점: " + total );
		System.out.println( "평균: " + avg );
		
		
		
	}//
}//
