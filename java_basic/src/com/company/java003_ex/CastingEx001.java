package com.company.java003_ex;

import java.util.Scanner;

public class CastingEx001 {
	public static void main(String[]args) {
		//변수
		int first, second, summit;
		Scanner scan = new Scanner (System.in);
		//입력
		System.out.print("숫자를 입력해주세요> ");
		first = (int) scan.nextFloat();
		System.out.print("숫자를 입력해주세요> ");
		second = (int) scan.nextFloat();
		//처리
		summit = first / second;
		//출력
		System.out.print(summit);
		scan.close();
	}
}
