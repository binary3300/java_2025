package com.company.java011;

import com.company.java011_ex.Cat;

class Cat2 extends Cat{
	public void show() { //지금 이 자바파일은 java011에 있고, 임포트로 가져온 cat자바파일은 java011_Ex에 있다. 다른폴더라고!!!!!!!
		public_=10;
		protected_=20; //extends 사용- 상속받은 자식만
		//package_=30; //패키지는 같은폴더로 묶여있기때문에 한 폴더에서만 사용가능.
		//private_=40; //cat 클래스에서만 사용- getter/setter
		System.out.println( public_ + "/" + protected_ );
	}
} //extends Cat의 기능 사용[상속]

public class Modifier2_protected {
	public static void main(String[] args) {
		Cat2 cat2 = new Cat2();
		cat2.show();
		
		cat2.public_=100; //아무데서나 접근가능
		//cat2.protected_=200; //extends 키워드를 받은적이 없어요! extends Cat을 한적이 없다~~~
	
}
}
/*
--------------------------------------------------------------------------
[method:정보]   
--------------------------------------------------------------------------
[heap]                       	| [stack]

                         		|  main  //##2
--------------------------------------------------------------------------
 */