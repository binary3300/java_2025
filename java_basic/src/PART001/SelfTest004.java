package PART001;

import java.util.Scanner;

public class SelfTest004 {
	public static void main(String[] args) {
		int kor, eng;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("[1]국어 점수를 입력 해 주세요_ ");
		kor = scan.nextInt();
		System.out.print("[2]영어 점수를 입력 해 주세요 _ ");
		eng = scan.nextInt();
		
		if(kor <40) {System.out.println("국어 과락");}
		if(eng <40) {System.out.println("영어 과락");}
		
		
		scan.close();
		
	}
}
