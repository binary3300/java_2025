package com.company.java007_ex;

import java.util.Arrays;

public class Arrey2Ex006 {
	public static void main(String[] args) {
		int[][] datas = { { 10, 10, 10, 10 }, // 00 01 02 03
						{ 20, 20, 20, 20 }, // 10 11 12 13
						{ 30, 30, 30, 30 }, // 20 21 22 23
						};
		int[][] result = new int[datas.length + 1][datas[0].length + 1];

//		for(층 좌표를 움직일 규칙) {세로층의 정보
//			for(칸 좌표를 움직일 규칙) { result[층][칸] } 가로 칸의 정보
//		}ch끝
//
//		result[0][0] = datas[0][0];
//
//		for (int ch = 0; ch < datas.length; ch++) {
//			for (int kan = 0; kan < datas[ch].length; kan++) {
//				result[ch][kan] = datas[ch][kan];
//			}
//		}
//
//		/*
//		 * 출력내용 10 10 10 10 40 20 20 20 20 80 30 30 30 30 120 60 60 60 60 240
//		 */
//
//		result[0][4] += result[0][0];
//		result[0][4] += result[0][1];
//		result[0][4] += result[0][2];
//		result[0][4] += result[0][3];
//		// for(int kan=0; kan<4; kan++) { result[0][4] += result[0][kan] ;}
//
//		result[1][4] += result[1][0];
//		result[1][4] += result[1][1];
//		result[1][4] += result[1][2];
//		result[1][4] += result[1][3];
//		// for(int kan=0; kan<4; kan++) { result[1][4] += result[1][kan]; }
//
//		// for( int kan=0; kan<4; kan++ ) {result[0][4] += result[0][kan];}
//
//		for(int ch=0; ch<datas.length; ch++){
//			for( int kan=0; kan<datas[ch].length; kan++ ) {
//				result[ch][ datas[ch].length ] += result[ch][kan];
//				}
//			}
//
//		for (int ch = 0; ch < datas.length; ch++) { // 1층 정보
//			for (int kan = 0; kan < datas[ch].length; kan++) { // 2층 칸정보
//				result[ch][kan] = datas[ch][kan]; // 데이터 복사해서 넣기
//				result[ch][datas[ch].length] += result[ch][kan]; // 가로방향 데이터 더하기
//			}
//		}
//
//		// 세로방향 데이터 누적
//		// result[3][0] += result[0][0]; result[3][0] += result[1][0]; result[3][0] +=
//		// result[2][0] for1;
//		// result[3][1] += result[0][1]; result[3][1] += result[1][1]; result[3][1] +=
//		// result[2][1] for2;
//		// result[3][2] += result[0][2]; result[3][2] += result[1][2]; result[3][2] +=
//		// result[2][2] for3;
//		// result[3][3] += result[0][3]; result[3][3] += result[1][3]; result[3][3] +=
//		// result[2][3] for4;
//
//		result[3][0] += result[0][0];
//		result[3][0] += result[1][0];
//		result[3][0] += result[2][0]; //끝나는부분마다 ; 를 붙이고 컨트롤 쉬프트 F
//		result[3][1] += result[0][1]; result[3][1] += result[1][1]; result[3][1] +=
//		result[2][1] 
//		result[3][2] += result[0][2]; result[3][2] += result[1][2]; result[3][2] +=
//		result[2][2] 
//		result[3][3] += result[0][3]; result[3][3] += result[1][3]; result[3][3] +=
//		result[2][3] 
//				
//				ㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅜㅠㅜㅠㅜㅠ
//		
//
//		System.out.println(Arrays.deepToString(result));

	}//
}//
