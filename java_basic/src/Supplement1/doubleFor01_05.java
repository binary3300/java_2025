package Supplement1;

import javax.annotation.processing.SupportedSourceVersion;

public class doubleFor01_05 {
	public static void main(String[] args) {
		/* 1) 이중for
		 * ★★★
		 * ★★★
		 * ★★★
		 * for(string? i=★★★;i<4;i++){프린트i}
		 */
		//for(String i="★★★"; i=<3; i++) {System.out.println(i);}
		//별 세개짜리는 =<3 i++ 이걸 할 수가 없구나,,, 그럼 i="★" 로 해서 (ck 줄){(kan){★★★}} 해야겠ㄷ네
		
		String data = "★";
		for(int ch=1;ch<=3;ch++) {for(int kan=1; kan<=3; kan++) {System.out.print(data);}System.out.println();}
		
		
		/* 2) 이중for
		 * ★
		 * ★★
		 * ★★★
		 * 가로로는 늘지않고 한바퀴 돌았을때 별이 하나씩 늘게...
		 */
		//String data = "★";
		for(int ch=1;ch<=3;ch++) {//3 아래로 반복출력합니다. 3번 반복하면 끝납니다.
			for(int kan=1; kan<=1; kan++) { //2 오른쪽으로 반복출력합니다. 1번 반복하면 끝입니다.
				System.out.println(data); //1 data"★"을 출력합니다
			}data+="★";
		}
		
		/* 3) 이중for
		 * ★★★      ch가 0일대 kan을 3개
		 * ★★		ch가 1일때 kan을 2개
		 * ★		ch가 2일때 kan을 1개
		 */
		for(int ch=0; ch<3; ch++) {
			for(int kan=3; kan>ch; kan--) {
				System.out.print("★");
				}System.out.println();
		}
		
		/* 4) 이중for
		 *111	ch가 0일때 kan은 111
		 *222	ch가 1일때 kan은 111+111
		 *333	ch가 2일때 kan은 111+111+111
		 */
		int data2 = 111;
		for(int ch=0; ch<3; ch++){
			for(int kan=0; kan<ch; kan++){
				{System.out.print(data2);}
				data2+=111; System.out.println();}
		}
		System.out.println("----------------------");
		/*
		 * 5)이중for
		 * 1	층이 0일때 칸은 (1)
		 * 22	층이 1일때 칸은 (2)(2)
		 * 333	층이 2일때 칸은 (3)(3)(3)
		 */
		int data3 = 0;
		for(int ch=0; ch<=3; ch++) {
			for(int kan=0; kan<ch; kan++) {
				System.out.print(data3);
			} data3+=1; System.out.println();
		}//와 해냄
		
		
		
	}//main
}//claa
