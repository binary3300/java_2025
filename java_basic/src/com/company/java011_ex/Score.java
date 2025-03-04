package com.company.java011_ex;

//1. 클래스는 부품객체
//2. 상태(멤버변수)와 행위(멤버함수)
public class Score {
	//멤버변수
	   private String name;
	   private int kor, eng, math , total;
	   private double aver;
	   private String p  , s  , rank;
	   
	//멤버함수
	public Score() {this.name= this.p = this.s = this.rank = " ";}
	public Score(String name, int kor, int eng, int math) {
		//1-1 this.name= this.p = this.s = this.rank = " ";
		this();
		this.name=name; this.kor=kor; this.eng=eng; this.math=math; //사용자들에게 입력받은 다음에 셋팅
		//1-2. this(); //error Score()
	}// 1. new 메모리, 객체 생성	2. 초기화		3. a1번지

	
	public static void info() {
		System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\r\n"
				+ "이름\t   국어\t   영어\t   수학\t   총점\t   평균\t   합격여부\t   장학생\t   랭킹\r\n"
				+ ":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\r\n"
				+ "");

	}
	
	public   void show(){
		this.total = this.kor + this.eng + this.math;
		this.aver = this.total/3.0;
		this.p = this.aver<60? "불합격":"합격";
		this.s = this.aver>=95?"장학생":"";
		for(int i=0; i<10; i++) {this.rank+="*";}
		System.out.printf("%s \t %d \t %d \t %d \t %d \t %.2f \t %s \t %s \t %s \n",
				this.name, this.kor, this.eng, this.math, this.total, this.aver, this.p, this.s, this.rank);
	}
	
	
//private- setters/getters (alt shift s)
	//프라이빗으로 만든 클래스니까 외부에서 쓸 수 있게 여기서 게터즈 세터즈 만들면 다른데서 쓰기좋음.
	//컨트롤 알트 제이

	public String getName() { return name; }  public void setName(String name) { this.name = name; }  
	public int getKor() { return kor; }  public void setKor(int kor) { this.kor = kor; }  
	public int getEng() { return eng; }  public void setEng(int eng) { this.eng = eng; }  
	public int getMath() { return math; }  public void setMath(int math) { this.math = math; }  
	public int getTotal() { return total; }  public void setTotal(int total) { this.total = total; }  
	public double getAver() { return aver; }  public void setAver(double aver) { this.aver = aver; }  
	public String getP() { return p; }  public void setP(String p) { this.p = p; }  
	public String getS() { return s; }  public void setS(String s) { this.s = s; }  
	public String getRank() { return rank; }  public void setRank(String rank) { this.rank = rank; }
	
	
	
}
