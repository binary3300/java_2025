package com.company.java012;

import java.awt.Container;
import java.lang.ModuleLayer.Controller;

/* 			Objact
 *   		  △
 * 			 Calc (exec)
 *   △		  △				△	  		  △  
 * Plus		Minus 		Multiply		Divide
 * */

class Calc 		extends Object	{void exec ( double d1, double d2 ){System.out.println();}}
class Plus 		extends Calc	{void exec ( double d1, double d2 ){System.out.println(d1+d2);}}
class Minus 	extends Calc	{void exec ( double d1, double d2 ){System.out.println(d1-d2);}}
class Multiply 	extends Calc	{void exec ( double d1, double d2 ){System.out.println(d1*d2);}}
class Divide 	extends Calc	{void exec ( double d1, double d2 ){System.out.println(d1/d2);}}

public class Poly005_arr {
	public static void main(String[] args) {
		//부모	   = 자식	/업캐스팅 /타입캐스팅 필요없음
		Calc [] my = { new Plus(), new Minus(), new Multiply(), new Divide() };
		Controller my[0] Controller .exec(10,3); //더하기
		Controller my[1] Controller .exec(10,3); //빼기
		Controller my[2] Controller .exec(10,3); //곱하기
		Controller my[3] Controller .exec(10,3); //나누기
	}//main
}//class
