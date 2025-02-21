package com.company.java004_ex;

import java.util.Scanner;

public class SwitchEx002 {
	public static void main(String[]args) {
		int a;
		System.out.println("숫자를 하나 입력해주세요");
		
		//입력
		Scanner scan = new Scanner (System.in);
		a = scan.nextInt();
		//판단
		switch(a) {
		case 3: case 4: case 5 :System.out.println("봄"); break;
		case 6: case 7: case 8 :System.out.println("여름"); break;
		case 9: case 10: case 11 :System.out.println("가을"); break;
		case 12: case 1: case 2 :System.out.println("겨울"); break;
		
		}
		//루루
		//case 3, 4, 5:    이런 표기도 맞긴 함 틀리진않음
		//case 6, 7, 8:		하지만!
		//case 9, 10, 11:	이건 높은버전의 자바만 되는거라서 실무에서 쓰면 적용 안되는경우가 많음
		//case 12, 1, 2: 	모든 회사가 최신형 자바를 쓰는게 아니다!! 호환성에 문제 생길수도 있으니 case를 일일히 쓰는 방향으로 가자
		
		scan.close();
		
	}//메인끝
}//클래스끝
