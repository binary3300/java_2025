package com.company.java002_ex;

import java.util.Scanner;

public class DataTypeEx002 {
	public static void main(String[]args) {
		//변수 
		int a = 0;
		//입력
		Scanner scanner = new Scanner(System.in);
		System.out.print("좋아하는 숫자를 입력 >");
		a = scanner.nextInt();
		//출력 (처리는 지금 없어서 생략)
		System.out.println("좋아하는 숫자는: " + a + " 입니다.");
		
		
		
		scanner.close();
	}
}
