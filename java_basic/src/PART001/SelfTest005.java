package PART001;

import java.util.Scanner;

public class SelfTest005 {
public static void main(String[] args) {
//	스캐너
//	인트나이
//	나이에스캔적용
//	나이입력밪기
//	이프 나이가19세미만이면 풀력 님은미성년자
//	엘스 님은성은
	
	Scanner scan = new Scanner(System.in);
	int age = 0;
	
	System.out.println("당신의 나이를 입력하세요. __ ");
	age = scan.nextInt();
	
	if(age < 19) {System.out.println("당신은 미성년자 입니다.");}
	else {System.out.println("당신은 성인 입니다.");}

	scan.close();
}
}
