package com.company.java013;

//class Shape002{
//show Area(int w, int h);
//show Area(int r);
//}
//
//public class abstract002 {
//	public static void main(String[] args) {
//		Rectangle002 rec = new Rectangle002();
//		rec.showArea(10,10);
//		Triangle002 tri = new Triangle002();
//		tri.showArea(10,10);
//		Circle002 cir = new Circle002();
//		cir.showArea(10);

/* 
 * 				Shape002{show Area(int w, int h); show Area(int r)}
 * 	   △		   △			△
 * Rectangle	Circle		Triangle
 */

abstract class Shape002{
	abstract void showArea(int w, int h); //{}
	abstract void showArea(int r); //설계 메서드
}

class Rectangle extends Shape002{
	@Override void showArea(int w, int h) {System.out.println("사각형의 넓이: "+w*h);}
	@Override void showArea(int r) {} //불필요한 @Override
}

class Circle extends Shape002{
	@Override void showArea(int w, int h) {}//불필요한 @Override
	@Override void showArea(int r) {System.out.println("원의 넓이: "+r*r*Math.PI);}
}

class Triangle extends Shape002{
	@Override void showArea(int w, int h) {System.out.println("삼각형의 넓이: "+w*h*0.5);}
	@Override void showArea(int r) {}//불필요한 @Override
}

public class abstract002 {
	public static void main(String[] args) {
		Shape002 shape = null; //shape = new Shape002(); 는 에러난다!!! 
		
		shape = new Rectangle(); //부모=자식 담을수있어서 오류안나고 가능함
		shape.showArea(10,3);
		
		shape = new Circle(); //부모=자식 담을수있어서 오류안나고 가능함
		shape.showArea(10);
		
		shape = new Triangle(); //부모=자식 담을수있어서 오류안나고 가능함
		shape.showArea(10,3);
		

		System.out.println("---------------------------------------");
		
		//ver2
		Shape002 shape2 = null;
		Shape002 []s	= { new Rectangle(), new Circle(), new Triangle() };
		//Circle이니? shape.showArea(10);
		//	instanceof!!!!!!!!!!!!!!!!!!!! 객체가 어떤 클래스인지, 어떤 클래스를 상속받았는지 확인!!! for문으로도 쓸수있음
		if( s[0] instanceof Circle ) {s[0].showArea(10);}
		else {s[0].showArea(10,3);}
		
		if( s[1] instanceof Triangle ) {s[1].showArea(10);}
		else {s[1].showArea(10,3);}
		
		if( s[2] instanceof Rectangle ) {s[2].showArea(10);}
		else {s[2].showArea(10,3);}
		
		
		
//		Rectangle rec = new Rectangle();
//		rec.showArea(10,10);
//		Triangle tri = new Triangle();
//		tri.showArea(10,10);
//		Circle cir = new Circle();
//		cir.showArea(10);
		
	}//main
}//class
