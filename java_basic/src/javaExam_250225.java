import java.util.Scanner;

public class javaExam_250225 {
	public static void main(String[] args) {
		/* 1. 자바의 자료형은(기본형/참조형)로 분류된다
		 * 2. 자바의 기본형은( boolean(대문자로 쓰면 안돼요~), true/false, byte, short, int, long, float, double / char)가 있다.
		 * 3. 자바의 형 변환은 (true/false)빼고 기본형에서 가능하다.
		 * 4. ch가 대문자일 경우 조건식 작성
		 * 		'A' <= ch <= 'Z'	('A' <= ch && ch <= 'Z' )
		 * 5. ch가 소문자일 경우 조건식 작성
		 * 		'a'<= ch <='z'		('a'<= ch && ch <='z')
		 * 6. a가 1~100 사이일 경우 조건식 작성
		 * 		 1 <= a <= 100 		(1 <= a && a <= 100)
		 * */
		
		
		//class1
		char a = ' ';
		Scanner scan = new Scanner(System.in);
		System.out.println("알파벳을 하나 입력해주세요");
		a = scan.next().charAt(0);
		
		if(a == 'a') {System.out.println("apple");}
		else if(a == 'b') {System.out.println("banana");}
		else if(a == 'c') {System.out.println("coconut");}
		
		//class2
		char a1 = 0;
		System.out.println("알파벳을 하나 입력해주세요");
		a1 = scan.next().charAt(0);
		
		switch(a1) {
		case 'a': {System.out.println("apple");} break;
		case 'b': {System.out.println("banana");} break;
		case 'c': {System.out.println("coconut");} break;
		}
		
		//class3
		for(int i=10; i<=30; i+=10) {System.out.println(i);}
		
		int i = 0;
		while(i<=30) {System.out.println(i);  i+=10;}
		
		do {System.out.println(i);  i+=10;} while(i<=30);
		
		//????왜 4번 안했지??
		//class4
		int[] arr= {1, 2, 3};
		
		for(int j = 0; j<arr.length; j++) {System.out.println(arr[j]);}
		
		
		scan.close();
	}//
}//
