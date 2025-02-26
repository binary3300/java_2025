package com.company.java008;

public class Repeat004 {
	public static void main(String[] args) {
		//선생님 풀이 보고 같이 따라함
		//int arr2 = new int [][];
		
		int[][] arr2 = new int[2][3];
									// 00 01 02
									// 10 11 12
		arr2[0][0] = 10;
		arr2[0][1] = 20;
		arr2[0][2] = 30;

		arr2[1][0] = 50;
		arr2[1][1] = 60;
		arr2[1][2] = 70;
		
		
		//for(int ch=0; ch<arr2.length; ch++) { for( int kan=0; kan<arr2[ch].length; kan++ ) {  System.out.println(arr2[ch][kan]);  } }
		
		
		
		for(int ch=0; ch<arr2.length; ch++) { //[여기. 층][] 의 규칙
			for( int kan=0; kan<arr2[ch].length; kan++ ) { //[][여기. 칸]의 규칙
				System.out.println(arr2[ch][kan]); //층에서 칸까지 다 돌고 할 일(출력)
				}
			}//하 데이터도 헤야하는거 아는데ㅠㅠ아니다 울지말고하자 아직초보인데 하기싫어하면어떡해 
		
		/* 	
		 * int data= 10;
		arr2[0][0] = data; +=data;
		arr2[0][1] = data; +=data;
		arr2[0][2] = data; +=data;  여기까지 오면 최종값은 40이 된다. 
		
		data= 50;  저 위에서 40이 됐는데, 이 배열에선 그걸 원하지 않기때문에 다시 초기화해준다.
		arr2[1][0] = data; +=data;
		arr2[1][1] = data; +=data;
		arr2[1][2] = data; +=data;
		 *  */
		
		int data= 10;
		for(int ch=0; ch<arr2.length; ch++) { //[여기. 층][] 의 규칙
			for( int kan=0; kan<arr2[ch].length; kan++ ) { //[][여기. 칸]의 규칙
				arr2[ch][kan]=data; data+=10; //층에서 칸까지 다 돌고 할 일(출력)
				}
				}
	}//
}//
