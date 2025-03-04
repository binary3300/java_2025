package com.company.java011_ex;
public class Milk{  // java011_ex에 설정해주세요!
	//public(아무데거나 사용) > protected(exteneds) > package(같은폴더) > private(클래스 내)
	
    private int  mno;   
    private String mname;  
    private  int mprice;
    
    //alt shift s
    //오른쪾마우스 소스 게터스 세터즈 - 전체선택-제너레이트
    //이것만 하면 주소값만 나오니까
    //같은경로에 투 스트링 도 해주기
    
	public int getMno() {
		return mno;
	}
	@Override
	public String toString() {
		return "Milk [mno=" + mno + ", mname=" + mname + ", mprice=" + mprice + "]";
	}
	public void setMno(int mno) {
		this.mno = mno;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public int getMprice() {
		return mprice;
	}
	public void setMprice(int mprice) {
		this.mprice = mprice;
	}  
    
    
 }