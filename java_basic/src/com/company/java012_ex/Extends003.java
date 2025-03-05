package com.company.java012_ex;
//1  클래스는 부품객체
//2. 상태는 멤버변수 + 행위는 멤버함수
//3. 클래스의 재사용(재활용), 오버라이드(@Override)- 부모메서드 나한테 맞게 수정
/*											MobileNote9 my9 = new MobileNote9();
 *Object										Object()	 {#4		}#5
 *	↑
 *MobileNote7	String iris(private)/ void newshow(){} , getters/setters{#3		}#6 iris 초기화
 *	↑
 *MobileNote8	String face(private)/ void newshow(){} , getters/setters{#2		}#7 face 초기화
 *	↑
 *MobileNote9	int battery(private)/ (void newshow(){} , getters/setters{#1		}#8 battery 초기화
 *	
 */

class MobileNote7 extends Object	 {
	private String iris;
	
	void newshow() {System.out.println( "::::NOTE7 = 홍채인식>" + this.iris );}
	public String getIris() {return iris;}
	public void setIris(String iris) {this.iris = iris;}
}
	
class MobileNote8 extends MobileNote7{
	private String face;
	//public > protected > package(지금 여기) 이것보다 더 넓어야함 > private
	@Override protected void newshow() {
		super.newshow(); 
		System.out.println( "::::NOTE8 = 안면인식>" + this.face ); }
	
	public String getFace() {return face;}
	public void setFace(String face) {this.face = face;}
}


class MobileNote9 extends MobileNote8{
	private int battery=24;
	@Override protected void newshow() {
		super.newshow(); 
		System.out.println( "::::NOTE9 = 하루종일 베터리 사용>" + this.battery ); }
	
	public int getBattery() {return battery;}
	public void setBattery(int battery) {this.battery = battery;}
}



public class Extends003 {
 public static void main(String[] args) {
	MobileNote9 my9 = new MobileNote9();
	my9.setIris("brown");
	my9.setFace("preety");
	my9.newshow();
 		
	}
}


