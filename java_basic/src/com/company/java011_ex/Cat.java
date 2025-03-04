package com.company.java011_ex; //01.외부폴더

//아래 public이 지워지면 같은 폴더(패키지)에서만 쓸수있다.
public class Cat {
	public 		int public_;
	protected 	int protected_;
				int package_;
	private 	int private_; //cat 내부에서만 접근가능
	
	
	

	//알트+쉬프트+s ->getter + setters
	public int getPrivate_() {return private_;}
	public void setPrivate_(int private_) {this.private_ = private_;}
	
	
}
