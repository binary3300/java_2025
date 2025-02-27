import java.util.Scanner;

public class java_boxp_0227 {
	
	public static void hi(){ System.out.println("hi");}
	
public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	
	//Repeat1
	System.out.println("if 입력");
	char ifch = scan.next().charAt(0);
	if(ifch=='j') {System.out.println("java");}
	else if(ifch=='h') {System.out.println("html");}
	else if(ifch=='c') {System.out.println("css");}
	
	//Repeat2
	System.out.println("switch 입력");
	char swch = scan.next().charAt(0);
	switch(swch) {
		case 'j': {System.out.println("java");}; break;
		case 'h': {System.out.println("html");}; break;
		case 'c': {System.out.println("css");}; break;
	}
	
	//Repeat3
	for(int i=100; i<301; i+=100) {System.out.println(i);}
	
	int i=100; while(i<301) {System.out.println(i);i+=100;}
	
	i=100; do {System.out.println(i);i+=100;} while(i<301);
	
//	//Repeat4  ????
//	char arr[] = new char[3];
//	char data = 'a';
//	for(int ar=0; ar<arr.length; ar++) { arr[ar]=data; data += 1;  System.out.println(arr[ar]);}
	
	//Repeat4 선생님 풀이
	char arr0[] = new char[3];
	char data0 = 'a';
	arr0[0]= data0++; arr0[1]= data0++; arr0[2]= data0++;
	for(int i9=0; i9<arr0.length; i9++) { System.out.println( arr0[i9]) ;}
	
	
	//Repeat5
	char arr2[][] = new char[2][3];
	char data2 = 'a';
	for(int ch=0; ch<arr2.length;ch++) {
		for(int kan=0; kan<arr2[ch].length; kan++) {
			arr2[ch][kan]=data2; data2+=1;
			System.out.println(arr2[ch][kan]);
			}
		data2 = 'd';
		}
	
	//Repeat7
	/* 다음의 메서드를 정의하시오
	 * public static void main(String[] args) {
	 * 	hi(); //hi출력
	 * 	hi(1); //hi 1님! 출력
	 * 	System.out.println(hi("Sally")); //hi Sally출력
	 * }
	 * 
	 * 입력받은게 숫자인지 스트링인지 판별?
	 * 1일경우 hi + a +님!
	 * 문자일경우 hi + b
	 * 
	 * public static void hi(){ System.out.println("hi")}
	 * 
	 * 
	 * */
	
	hi();
	
	
	
}//
}//
