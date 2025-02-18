package com.company.java002_ex;

import java.util.Scanner;

public class DataTypeEx003 {
	public static void main(String []args) {
		float pie = 0.0f; 
		Scanner scan = new Scanner (System.in);
		System.out.print("파이 값을 입력하세요>"); pie = scan.nextFloat();
		System.out.print("파이값은 " +pie+ "입니다.\n");
		System.out.printf("파이값은 %f입니다 \n", pie);
		System.out.printf("파이값은 %.2f입니다 \n", pie);
		System.out.printf("파이값은 %.3f입니다 \n", pie);
		scan.close();
	}
}
