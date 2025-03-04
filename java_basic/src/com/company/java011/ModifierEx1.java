package com.company.java011;

import com.company.java011_ex.Milk;

public class ModifierEx1{ // java011 패키지에 설정해주세요.
	public static void main(String[] args) {
		         Milk m1 = new Milk();  //다른 폴더 임포트 한다고 마우스올리면 창 나옴
		         System.out.println( m1 );  
		         
		         m1.setMprice(2000);       
		         System.out.println( m1 );
		      } 
}
