package com.company.java018;

class Milk{
	private String name; private int price;
	public Milk() { this.name = "White"; this.price = 1300; }
	public Milk(String name, int price) { super(); this.name = name; this.price = price; }
	@Override public String toString() { return "Milk [name=" + name + ", price=" + price + "]"; }
	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
	public int getPrice() { return price; }
	public void setPrice(int price) { this.price = price; }
}

class MilkPrint{
	void show( Milk []milks ) { //milks = [1번지, 2번지, 3번지] 배열에서 값을 꺼낸다. for문으로!!
		for(int i=0; i<=3;i++) {
			System.out.println(milks[i].getName() +"i"+ milks[i].getPrice() );
		}
	}
	
}


public class Repeat001_Milk {
	public static void main(String[] args) {
		//Q3.  class(1) 필요한 자료의 묶음.
			Milk m1 = new Milk("choco" , 1200);
			System.out.println( m1 );  // 출력된 결과 : choco / 1200
			Milk m2 = new Milk();
			System.out.println( m2 );  // 출력된 결과 : white / 1300
		 	
		 	
		 	
		//Q4.  class(2) 클래스 배열
			Milk []milks = new Milk[3];   //milks = [null, null, null]
			milks[0] = new Milk("white",1000);	//milks[0] = 1번지 {"white",1000}
			milks[1] = new Milk("choco",1200);  //milks[1] = 2번지 {"choco",1200}
			milks[2] = new Milk("banana",1500); //milks[2] = 3번지 {"banana",1500}
			
			MilkPrint  print = new MilkPrint();   
			print.show(  milks     );	
			//	리턴값		 메서드명 파라미터 뭘로 만들어야할지 생각하자
			//일단void		  show( Milk []milks )   /milks = [1번지, 2번지, 3번지]
			/* 출력된 결과 : 
			 * white  / 1000
			 * choco  / 1200
			 * banana / 1500 */
		 	
		 	
	}
}
