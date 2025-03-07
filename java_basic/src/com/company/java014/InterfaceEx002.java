package com.company.java014;
/* 
						Board - exec()
	△				△				△				△
	|				|				|				|
BoardInsert		BoardDelete		BoardSelect		BoardUpdate


 */
interface Board{public void exec();};	//설계목적! 맴버변수는 상수, 멤버함수는 abstract가 자동으로 들어있다!

class BoardInsert implements Board{@Override public void exec() {System.out.println("게시판 글쓰기");}};
class BoardDelete implements Board{@Override public void exec() {System.out.println("게시판 글지우기");}};
class BoardSelect implements Board{@Override public void exec() {System.out.println("게시판 글 선택");}};
class BoardUpdate implements Board{@Override public void exec() {System.out.println("게시판 글 수정");}};


//main class
public class InterfaceEx002 {
	public static void main(String[] args) {
		Board board = null;
		board = new BoardInsert();board.exec();
		board = new BoardDelete();board.exec();
		board = new BoardSelect();board.exec();
		board = new BoardUpdate();board.exec();
		
		
		
	}//main
}//class
