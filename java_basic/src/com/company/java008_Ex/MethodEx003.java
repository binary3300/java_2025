package com.company.java008_Ex;

public class MethodEx003 {
	
	//1
	//public static 숫자 (본문에서 이걸 타이핑하면 찾아올거야){이 행동을 할거아.}
	//public static int return_num() { return 1; }
	//public static 리턴값 메서드이름 파라미터 {행동}
	public static int return_num(){return 1;}
	
	//2
	//public static 실수 return_float( int(), float() ;) { return  }
	public static double return_float(){return 3.3333;}
	
	//3
	public static String mycolor(){return "PURPLE";}

	//4
	public static String jangsu(){return "★★★★★";}
	
	//5
	public static int myadd(int a,int b) { return a+b;} 
	
	//6
	public static String myban(char c) { if(c == 'A'){return "노랑조";} else if(c == 'B'){return "주황조";}else{return "잘 써줘";}}
	
	//7
	public static String stdId(int a) { return "G"+ a ;}
	
	//8
	public static char stdAvg(int d) { if(d >= 90){return 'A';}else if( d>= 80 ){ return 'B';} else if(d >=70){ return 'C' ;} else { return 'D' ;}}
	
	public static void main(String[] args) {
		//public static 리턴값 메서드이름(재료){해야할 일}
		//public static 1 return_num(){1 주기}
		//public static int return_num(){return 1;}
//		System.out.println("1. 내가 좋아하는 숫자    :" + return_num();)    // 1을 결과값으로 줌
		System.out.println("1. 내가 좋아하는 숫자    :" + return_num());
		

		//public static 리턴값 메서드이름(재료){해야할 일}
		//public static 3.3333 return_float(){3.3333주기}
		//public static double return_float(){return 3.3333;}
//		System.out.println("2. 10/3.0을 실수로 표현 :" + return_float());  // 3.3333을 결과값으로 줌
		System.out.println("2. 10/3.0을 실수로 표현 :" + return_float());
		

		//public static 리턴값 메서드이름(재료){해야할 일}
		//public static PURPLE mycolor(){PURPLE주기}
		//public static String mycolor(){return "PURPLE";}
		System.out.println("3. BEST COLOR        :" + mycolor());      // PURPLE을 결과값으로 줌
		
		//public static 리턴값 메서드이름(재료){해야할 일}
		//public static ★★★★★ jangsu(){return ★★★★★}
		//public static String jangsu(){return "★★★★★";}
		System.out.println("4. 장수돌침대 별이       :" + jangsu());        // ★★★★★을 결과값으로 줌  
		
		//public static 두숫자를 더한값의 자료형 myadd(10,20) { return 결과값 } 
		//public static int myadd(int a,int b) { return 결과값 a+b;} 
		
		System.out.println("5. 10+20= " + myadd(10,20));       // 두숫자를 더한값을 결과값으로 줌  
		
		//public static 리턴값의 형태 myban('B') { A이면 노랑조 ,  B이면 주황조 }
		//public static String myban('B') { if(입력값이 a다){노랑조} else if(인력값이 b다){주황조};}
		//public static String myban(char c) { if(c == a){return "노랑조"} else if(c == b){return "주황조"};}
		System.out.println("6. 반(노랑조/주황조)=" + myban('B'));  // A이면 노랑조 ,  B이면 주황조
		
		
		//public static 결괏값형태 stdId(1111) { G하고 넣어준 학번 나오게 }
		//public static String stdId(int a) { return "G"+ a ;}
		System.out.println("7. 당신의 학번은?" + stdId(1111));   // G하고 넣어준 학번 나오게
		
		
		//public static 형태 stdAvg(88) { 90점이상이면 A ,  80점이상이면 B ,  70점이상이면 C , 아니라면  D }
		//public static char stdAvg(int d) { if(d  90점이상이면){A}else if( 80점이상이면 ){ B },  else if(70점이상이면){ C} , else {  D }
		//public static char stdAvg(int d) { if(d >= 90){return 'A';}else if( d>= 80 ){ return 'B'}, else if(d >=70){ return 'C' } , else { return 'D' }
		System.out.println("8.당신의 평균은?" + stdAvg(88));    
		
		
//		90점이상이면 A ,  80점이상이면 B ,  70점이상이면 C , 아니라면  D

//		출력결과 :
//		1. 내가 좋아하는 숫자    : 1
//		2. 10/3.0을 실수로 표현 : 3.3333
//		3. BEST COLOR        : PURPLE
//		4. 장수돌침대 별이       : ★★★★★
//		5. 10+20= 30
//		6. 반(노랑조/주황조)= 나는 노랑조
//		7. 당신의 학번은? G1111
//		8. 당신의 평균은? B
		
		
	
	
	}//main
}//class
