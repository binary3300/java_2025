package PART001;

import java.util.Scanner;

public class SelfTest007 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	char A = ' ';
	
	System.out.println("a,b,c중에 입력해주세요");
	A = scan.next().charAt(0);
	
	switch (A) {
	case 'a': case 'A': System.out.println("apple"); break;
	case 'b': case 'B': System.out.println("banana"); break;
	case 'c': case 'C': System.out.println("coconut"); break;
	
//	if(A == 'a' || A == 'A') {}
//	else if(A == 'b' || A == 'B') {}
//	else if(A == 'c' || A == 'C') {}
//	else {System.out.println("A, B, C 중에서 입력해주세요");}

	}
}
}
