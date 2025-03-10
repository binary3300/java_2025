package com.company.java015_ex;

import java.awt.List;
import java.util.ArrayList;

public class ListEx001 {
	public static void main(String[] args) {
		//1.  ArrayList이용해서 colors 만들기
		ArrayList<String> colors = new ArrayList<>();
		
		//2. red, green, blue 데이터 추가
		colors.add("red");
		colors.add("green");
		colors.add("blue");
		
		//3. 출력
		System.out.println(colors);
		System.out.println(colors.get(0)); //red
		System.out.println(colors.get(1)); //green
		System.out.println(colors.get(2)); //blue
		System.out.println();
		
		for(int i=0; i<colors.size(); i++) {System.out.println(colors.get(i));}
		
		
		
//		ArrayList colors = new ArrayList();
//		colors.add("red");
//		colors.add("green");
//		colors.add("blue");
//		System.out.println(colors);
		
		
		
		
		
	}//
}//
