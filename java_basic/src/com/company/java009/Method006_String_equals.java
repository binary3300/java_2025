package com.company.java009;

public class Method006_String_equals {
	public static void main(String[] args) {
		String str1 = "apple";
		String str2 = "apple";//같은 메서드 안에서 똑같은 내용을 담는 저거(변수)가 생기면 같은 주소에 넣어둔다...
		String str3 = new String("apple");
		
		System.out.println("step1 값 출력: "+ str1 +" "+ str2 +" "+ str3 );

		System.out.println("step2 같은지 확인: "+ (str1==str2) +" "+ (str1==str3));
	//												true				false   
		//										내용물은 같지만, 둘이 넣어놓은 주소값이 다르기때문에 false가 나온다.
		//										그래서 다른 방식으로 불러온 어쩌구(변수)들도 값으로 비교해야할 일이 생기면>>> 비교하고싶은애1.equals(비교하고싶은애2) <<<
		//										로 알아볼 수 있다  .equals 만 쳐도 괄호랑 다른 어쩌구를 알아서 가져온다.
		
		System.out.println("step3 주소값 확인: " +" "+
				System.identityHashCode(str1) +" "+
				System.identityHashCode(str2) +" "+
				System.identityHashCode(str3)
				);
		
		System.out.println("step4 문자열의 값비교- equals : "+
				str1.equals(str2) +" "+ str1.equals(str3));
	
	
	
	}//
}//
