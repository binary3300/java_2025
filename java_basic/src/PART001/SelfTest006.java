package PART001;

import java.util.Scanner;

public class SelfTest006 {
public static void main(String[] args) {
	int kor;
	Scanner scan = new Scanner(System.in);
	
	System.out.print("[1]국어점수를입력해주세요 __");
	kor = scan.nextInt();
	
	if(kor >= 90) {System.out.println("수");}
	else if(kor >= 80) {System.out.println("우");}
	else if(kor >= 70) {System.out.println("미");}
	else if(kor >= 60) {System.out.println("양");}
	else{System.out.println("가");}

	scan.close();
}
}
