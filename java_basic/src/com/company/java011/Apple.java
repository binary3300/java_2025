package com.company.java011;
//클래스- 부품객체(맴버변수+멤버함수)
//오른쪽마우스-소스 제너레이트 투 스트링~ 컨스트럭터 투 클래스 다 해줌


public class Apple {
	private String name;
	private String order;
	private int num;
	private int price;
	
	@Override
	public String toString() {
		return "Apple [name=" + name + ", order=" + order + ", num=" + num + ", price=" + price + "]";
	}
	public Apple() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Apple(String name, String order, int num, int price) {
		super();
		this.name = name;
		this.order = order;
		this.num = num;
		this.price = price;
	}
	public String getOrder() {return order;}
	public void setOrder(String order) {this.order = order;}
	public int getNum() {return num;}
	public void setNum(int num) {this.num = num;}
	public int getPrice() {return price;}
	public void setPrice(int price) {this.price = price;}
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}

}
